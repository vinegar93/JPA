package cn.hwd.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaff extends Staff {

	private String qualification;
	private String subjectexpertise;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubjectexpertise() {
		return subjectexpertise;
	}
	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
	public TeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeachingStaff(int id, String name, String qualification, String subjectexpertise) {
		super(id, name);
		this.qualification = qualification;
		this.subjectexpertise = subjectexpertise;
	}
}
