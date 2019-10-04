package com.ats.renting.model.dto;

import com.ats.renting.model.entity.UserEntity;

public class CarDto {

		private Integer id;
		private String brand;
		private String model;
		private UserEntity user;
		
		public CarDto() {
		}

		

		public CarDto(Integer id, String brand, String model, UserEntity user) {
			super();
			this.id = id;
			this.brand = brand;
			this.model = model;
			this.user = user;
		}



		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
		

		public UserEntity getUser() {
			return user;
		}



		public void setUser(UserEntity user) {
			this.user = user;
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((brand == null) ? 0 : brand.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			result = prime * result + ((user == null) ? 0 : user.hashCode());
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CarDto other = (CarDto) obj;
			if (brand == null) {
				if (other.brand != null)
					return false;
			} else if (!brand.equals(other.brand))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			if (user == null) {
				if (other.user != null)
					return false;
			} else if (!user.equals(other.user))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "CarDto [id=" + id + ", brand=" + brand + ", model=" + model + ", user=" + user + "]";
		}

        
        
		
		
		
		
	
}
