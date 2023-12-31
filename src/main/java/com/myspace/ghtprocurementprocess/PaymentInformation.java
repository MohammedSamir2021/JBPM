package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PaymentInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "subTotal")
	private java.lang.Integer subTotal;
	@org.kie.api.definition.type.Label(value = "totalAmount")
	private java.lang.Integer totalAmount;
	@org.kie.api.definition.type.Label(value = "paymentMethod")
	private java.lang.String paymentMethod;

	public PaymentInformation() {
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

	public PaymentInformation(java.lang.Integer subTotal,
			java.lang.Integer totalAmount, java.lang.String paymentMethod) {
		this.subTotal = subTotal;
		this.totalAmount = totalAmount;
		this.paymentMethod = paymentMethod;
	}

}