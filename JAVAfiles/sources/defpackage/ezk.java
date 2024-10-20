package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezk {
    public final fjl a;
    public final long b;
    public final long c;
    public final long d;
    public final HashMap e;
    public long f;
    private final long g;
    private final long h;

    public ezk() {
        this(new fjl(), 2500, 5000);
    }

    public static void b(int i, int i2, String str, String str2) {
        boolean z;
        String co = a.co(str2, str, " cannot be less than ");
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, co);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        Iterator it = this.e.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((appq) it.next()).b;
        }
        return i;
    }

    public final void c(fbz fbzVar) {
        if (this.e.remove(fbzVar) != null) {
            d();
        }
    }

    public final void d() {
        if (this.e.isEmpty()) {
            this.a.b();
        } else {
            this.a.c(a());
        }
    }

    public final boolean e(fak fakVar) {
        appq appqVar = (appq) this.e.get(fakVar.a);
        dzg.g(appqVar);
        long j = this.g;
        float f = fakVar.c;
        int a = this.a.a();
        int a2 = a();
        if (f > 1.0f) {
            j = Math.min(eul.s(j, f), this.h);
        }
        long j2 = fakVar.b;
        long max = Math.max(j, 500000L);
        boolean z = false;
        if (j2 < max) {
            if (a < a2) {
                z = true;
            }
            appqVar.a = z;
            if (!z && j2 < 500000) {
                eub.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.h || a >= a2) {
            appqVar.a = false;
        }
        return appqVar.a;
    }

    public ezk(fjl fjlVar, int i, int i2) {
        b(i, 0, "bufferForPlaybackMs", "0");
        b(i2, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(50000, i, "minBufferMs", "bufferForPlaybackMs");
        b(50000, i2, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(50000, 50000, "maxBufferMs", "minBufferMs");
        b(0, 0, "backBufferDurationMs", "0");
        this.a = fjlVar;
        this.g = eul.u(50000L);
        this.h = eul.u(50000L);
        this.b = eul.u(i);
        this.c = eul.u(i2);
        this.d = eul.u(0L);
        this.e = new HashMap();
        this.f = -1L;
    }
}
