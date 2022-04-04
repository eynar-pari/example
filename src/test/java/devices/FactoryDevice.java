package devices;

import com.beust.ah.A;

public class FactoryDevice {
   public static IDevices make(String type){
       IDevices devices;

       switch (type.toLowerCase()){
           case "android":
               devices= new Android();
               break;
           case "ios":
               devices= new Ios();
               break;
           default:
               devices= new Android();
               break;
       }
       return devices;
   }

}

