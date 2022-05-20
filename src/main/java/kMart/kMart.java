package kMart;

import javafx.scene.control.RadioButton;

public class kMart {
    public kMart(RadioButton txtMedium, RadioButton txtSmall) {
        this.txtMedium = txtMedium;
        this.txtSmall = txtSmall;
    }

    private RadioButton txtMedium , txtSmall;

    public RadioButton getTxtMedium() {
        return txtMedium;
    }

    public void setTxtMedium(RadioButton txtMedium) {
        this.txtMedium = txtMedium;
    }

    public RadioButton getTxtSmall() {
        return txtSmall;
    }

    public void setTxtSmall(RadioButton txtSmall) {
        this.txtSmall = txtSmall;
    }

    @Override
    public String toString() {
        return "kMart{" + "txtMedium=" + txtMedium + ", txtSmall=" + txtSmall + '}';

    }
}

