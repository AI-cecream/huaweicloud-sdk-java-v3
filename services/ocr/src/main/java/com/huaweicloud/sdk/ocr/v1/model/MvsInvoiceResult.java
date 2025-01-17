package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MvsInvoiceResult
 */
public class MvsInvoiceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_printed_code")

    private String machinePrintedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_printed_number")

    private String machinePrintedNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_number")

    private String machineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_name")

    private String buyerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_organization_number")

    private String buyerOrganizationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_id")

    private String buyerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_name")

    private String sellerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_phone")

    private String sellerPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_id")

    private String sellerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_account")

    private String sellerAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_address")

    private String sellerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_bank")

    private String sellerBank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_type")

    private String vehicleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brand_model")

    private String brandModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturing_location")

    private String manufacturingLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_certificate")

    private String qualityCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_certificate")

    private String importCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_number")

    private String inspectionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_number")

    private String engineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_identification_number")

    private String vehicleIdentificationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tonnage")

    private String tonnage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seating_capacity")

    private String seatingCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_authority")

    private String taxAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_authority_code")

    private String taxAuthorityCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_payment_receipt")

    private String taxPaymentReceipt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_rate")

    private String taxRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax")

    private String tax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_exclusive_price")

    private String taxExclusivePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private String total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_chinese")

    private String totalChinese;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fiscal_code")

    private String fiscalCode;

    public MvsInvoiceResult withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 发票代码。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MvsInvoiceResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 发票号码。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MvsInvoiceResult withMachinePrintedCode(String machinePrintedCode) {
        this.machinePrintedCode = machinePrintedCode;
        return this;
    }

    /**
     * 机打代码。 
     * @return machinePrintedCode
     */
    public String getMachinePrintedCode() {
        return machinePrintedCode;
    }

    public void setMachinePrintedCode(String machinePrintedCode) {
        this.machinePrintedCode = machinePrintedCode;
    }

    public MvsInvoiceResult withMachinePrintedNumber(String machinePrintedNumber) {
        this.machinePrintedNumber = machinePrintedNumber;
        return this;
    }

    /**
     * 机打号码。 
     * @return machinePrintedNumber
     */
    public String getMachinePrintedNumber() {
        return machinePrintedNumber;
    }

    public void setMachinePrintedNumber(String machinePrintedNumber) {
        this.machinePrintedNumber = machinePrintedNumber;
    }

    public MvsInvoiceResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 开票日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public MvsInvoiceResult withMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
        return this;
    }

    /**
     * 机器编号。 
     * @return machineNumber
     */
    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public MvsInvoiceResult withBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }

    /**
     * 购买方名称。 
     * @return buyerName
     */
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public MvsInvoiceResult withBuyerOrganizationNumber(String buyerOrganizationNumber) {
        this.buyerOrganizationNumber = buyerOrganizationNumber;
        return this;
    }

    /**
     * 购买方身份证号码/组织机构代码。 
     * @return buyerOrganizationNumber
     */
    public String getBuyerOrganizationNumber() {
        return buyerOrganizationNumber;
    }

    public void setBuyerOrganizationNumber(String buyerOrganizationNumber) {
        this.buyerOrganizationNumber = buyerOrganizationNumber;
    }

    public MvsInvoiceResult withBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }

    /**
     * 购买方纳税人识别号。 
     * @return buyerId
     */
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public MvsInvoiceResult withSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    /**
     * 销货单位名称。 
     * @return sellerName
     */
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public MvsInvoiceResult withSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
        return this;
    }

    /**
     * 销售方电话。 
     * @return sellerPhone
     */
    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public MvsInvoiceResult withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * 销售方纳税人识别号。 
     * @return sellerId
     */
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public MvsInvoiceResult withSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
        return this;
    }

    /**
     * 销售方账号。 
     * @return sellerAccount
     */
    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public MvsInvoiceResult withSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
        return this;
    }

    /**
     * 销售方地址。 
     * @return sellerAddress
     */
    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public MvsInvoiceResult withSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
        return this;
    }

    /**
     * 销售方开户行。 
     * @return sellerBank
     */
    public String getSellerBank() {
        return sellerBank;
    }

    public void setSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
    }

    public MvsInvoiceResult withVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    /**
     * 车辆类型。 
     * @return vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public MvsInvoiceResult withBrandModel(String brandModel) {
        this.brandModel = brandModel;
        return this;
    }

    /**
     * 厂牌型号。 
     * @return brandModel
     */
    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public MvsInvoiceResult withManufacturingLocation(String manufacturingLocation) {
        this.manufacturingLocation = manufacturingLocation;
        return this;
    }

    /**
     * 产地。 
     * @return manufacturingLocation
     */
    public String getManufacturingLocation() {
        return manufacturingLocation;
    }

    public void setManufacturingLocation(String manufacturingLocation) {
        this.manufacturingLocation = manufacturingLocation;
    }

    public MvsInvoiceResult withQualityCertificate(String qualityCertificate) {
        this.qualityCertificate = qualityCertificate;
        return this;
    }

    /**
     * 合格证号。 
     * @return qualityCertificate
     */
    public String getQualityCertificate() {
        return qualityCertificate;
    }

    public void setQualityCertificate(String qualityCertificate) {
        this.qualityCertificate = qualityCertificate;
    }

    public MvsInvoiceResult withImportCertificate(String importCertificate) {
        this.importCertificate = importCertificate;
        return this;
    }

    /**
     * 进口证明书号。 
     * @return importCertificate
     */
    public String getImportCertificate() {
        return importCertificate;
    }

    public void setImportCertificate(String importCertificate) {
        this.importCertificate = importCertificate;
    }

    public MvsInvoiceResult withInspectionNumber(String inspectionNumber) {
        this.inspectionNumber = inspectionNumber;
        return this;
    }

    /**
     * 商检单号。 
     * @return inspectionNumber
     */
    public String getInspectionNumber() {
        return inspectionNumber;
    }

    public void setInspectionNumber(String inspectionNumber) {
        this.inspectionNumber = inspectionNumber;
    }

    public MvsInvoiceResult withEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
        return this;
    }

    /**
     * 发动机号码。 
     * @return engineNumber
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public MvsInvoiceResult withVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        return this;
    }

    /**
     * 车辆识别代号/车架号码。 
     * @return vehicleIdentificationNumber
     */
    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public MvsInvoiceResult withTonnage(String tonnage) {
        this.tonnage = tonnage;
        return this;
    }

    /**
     * 吨位。 
     * @return tonnage
     */
    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    public MvsInvoiceResult withSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    /**
     * 限乘人数。 
     * @return seatingCapacity
     */
    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public MvsInvoiceResult withTaxAuthority(String taxAuthority) {
        this.taxAuthority = taxAuthority;
        return this;
    }

    /**
     * 主管税务机关。 
     * @return taxAuthority
     */
    public String getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(String taxAuthority) {
        this.taxAuthority = taxAuthority;
    }

    public MvsInvoiceResult withTaxAuthorityCode(String taxAuthorityCode) {
        this.taxAuthorityCode = taxAuthorityCode;
        return this;
    }

    /**
     * 主管税务机关代码。 
     * @return taxAuthorityCode
     */
    public String getTaxAuthorityCode() {
        return taxAuthorityCode;
    }

    public void setTaxAuthorityCode(String taxAuthorityCode) {
        this.taxAuthorityCode = taxAuthorityCode;
    }

    public MvsInvoiceResult withTaxPaymentReceipt(String taxPaymentReceipt) {
        this.taxPaymentReceipt = taxPaymentReceipt;
        return this;
    }

    /**
     * 完税凭证号码。 
     * @return taxPaymentReceipt
     */
    public String getTaxPaymentReceipt() {
        return taxPaymentReceipt;
    }

    public void setTaxPaymentReceipt(String taxPaymentReceipt) {
        this.taxPaymentReceipt = taxPaymentReceipt;
    }

    public MvsInvoiceResult withTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * 增值税税率或征收率。 
     * @return taxRate
     */
    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public MvsInvoiceResult withTax(String tax) {
        this.tax = tax;
        return this;
    }

    /**
     * 增值税税额。 
     * @return tax
     */
    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public MvsInvoiceResult withTaxExclusivePrice(String taxExclusivePrice) {
        this.taxExclusivePrice = taxExclusivePrice;
        return this;
    }

    /**
     * 不含税价。 
     * @return taxExclusivePrice
     */
    public String getTaxExclusivePrice() {
        return taxExclusivePrice;
    }

    public void setTaxExclusivePrice(String taxExclusivePrice) {
        this.taxExclusivePrice = taxExclusivePrice;
    }

    public MvsInvoiceResult withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * 价税合计。 
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public MvsInvoiceResult withTotalChinese(String totalChinese) {
        this.totalChinese = totalChinese;
        return this;
    }

    /**
     * 价税合计大写。 
     * @return totalChinese
     */
    public String getTotalChinese() {
        return totalChinese;
    }

    public void setTotalChinese(String totalChinese) {
        this.totalChinese = totalChinese;
    }

    public MvsInvoiceResult withFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
        return this;
    }

    /**
     * 税控码。 
     * @return fiscalCode
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MvsInvoiceResult mvsInvoiceResult = (MvsInvoiceResult) o;
        return Objects.equals(this.code, mvsInvoiceResult.code) && Objects.equals(this.number, mvsInvoiceResult.number)
            && Objects.equals(this.machinePrintedCode, mvsInvoiceResult.machinePrintedCode)
            && Objects.equals(this.machinePrintedNumber, mvsInvoiceResult.machinePrintedNumber)
            && Objects.equals(this.issueDate, mvsInvoiceResult.issueDate)
            && Objects.equals(this.machineNumber, mvsInvoiceResult.machineNumber)
            && Objects.equals(this.buyerName, mvsInvoiceResult.buyerName)
            && Objects.equals(this.buyerOrganizationNumber, mvsInvoiceResult.buyerOrganizationNumber)
            && Objects.equals(this.buyerId, mvsInvoiceResult.buyerId)
            && Objects.equals(this.sellerName, mvsInvoiceResult.sellerName)
            && Objects.equals(this.sellerPhone, mvsInvoiceResult.sellerPhone)
            && Objects.equals(this.sellerId, mvsInvoiceResult.sellerId)
            && Objects.equals(this.sellerAccount, mvsInvoiceResult.sellerAccount)
            && Objects.equals(this.sellerAddress, mvsInvoiceResult.sellerAddress)
            && Objects.equals(this.sellerBank, mvsInvoiceResult.sellerBank)
            && Objects.equals(this.vehicleType, mvsInvoiceResult.vehicleType)
            && Objects.equals(this.brandModel, mvsInvoiceResult.brandModel)
            && Objects.equals(this.manufacturingLocation, mvsInvoiceResult.manufacturingLocation)
            && Objects.equals(this.qualityCertificate, mvsInvoiceResult.qualityCertificate)
            && Objects.equals(this.importCertificate, mvsInvoiceResult.importCertificate)
            && Objects.equals(this.inspectionNumber, mvsInvoiceResult.inspectionNumber)
            && Objects.equals(this.engineNumber, mvsInvoiceResult.engineNumber)
            && Objects.equals(this.vehicleIdentificationNumber, mvsInvoiceResult.vehicleIdentificationNumber)
            && Objects.equals(this.tonnage, mvsInvoiceResult.tonnage)
            && Objects.equals(this.seatingCapacity, mvsInvoiceResult.seatingCapacity)
            && Objects.equals(this.taxAuthority, mvsInvoiceResult.taxAuthority)
            && Objects.equals(this.taxAuthorityCode, mvsInvoiceResult.taxAuthorityCode)
            && Objects.equals(this.taxPaymentReceipt, mvsInvoiceResult.taxPaymentReceipt)
            && Objects.equals(this.taxRate, mvsInvoiceResult.taxRate) && Objects.equals(this.tax, mvsInvoiceResult.tax)
            && Objects.equals(this.taxExclusivePrice, mvsInvoiceResult.taxExclusivePrice)
            && Objects.equals(this.total, mvsInvoiceResult.total)
            && Objects.equals(this.totalChinese, mvsInvoiceResult.totalChinese)
            && Objects.equals(this.fiscalCode, mvsInvoiceResult.fiscalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
            number,
            machinePrintedCode,
            machinePrintedNumber,
            issueDate,
            machineNumber,
            buyerName,
            buyerOrganizationNumber,
            buyerId,
            sellerName,
            sellerPhone,
            sellerId,
            sellerAccount,
            sellerAddress,
            sellerBank,
            vehicleType,
            brandModel,
            manufacturingLocation,
            qualityCertificate,
            importCertificate,
            inspectionNumber,
            engineNumber,
            vehicleIdentificationNumber,
            tonnage,
            seatingCapacity,
            taxAuthority,
            taxAuthorityCode,
            taxPaymentReceipt,
            taxRate,
            tax,
            taxExclusivePrice,
            total,
            totalChinese,
            fiscalCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MvsInvoiceResult {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    machinePrintedCode: ").append(toIndentedString(machinePrintedCode)).append("\n");
        sb.append("    machinePrintedNumber: ").append(toIndentedString(machinePrintedNumber)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    machineNumber: ").append(toIndentedString(machineNumber)).append("\n");
        sb.append("    buyerName: ").append(toIndentedString(buyerName)).append("\n");
        sb.append("    buyerOrganizationNumber: ").append(toIndentedString(buyerOrganizationNumber)).append("\n");
        sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
        sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
        sb.append("    sellerPhone: ").append(toIndentedString(sellerPhone)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    sellerAccount: ").append(toIndentedString(sellerAccount)).append("\n");
        sb.append("    sellerAddress: ").append(toIndentedString(sellerAddress)).append("\n");
        sb.append("    sellerBank: ").append(toIndentedString(sellerBank)).append("\n");
        sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
        sb.append("    brandModel: ").append(toIndentedString(brandModel)).append("\n");
        sb.append("    manufacturingLocation: ").append(toIndentedString(manufacturingLocation)).append("\n");
        sb.append("    qualityCertificate: ").append(toIndentedString(qualityCertificate)).append("\n");
        sb.append("    importCertificate: ").append(toIndentedString(importCertificate)).append("\n");
        sb.append("    inspectionNumber: ").append(toIndentedString(inspectionNumber)).append("\n");
        sb.append("    engineNumber: ").append(toIndentedString(engineNumber)).append("\n");
        sb.append("    vehicleIdentificationNumber: ")
            .append(toIndentedString(vehicleIdentificationNumber))
            .append("\n");
        sb.append("    tonnage: ").append(toIndentedString(tonnage)).append("\n");
        sb.append("    seatingCapacity: ").append(toIndentedString(seatingCapacity)).append("\n");
        sb.append("    taxAuthority: ").append(toIndentedString(taxAuthority)).append("\n");
        sb.append("    taxAuthorityCode: ").append(toIndentedString(taxAuthorityCode)).append("\n");
        sb.append("    taxPaymentReceipt: ").append(toIndentedString(taxPaymentReceipt)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    taxExclusivePrice: ").append(toIndentedString(taxExclusivePrice)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    totalChinese: ").append(toIndentedString(totalChinese)).append("\n");
        sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
