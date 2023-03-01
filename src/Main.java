
/*
public class User {
    private List<Service> services;
    public float getTotal() {
        float total = 0.0;
        foreach (Service s in services) {

        }            MultimediaContent mc = s.getMultimediaContent();
            if(typeof(s)==StreamingService) {
                total += mc.getStreamingPrice();
            }else if(typeof(s)==DownloadService){
                total += mc.getDownloadPrice();
            }
            if (typeof(mc)==PremiumContent) {
                total += mc.getAdditionalFee();
            }
        }
        return total;
    }
 */

import java.security.Provider;
import java.util.List;

public class User {
    private List<Servicio> services;
    public float getTotal() {
        float total = 0.0;

        foreach (Service s in services) {
            MultimediaContent mc = s.getMultimediaContent();


            //TODO metodo getPrice en ambas clases que heredan de service para solo llamar a una de ellas
                /*
                total+=Service.getPrice();
                La clase premium es una herencia de la clase padre multimediacontent asi que con tener el precio
                sobreescrito.
                 */
            if(typeof(s)==StreamingService) {
                total += mc.getStreamingPrice();
            }else if(typeof(s)==DownloadService){
                total += mc.getDownloadPrice();
            }


            if (typeof(mc)==PremiumContent) {
                total += mc.getAdditionalFee();
            }
        }
        return total;
    }
}