package ocp.practice;

/**
 * Created by iuliab on 17.12.2017.
 */
public class ProducedElement {

    private Integer sequenceNumber;
    private double producingTime;

    public ProducedElement(Integer sequenceNumber, Double producingTime) {
        this.sequenceNumber = sequenceNumber;
        this.producingTime = producingTime;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public double getProducingTime() {
        return producingTime;
    }

    public void setProducingTime(double producingTime) {
        this.producingTime = producingTime;
    }
}
