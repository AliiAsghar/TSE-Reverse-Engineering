package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxk {
    public static final String a = gsy.b("NetworkStateTracker");

    public static final gwm a(ConnectivityManager connectivityManager) {
        boolean z;
        boolean z2;
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            gsy.a();
            Log.e(a, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            z2 = networkCapabilities.hasCapability(16);
            boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                z3 = false;
            }
            return new gwm(z, z2, isActiveNetworkMetered, z3);
        }
        z2 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z3 = false;
        return new gwm(z, z2, isActiveNetworkMetered2, z3);
    }
}
