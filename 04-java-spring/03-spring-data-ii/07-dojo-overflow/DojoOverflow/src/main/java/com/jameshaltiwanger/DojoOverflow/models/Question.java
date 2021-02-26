package com.jameshaltiwanger.DojoOverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;

@Entity
@Table(name="questions")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min=1, max=100)
	private String question;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(mappedBy="question", fetch=FetchType.LAZY)
	private List<Answer> answers;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="tags_questions",
		joinColumns = @JoinColumn(name="question_id"), //might have to manually add the import for JoinColumn.
		inverseJoinColumns = @JoinColumn(name="tag_id")
	)
	private List<Tag> tags;
	
	public Question() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	
}
