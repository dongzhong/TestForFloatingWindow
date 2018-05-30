package dongzhong.testforfloatingwindow;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.WindowManager;

/**
 * Created by dongzhong on 2018/5/30.
 */

public class FloatingImageDisplayService extends Service {
    private WindowManager windowManager;
    private WindowManager.LayoutParams layoutParams;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
