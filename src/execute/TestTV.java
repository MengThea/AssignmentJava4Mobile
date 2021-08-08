package execute;

public class TestTV {
    import model.TV;
import util.Util;

    public class TestTV {
        public static void main(String[] args) {
            TV tv1 = new TV();
            TV tv2 = new TV();

            tv1.setOn(true);
            tv2.setOn(true);
            tv1.setChannelUp();
            tv2.setChannel(100);
            tv1.setVolumeLevel(40);

            Util.showTVOnOff(tv1.isOn(),1);
            Util.showTVOnOff(tv2.isOn(),2);
            Util.showChannel(tv1.getChannel(),1);
            Util.showChannel(tv2.getChannel(),2);
            Util.showVolumeLevel(tv1.getVolumeLevel(),1);
            Util.showVolumeLevel(tv2.getVolumeLevel(),2);

        }
    }
}
