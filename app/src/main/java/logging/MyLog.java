package logging;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Lenovo on 6/7/2015.
 */
public class MyLog {
    public static void m(String message) {
        Log.d("Test123", "" + message);
    }

    public static void t(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_SHORT).show();
    }
    public static void T(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_LONG).show();
    }
}