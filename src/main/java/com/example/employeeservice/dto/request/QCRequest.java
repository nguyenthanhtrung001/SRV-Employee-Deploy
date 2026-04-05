package com.example.employeeservice.dto.request;

public class QCRequest {
    private String qcCode;
    private String type;
    private String productName;
    private Long employeeId;

    public QCRequest() {
    }

    public QCRequest(String qcCode, String type, String productName, Long employeeId) {
        this.qcCode = qcCode;
        this.type = type;
        this.productName = productName;
        this.employeeId = employeeId;
    }

    public String getQcCode() {
        return qcCode;
    }

    public void setQcCode(String qcCode) {
        this.qcCode = qcCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}