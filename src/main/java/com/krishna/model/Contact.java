package com.krishna.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String name;
		private Long mobile;
		private String imageUrl;
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
		public Long getMobile() {
			return mobile;
		}
		public void setMobile(Long mobile) {
			this.mobile = mobile;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public Contact( String name, Long mobile, String imageUrl) {
			super();
		
			this.name = name;
			this.mobile = mobile;
			this.imageUrl = imageUrl;
		}
		public Contact() {
			super();
		}
		@Override
		public String toString() {
			return "Contact [id=" + id + ", name=" + name + ", mobile=" + mobile + ", imageUrl=" + imageUrl + "]";
		}
		
		
}
