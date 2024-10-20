package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atii {
    private static atii e;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public atii(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.d = context;
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = scheduledExecutorService2;
    }

    public static synchronized void e(Context context) {
        synchronized (atii.class) {
            if (e == null) {
                e = new atii(context);
            } else {
                throw new IllegalStateException("Context already configured");
            }
        }
    }

    public static atii j() {
        atii atiiVar = e;
        if (atiiVar != null) {
            return atiiVar;
        }
        throw new IllegalStateException("Context not configured");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, atjg] */
    private final atjg k() {
        ?? r0 = this.a;
        if (r0 != 0) {
            return r0;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final String a(atgl atglVar) {
        StringBuilder sb = new StringBuilder(k().b());
        try {
            Map map = atfz.a;
            long millis = atglVar.getMillis();
            atfu a = atglVar.a();
            if (a == null) {
                a = athk.N();
            }
            atjg k = k();
            try {
                atfu b = b(a);
                atgc z = b.z();
                int a2 = z.a(millis);
                long j = a2;
                long j2 = millis + j;
                if ((millis ^ j2) < 0 && (j ^ millis) >= 0) {
                    z = atgc.a;
                    a2 = 0;
                    j2 = millis;
                }
                k.d(sb, j2, b.a(), a2, z, null);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
        }
        return sb.toString();
    }

    public final atfu b(atfu atfuVar) {
        Object obj = this.c;
        atfu c = atfz.c(atfuVar);
        if (obj == null) {
            obj = c;
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            return ((atfu) obj).b((atgc) obj2);
        }
        return (atfu) obj;
    }

    public final atii c() {
        Object obj = this.d;
        atgc atgcVar = atgc.a;
        if (obj == atgcVar) {
            return this;
        }
        return new atii(this.a, this.b, this.c, atgcVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [atje, java.lang.Object] */
    public final atjf d() {
        return atjf.b(this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Collection f() {
        return this.a.values();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final List g(byte[] bArr) {
        List list = (List) this.a.get(aocj.b(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final List h() {
        return g(anms.a);
    }

    public final boolean i() {
        if (!((anth) this.c).b.isEmpty()) {
            return true;
        }
        return false;
    }

    public atii(apdf apdfVar, Object obj, apdf apdfVar2, Object obj2) {
        this.c = apdfVar;
        this.b = obj;
        this.d = apdfVar2;
        this.a = obj2;
    }

    public atii(aqux aquxVar, aqrr aqrrVar, aqut aqutVar, String str) {
        this.d = aqrrVar;
        this.c = aquxVar;
        this.a = aqutVar;
        this.b = str;
    }

    public atii(atjg atjgVar, atje atjeVar) {
        this.a = atjgVar;
        this.b = atjeVar;
        this.c = null;
        this.d = null;
    }

    public atii(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public atii(Map map, anty antyVar, anth anthVar, Class cls) {
        this.a = map;
        this.d = antyVar;
        this.b = cls;
        this.c = anthVar;
    }

    public atii() {
        this.d = new HashMap();
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public atii(andc andcVar, andc andcVar2) {
        alog s = alog.s(andcVar, andcVar2);
        this.c = new ancw();
        this.a = alog.j(s);
        alur it = s.iterator();
        while (it.hasNext()) {
            ((andc) it.next()).g((ancw) this.c);
        }
        this.d = andcVar;
        this.b = andcVar2;
    }

    private atii(Context context) {
        this.d = new aoso();
        aosm aosmVar = new aosm(context.getAssets());
        this.c = aosmVar;
        this.a = new aosv(new aojj("Metadata"), aosmVar, null);
        this.b = new aosv(new aojj("ShortNums"), aosmVar);
        new asqe(aosmVar, aoss.c());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public atii(atii atiiVar) {
        this.d = new HashMap((Map) atiiVar.b);
        this.c = new HashMap((Map) atiiVar.c);
        this.a = new HashMap((Map) atiiVar.d);
        this.b = new HashMap((Map) atiiVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public atii(atii atiiVar, byte[] bArr) {
        this.b = new HashMap((Map) atiiVar.d);
        this.c = new HashMap((Map) atiiVar.c);
        this.d = new HashMap((Map) atiiVar.a);
        this.a = new HashMap((Map) atiiVar.b);
    }

    public atii(aojr aojrVar, List list) {
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.c = aojrVar;
        this.d = list;
    }
}
