package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import io.grpc.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class apzj {
    public static volatile aqux a;
    public static volatile aqux b;
    public static volatile aqux c;

    private apzj() {
    }

    public static void f(Object obj, Class cls) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void g(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void h(Object obj) {
        obj.getClass();
    }

    public static Object i(Context context) {
        ComponentCallbacks2 p = aowt.p(context.getApplicationContext());
        boolean z = p instanceof apxq;
        Object[] objArr = {p.getClass()};
        if (z) {
            return ((apxq) p).aS();
        }
        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static asmb l(aqrn aqrnVar, aqvt... aqvtVarArr) {
        asmb n = aqrnVar.n();
        List asList = Arrays.asList(aqvtVarArr);
        if (!asList.isEmpty()) {
            Object obj = n.a;
            HashMap hashMap = new HashMap();
            Iterator it = n.p().iterator();
            while (true) {
                aqvw aqvwVar = (aqvw) obj;
                String str = aqvwVar.a;
                if (it.hasNext()) {
                    asmb asmbVar = (asmb) it.next();
                    Object obj2 = asmbVar.b;
                    Iterator it2 = asList.iterator();
                    aqvu aqvuVar = obj2;
                    while (it2.hasNext()) {
                        aqvuVar = new aqvu((aqvt) it2.next(), aqvuVar);
                    }
                    aqae.v(asmbVar.y(aqvuVar), str, hashMap);
                } else {
                    return aqae.u(str, aqvwVar, hashMap);
                }
            }
        } else {
            return n;
        }
    }

    public void j(aqvt aqvtVar) {
        throw null;
    }

    public Status k(aqvb aqvbVar) {
        throw null;
    }

    public apzj(byte[] bArr) {
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void e() {
    }

    public void d(Object obj) {
    }
}
