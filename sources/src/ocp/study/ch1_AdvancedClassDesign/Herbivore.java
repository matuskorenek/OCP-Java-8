package ocp.study.ch1_AdvancedClassDesign;

interface CanFly {
    void fly();
}
interface HasWings {
    public abstract Object getWingSpan();
}
abstract class Falcon implements CanFly, HasWings {

}

