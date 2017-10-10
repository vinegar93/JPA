package cn.hwd.jpa.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@ManyToMany(targetEntity=Cla.class)
	private Set<Cla> clas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Cla> getClas() {
		return clas;
	}
	public void setClas(Set<Cla> clas) {
		this.clas = clas;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int id, String name, Set<Cla> clas) {
		super();
		this.id = id;
		this.name = name;
		this.clas = clas;
	}
}
