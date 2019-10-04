package com.ats.renting.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "car")
public class CarEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private String brand;
		private String model;	
		
		public CarEntity() {
		}

		public CarEntity(Integer id, String model, String brand) {
			this.id = id;
			this.model = model;
			this.brand = brand;
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((brand == null) ? 0 : brand.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((model == null) ? 0 : model.hashCode());
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
			CarEntity other = (CarEntity) obj;
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
			return true;
		}

		@Override
		public String toString() {
			return "Car [id=" + id + ", model=" + model + ", brand=" + brand + "]";
		}
		
		
		
		
	
}
