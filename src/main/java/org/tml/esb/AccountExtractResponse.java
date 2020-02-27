package org.tml.esb;

import org.infinispan.protostream.annotations.ProtoDoc;
import org.infinispan.protostream.annotations.ProtoField;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@ProtoDoc("@Indexed")
public class AccountExtractResponse {

	@JsonIgnore
	private String rowId;
	@JsonIgnore
	private String conflictId;
	@JsonIgnore
	private String lastUpd;
	@JsonIgnore
	private String created;
	@JsonIgnore
	private String lastUpdBy;
	@JsonIgnore
	private String createdBy;
	@JsonIgnore
	private String modificationNum;
	@JsonIgnore
	private String rowId1;
	@JsonIgnore
	private String activityId;
	@JsonProperty("Exshowroom_Price")
	private String itemDtlAmt;
	@JsonIgnore
	private String assetId;
	@JsonIgnore
	private String bonusQty;
	@JsonIgnore
	private String partRprId;
	@JsonIgnore
	private String extndPrice;
	@JsonIgnore
	private String extndTax;
	@JsonIgnore
	private String invcLnItemId;
	@JsonIgnore
	private String invcTypeCd;
	@JsonIgnore
	private String orderId;
	@JsonIgnore
	private String lnNum;
	@JsonIgnore
	private String orderItemId;
	@JsonIgnore
	private String prodId;
	@JsonProperty("VC_No")
	private String vcNo;
	@JsonIgnore
	private String qtyReq;
	@JsonProperty("Final TCS")
	private String xTcsAmount;
	@JsonIgnore
	private String xTmAccessoriesAmt;
	@JsonProperty("Account_Name")
	private String acctName;
	@JsonIgnore
	private String attrib03;
	@JsonProperty("Salesperson_Name")
	private String login;
	@JsonProperty("Entry Tax(G)")
	private String discountAmt;
	@JsonProperty("Account_Code")
	private String acntId;
	@JsonIgnore
	private String conFstName;
	@JsonIgnore
	private String conLastName;
	@JsonIgnore
	private String conMidName;
	@JsonProperty("Full_Name")
	private String fullName;
	@JsonIgnore
	private String xItemColor;
	@JsonProperty("Customer_Code")
	private String blPerId;
	@JsonProperty("Customer ST/Tin No")
	private String customerSt;
	@JsonIgnore
	private String xEngineNum;
	@JsonIgnore
	private String xExtndPrice;
	@JsonIgnore
	private String xExtendedQty;
	@JsonIgnore
	private String hypothecation;
	@JsonProperty("No PAN")
	private String xInvNoPan;
	@JsonIgnore
	private String xOrdItmDscntPercent;
	@JsonIgnore
	private String xOrdItmDscntAmt;
	@JsonProperty("PAN")
	private String xInvPan;
	@JsonIgnore
	private String xPartBillType;
	@JsonIgnore
	private String xPartStatusCd;
	@JsonIgnore
	private String xPartNum;
	@JsonProperty("Concession")
	private String xPreTaxDscnt;
	@JsonIgnore
	private String xDescText;
	@JsonIgnore
	private String xProdDescLong;
	@JsonIgnore
	private String xRemarks;
	@JsonIgnore
	private String xScmDscAmt;
	@JsonProperty("Chassis_No")
	private String xSerialNum;
	@JsonIgnore
	private String uomCd;
	@JsonIgnore
	private String xUnitPrice;
	@JsonIgnore
	private String xDepreciationPerct;
	@JsonIgnore
	private String xTmDiscountAmt;
	@JsonProperty("Division")
	private String division;
	@JsonProperty("Exchange Bonus")
	private String xXchngbonus;
	@JsonIgnore
	private String xTmExtWarAmt;
	@JsonProperty("Fame Demand Incentive")
	private String xFameDmndInc;
	@JsonIgnore
	private String attrib01;
	@JsonProperty("GSTIN")
	private String xGstin;
	@JsonIgnore
	private String grossAmt;
	@JsonProperty("HSN")
	private String xHsnCode;
	@JsonIgnore
	private String xTmInsuranceAmt;
	@JsonIgnore
	private String attrib16;
	@JsonIgnore
	private String xInsuranceAmount;
	@JsonProperty("Invoice Cancellation Date")
	private String xInvCnclldDt;

