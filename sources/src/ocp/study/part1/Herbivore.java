package ocp.study.part1;

interface CanFly {
    void fly();
}
interface HasWings {
    public abstract Object getWingSpan();
}
abstract class Falcon implements CanFly, HasWings {

}

