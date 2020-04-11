module Ja.Fx {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;


    opens sample;
    opens MultiThrd;
    opens MultiThrd.Basic;
    opens SimUDuck;
    opens DesignPatterns.factory;
    opens DesignPatterns.observer.SimpleWeatherStation;
    opens DesignPatterns.observer.Stock;
    opens DesignPatterns.observer.weather;
//    opens ProjectDingen.one.Client;
    opens ProjectDingen.Client;
//    opens ProjectDingen.ClientCollege;
    opens ProjectDingen.chat;
    opens ProjectDingen.GameClient2;

}