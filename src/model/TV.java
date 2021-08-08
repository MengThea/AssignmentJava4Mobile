package model;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;

public class TV {
    private int channel= 1;
    private int VolumeLevel= 1;
    private boolean on;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (on && channel > 0 && channel <= 120) {
            this.channel = channel;
        }else {
           System.out.println("channel must rang in [1,120]");
    }
    }

    public int getVolumeLevel() {
        return VolumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(on && VolumeLevel>=1 && VolumeLevel<=100) {
            this.VolumeLevel = volumeLevel;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on =on;
    }
    public void setchannelUp() {
        if (on &&channel < 120) {
            channel++;
        }
    }
    public void setchannelDown(){
         if(on &&channel>1) {
            channel++;
            }
    }
    public void setVolumeLevelUp(){
        if (on &&VolumeLevel)
    }
}
