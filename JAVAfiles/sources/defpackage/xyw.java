package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyw {
    public final long a;
    public int b;
    public final Object c;

    public xyw(String str, long j) {
        this.c = str;
        this.a = j;
        this.b = 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map, java.lang.Object] */
    private final synchronized void b(long j) {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            if (((xyv) ((Map.Entry) it.next()).getValue()).a <= j - this.a) {
                it.remove();
            }
        }
        int i = ((vl) this.c).d;
        int i2 = this.b;
        if (i2 < 60 && i >= (i2 * 3) / 4) {
            i2 = Math.min(i + i, 60);
            this.b = i2;
        }
        if (i2 > 15 && i < (i2 >> 2)) {
            i2 = Math.max(i + i, 15);
            this.b = i2;
        }
        if (i2 >= 60) {
            this.c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Map, java.lang.Object] */
    public final synchronized boolean a(xzx xzxVar, Object obj) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        xyv xyvVar = (xyv) this.c.get(obj);
        z = true;
        if (xyvVar == null) {
            this.c.put(obj, new xyv(elapsedRealtime));
        } else {
            if (xyvVar.a + this.a <= elapsedRealtime) {
                if (xyvVar.b > 0) {
                    xzxVar.H("[Throttled");
                    xzxVar.F(xyvVar.b);
                    xzxVar.H("times]");
                }
                xyvVar.a = elapsedRealtime;
            } else {
                xyvVar.b++;
                z = false;
            }
        }
        if (((vl) this.c).d > this.b) {
            b(elapsedRealtime);
        }
        return z;
    }

    public xyw(long j) {
        this.b = 15;
        this.c = new tm();
        this.a = j;
    }
}
