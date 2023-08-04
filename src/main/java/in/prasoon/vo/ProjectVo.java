package in.prasoon.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVo
{
	private int projectId;
	private String projectName;
	private String projectCode;
	private String contactPerson;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date endDate;
	private String projectRemark;
	
	private CustomerVo customerVo;
	private ProjectVo projectVo;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getProjectRemark() {
		return projectRemark;
	}
	public void setProjectRemark(String projectRemark) {
		this.projectRemark = projectRemark;
	}
	public CustomerVo getCustomerVo() {
		return customerVo;
	}
	public void setCustomerVo(CustomerVo customerVo) {
		this.customerVo = customerVo;
	}
	public ProjectVo getProjectVo() {
		return projectVo;
	}
	public void setProjectVo(ProjectVo projectVo) {
		this.projectVo = projectVo;
	}
	@Override
	public String toString() {
		return "ProjectVo [projectId=" + projectId + ", projectName=" + projectName + ", projectCode=" + projectCode
				+ ", contactPerson=" + contactPerson + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", projectRemark=" + projectRemark + ", customerVo=" + customerVo + ", projectVo=" + projectVo + "]";
	}
	public ProjectVo(int projectId, String projectName, String projectCode, String contactPerson, Date startDate,
			Date endDate, String projectRemark, CustomerVo customerVo, ProjectVo projectVo) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.contactPerson = contactPerson;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectRemark = projectRemark;
		this.customerVo = customerVo;
		this.projectVo = projectVo;
	}
	public ProjectVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
