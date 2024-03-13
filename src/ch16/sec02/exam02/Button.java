package ch16.sec02.exam02;

public class Button {

    public interface ClickListener {
        void onclick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onclick();
    }
}
