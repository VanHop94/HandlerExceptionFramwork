package smarttouch.uet.edu.handlerexceptionframework;

/**
 * Created by VanHop on 3/2/2016.
 */
public class ReportCrashUtil {

    public static void init(Class<?> classApp){
        boolean isConfig = classApp.isAnnotationPresent(ReportCrash.class);
        if(isConfig){
            ReportCrash reportCrash = classApp.getAnnotation(ReportCrash.class);
            String formUri = reportCrash.formUri();
            String key = reportCrash.key();
            Thread.setDefaultUncaughtExceptionHandler(new ReportExceptionHandler(formUri,key));
        }
    }

}
