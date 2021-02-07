package com.jameshaltiwanger.show.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "books") //Entity and Table creates a table called books for each of our Book "objects"
public class Book { //Our java domain model
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	//Creates the Id column, and makes it increment by one each time a new object is created. 
    
	@Column
    @Size(min = 5, max = 200)
    private String title;
    
    @Column
    @Size(min = 5, max = 200)
    private String description;
    
    @Column
    @Size(min = 3, max = 40)
    private String language;
    
    @Column
    @Min(100)
    private int numberOfPages;
    
    @Column(updatable=false) // This will not allow the createdAt column to be updated after creation
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss") //formating and creating a date variable
    private Date createdAt;
    
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    //Saves the date the new object was created
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    //Saves the date the object was updated
    
    public Book() { //Empty "java bean" constructor
    }
    
    public Book(String title, String desc, String lang, int pages) { //Filled in constructor
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = pages;
    }

    //The following are getters and setters!
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
    
}
