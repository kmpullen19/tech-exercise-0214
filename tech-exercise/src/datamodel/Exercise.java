package datamodel;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE exercise (
  id INT NOT NULL AUTO_INCREMENT,    
  name VARCHAR(30) NOT NULL,   
  length INT NOT NULL, 
  intensity INT,
  date_of_exercise DATETIME NOT NULL,   
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "exercise")
public class Exercise {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id")
	   private Integer id;

	   @Column(name = "type")
	   private String type;

	   @Column(name = "length")
	   private Integer length;
	   
	   @Column(name = "intensity")
	   private Integer intensity;
	   
	   @Column(name = "date")
	   private Date date;
	   

	   public Exercise() {
	   }

	   public Exercise(Integer id, String type, Integer length, Integer intensity, Date date) {
	      this.id = id;
	      this.type = type;
	      this.length = length;
	      this.intensity = intensity;
	      this.date = date;
	   }

	   public Exercise(String type, Integer length, Integer intensity, Date date) {
		   this.type = type;
		   this.length = length;
		   this.intensity = intensity;
		   this.date = date;
	   }

	   public Integer getId() {
	      return id;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }

	   public String getType() {
	      return type;
	   }

	   public void setType(String type) {
	      this.type = type;
	   }

	   public Integer getLength() {
	      return length;
	   }

	   public void setLength(Integer length) {
	      this.length = length;
	   }
	   
	   public Integer getIntensity() {
		   return intensity;
	   }

	   public void setIntensity(Integer intensity) {
		   this.intensity = intensity;
	   }
	   
	   public Date getDate() {
		   return date;
	   }
	   
	   public void setDate(Date date) {
		   this.date = date;
	   }

	   @Override
	   public String toString() {
	      return "Exercise: " + this.id + ", " + this.type + ", " + this.length + ", " + this.intensity + ", " + this.date;
	   }


}
