package com.jameshaltiwanger.DojoOverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jameshaltiwanger.DojoOverflow.models.Question;
import com.jameshaltiwanger.DojoOverflow.models.Tag;
import com.jameshaltiwanger.DojoOverflow.repositories.QuestionRepository;


@Service
public class QuestionService {
	@Autowired
	private QuestionRepository qRepo;
	
	public List<Question> getAllQuestions() {
		return qRepo.findAll();
	}
	
	public Question createQuestion(Question q) {
		return qRepo.save(q);
	}
	
	public void addTagToQuestion(Tag tag, Question question) {
		List<Tag> chosenTag = question.getTags();
		System.out.println(tag);
		chosenTag.add(tag);
		this.qRepo.save(question);
	}
	
	
}
