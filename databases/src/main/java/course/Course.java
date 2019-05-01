package course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import stockprice.Welcomes;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Welcomes w;			//How will spring know this is a foreign key to the Topic table?
	
	public Course(String id, String name, String description, String topicid) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.w = new Welcomes(topicid,"","");
	}

	public Welcomes getW() {
		return w;
	}

	public void setW(Welcomes w) {
		this.w = w;
	}

	public Course() {}
	
	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

		

}