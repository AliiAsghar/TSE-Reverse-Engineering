package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hue {
    public static final boolean a;
    public static final boolean b;
    private static final File d;
    private static volatile hue e;
    private int f;
    private boolean g = true;
    public final AtomicBoolean c = new AtomicBoolean(false);

    static {
        boolean z;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        } else {
            z = false;
        }
        a = z;
        if (Build.VERSION.SDK_INT < 28) {
            z2 = false;
        }
        b = z2;
        d = new File("/proc/self/fd");
    }

    public static hue a() {
        if (e == null) {
            synchronized (hue.class) {
                if (e == null) {
                    e = new hue();
                }
            }
        }
        return e;
    }

    private final synchronized boolean c() {
        boolean z = true;
        int i = this.f + 1;
        this.f = i;
        if (i >= 50) {
            this.f = 0;
            int length = d.list().length;
            int i2 = 20000;
            if (Build.VERSION.SDK_INT == 28) {
                Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Build.MODEL.startsWith((String) it.next())) {
                        i2 = 500;
                        break;
                    }
                }
            }
            long j = i2;
            if (length >= j) {
                z = false;
            }
            this.g = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
            }
        }
        return this.g;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!b) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a && !this.c.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i >= 0 && i2 >= 0) {
            if (!c()) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
        }
        return false;
    }
}
