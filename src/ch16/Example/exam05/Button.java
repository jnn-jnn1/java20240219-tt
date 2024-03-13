package ch16.Example.exam05;

public class Button {

    @FunctionalInterface
    interface ClickListener {
        void onclick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void clcik() {
        clickListener.onclick();
    }
}
