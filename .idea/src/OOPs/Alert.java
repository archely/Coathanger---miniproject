import java.io.Serializable;


public class CoatHanger implements Serializable {


    public CoatHanger(CoathangerType) {

        this.mCoat = coat;
    }

    public boolean isCoatHangerLightWeight() { //isCoatHangerLightWeight() you can check MeasureLevel.java
        return mCoat.getMeasure().equals(Measure.LOW);
    }


    @Override
    public void LightCoat() { //LightCoat() sends a notification to  Coathanger_Type.java
        notification("Your coat is so light!");
    }


    @Override
    public void HeavyCoat() { //HeavyCoat() sends a notification to Coathanger_Type.java
        notification("Your coat is so heavy, Please change it!");
    }

}