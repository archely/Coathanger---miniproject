
import java.io.Serializable;


public class CoathangerMeasure implements Serializable {

    public CoathangerMeasure(CoathangerMeasurer coat) {
        this.mCoat = coat;

    }

//weight levels for measure


    public void isWorkingCoathanger() {
        this.mCoat = coat.LOW;

    }

    public void isWorkingCoathanger() {
        this.mCoat = coat.MEDIUM;
    }

    public void isWorkingCoathanger() {
        this.mCoat = coat.HIGH;
    }


    public Coat getCoat() {
        return mCoat;
    }
}

