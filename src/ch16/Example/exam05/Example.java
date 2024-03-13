package ch16.Example.exam05;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다"));
        btnOk.clcik();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다"));
        btnCancel.clcik();
    }
}
