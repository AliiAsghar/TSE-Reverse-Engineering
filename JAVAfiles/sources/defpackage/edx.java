package defpackage;

import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.view.InputDevice;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }

    public static int d(Resources resources, int i, ecj ecjVar, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            if (i != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(i)) >= 0) {
                return dimensionPixelSize;
            }
            return i2;
        }
        return ((Integer) ecjVar.a()).intValue();
    }

    public static int e(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static boolean f(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        if (device != null && device.getMotionRange(i2, i3) != null) {
            return true;
        }
        return false;
    }

    public static String g(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static void h(AudioTrack audioTrack, efu efuVar) {
        Object obj;
        if (efuVar == null) {
            obj = null;
        } else {
            obj = efuVar.a;
        }
        audioTrack.setPreferredDevice((AudioDeviceInfo) obj);
    }
}
