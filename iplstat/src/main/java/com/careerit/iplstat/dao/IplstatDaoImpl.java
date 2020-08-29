package com.careerit.iplstat.dao;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.unwind;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationExpression;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import com.careerit.iplstat.dto.LabelDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountDTO;
import com.mongodb.client.model.Accumulators;

@Repository
public class IplstatDaoImpl implements IplstatDao {

	private Logger log = LoggerFactory.getLogger(IplstatDaoImpl.class);

	@Autowired
	private MongoOperations mongoOperations;

	@Override
	public LabelDTO findTeamLabels() {

		GroupOperation group = group("null").addToSet("label").as("labels");
		ProjectionOperation project = project().andExclude("_id").andInclude("labels");
		Aggregation aggr = newAggregation(group, project);

		AggregationResults<LabelDTO> result = mongoOperations.aggregate(aggr, "team", LabelDTO.class);

		LabelDTO labelDTO = result.getUniqueMappedResult();
		log.info("Label count found in DB:{}", labelDTO.getLabels().size());
		return labelDTO;
	}

	@Override
	public List<PlayerDTO> findPlayersByTeam(String label) {

		MatchOperation match = match(Criteria.where("label").is(label));
		UnwindOperation unwind = unwind("players");
		ProjectionOperation project = project().and("players.name").as("name").and("players.role").as("role")
				.and("players.price").as("price").and("label").as("label").andExclude("_id");

		Aggregation aggr = newAggregation(match, unwind, project);
		log.info("Query :{}", aggr);

		AggregationResults<PlayerDTO> result = mongoOperations.aggregate(aggr, "team", PlayerDTO.class);
		List<PlayerDTO> list = result.getMappedResults();
		log.info("Total player found for {} team is {}", label, list.size());
		return list;
	}

	@Override
	public List<RoleCountDTO> findPlayersCountByRole(String label) {
		MatchOperation match = match(Criteria.where("label").is(label));
		UnwindOperation unwind = unwind("players");
		GroupOperation group = group("players.role").count().as("count");
		ProjectionOperation project = project().and("_id").as("role").and("count").as("count");
		Aggregation aggr = newAggregation(match, unwind, group, project);

		AggregationResults<RoleCountDTO> result = mongoOperations.aggregate(aggr, "team", RoleCountDTO.class);
		List<RoleCountDTO> list = result.getMappedResults();
		log.info("Total roles  found for {} team is {}", label, list.size());
		return list;
	}

	@Override
	public List<PlayerDTO> findPlayerByTeamAndRole(String label, String role) {
		MatchOperation match_1 = match(Criteria.where("label").is(label));
		UnwindOperation unwind = unwind("players");
		MatchOperation match_2 = match(Criteria.where("players.role").is(role));
		ProjectionOperation project = project().and("players.name").as("name").and("players.role").as("role")
				.and("players.price").as("price").and("label").as("label").andExclude("_id");

		Aggregation aggr = newAggregation(match_1, unwind, match_2, project);

		AggregationResults<PlayerDTO> result = mongoOperations.aggregate(aggr, "team", PlayerDTO.class);
		List<PlayerDTO> list = result.getMappedResults();
		log.info("Total player found for team {} and role {} is {}", label, role, list.size());
		return list;
	}

}
