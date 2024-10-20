package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public final class fzd {
    public final hh a;
    public final Executor b = sq.a;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public gcj d;
    public gcj e;
    public int f;
    public final gch g;
    public final arth h;
    public final List i;
    public final gcg j;
    public final fdx k;

    @armg
    public fzd(hh hhVar, fdx fdxVar) {
        fzb fzbVar = new fzb(this);
        this.g = fzbVar;
        this.h = new ifp((Object) fzbVar, 1, (byte[]) null);
        this.i = new CopyOnWriteArrayList();
        this.j = new fzc(this);
        this.a = hhVar;
        this.k = fdxVar;
    }

    public final int a() {
        gcj c = c();
        if (c != null) {
            return c.g();
        }
        return 0;
    }

    public final hh b() {
        hh hhVar = this.a;
        if (hhVar != null) {
            return hhVar;
        }
        arro.b("updateCallback");
        return null;
    }

    public final gcj c() {
        gcj gcjVar = this.e;
        if (gcjVar == null) {
            return this.d;
        }
        return gcjVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, arqv] */
    public final void d(gcj gcjVar, gcj gcjVar2) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ghw) it.next()).a.a(gcjVar, gcjVar2);
        }
    }
}
