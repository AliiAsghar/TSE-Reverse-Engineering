package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acex {
    public static IBitmapDescriptorFactoryDelegate a;
    public static ICameraUpdateFactoryDelegate b;

    public static Parcelable a(Bundle bundle, String str) {
        ClassLoader i = i();
        bundle.setClassLoader(i);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(i);
        return bundle2.getParcelable(str);
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a2 = a(bundle, "MapOptions");
            if (a2 != null) {
                c(bundle2, "MapOptions", a2);
            }
            Parcelable a3 = a(bundle, "StreetViewPanoramaOptions");
            if (a3 != null) {
                c(bundle2, "StreetViewPanoramaOptions", a3);
            }
            Parcelable a4 = a(bundle, "camera");
            if (a4 != null) {
                c(bundle2, "camera", a4);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader i = i();
        bundle.setClassLoader(i);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(i);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static final void d(String str, Object... objArr) {
        Log.e("WakeLock", String.format(str, objArr));
    }

    public static byte e(Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                return (byte) 0;
            }
            return (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean f(byte b2) {
        if (b2 != 0) {
            if (b2 != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static String g(Account account) {
        if (account == null) {
            return "null";
        }
        if (Log.isLoggable("GCoreUlr", 2)) {
            return account.name;
        }
        return "account#" + (account.name.hashCode() % 20) + "#";
    }

    public static int h(int i) {
        if (i != -2 && i != -1 && i != 0 && i != 1) {
            if (i > 0) {
                return 99;
            }
            return -3;
        }
        return i;
    }

    private static ClassLoader i() {
        ClassLoader classLoader = acex.class.getClassLoader();
        abhg.m(classLoader);
        return classLoader;
    }
}
