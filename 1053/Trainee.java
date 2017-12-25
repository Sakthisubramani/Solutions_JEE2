package com.htc.javaex1;

import java.io.Serializable;

public class Trainee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int traineeId;
	private String traineeName;
	private String contactNo;
	private String email;
	private char gender;
	private int age;

/*	public static void main(String[] args) {

	}*/
	
	
	public Trainee(int traineeId, String traineeName, String contactNo, String email,char gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}


	public Trainee() {super();}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + ", hashCode()=" + hashCode()
				+ ", getTraineeId()=" + getTraineeId() + ", getTraineeName()=" + getTraineeName() + ", getContactNo()="
				+ getContactNo() + ", getEmail()=" + getEmail() + ", getGender()=" + getGender() + ", getAge()="
				+ getAge() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + traineeId;
		result = prime * result + ((traineeName == null) ? 0 : traineeName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Trainee)) {
			return false;
		}
		Trainee other = (Trainee) obj;
		if (age != other.age) {
			return false;
		}
		if (contactNo == null) {
			if (other.contactNo != null) {
				return false;
			}
		} else if (!contactNo.equals(other.contactNo)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (gender != other.gender) {
			return false;
		}
		if (traineeId != other.traineeId) {
			return false;
		}
		if (traineeName == null) {
			if (other.traineeName != null) {
				return false;
			}
		} else if (!traineeName.equals(other.traineeName)) {
			return false;
		}
		return true;
	}
	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
