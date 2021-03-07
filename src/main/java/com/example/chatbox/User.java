package com.example.chatbox;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	  	@Id
	  	@Column(unique=true, nullable=false, length= 255)
	    private String username;
	     
	    @Column(unique= true, length= 255)
	    private String email;
	     
	    @Column(name= "passwordstring", nullable= false, length= 255)
	    private String password;

		@Column(name= "userrole", nullable= false, length= 255)
	    private UserRole userRole;
	     
	    @Column(name= "status", length= 255)
	    private String status;
	    
	    public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public UserRole getUserRole() {
			return userRole;
		}

		public void setUserRole(UserRole userRole) {
			this.userRole = userRole;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
}
