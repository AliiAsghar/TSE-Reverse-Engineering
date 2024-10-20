package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzi {
    public final hd a;
    public final hh b;
    public final arpi c;
    public int e;
    public final gcz g;
    public final AtomicInteger h;
    public final asai i;
    public final asai j;
    public final AtomicReference k;
    public final CopyOnWriteArrayList l;
    public final arqr m;
    public final arml n;
    public final hpg o;
    private final arpi p;
    public final ascd d = ascy.a(false);
    public final AtomicReference f = new AtomicReference(null);

    public fzi(hd hdVar, hh hhVar, arpi arpiVar, arpi arpiVar2) {
        this.a = hdVar;
        this.b = hhVar;
        this.p = arpiVar;
        this.c = arpiVar2;
        fzf fzfVar = new fzf(this, arpiVar);
        this.g = fzfVar;
        this.h = new AtomicInteger(0);
        asaa asaaVar = new asaa(new fzh(armd.u(new aghw(fzfVar.h, 11), -1), null, this));
        arwb arwbVar = arws.a;
        this.i = armd.n(asaaVar, asfh.a);
        this.j = new asce(fzfVar.i);
        this.k = new AtomicReference(null);
        this.l = new CopyOnWriteArrayList();
        this.m = new rh(this, 11);
        this.n = armd.a(ry.d);
        this.o = new hpg(this, 1);
    }
}
