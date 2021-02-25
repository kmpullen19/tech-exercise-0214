package datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8 CREATE TABLE exercise ( id INT NOT NULL AUTO_INCREMENT, name
 *        VARCHAR(30) NOT NULL, length INT NOT NULL, intensity INT,
 *        date_of_exercise DATETIME NOT NULL, PRIMARY KEY (id));
 */
@Entity
@Table(name = "exercise")
public class Exercise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "userName")
	private String userName;

	@Column(name = "type")
	private String type;
	
	@Column(name = "description")
	private String description;

	@Column(name = "length")
	private String length;

	@Column(name = "intensity")
	private Integer intensity;

	@Column(name = "date")
	private String date;

	public Exercise() {
	}

	public Exercise(Integer id, String userName, String type, String length, Integer intensity, String date, String descripiton) {
		this.id = id;
		this.userName = userName;
		this.type = type;
		this.length = length;
		this.intensity = intensity;
		this.date = date;
		this.description = description;
	}

	public Exercise(String userName, String type, String length, Integer intensity, String date, String description) {
		this.userName = userName;
		this.type = type;
		this.length = length;
		this.intensity = intensity;
		this.date = date;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public Integer getIntensity() {
		return intensity;
	}

	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	@Override
//	public String toString() {
//		return "Exercise: " + this.id + ", " + this.userName + ", " + this.type + ", " + this.length + ", " + this.intensity + ", "
//				+ this.date + ", " + this.description;
//	}

}
