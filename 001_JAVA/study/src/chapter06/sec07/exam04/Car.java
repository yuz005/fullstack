package chapter06.sec07.exam04;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //매개 변수가 없는 생성자 선언
    Car(){}
    //매개 변수로 model 만 가지는 생성자
    Car(String model){
        this.model=model;
    }
    //매개변수로 model 과 color 를 가지는 생성자
    Car(String model,String color){
        this.model=model;
        this.color=color;
    }
    //매개변수로 model 과 color, max Speed 를 가지는 생성자
    Car(String model,String color,int maxSpeed){
        this.model=model;
        this.color=color;
        this.maxSpeed=maxSpeed;
    }
}
