package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwy {
    public static final long a = eul.u(500);
    public final String b;
    public final fuy c;
    public final SparseArray d;
    public final ScheduledExecutorService e;
    public final long f;
    public final MediaCodec.BufferInfo g;
    public boolean h;
    public boolean i;
    public int j;
    public long k;
    public long l;
    public long m;
    public ScheduledFuture n;
    public boolean o;
    public fva p;
    public long q;
    public volatile int r;
    public volatile int s;
    public final qdq t;

    public fwy(String str, fuy fuyVar, qdq qdqVar, long j) {
        this.b = str;
        this.c = fuyVar;
        this.t = qdqVar;
        d.s(true);
        d.t(true, "appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.");
        this.f = j;
        this.d = new SparseArray();
        this.j = -2;
        this.q = -9223372036854775807L;
        this.l = Long.MAX_VALUE;
        this.e = eul.Q("Muxer:Timer");
        this.g = new MediaCodec.BufferInfo();
    }

    public static fwx a(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        fwx fwxVar = (fwx) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            fwx fwxVar2 = (fwx) sparseArray.valueAt(i);
            if (fwxVar2.e < fwxVar.e) {
                fwxVar = fwxVar2;
            }
        }
        return fwxVar;
    }

    public final alog b(int i) {
        return this.c.a(i);
    }

    public final void c() {
        dzg.h(this.p);
        ScheduledFuture scheduledFuture = this.n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.n = this.e.schedule(new fhg(this, 16), this.f, TimeUnit.MILLISECONDS);
    }

    public final boolean d(String str) {
        return b(erl.b(str)).contains(str);
    }
}
