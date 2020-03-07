module Ja.Fx {
    requires javafx.fxml;
    requires javafx.controls;


    opens sample;
    opens MultiThrd;
    opens MultiThrd.Basic;
    opens SimUDuck;
    opens WeatherStation;
    opens DesignPatterns.factory;
    opens DesignPatterns.observer;
}