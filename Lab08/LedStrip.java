public class LedStrip extends Led{
    
    private int noOfLed;
    private Led[] leds;

    public void lenLedStrip(int noOfLed){
        this.noOfLed=noOfLed;
        leds=new Led[noOfLed];
    }

    public void setLeds(String colourName,boolean working,int i){
            leds[i]=new Led();
            leds[i].setColourName(colourName);
            leds[i].setWorking(working);
    }

    private int numberOfDefectiveLed(){
        int defective=0;
        for(int i=0;i<noOfLed;i++){
            if(!leds[i].isWorking())
                defective++;
        }
        return defective;
    }

    private boolean isStripDefective(){
        if(((int)noOfLed/2)<numberOfDefectiveLed())
            return true;
        else    
            return false;
    }

    public boolean defective(){
        return isStripDefective();
    }
}