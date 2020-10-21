import java.io.Serializable;


public class CoatHanger implements Serializable {


    private final CoathangerMeasurer mCoat;


    private final Coathanger_Type mCoathanger_type= new Coathanger_Type(this);


    public CoatHanger(CoathangerMeasurer) {
        System.out.println("Please put your coat");

        this.mCoat = coat;
    }

    public boolean isCoatHangerHeavyWeight() { //isCoatHangerHeavyWeight() you can check MeasureLevel.java
        return mCoat.getCoat().equals(Coat.HIGH);
    }

    public void alert(){
        System.out.println("Hanger is not available");
    }


    @Override
    public void LightCoat() { //LightCoat() sends a notification to  Coathanger_Type.java
        mCoathanger_type.notification("Your coat is so light!");
    }


    @Override
    public void HeavyCoat() { //HeavyCoat() sends a notification to Coathanger_Type.java.
        mCoathanger_type.notification("Your coat is so heavy, Please change it!");
    }

}
