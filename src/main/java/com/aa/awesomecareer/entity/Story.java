package com.aa.awesomecareer.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "story")
public class Story {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "userId")
	private Integer userId;
	@Column(name = "content", length = 3000)
	private String content;
	@Column(name = "image", length = 256)
	private String image;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "createdAt")
	private Date createdAt;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "updatedBy")
	private Date updatedBy;

//	@OneToMany(mappedBy = "favorite")
//	private List<Application> favorites;
//
//	@OneToMany(mappedBy = "storyhastag")
//	private List<StoryHashtag> storyHashtags;
}
