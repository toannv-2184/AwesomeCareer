package com.aa.awesomecareer.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.aa.awesomecareer.util.validator.FieldMatch;
import com.aa.awesomecareer.util.validator.UniqueEmail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@UniqueEmail(name = "email", message = "{user.validation.email.exist}")
@FieldMatch(first = "password", second = "confirmation", message = "{user.validation.password.notmatch}")
public class UserModel extends BaseModel {
	
	public Integer id;
	@NotNull
	@NotEmpty
	public String fullName;
	@NotNull
	@NotEmpty
	private String email;
	@NotNull
	@NotEmpty
	private String password;
	@NotNull
	@NotEmpty
	private String company;
	@NotNull
	@NotEmpty
	private String occupationInterest;
	@NotNull
	@NotEmpty
	private String country;
	
	public String userName;
	private String seftIntroduction;
	private String ambition;
	private String link;
	private String goodAt;
	private String resume;
	private String interest;
	private String gender;
	private Date birthday;
	private String relationshipStatus;
	private boolean imAParent;
//	private String image;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOccupationInterest() {
		return occupationInterest;
	}
	public void setOccupationInterest(String occupationInterest) {
		this.occupationInterest = occupationInterest;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private List<ApplicationModel> applicationModels;
	private List<BookmarkModel> bookmarkModels;
	private List<FavoriteModel> favoriteModels;
	private List<VotingModel> votingModels;
	private List<FollowModel> followModels;
	private List<InterestModel> interestModels;
	private List<LanguageModel> languageModels;
	private List<CertificateModel> certificateModels;
	private List<EducationModel> educationModels;
	private List<ProjectModel> projectModels;
	private List<ProfileModel> profileModels;
}

