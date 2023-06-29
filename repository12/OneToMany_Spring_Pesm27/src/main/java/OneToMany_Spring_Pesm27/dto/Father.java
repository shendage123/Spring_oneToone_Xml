package OneToMany_Spring_Pesm27.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Father {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
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

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public List<Children> getChildrens() {
	return childrens;
}

public void setChildrens(List<Children> childrens) {
	this.childrens = childrens;
}

	private String name;
	private long phone;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Children>childrens;
	
}
