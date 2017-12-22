package com.htc.exercises.main;

public class Project {
	
	private String projectId;
	private String projectName; 
	private String projectHead; 
	private int noOfResources;
	
	
	public String getProjectId() {
		return projectId;
	}
		public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHead() {
		return projectHead;
	}
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	public int getNoOfResources() {
		return noOfResources;
	}
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfResources;
		result = prime * result + ((projectHead == null) ? 0 : projectHead.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
		Project other = (Project) obj;
		if (noOfResources != other.noOfResources)
			return false;
		if (projectHead == null) {
			if (other.projectHead != null)
				return false;
		} else if (!projectHead.equals(other.projectHead))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}
	
	public Project() {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
		
	}
	
public static void main(String[] args) {
	
	Project p1 = new Project();
	p1.setProjectId("PR123");
	p1.setProjectName("Statefarm");
	p1.setProjectHead("Jhon");
	p1.setNoOfResources(20);
	
	System.out.println(p1);
}

}