	private String invcDt;
	private String invcNum;
	@JsonProperty("Invoice Status")
	private String statusCd;
	@JsonProperty("LOB")
	private String lob;
	@JsonIgnore
	private String xTmNumberplateAmt;
	@JsonProperty("Order_Dt")
	private String orderDt;
	@JsonIgnore
	private String xDisInvtaxAmt;
	@JsonProperty("Order_No")
	private String orderNum;
	@JsonProperty("Order_Type")
	private String orderType;
	@JsonIgnore
	private String xTmOtherAmt;
	@JsonProperty("Model")
	private String model;
	@JsonIgnore
	private String xPermRegnNo;
	@JsonProperty("Place of Supply")
	private String xPlaceOfSupply;
	@JsonIgnore
	private String name20;
	@JsonIgnore
	private String type;
	@JsonIgnore
	private String xTmRegistrationAmt;
	@JsonIgnore
	private String attrib22;
	@JsonIgnore
	private String attrib21;
	@JsonIgnore
	private String qty;
	@JsonProperty("Residential Status")
	private String xResidentStat;
	@JsonProperty("State Code")
	private String xStateCode;
	@JsonProperty("TCS @1%")
	private String xTcsPrice;
	@JsonProperty("Tax Exemption Category")
	private String xTaxexemptCategory;
	@JsonIgnore
	private String xTmTransformationAmt;
	@JsonProperty("VAS 1")
	private String xVas1Price;
	@JsonProperty("VAS 2")
	private String xVas2Price;
	@JsonProperty("VAS 3")
	private String xVas3Price;
	@JsonIgnore
	private String attrib17;
	@JsonIgnore
	private String attrib18;
	@JsonIgnore
	private String attrib36;
	@JsonIgnore
	private String attrib19;
	@JsonIgnore
	private String attrib41;
	@JsonIgnore
	private String tmshtItmId;
	@JsonIgnore
	private String conflictId1;
	@JsonIgnore
	private String lastUpd1;
	@JsonIgnore
	private String created1;
	@JsonIgnore
	private String lastUpdBy1;
	@JsonIgnore
	private String createdBy1;
	@JsonIgnore
	private String modificationNum1;
	@JsonIgnore
	private String rowId2;
// NAME_6
	@JsonProperty("Order Type")
	private String name;
	@JsonProperty("TAX_AMT")
	private String taxAmt;
	@JsonProperty("TAX_RATE")
	private String taxRate;
	@JsonProperty("Quantity")
	private String quantity = "1";
	@JsonProperty("Godown")
	private String godown = "Vehicle Default Location";
	@JsonProperty("SALES_Ledger_name")
	private String salesLedgerName = "SALES LOCAL A/C";
	@JsonProperty("Entry Tax")
	private String entryTax = "0";
	@JsonProperty("Toll Tax")
	private String tollTax = "0";
	@JsonProperty("Surcharge")
	private String surcharge = "0";
	@JsonProperty("Resale Tax")
	private String resaleTax = "0";
	@JsonProperty("Turnover Tax")
	private String turnOverTax = "0";
	@JsonProperty("Road_Cess_and_Infrastructure_Cess")
	private String roadCess;
	@JsonProperty("Octroi")
	private String octroi = "0";
	@JsonProperty("LST")
	private String lst = "0";
	@JsonProperty("Output VAT @ 12.5%")
	private String outputVat125 = "0";
	@JsonProperty("Output VAT @ 20%")
	private String outputVat20 = "0";
	@JsonProperty("Output VAT @ 15%")
	private String outputVat15 = "0";
	@JsonProperty("Output VAT @ 4%")
	private String outputVat4 = "0";
	@JsonProperty("VAT Classification 1")
	private String vatClassification1 = "Output VAT @ 12.5%";
	@JsonProperty("VAT Assessible Amt 1")
	private String vatAssessibleAmt1 = "0";
	@JsonProperty("VAT Classification 2")
	private String vatClassification2 = "Output VAT @ 20%";
	@JsonProperty("VAT Assessible Amt 2")
	private String vatAssessibleAmt2 = "0";
	@JsonProperty("VAT Classification 3")
	private String vatClassification3 = "Output VAT @ 15%";
	@JsonProperty("VAT Assessible Amt 3")
	private String vatAssessibleAmt3 = "0";
	@JsonProperty("VAT Classification 4")
	private String vatClassification4 = "Output VAT @ 4%";
	@JsonProperty("VAT Assessible Amt 4")
	private String vatAssessibleAmt4 = "0";
	@JsonProperty("Output VAT @ 14%")
	private String outputVat14 = "0";
	@JsonProperty("Output VAT @ 14.5%")
	private String outputVat145 = "0";
	@JsonProperty("VAT Classification 5")
	private String vatClassification5 = "Output VAT @ 14%";
	@JsonProperty("VAT Assessible Amt 5")
	private String vatAssessibleAmt5 = "0";
	@JsonProperty("VAT Classification 6")
	private String vatClassification6 = "Output VAT @ 14.5%";
	@JsonProperty("VAT Assessible Amt 6")
	private String vatAssessibleAmt6 = "0";
	@JsonProperty("Output VAT @ 13.5%")
	private String outputVat135 = "0";
	@JsonProperty("VAT Classification 7")
	private String vatClassification7 = "Output VAT @ 13.5%";
	@JsonProperty("VAT Assessible Amt 7")
	private String vatAssessibleAmt7 = "0";
	@JsonProperty("Output VAT @ 13%")
	private String outputVat13 = "0";
	@JsonProperty("VAT Assessible Amt 8")
	private String vatAssessibleAmt8 = "0";
	@JsonProperty("VAT Classification 8")
	private String vatClassification8 = "Output VAT @ 13%";
	@JsonProperty("Output VAT @ 5%")
	private String outputVat5 = "0";
	@JsonProperty("VAT Assessible Amt 9")
	private String vatAssessibleAmt9 = "0";
	@JsonProperty("VAT Classification 9")
	private String vatClassification9 = "Output VAT @ 5%";
	@JsonProperty("Output VAT @ 13.75%")
	private String outputVat1375 = "0";
	@JsonProperty("VAT Assessible Amt 10")
	private String vatAssessibleAmt10 = "0";
	@JsonProperty("VAT Classification 10")
	private String vatClassification10 = "Output VAT @ 13.75%";

