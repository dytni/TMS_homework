package course.clients;

import course.clients.enums.OperationStatus;

public class BankOperation {
    int operationId;
    String numberAccountIn;
    String numberAccountOut;
    float payment;
    String DateTime;
    OperationStatus status;

    public BankOperation(int operationId, String numberAccountIn, String numberAccountOut, float payment, String dateTime, OperationStatus status) {
        this.operationId = operationId;
        this.numberAccountIn = numberAccountIn;
        this.numberAccountOut = numberAccountOut;
        this.payment = payment;
        DateTime = dateTime;
        this.status = status;
    }

    public int getOperationId() {
        return operationId;
    }

    public String getNumberAccountIn() {
        return numberAccountIn;
    }

    public String getNumberAccountOut() {
        return numberAccountOut;
    }

    public float getPayment() {
        return payment;
    }

    public String getDateTime() {
        return DateTime;
    }

    public OperationStatus getStatus() {
        return status;
    }
}
