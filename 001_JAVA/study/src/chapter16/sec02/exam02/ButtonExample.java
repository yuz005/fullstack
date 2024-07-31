package chapter16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args){
        Button btnOk = new Button();

        //ok button 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnOk.setClickListener(()-> {
            System.out.println("OK 버튼을 클릭했습니다.");
        });
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(()-> {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        btnCancel.click();
    }
}
