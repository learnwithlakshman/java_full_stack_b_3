package com.careerit.sc.lc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwl.ccquestions.ArrayQuestions;
import com.lwl.ccquestions.StringQuestions;

@Service
public class CodingQuestionService {

	@Autowired
	private StringQuestions stringQuestions;
	@Autowired
	private ArrayQuestions arryQuestions;

	public int biggest(int[] arr) {
		return arryQuestions.maxElement(arr);
	}
	
	public int occurance(String data,String key) {
		return stringQuestions.matchCount(data, key);
	}
}
