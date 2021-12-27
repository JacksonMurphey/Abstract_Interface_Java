public abstract class Phone {
    
    protected String versionNumber;
    protected String carrier;
    protected String ringTone;
    protected int batteryPercentage;



    public Phone(String versionNumber, String carrier, String ringTone, int batteryPercentage){
        this.versionNumber = versionNumber;
        this.carrier = carrier;
        this.ringTone = ringTone;
        this.batteryPercentage = batteryPercentage;
    }
    
    // abstract method. Will be implemented by the subclass. 
    public abstract void displayInfo();

    //setters. 
    public void setVersionNumber(String versionNumber){
        this.versionNumber = versionNumber;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setRingTone(String ringTone){
        this.ringTone = ringTone;
    }
    public void setBatteryPercentage(int batteryPercentage){
        this.batteryPercentage = batteryPercentage;
    }

    // getters
    public String getVersionNumber(){
        return this.versionNumber;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public String getRingTone(){
        return this.ringTone;
    }
    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }
}
