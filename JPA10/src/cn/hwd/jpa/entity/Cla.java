package cn.hwd.jpa.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cla {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
	@ManyToMany(targetEntity=Teacher.class)
    private Set<Teacher> teachers;
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
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Cla() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cla(int id, String name, Set<Teacher> teachers) {
		super();
		this.id = id;
		this.name = name;
		this.teachers = teachers;
	}
}
