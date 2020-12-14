package com.sd.employee;

import java.io.Serializable;

public class EmployeeData implements Serializable {
	
	private static final long serialVersionUID=1L;
	
          private int id;
          private String name;
          private int age;
          private double salary;
          
       
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * @return the salary
		 */
		public double getSalary() {
			return salary;
		}

		/**
		 * @param salary the salary to set
		 */
		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(salary);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof EmployeeData))
				return false;
			EmployeeData other = (EmployeeData) obj;
			if (age != other.age)
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "EmployeeData [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
          
}
