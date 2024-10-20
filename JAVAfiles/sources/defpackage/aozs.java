package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aozs {
    public static final aozs a = new aozs(null);
    private static volatile boolean b = false;
    private static volatile aozs c;
    private final Map d;

    aozs() {
        this.d = new HashMap();
    }

    public static aozs a() {
        aozs aozsVar = c;
        if (aozsVar != null) {
            return aozsVar;
        }
        synchronized (aozs.class) {
            aozs aozsVar2 = c;
            if (aozsVar2 != null) {
                return aozsVar2;
            }
            apcc apccVar = apcc.a;
            aozs b2 = aozx.b(aozs.class);
            c = b2;
            return b2;
        }
    }

    public apae b(apbt apbtVar, int i) {
        return (apae) this.d.get(new aozr(apbtVar, i));
    }

    public aozs(byte[] bArr) {
        this.d = Collections.emptyMap();
    }
}
