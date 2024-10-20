package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvy implements gwn, haf {
    public static final String a = gsy.b("DelayMetCommandHandler");
    public final Context b;
    public final int c;
    public final gyg d;
    public final gwd e;
    public int f;
    public final Executor g;
    public final Executor h;
    public PowerManager.WakeLock i;
    public boolean j;
    public final arwb k;
    public volatile arxm l;
    public final hgi m;
    public final hgi n;
    private final Object o;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public gvy(Context context, int i, gwd gwdVar, hgi hgiVar) {
        this.b = context;
        this.c = i;
        this.e = gwdVar;
        this.d = (gyg) hgiVar.a;
        this.n = hgiVar;
        gqg gqgVar = gwdVar.e.k;
        gpx gpxVar = gwdVar.j;
        this.g = gpxVar.b;
        this.h = gpxVar.c;
        this.k = (arwb) gpxVar.d;
        this.m = new hgi(gqgVar);
        this.j = false;
        this.f = 0;
        this.o = new Object();
    }

    public final void a() {
        synchronized (this.o) {
            if (this.l != null) {
                this.l.v(null);
            }
            this.e.c.a(this.d);
            PowerManager.WakeLock wakeLock = this.i;
            if (wakeLock != null && wakeLock.isHeld()) {
                gsy.a().c(a, "Releasing wakelock " + this.i + "for WorkSpec " + this.d);
                this.i.release();
            }
        }
    }

    @Override // defpackage.haf
    public final void b(gyg gygVar) {
        gsy a2 = gsy.a();
        String str = a;
        Objects.toString(gygVar);
        a2.c(str, "Exceeded time limits on execution for ".concat(gygVar.toString()));
        this.g.execute(new gtq(this, 2));
    }

    @Override // defpackage.gwn
    public final void e(gys gysVar, gvf gvfVar) {
        if (gvfVar instanceof gwh) {
            this.g.execute(new gtq(this, 3));
        } else {
            this.g.execute(new gtq(this, 2));
        }
    }
}
