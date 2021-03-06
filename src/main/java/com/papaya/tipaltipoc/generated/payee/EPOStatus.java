//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 05:36:34 PM IDT 
//


package com.papaya.tipaltipoc.generated.payee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePOStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePOStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="Scheduled"/&gt;
 *     &lt;enumeration value="Submitted"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Deferred"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="SubmittedToPaymentSystem"/&gt;
 *     &lt;enumeration value="SupportReviewRequired"/&gt;
 *     &lt;enumeration value="DeferredInternal"/&gt;
 *     &lt;enumeration value="ComplianceReview"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Cleared"/&gt;
 *     &lt;enumeration value="FraudReview"/&gt;
 *     &lt;enumeration value="InternalFraudReview"/&gt;
 *     &lt;enumeration value="ProviderInProcess"/&gt;
 *     &lt;enumeration value="OnHold"/&gt;
 *     &lt;enumeration value="WaitingInternalChecks"/&gt;
 *     &lt;enumeration value="PendingLiquidityArrival"/&gt;
 *     &lt;enumeration value="PendingLoanProviderApproval"/&gt;
 *     &lt;enumeration value="PendingLoanProviderFunding"/&gt;
 *     &lt;enumeration value="PendingPayerFunds"/&gt;
 *     &lt;enumeration value="PayeeTriggerReview"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ePOStatus")
@XmlEnum
public enum EPOStatus {

    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("Submitted")
    SUBMITTED("Submitted"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Deferred")
    DEFERRED("Deferred"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("SubmittedToPaymentSystem")
    SUBMITTED_TO_PAYMENT_SYSTEM("SubmittedToPaymentSystem"),
    @XmlEnumValue("SupportReviewRequired")
    SUPPORT_REVIEW_REQUIRED("SupportReviewRequired"),
    @XmlEnumValue("DeferredInternal")
    DEFERRED_INTERNAL("DeferredInternal"),
    @XmlEnumValue("ComplianceReview")
    COMPLIANCE_REVIEW("ComplianceReview"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Cleared")
    CLEARED("Cleared"),
    @XmlEnumValue("FraudReview")
    FRAUD_REVIEW("FraudReview"),
    @XmlEnumValue("InternalFraudReview")
    INTERNAL_FRAUD_REVIEW("InternalFraudReview"),
    @XmlEnumValue("ProviderInProcess")
    PROVIDER_IN_PROCESS("ProviderInProcess"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("WaitingInternalChecks")
    WAITING_INTERNAL_CHECKS("WaitingInternalChecks"),
    @XmlEnumValue("PendingLiquidityArrival")
    PENDING_LIQUIDITY_ARRIVAL("PendingLiquidityArrival"),
    @XmlEnumValue("PendingLoanProviderApproval")
    PENDING_LOAN_PROVIDER_APPROVAL("PendingLoanProviderApproval"),
    @XmlEnumValue("PendingLoanProviderFunding")
    PENDING_LOAN_PROVIDER_FUNDING("PendingLoanProviderFunding"),
    @XmlEnumValue("PendingPayerFunds")
    PENDING_PAYER_FUNDS("PendingPayerFunds"),
    @XmlEnumValue("PayeeTriggerReview")
    PAYEE_TRIGGER_REVIEW("PayeeTriggerReview");
    private final String value;

    EPOStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPOStatus fromValue(String v) {
        for (EPOStatus c: EPOStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
