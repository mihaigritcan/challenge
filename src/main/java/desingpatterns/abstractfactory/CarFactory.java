package desingpatterns.abstractfactory;

public interface CarFactory {
    Car createSedan();
    Car createCombi();
    Car createHatchback();
}
