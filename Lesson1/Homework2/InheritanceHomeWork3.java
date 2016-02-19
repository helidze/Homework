public class Phone {
    int IMEI;
    int dynamic;
    int button;

    public void ring(){
    }
    public void resetCall(){
    }
}

class Android extends Phone { //наследуемся от класса Phone
    String OS; // добавляем свойтво ОS типа String
    boolean UI;
    int program;

    public void startOS(){} //описываем метод запускОС
    public void updateOS(){}
}

class SamsungPhone extends Android {
    char logo;
    String model;
    String name;

    public void enterShop(){}
    public void uniqueUnlock(){}
}

class SensorPhone extends SamsungPhone {
    String touchScreen;
    int sensorBotton;
    boolean frontCam;

    public void unlock(){}
    public void lock(){}
}
