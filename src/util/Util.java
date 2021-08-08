package util;

public class Util {
    Some part of code here
    public class Util {
        public static void showMessage(String message) {
            System.out.println(message);
        }

        public static void showMessage(int message) {
            System.out.println(message);
        }

        public static void showMessage(double message) {
            System.out.println(message);
        }


        public static void showTVOnOff(boolean on, int numTv) {
            System.out.println("TV " + numTv + (on ? " --> On" : " --> Off"));
        }
        public static void showChannel(int channel, int numTv){
            if(0 != channel) {
                System.out.println("TV " + numTv + " Channel " + channel);
                return;
            }
            System.out.println("Please turn on "+"TV " + numTv );
        }
        public static void showVolumeLevel(int volumeLevel, int numTv){
            if(0 != volumeLevel) {
                System.out.println("TV " + numTv + " Volume " + volumeLevel);
                return;
            }
            System.out.println("Please turn on "+"TV " + numTv );
        }
    }
}
