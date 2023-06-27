package com.example.entity;

/*import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;*/
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*@JsonInclude(value=Include.NON_NULL)*/
@Entity
@Table(name="tcolleges")
public class College {
		@Id
		@Column(name="date")
		private Long id;
		 @Column(name = "college_admin")
		private String collegeAdmin;
		 @Column(name = "college_name")
		private String collegeName;
		private String location;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCollegeAdmin() {
			return collegeAdmin;
		}
		public void setCollegeAdmin(String collegeAdmin) {
			this.collegeAdmin = collegeAdmin;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public String toString() {
			return "College [id=" + id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName
					+ ", location=" + location + "]";
		}
				
}
