package me.cmnt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "community_user", schema = "community")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	@Column(name = "username", length = 100)
	private String username;
	@Column(name = "password", length = 100)
	private String password;
	@Column(name = "user_name", length = 100)
	private String user_name;
	@Column(name = "user_id", length = 100)
	private String user_id;
	@Column(name = "user_tel", length = 100)
	private String user_tel;
	@Column(name = "user_img", length = 100)
	private String user_img;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public String getUser_img() {
		return user_img;
	}

	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"username\":\"" + username
				+ "\",\"password\":\"" + password + "\",\"user_name\":\""
				+ user_name + "\",\"user_id\":\"" + user_id
				+ "\",\"user_tel\":\"" + user_tel + "\",\"user_img\":\""
				+ user_img + "\"}";
	}

}