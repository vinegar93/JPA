package cn.hwd.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Staff implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
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
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
