package com.aa.awesomecareer.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "bookmark")
public class Bookmark {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "userId")
	private Integer userId;
	@Column(name = "jobId")
	private Integer jobId;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "createdAt")
	private Date createdAt;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "updatedBy")
	private Date updatedBy;

//	@ManyToOne
//	@JoinColumn(name = "id")
//	private User user;
//
//	@ManyToOne
//	@JoinColumn(name = "id")
//	private Job job;

}
