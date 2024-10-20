package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhj {
    public final Uri b;
    public final ewb c;
    public final flw d;
    public volatile boolean e;
    public long g;
    public fmq i;
    public boolean j;
    public final /* synthetic */ fhm k;
    public final aqws m;
    public final lxs n;
    public final vtk l = new vtk((byte[]) null);
    public boolean f = true;
    public final long a = fgm.a();
    public evl h = a(0);

    public fhj(fhm fhmVar, Uri uri, evg evgVar, lxs lxsVar, flw flwVar, aqws aqwsVar) {
        this.k = fhmVar;
        this.b = uri;
        this.c = new ewb(evgVar);
        this.n = lxsVar;
        this.d = flwVar;
        this.m = aqwsVar;
    }

    public final evl a(long j) {
        evk evkVar = new evk();
        evkVar.a = this.b;
        evkVar.e = j;
        evkVar.f = 6;
        evkVar.d = fhm.a;
        return evkVar.a();
    }

    public final void b(long j, long j2) {
        this.l.a = j;
        this.g = j2;
        this.f = true;
        this.j = false;
    }
}
