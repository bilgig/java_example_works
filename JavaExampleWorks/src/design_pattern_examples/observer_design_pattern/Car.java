package design_pattern_examples.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Car implements Subject{
    private String carBrand;
    private String carModel;

    private String carColor;
    private int carAge;

    private boolean available;

    private List<Observer> observerList=new ArrayList<>();

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if(available){
            notifyObservers();
        }
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void registerObserver(Observer observer) {
    observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Fiyatı düşen arabanın heberi veriliyor....");
        for(Observer observer:observerList){
            observer.update(carBrand,carModel,carColor,carAge);
        }
    }
}
