package desingpatterns.abstractfactory;

public abstract class AbstractCar implements Car{
    public String toString(){
        return "Car "+getProducer()+" "+getModelName()+" "+getType()+" has "+getCylindersNum()+" cylinders and engine "
                +getEngineVolume()+" and trunk with size "+getTrunkSize()+" liters";
    }
}
