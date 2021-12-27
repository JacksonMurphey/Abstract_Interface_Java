public class Galaxy extends Phone implements Ringable {
    

    
    public Galaxy(String versionNumber, String carrier, String ringTone, int batteryPercentage){
        super(versionNumber,carrier,ringTone,batteryPercentage);
    }

    @Override
    public String ring(){
        String ring = "Galaxy " + this.versionNumber + " gets a call. " + this.ringTone;
        return ring;
    }

    @Override 
    public String unlock(){
        String unlock = "Unlocking via facial recognition";
        return unlock; 
    }

    @Override
    public void displayInfo(){
        System.out.println("Galaxy " + this.versionNumber + " from " + this.carrier);
    }
    
}