	@JsonProperty("Total_Order_Value")
	private String totalOrderValue;

	@JsonProperty("Narration")
	private String narration;

	@JsonProperty("Output CGST")
	private String outputCGST;

	@JsonProperty("Output SGST")
	private String outputSGST;

	@JsonProperty("Output UTGST")
	private String outputUTGST;

	@JsonProperty("Output GST Cess")
	private String outputGSTCess;

	@JsonProperty("CGST Classification")
	private String classficationCGST;

	@JsonProperty("SGST Classification")
	private String classficationSGST;

	@JsonProperty("UTGST Classification")
	private String classficationUTGST;

	@JsonProperty("ITGST Classification")
	private String classficationIGST;

	@JsonProperty("GST Cess Classification")
	private String classficationGSTCess;

	@JsonProperty("GST Cess Assessible Amount")
	private String gstCessAssibleAmount;

	@JsonProperty("Output IGST")
	private String outputIGST;

	@JsonProperty("CGST Assessible Amount")
	private String cgstAssessibleAmount;

	@JsonProperty("SGST Assessible Amount")
	private String sgstAssessibleAmount;

	@JsonProperty("UTGST Assessible Amount")
	private String utgstAssessibleAmount;

	@JsonProperty("IGST Assessible Amount")
	private String igstAssessibleAmount;

	@JsonProperty("Other Tax Amount")
	private String otherTaxAmount;

	@JsonProperty("KFC Assessible Amount")
	private String kfcAccessibleAmount;

	@JsonProperty("Kerala Flood Cess(KFC)")
	private String kfc;

