package postgresql_connect;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Student {
private String name;
@Id
private int aid;
private String tech ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
@Override
public String toString() {
	return "Student {"+ "name="+ name + ", aid=" + aid +'\'' +", tech=' " + tech + '\''+ '}';
}


}
