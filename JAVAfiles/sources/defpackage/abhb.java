package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abhb {
    public static volatile aqux a;

    private abhb() {
    }

    public static void a(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException((String) obj2);
        }
    }

    public static abra b(Status status) {
        if (status.h != null) {
            return new abrl(status);
        }
        return new abra(status);
    }

    public static void c(Status status, acit acitVar) {
        d(status, null, acitVar);
    }

    public static void d(Status status, Object obj, acit acitVar) {
        if (status.c()) {
            acitVar.b(obj);
        } else {
            acitVar.a(b(status));
        }
    }

    public static boolean e(Status status, Object obj, acit acitVar) {
        if (status.c()) {
            return acitVar.d(obj);
        }
        return acitVar.c(b(status));
    }

    public static absw f(Object obj, String str) {
        d.aC(obj, "Listener must not be null");
        d.aC(str, "Listener type must not be null");
        abhg.l(str, "Listener type must not be empty");
        return new absw(obj, str);
    }

    public static absy g(Object obj, Looper looper, String str) {
        d.aC(obj, "Listener must not be null");
        d.aC(looper, "Looper must not be null");
        d.aC(str, "Listener type must not be null");
        return new absy(looper, obj, str);
    }

    public abhb(byte[] bArr) {
    }
}
