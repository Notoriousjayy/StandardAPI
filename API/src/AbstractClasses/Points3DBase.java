package AbstractClasses;

abstract public class Points3DBase extends Points2DBase {
    double z;

    public Points3DBase() {
        this.z = Math.random();
    }
}
