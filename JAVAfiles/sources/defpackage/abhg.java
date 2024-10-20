package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhg {
    public static volatile aqvw a;
    private static volatile aqux b;

    public static aqux a() {
        aqux aquxVar = b;
        if (aquxVar == null) {
            synchronized (abhg.class) {
                aquxVar = b;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("stargate.SatelliteSessionStateNotificationService", "OnSatelliteSessionStateChanged");
                    a2.b();
                    abgw abgwVar = abgw.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abgwVar);
                    a2.d = new arkw(abgx.a);
                    aquxVar = a2.a();
                    b = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    public static void e() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
    }

    public static void f() {
        g("Must not be called on the main application thread");
    }

    public static void g(String str) {
        if (!abvk.e()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void h(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void i(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void j(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void k(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void l(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void m(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static acir n(abri abriVar, abuq abuqVar) {
        acit acitVar = new acit();
        abriVar.d(new abuo(abriVar, acitVar, abuqVar));
        return (acir) acitVar.a;
    }

    public static acir o(abri abriVar) {
        return n(abriVar, new abup());
    }

    public static final String p(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final void q(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }
}
