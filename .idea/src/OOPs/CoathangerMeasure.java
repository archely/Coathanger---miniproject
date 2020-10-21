
import java.io.Serializable;


public class CoathangerMeasure implements Serializable {

    public CoathangerMeasure(Measure measure) {
        this.mMeasure = measure;

    }

//.


    public void isWorkingCoathanger() {
        this.mMeasure = measure.LOW;

    }

    public void isWorkingCoathanger() {
        this.mMeasure = measure.MEDIUM;
    }

    public void isWorkingCoathanger() {
        this.mMeasure = measure.HIGH;
    }


    public Measure getMeasure() {
        return mMeasure;
    }
}

