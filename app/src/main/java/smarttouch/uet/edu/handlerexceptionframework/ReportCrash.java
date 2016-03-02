package smarttouch.uet.edu.handlerexceptionframework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by VanHop on 3/2/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface ReportCrash {

    public String formUri();
    public String key();
}