	public void setTotalOrderValue(String totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public void setCgstAssessibleAmount(String cgstAssessibleAmount) {
		this.cgstAssessibleAmount = cgstAssessibleAmount;
	}

	public void setSgstAssessibleAmount(String sgstAssessibleAmount) {
		this.sgstAssessibleAmount = sgstAssessibleAmount;
	}

	public void setUtgstAssessibleAmount(String utgstAssessibleAmount) {
		this.utgstAssessibleAmount = utgstAssessibleAmount;
	}

	public void setIgstAssessibleAmount(String igstAssessibleAmount) {
		this.igstAssessibleAmount = igstAssessibleAmount;
	}

	public String getTotalOrderValue() {
		return totalOrderValue;
	}

	public String getNarration() {
		return narration;
	}

	public String getCgstAssessibleAmount() {
		return cgstAssessibleAmount;
	}

	public String getSgstAssessibleAmount() {
		return sgstAssessibleAmount;
	}

	public String getUtgstAssessibleAmount() {
		return utgstAssessibleAmount;
	}

	public String getIgstAssessibleAmount() {
		return igstAssessibleAmount;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getGodown() {
		return godown;
	}

	public String getSalesLedgerName() {
		return salesLedgerName;
	}

	public String getEntryTax() {
		return entryTax;
	}

	public String getTollTax() {
		return tollTax;
	}

	public String getSurcharge() {
		return surcharge;
	}

	public String getResaleTax() {
		return resaleTax;
	}

	public String getTurnOverTax() {
		return turnOverTax;
	}

	public String getOctroi() {
		return octroi;
	}

	public String getLst() {
		return lst;
	}

	public String getOutputVat125() {
		return outputVat125;
	}

	public String getOutputVat20() {
		return outputVat20;
	}

	public String getOutputVat15() {
		return outputVat15;
	}

	public String getOutputVat4() {
		return outputVat4;
	}

	public String getVatClassification1() {
		return vatClassification1;
	}

	public String getVatAssessibleAmt1() {
		return vatAssessibleAmt1;
	}

	public String getVatClassification2() {
		return vatClassification2;
	}

	public String getVatAssessibleAmt2() {
		return vatAssessibleAmt2;
	}

	public String getVatClassification3() {
		return vatClassification3;
	}

	public String getVatAssessibleAmt3() {
		return vatAssessibleAmt3;
	}

	public String getVatClassification4() {
		return vatClassification4;
	}

	public String getVatAssessibleAmt4() {
		return vatAssessibleAmt4;
	}

	public String getOutputVat14() {
		return outputVat14;
	}

	public String getOutputVat145() {
		return outputVat145;
	}

	public String getVatClassification5() {
		return vatClassification5;
	}

	public String getVatAssessibleAmt5() {
		return vatAssessibleAmt5;
	}

	public String getVatClassification6() {
		return vatClassification6;
	}

	public String getVatAssessibleAmt6() {
		return vatAssessibleAmt6;
	}

	public String getOutputVat135() {
		return outputVat135;
	}

	public String getVatClassification7() {
		return vatClassification7;
	}

	public String getVatAssessibleAmt7() {
		return vatAssessibleAmt7;
	}

	public String getOutputVat13() {
		return outputVat13;
	}

	public String getVatAssessibleAmt8() {
		return vatAssessibleAmt8;
	}

	public String getVatClassification8() {
		return vatClassification8;
	}

	public String getOutputVat5() {
		return outputVat5;
	}

	public String getVatAssessibleAmt9() {
		return vatAssessibleAmt9;
	}

	public String getVatClassification9() {
		return vatClassification9;
	}

	public String getOutputVat1375() {
		return outputVat1375;
	}

	public String getVatAssessibleAmt10() {
		return vatAssessibleAmt10;
	}

	public String getVatClassification10() {
		return vatClassification10;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getConflictId() {
		return conflictId;
	}

	public void setConflictId(String conflictId) {
		this.conflictId = conflictId;
	}

	public String getLastUpd() {
		return lastUpd;
	}

	public void setLastUpd(String lastUpd) {
		this.lastUpd = lastUpd;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getLastUpdBy() {
		return lastUpdBy;
	}

	public void setLastUpdBy(String lastUpdBy) {
		this.lastUpdBy = lastUpdBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModificationNum() {
		return modificationNum;
	}

	public void setModificationNum(String modificationNum) {
		this.modificationNum = modificationNum;
	}

	public String getRowId1() {
		return rowId1;
	}

	public void setRowId1(String rowId1) {
		this.rowId1 = rowId1;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getItemDtlAmt() {
		return itemDtlAmt;
	}

	public void setItemDtlAmt(String itemDtlAmt) {
		this.itemDtlAmt = itemDtlAmt;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getBonusQty() {
		return bonusQty;
	}

	public void setBonusQty(String bonusQty) {
		this.bonusQty = bonusQty;
	}

	public String getPartRprId() {
		return partRprId;
	}

	public void setPartRprId(String partRprId) {
		this.partRprId = partRprId;
	}

	public String getExtndPrice() {
		return extndPrice;
	}

	public void setExtndPrice(String extndPrice) {
		this.extndPrice = extndPrice;
	}

	public String getExtndTax() {
		return extndTax;
	}

	public void setExtndTax(String extndTax) {
		this.extndTax = extndTax;
	}

	public String getInvcLnItemId() {
		return invcLnItemId;
	}

	public void setInvcLnItemId(String invcLnItemId) {
		this.invcLnItemId = invcLnItemId;
	}

	public String getInvcTypeCd() {
		return invcTypeCd;
	}

	public void setInvcTypeCd(String invcTypeCd) {
		this.invcTypeCd = invcTypeCd;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getLnNum() {
		return lnNum;
	}

	public void setLnNum(String lnNum) {
		this.lnNum = lnNum;
	}

	public String getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getQtyReq() {
		return qtyReq;
	}

	public void setQtyReq(String qtyReq) {
		this.qtyReq = qtyReq;
	}

	public String getxTcsAmount() {
		return xTcsAmount;
	}

	public void setxTcsAmount(String xTcsAmount) {
		this.xTcsAmount = xTcsAmount;
	}

	public String getxTmAccessoriesAmt() {
		return xTmAccessoriesAmt;
	}

	public void setxTmAccessoriesAmt(String xTmAccessoriesAmt) {
		this.xTmAccessoriesAmt = xTmAccessoriesAmt;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAttrib03() {
		return attrib03;
	}

	public void setAttrib03(String attrib03) {
		this.attrib03 = attrib03;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getDiscountAmt() {
		return discountAmt;
	}

	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}

	public String getAcntId() {
		return acntId;
	}

	public void setAcntId(String acntId) {
		this.acntId = acntId;
	}

	public String getConFstName() {
		return conFstName;
	}

	public void setConFstName(String conFstName) {
		if (conFstName != null)
			this.conFstName = conFstName;
		else
			this.conFstName = "";
	}

	public String getConLastName() {
		return conLastName;
	}

	public void setConLastName(String conLastName) {
		if (conLastName != null)
			this.conLastName = conLastName;
		else
			this.conLastName = "";
	}

	public String getConMidName() {
		return conMidName;
	}

	public void setConMidName(String conMidName) {
		if (conMidName != null)
			this.conMidName = conMidName;
		else
			this.conMidName = "";
	}

	public String getxItemColor() {
		return xItemColor;
	}

	public void setxItemColor(String xItemColor) {
		this.xItemColor = xItemColor;
	}

	public String getBlPerId() {
		return blPerId;
	}

	public void setBlPerId(String blPerId) {
		this.blPerId = blPerId;
	}

	public String getCustomerSt() {
		return customerSt;
	}

	public void setCustomerSt(String customerSt) {
		this.customerSt = customerSt;
	}

	public String getxEngineNum() {
		return xEngineNum;
	}

	public void setxEngineNum(String xEngineNum) {
		this.xEngineNum = xEngineNum;
	}

	public String getxExtndPrice() {
		return xExtndPrice;
	}

	public void setxExtndPrice(String xExtndPrice) {
		this.xExtndPrice = xExtndPrice;
	}

	public String getxExtendedQty() {
		return xExtendedQty;
	}

	public void setxExtendedQty(String xExtendedQty) {
		this.xExtendedQty = xExtendedQty;
	}

	public String getHypothecation() {
		return hypothecation;
	}

	public void setHypothecation(String hypothecation) {
		this.hypothecation = hypothecation;
	}

	public String getxInvNoPan() {
		return xInvNoPan;
	}

	public void setxInvNoPan(String xInvNoPan) {
		this.xInvNoPan = xInvNoPan;
	}

	public String getxOrdItmDscntPercent() {
		return xOrdItmDscntPercent;
	}

	public void setxOrdItmDscntPercent(String xOrdItmDscntPercent) {
		this.xOrdItmDscntPercent = xOrdItmDscntPercent;
	}

	public String getxOrdItmDscntAmt() {
		return xOrdItmDscntAmt;
	}

	public void setxOrdItmDscntAmt(String xOrdItmDscntAmt) {
		this.xOrdItmDscntAmt = xOrdItmDscntAmt;
	}

	public String getxInvPan() {
		return xInvPan;
	}

	public void setxInvPan(String xInvPan) {
		this.xInvPan = xInvPan;
	}

	public String getxPartBillType() {
		return xPartBillType;
	}

	public void setxPartBillType(String xPartBillType) {
		this.xPartBillType = xPartBillType;
	}

	public String getxPartStatusCd() {
		return xPartStatusCd;
	}

	public void setxPartStatusCd(String xPartStatusCd) {
		this.xPartStatusCd = xPartStatusCd;
	}

	public String getxPartNum() {
		return xPartNum;
	}

	public void setxPartNum(String xPartNum) {
		this.xPartNum = xPartNum;
	}

	public String getxPreTaxDscnt() {
		return xPreTaxDscnt;
	}

	public void setxPreTaxDscnt(String xPreTaxDscnt) {
		this.xPreTaxDscnt = xPreTaxDscnt;
	}

	public String getxDescText() {
		return xDescText;
	}

	public void setxDescText(String xDescText) {
		this.xDescText = xDescText;
	}

	public String getxProdDescLong() {
		return xProdDescLong;
	}

	public void setxProdDescLong(String xProdDescLong) {
		this.xProdDescLong = xProdDescLong;
	}

	public String getxRemarks() {
		return xRemarks;
	}

	public void setxRemarks(String xRemarks) {
		this.xRemarks = xRemarks;
	}

	public String getxScmDscAmt() {
		return xScmDscAmt;
	}

	public void setxScmDscAmt(String xScmDscAmt) {
		this.xScmDscAmt = xScmDscAmt;
	}

	public String getxSerialNum() {
		return xSerialNum;
	}

	public void setxSerialNum(String xSerialNum) {
		this.xSerialNum = xSerialNum;
	}

	public String getUomCd() {
		return uomCd;
	}

	public void setUomCd(String uomCd) {
		this.uomCd = uomCd;
	}

	public String getxUnitPrice() {
		return xUnitPrice;
	}

	public void setxUnitPrice(String xUnitPrice) {
		this.xUnitPrice = xUnitPrice;
	}

	public String getxDepreciationPerct() {
		return xDepreciationPerct;
	}

	public void setxDepreciationPerct(String xDepreciationPerct) {
		this.xDepreciationPerct = xDepreciationPerct;
	}

	public String getxTmDiscountAmt() {
		return xTmDiscountAmt;
	}

	public void setxTmDiscountAmt(String xTmDiscountAmt) {
		this.xTmDiscountAmt = xTmDiscountAmt;
	}

	public String getxXchngbonus() {
		return xXchngbonus;
	}

	public void setxXchngbonus(String xXchngbonus) {
		this.xXchngbonus = xXchngbonus;
	}

	public String getxTmExtWarAmt() {
		return xTmExtWarAmt;
	}

	public void setxTmExtWarAmt(String xTmExtWarAmt) {
		this.xTmExtWarAmt = xTmExtWarAmt;
	}

	public String getxFameDmndInc() {
		return xFameDmndInc;
	}

	public void setxFameDmndInc(String xFameDmndInc) {
		this.xFameDmndInc = xFameDmndInc;
	}

	public String getAttrib01() {
		return attrib01;
	}

	public void setAttrib01(String attrib01) {
		this.attrib01 = attrib01;
	}

	public String getxGstin() {
		return xGstin;
	}

	public void setxGstin(String xGstin) {
		this.xGstin = xGstin;
	}

	public String getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(String grossAmt) {
		this.grossAmt = grossAmt;
	}

	public String getxHsnCode() {
		return xHsnCode;
	}

	public void setxHsnCode(String xHsnCode) {
		this.xHsnCode = xHsnCode;
	}

	public String getxTmInsuranceAmt() {
		return xTmInsuranceAmt;
	}

	public void setxTmInsuranceAmt(String xTmInsuranceAmt) {
		this.xTmInsuranceAmt = xTmInsuranceAmt;
	}

	public String getAttrib16() {
		return attrib16;
	}

	public void setAttrib16(String attrib16) {
		this.attrib16 = attrib16;
	}

	public String getxInsuranceAmount() {
		return xInsuranceAmount;
	}

	public void setxInsuranceAmount(String xInsuranceAmount) {
		this.xInsuranceAmount = xInsuranceAmount;
	}

	public String getxInvCnclldDt() {
		return xInvCnclldDt;
	}

	public void setxInvCnclldDt(String xInvCnclldDt) {
		this.xInvCnclldDt = xInvCnclldDt;
	}

	@ProtoDoc("@IndexedField(index = true, store=false)")
	@ProtoField(number = 1)
	public String getInvcDt() {
		return invcDt;
	}

	public void setInvcDt(String invcDt) {
		this.invcDt = invcDt;
	}

	@ProtoDoc("@IndexedField(index = true, store=false)")
	@ProtoField(number = 2)
	public String getInvcNum() {
		return invcNum;
	}

	public void setInvcNum(String invcNum) {
		this.invcNum = invcNum;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getxTmNumberplateAmt() {
		return xTmNumberplateAmt;
	}

	public void setxTmNumberplateAmt(String xTmNumberplateAmt) {
		this.xTmNumberplateAmt = xTmNumberplateAmt;
	}

	public String getOrderDt() {
		return orderDt;
	}

	public void setOrderDt(String orderDt) {
		this.orderDt = orderDt;
	}

	public String getxDisInvtaxAmt() {
		return xDisInvtaxAmt;
	}

	public void setxDisInvtaxAmt(String xDisInvtaxAmt) {
		this.xDisInvtaxAmt = xDisInvtaxAmt;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getxTmOtherAmt() {
		return xTmOtherAmt;
	}

	public void setxTmOtherAmt(String xTmOtherAmt) {
		this.xTmOtherAmt = xTmOtherAmt;
	}

	public String getxPermRegnNo() {
		return xPermRegnNo;
	}

	public void setxPermRegnNo(String xPermRegnNo) {
		this.xPermRegnNo = xPermRegnNo;
	}

	public String getxPlaceOfSupply() {
		return xPlaceOfSupply;
	}

	public void setxPlaceOfSupply(String xPlaceOfSupply) {
		this.xPlaceOfSupply = xPlaceOfSupply;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getxTmRegistrationAmt() {
		return xTmRegistrationAmt;
	}

	public void setxTmRegistrationAmt(String xTmRegistrationAmt) {
		this.xTmRegistrationAmt = xTmRegistrationAmt;
	}

	public String getAttrib22() {
		return attrib22;
	}

	public void setAttrib22(String attrib22) {
		this.attrib22 = attrib22;
	}

	public String getAttrib21() {
		return attrib21;
	}

	public void setAttrib21(String attrib21) {
		this.attrib21 = attrib21;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getxResidentStat() {
		return xResidentStat;
	}

	public void setxResidentStat(String xResidentStat) {
		this.xResidentStat = xResidentStat;
	}

	public String getxStateCode() {
		return xStateCode;
	}

	public void setxStateCode(String xStateCode) {
		this.xStateCode = xStateCode;
	}

	public String getxTcsPrice() {
		return xTcsPrice;
	}

	public void setxTcsPrice(String xTcsPrice) {
		this.xTcsPrice = xTcsPrice;
	}

	public String getxTaxexemptCategory() {
		return xTaxexemptCategory;
	}

	public void setxTaxexemptCategory(String xTaxexemptCategory) {
		this.xTaxexemptCategory = xTaxexemptCategory;
	}

	public String getxTmTransformationAmt() {
		return xTmTransformationAmt;
	}

	public void setxTmTransformationAmt(String xTmTransformationAmt) {
		this.xTmTransformationAmt = xTmTransformationAmt;
	}

	public String getxVas1Price() {
		return xVas1Price;
	}

	public void setxVas1Price(String xVas1Price) {
		this.xVas1Price = xVas1Price;
	}

	public String getxVas2Price() {
		return xVas2Price;
	}

	public void setxVas2Price(String xVas2Price) {
		this.xVas2Price = xVas2Price;
	}

	public String getxVas3Price() {
		return xVas3Price;
	}

	public void setxVas3Price(String xVas3Price) {
		this.xVas3Price = xVas3Price;
	}

	public String getAttrib17() {
		return attrib17;
	}

	public void setAttrib17(String attrib17) {
		this.attrib17 = attrib17;
	}

	public String getAttrib18() {
		return attrib18;
	}

	public void setAttrib18(String attrib18) {
		this.attrib18 = attrib18;
	}

	public String getAttrib36() {
		return attrib36;
	}

	public void setAttrib36(String attrib36) {
		this.attrib36 = attrib36;
	}

	public String getAttrib19() {
		return attrib19;
	}

	public void setAttrib19(String attrib19) {
		this.attrib19 = attrib19;
	}

	public String getAttrib41() {
		return attrib41;
	}

	public void setAttrib41(String attrib41) {
		this.attrib41 = attrib41;
	}

	public String getTmshtItmId() {
		return tmshtItmId;
	}

	public void setTmshtItmId(String tmshtItmId) {
		this.tmshtItmId = tmshtItmId;
	}

	public String getConflictId1() {
		return conflictId1;
	}

	public void setConflictId1(String conflictId1) {
		this.conflictId1 = conflictId1;
	}

	public String getLastUpd1() {
		return lastUpd1;
	}

	public void setLastUpd1(String lastUpd1) {
		this.lastUpd1 = lastUpd1;
	}

	public String getCreated1() {
		return created1;
	}

	public void setCreated1(String created1) {
		this.created1 = created1;
	}

	public String getLastUpdBy1() {
		return lastUpdBy1;
	}

	public void setLastUpdBy1(String lastUpdBy1) {
		this.lastUpdBy1 = lastUpdBy1;
	}

	public String getCreatedBy1() {
		return createdBy1;
	}

	public void setCreatedBy1(String createdBy1) {
		this.createdBy1 = createdBy1;
	}

	public String getModificationNum1() {
		return modificationNum1;
	}

	public void setModificationNum1(String modificationNum1) {
		this.modificationNum1 = modificationNum1;
	}

	public String getRowId2() {
		return rowId2;
	}

	public void setRowId2(String rowId2) {
		this.rowId2 = rowId2;
	}

	public String getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName20() {
		return name20;
	}

	public void setName20(String name20) {
		this.name20 = name20;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVcNo() {
		return vcNo;
	}

	public void setVcNo(String vcNo) {
		this.vcNo = vcNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setGodown(String godown) {
		this.godown = godown;
	}

	public void setSalesLedgerName(String salesLedgerName) {
		this.salesLedgerName = salesLedgerName;
	}

	public void setEntryTax(String entryTax) {
		this.entryTax = entryTax;
	}

	public void setTollTax(String tollTax) {
		this.tollTax = tollTax;
	}

	public void setSurcharge(String surcharge) {
		this.surcharge = surcharge;
	}

	public void setResaleTax(String resaleTax) {
		this.resaleTax = resaleTax;
	}

	public void setTurnOverTax(String turnOverTax) {
		this.turnOverTax = turnOverTax;
	}

	public void setOctroi(String octroi) {
		this.octroi = octroi;
	}

	public void setLst(String lst) {
		this.lst = lst;
	}

	public void setOutputVat125(String outputVat125) {
		this.outputVat125 = outputVat125;
	}

	public void setOutputVat20(String outputVat20) {
		this.outputVat20 = outputVat20;
	}

	public void setOutputVat15(String outputVat15) {
		this.outputVat15 = outputVat15;
	}

	public void setOutputVat4(String outputVat4) {
		this.outputVat4 = outputVat4;
	}

	public void setVatClassification1(String vatClassification1) {
		this.vatClassification1 = vatClassification1;
	}

	public void setVatAssessibleAmt1(String vatAssessibleAmt1) {
		this.vatAssessibleAmt1 = vatAssessibleAmt1;
	}

	public void setVatClassification2(String vatClassification2) {
		this.vatClassification2 = vatClassification2;
	}

	public void setVatAssessibleAmt2(String vatAssessibleAmt2) {
		this.vatAssessibleAmt2 = vatAssessibleAmt2;
	}

	public void setVatClassification3(String vatClassification3) {
		this.vatClassification3 = vatClassification3;
	}

	public void setVatAssessibleAmt3(String vatAssessibleAmt3) {
		this.vatAssessibleAmt3 = vatAssessibleAmt3;
	}

	public void setVatClassification4(String vatClassification4) {
		this.vatClassification4 = vatClassification4;
	}

	public void setVatAssessibleAmt4(String vatAssessibleAmt4) {
		this.vatAssessibleAmt4 = vatAssessibleAmt4;
	}

	public void setOutputVat14(String outputVat14) {
		this.outputVat14 = outputVat14;
	}

	public void setOutputVat145(String outputVat145) {
		this.outputVat145 = outputVat145;
	}

	public void setVatClassification5(String vatClassification5) {
		this.vatClassification5 = vatClassification5;
	}

	public void setVatAssessibleAmt5(String vatAssessibleAmt5) {
		this.vatAssessibleAmt5 = vatAssessibleAmt5;
	}

	public void setVatClassification6(String vatClassification6) {
		this.vatClassification6 = vatClassification6;
	}

	public void setVatAssessibleAmt6(String vatAssessibleAmt6) {
		this.vatAssessibleAmt6 = vatAssessibleAmt6;
	}

	public void setOutputVat135(String outputVat135) {
		this.outputVat135 = outputVat135;
	}

	public void setVatClassification7(String vatClassification7) {
		this.vatClassification7 = vatClassification7;
	}

	public void setVatAssessibleAmt7(String vatAssessibleAmt7) {
		this.vatAssessibleAmt7 = vatAssessibleAmt7;
	}

	public void setOutputVat13(String outputVat13) {
		this.outputVat13 = outputVat13;
	}

	public void setVatAssessibleAmt8(String vatAssessibleAmt8) {
		this.vatAssessibleAmt8 = vatAssessibleAmt8;
	}

	public void setVatClassification8(String vatClassification8) {
		this.vatClassification8 = vatClassification8;
	}

	public void setOutputVat5(String outputVat5) {
		this.outputVat5 = outputVat5;
	}

	public void setVatAssessibleAmt9(String vatAssessibleAmt9) {
		this.vatAssessibleAmt9 = vatAssessibleAmt9;
	}

	public void setVatClassification9(String vatClassification9) {
		this.vatClassification9 = vatClassification9;
	}

	public void setOutputVat1375(String outputVat1375) {
		this.outputVat1375 = outputVat1375;
	}

	public void setVatAssessibleAmt10(String vatAssessibleAmt10) {
		this.vatAssessibleAmt10 = vatAssessibleAmt10;
	}

	public void setVatClassification10(String vatClassification10) {
		this.vatClassification10 = vatClassification10;
	}

	public String getRoadCess() {
		return roadCess;
	}

	public void setRoadCess(String roadCess) {
		this.roadCess = roadCess;
	}

	public String getOutputCGST() {
		return outputCGST;
	}

	public void setOutputCGST(String outputCGST) {
		this.outputCGST = outputCGST;
	}

	public String getOutputSGST() {
		return outputSGST;
	}

	public void setOutputSGST(String outputSGST) {
		this.outputSGST = outputSGST;
	}

	public String getOutputUTGST() {
		return outputUTGST;
	}

	public void setOutputUTGST(String outputUTGST) {
		this.outputUTGST = outputUTGST;
	}

	public String getOutputGSTCess() {
		return outputGSTCess;
	}

	public void setOutputGSTCess(String outputGSTCess) {
		this.outputGSTCess = outputGSTCess;
	}

	public String getClassficationCGST() {
		return classficationCGST;
	}

	public void setClassficationCGST(String classficationCGST) {
		this.classficationCGST = classficationCGST;
	}

	public String getClassficationSGST() {
		return classficationSGST;
	}

	public void setClassficationSGST(String classficationSGST) {
		this.classficationSGST = classficationSGST;
	}

	public String getClassficationUTGST() {
		return classficationUTGST;
	}

	public void setClassficationUTGST(String classficationUTGST) {
		this.classficationUTGST = classficationUTGST;
	}

	public String getClassficationGSTCess() {
		return classficationGSTCess;
	}

	public void setClassficationGSTCess(String classficationGSTCess) {
		this.classficationGSTCess = classficationGSTCess;
	}

	public String getGstCessAssibleAmount() {
		return gstCessAssibleAmount;
	}

	public void setGstCessAssibleAmount(String gstCessAssibleAmount) {
		this.gstCessAssibleAmount = gstCessAssibleAmount;
	}

	public String getOutputIGST() {
		return outputIGST;
	}

	public void setOutputIGST(String outputIGST) {
		this.outputIGST = outputIGST;
	}

	public String getOtherTaxAmount() {
		return otherTaxAmount;
	}

	public void setOtherTaxAmount(String otherTaxAmount) {
		this.otherTaxAmount = otherTaxAmount;
	}

	public String getKfcAccessibleAmount() {
		return kfcAccessibleAmount;
	}

	public void setKfcAccessibleAmount(String kfcAccessibleAmount) {
		this.kfcAccessibleAmount = kfcAccessibleAmount;
	}

	public String getKfc() {
		return kfc;
	}

	public void setKfc(String kfc) {
		this.kfc = kfc;
	}

	public String getClassficationIGST() {
		return classficationIGST;
	}

	public void setClassficationIGST(String classficationIGST) {
		this.classficationIGST = classficationIGST;
	}
}