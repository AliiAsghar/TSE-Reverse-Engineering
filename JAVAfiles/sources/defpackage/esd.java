package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class esd {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public alog h;
    public alog i;
    public int j;
    public int k;
    public alog l;
    public esc m;
    public alog n;
    public int o;
    public int p;
    public boolean q;
    public HashMap r;
    public HashSet s;

    @Deprecated
    public esd() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        int i = alog.d;
        alog alogVar = alsx.a;
        this.h = alogVar;
        this.i = alogVar;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = alogVar;
        this.m = esc.a;
        this.n = alsx.a;
        this.o = 0;
        this.p = 0;
        this.q = false;
        this.r = new HashMap();
        this.s = new HashSet();
    }

    public final void a(ese eseVar) {
        this.a = eseVar.a;
        this.b = eseVar.b;
        this.c = eseVar.c;
        this.d = eseVar.d;
        int i = eseVar.e;
        int i2 = eseVar.f;
        int i3 = eseVar.g;
        int i4 = eseVar.h;
        this.e = eseVar.i;
        this.f = eseVar.j;
        this.g = eseVar.k;
        this.h = eseVar.l;
        int i5 = eseVar.m;
        this.i = eseVar.n;
        int i6 = eseVar.o;
        this.j = eseVar.p;
        this.k = eseVar.q;
        this.l = eseVar.r;
        this.m = eseVar.s;
        this.n = eseVar.t;
        this.o = eseVar.u;
        this.p = eseVar.v;
        boolean z = eseVar.w;
        boolean z2 = eseVar.x;
        boolean z3 = eseVar.y;
        this.q = eseVar.z;
        this.s = new HashSet(eseVar.B);
        this.r = new HashMap(eseVar.A);
    }

    public final void b(int i) {
        Iterator it = this.r.values().iterator();
        while (it.hasNext()) {
            if (((esb) it.next()).a() == i) {
                it.remove();
            }
        }
    }

    public void c(int i) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public esd(ese eseVar) {
        a(eseVar);
    }
}
