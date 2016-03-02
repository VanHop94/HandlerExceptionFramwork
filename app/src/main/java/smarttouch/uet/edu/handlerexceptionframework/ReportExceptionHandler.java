package smarttouch.uet.edu.handlerexceptionframework;

import android.util.Log;

/**
 * Created by VanHop on 3/2/2016.
 */
public class ReportExceptionHandler implements Thread.UncaughtExceptionHandler {

    private Thread.UncaughtExceptionHandler defaultUEH;

    private String formUri;

    private String key;

    /*
     * if any of the parameters is null, the respective functionality
     * will not be used
     */
    public ReportExceptionHandler(String formUri, String key) {
        this.defaultUEH = Thread.getDefaultUncaughtExceptionHandler();
        this.formUri = formUri;
        this.key = key;
    }

    public void uncaughtException(Thread t, Throwable e) {

        Log.i("TEST-VANHOP",e.getStackTrace().toString());

        defaultUEH.uncaughtException(t, e);
    }
}
