package cn.hwd.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class NonTeachingStaff extends Staff {

	private String areaexpertise;
	public String getAreaexpertise() {
		return areaexpertise;
	}
	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NonTeachingStaff(int id, String name, String areaexpertise) {
		super(id, name);
		this.areaexpertise = areaexpertise;
	}
}
