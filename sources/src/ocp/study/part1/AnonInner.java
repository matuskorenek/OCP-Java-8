package ocp.study.part1;

public class AnonInner {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    /*********** INTERFACE **********************/
    interface SaleTodayOnlyButInterface {
        int dollarsOffInterface();
    }
    public int pay() {
        return admissionButInterface(5, new SaleTodayOnlyButInterface() {
                public int dollarsOffInterface() { return 3; }
            });
    }

    public int admissionButInterface(int basePrice, SaleTodayOnlyButInterface sale) {
        return basePrice - sale.dollarsOffInterface();
    }

    /**********************************************/
    public static void main(String[] args) {
        AnonInner anonInner = new AnonInner();
        System.out.println(anonInner.admission(5));
        System.out.println(anonInner.pay());
    }
}
