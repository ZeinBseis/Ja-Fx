module Ja.Fx {
    requires javafx.fxml;
    requires javafx.controls;


    opens sample;
    opens MultiThrd;
    opens MultiThrd.Basic;
    opens SimUDuck;
    opens DesignPatterns.factory;
    opens DesignPatterns.observer.SimpleWeatherStation;
    opens DesignPatterns.observer.Stock;
    opens DesignPatterns.observer.weather;

}