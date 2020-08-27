package com.careerit.iplstat.dao;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.stereotype.Repository;

import com.careerit.iplstat.dto.LabelDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountDTO;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleCountDTO> findPlayersCountByRole(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> findPlayerByTeamAndRole(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
