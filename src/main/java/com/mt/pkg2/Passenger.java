package com.mt.pkg2;
public class Passenger
{
		private int id;
		private String name;
		private int age;
		private String gender;
		public Passenger(int id,String name,int age,String gender) {
			super();
			this.id=id;
			this.name=name;
			this.age=age;
			this.gender=gender;
			}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setId(String name) {
			this.name=name;
		}
		public int getAge() {
			return id;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String toString() {
			return "PassengerDetails[id="+id+",name="+name+",age="+age+",gender="+gender+"]";
		}
		
	}