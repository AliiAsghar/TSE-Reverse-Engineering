package defpackage;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public abstract class gcj extends AbstractList {
    private final gdk a;
    public final arwe f;
    public final arwb g;
    public final gcm h;
    public final List i;
    public final List j;
    public final akrq k;

    public gcj(gdk gdkVar, arwe arweVar, arwb arwbVar, gcm gcmVar, akrq akrqVar) {
        gdkVar.getClass();
        arweVar.getClass();
        arwbVar.getClass();
        akrqVar.getClass();
        this.a = gdkVar;
        this.f = arweVar;
        this.g = arwbVar;
        this.h = gcmVar;
        this.k = akrqVar;
        int i = akrqVar.c;
        int i2 = akrqVar.b;
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    public gdk a() {
        return this.a;
    }

    public abstract Object b();

    public abstract void c(arqv arqvVar);

    public abstract void d(int i);

    public void e(gbb gbbVar, gaz gazVar) {
        gbbVar.getClass();
    }

    public abstract boolean f();

    public final int g() {
        return this.h.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.h.get(i);
    }

    public final int h() {
        return this.h.b();
    }

    public final List i() {
        if (q()) {
            return this;
        }
        return new gea(this);
    }

    public final void j(gcg gcgVar) {
        gcgVar.getClass();
        aqjn.Q(this.i, rp.i);
        this.i.add(new WeakReference(gcgVar));
    }

    public final void k(arqv arqvVar) {
        arqvVar.getClass();
        aqjn.Q(this.j, rp.j);
        this.j.add(new WeakReference(arqvVar));
        c(arqvVar);
    }

    public final void l(int i) {
        if (i >= 0 && i < g()) {
            gcm gcmVar = this.h;
            gcmVar.g = arrn.u(i - gcmVar.b, 0, gcmVar.f - 1);
            d(i);
        } else {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + g());
        }
    }

    public final void m(int i, int i2) {
        if (i2 != 0) {
            Iterator it = aqjn.as(this.i).iterator();
            while (it.hasNext()) {
                gcg gcgVar = (gcg) ((WeakReference) it.next()).get();
                if (gcgVar != null) {
                    gcgVar.a(i, i2);
                }
            }
        }
    }

    public final void n(int i, int i2) {
        if (i2 != 0) {
            Iterator it = aqjn.as(this.i).iterator();
            while (it.hasNext()) {
                gcg gcgVar = (gcg) ((WeakReference) it.next()).get();
                if (gcgVar != null) {
                    gcgVar.b(i, i2);
                }
            }
        }
    }

    public final void o(gcg gcgVar) {
        gcgVar.getClass();
        aqjn.Q(this.i, new rh(gcgVar, 15));
    }

    public final void p(arqv arqvVar) {
        arqvVar.getClass();
        aqjn.Q(this.j, new rh(arqvVar, 16));
    }

    public boolean q() {
        return f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return g();
    }
}
