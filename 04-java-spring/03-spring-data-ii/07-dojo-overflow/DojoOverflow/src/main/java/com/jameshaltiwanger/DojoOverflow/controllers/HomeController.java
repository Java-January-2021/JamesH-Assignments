package com.jameshaltiwanger.DojoOverflow.controllers;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jameshaltiwanger.DojoOverflow.models.Question;
import com.jameshaltiwanger.DojoOverflow.models.Tag;
import com.jameshaltiwanger.DojoOverflow.services.AnwerService;
import com.jameshaltiwanger.DojoOverflow.services.QuestionService;
import com.jameshaltiwanger.DojoOverflow.services.TagService;

@Controller
public class HomeController {
	@Autowired
	private QuestionService qService;
	@Autowired
	private AnwerService aService;
	@Autowired
	private TagService tService;

	@GetMapping("/")
	public String index(Model model) {
		List<Question> allQuestions = qService.getAllQuestions();
		model.addAttribute("questions", allQuestions);
		return "index.jsp";
	}
	
	@GetMapping("/question/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/question/create")
	public String createQuestion(@RequestParam("question") String question, @RequestParam("tags") String tags) {
		
		Question q = new Question();
		q.setQuestion(question);
		
		String[] chosenTags = tags.split(", ");
		System.out.println(Arrays.toString(chosenTags));
		
		for(int i = 0; i < 3; i++) {
			if(this.tService.existsByT(chosenTags[i])) {
				Tag foundT = this.tService.findByT(chosenTags[i]); 
				List<Tag> chosenTag = q.getTags();
				chosenTag.add(foundT);
			}
			Tag t = new Tag();
			t.setTag(chosenTags[i]);
			tService.createTag(t);
			List<Tag> chosenTag = q.getTags();
			chosenTag.add(t);
			
		}
		
		qService.createQuestion(q);
		return "redirect:/";
	}
}
