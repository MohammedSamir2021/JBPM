package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class invoiceInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "invoceNumber")
	private java.lang.Integer invoceNumber;
	@org.kie.api.definition.type.Label(value = "invoiceDate")
	private java.util.Date invoiceDate;
	@org.kie.api.definition.type.Label(value = "discount")
	private java.lang.String discount;
	@org.kie.api.definition.type.Label(value = "tax")
	private java.lang.String tax;
	@org.kie.api.definition.type.Label(value = "shipingCost")
	private java.lang.Integer shipingCost;
	@org.kie.api.definition.type.Label(value = "deliveryDate")
	private java.util.Date deliveryDate;
	@org.kie.api.definition.type.Label(value = "subTotal")
	private java.lang.Integer subTotal;
	@org.kie.api.definition.type.Label(value = "totalAmount")
	private java.lang.Integer totalAmount;
	@org.kie.api.definition.type.Label(value = "paymentMethod")
	private java.lang.String paymentMethod;
	@org.kie.api.definition.type.Label(value = "bankName")
	private java.lang.String bankName;
	@org.kie.api.definition.type.Label(value = "accountNumber")
	private java.lang.Integer accountNumber;

	public invoiceInformation() {
	}

	public java.lang.Integer getInvoceNumber() {
		return this.invoceNumber;
	}

	public void setInvoceNumber(java.lang.Integer invoceNumber) {
		this.invoceNumber = invoceNumber;
	}

	public java.util.Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(java.util.Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public java.lang.String getDiscount() {
		return this.discount;
	}

	public void setDiscount(java.lang.String discount) {
		this.discount = discount;
	}

	public java.lang.String getTax() {
		return this.tax;
	}

	public void setTax(java.lang.String tax) {
		this.tax = tax;
	}

	public java.lang.Integer getShipingCost() {
		return this.shipingCost;
	}

	public void setShipingCost(java.lang.Integer shipingCost) {
		this.shipingCost = shipingCost;
	}

	public java.util.Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(java.util.Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public java.lang.Integer getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(java.lang.Integer subTotal) {
		this.subTotal = subTotal;
	}

	public java.lang.Integer getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(java.lang.Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public java.lang.String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(java.lang.String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public java.lang.String getBankName() {
		return this.bankName;
	}

	public void setBankName(java.lang.String bankName) {
		this.bankName = bankName;
	}

	public java.lang.Integer getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(java.lang.Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public invoiceInformation(java.lang.Integer invoceNumber,
			java.util.Date invoiceDate, java.lang.String discount,
			java.lang.String tax, java.lang.Integer shipingCost,
			java.util.Date deliveryDate, java.lang.Integer subTotal,
			java.lang.Integer totalAmount, java.lang.String paymentMethod,
			java.lang.String bankName, java.lang.Integer accountNumber) {
		this.invoceNumber = invoceNumber;
		this.invoiceDate = invoiceDate;
		this.discount = discount;
		this.tax = tax;
		this.shipingCost = shipingCost;
		this.deliveryDate = deliveryDate;
		this.subTotal = subTotal;
		this.totalAmount = totalAmount;
		this.paymentMethod = paymentMethod;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}

}