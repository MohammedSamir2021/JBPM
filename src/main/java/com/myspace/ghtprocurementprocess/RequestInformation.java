package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequestInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("itemCode")
	private java.lang.String itemCode;
	@org.kie.api.definition.type.Label("itemDescription")
	private java.lang.String itemDescription;
	@org.kie.api.definition.type.Label("quantity")
	private java.lang.Integer quantity;
	@org.kie.api.definition.type.Label("department")
	private java.lang.String department;
	@org.kie.api.definition.type.Label("requesterName")
	private java.lang.String requesterName;
	@org.kie.api.definition.type.Label("requestDate")
	private java.util.Date requestDate;

	@org.kie.api.definition.type.Label(value = "status")
	private java.lang.String status;

	@org.kie.api.definition.type.Label(value = "return/rejectResone")
	private java.lang.String returnORrejectResone;

	public RequestInformation() {
	}

	public java.lang.String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(java.lang.String itemCode) {
		this.itemCode = itemCode;
	}

	public java.lang.String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(java.lang.String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public java.lang.Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}

	public java.lang.String getDepartment() {
		return this.department;
	}

	public void setDepartment(java.lang.String department) {
		this.department = department;
	}

	public java.lang.String getRequesterName() {
		return this.requesterName;
	}

	public void setRequesterName(java.lang.String requesterName) {
		this.requesterName = requesterName;
	}

	public java.util.Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(java.util.Date requestDate) {
		this.requestDate = requestDate;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getReturnORrejectResone() {
		return this.returnORrejectResone;
	}

	public void setReturnORrejectResone(java.lang.String returnORrejectResone) {
		this.returnORrejectResone = returnORrejectResone;
	}

	public RequestInformation(java.lang.String itemCode,
			java.lang.String itemDescription, java.lang.Integer quantity,
			java.lang.String department, java.lang.String requesterName,
			java.util.Date requestDate, java.lang.String status,
			java.lang.String returnORrejectResone) {
		this.itemCode = itemCode;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.department = department;
		this.requesterName = requesterName;
		this.requestDate = requestDate;
		this.status = status;
		this.returnORrejectResone = returnORrejectResone;
	}

}