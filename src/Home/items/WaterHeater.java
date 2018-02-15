package Home.items;

public class WaterHeater {

        private static WaterHeater waterHeater;
        private static boolean isOn;

        private WaterHeater(){
            isOn = false;
        }

        public static WaterHeater newInstance() {
            if(waterHeater == null) {
                waterHeater = new WaterHeater();
            }
            return waterHeater;
        }

        public static void On(){
            isOn = true;
        }

        public static void Off(){
            isOn = false;
        }
}
