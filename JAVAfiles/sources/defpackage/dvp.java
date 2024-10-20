package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvp {
    public dwc a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public final HashMap r;
    dut s;

    public dvp() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
    }

    public final void a(dvp dvpVar) {
        if (dvpVar != null) {
            this.f = dvpVar.f;
            this.g = dvpVar.g;
            this.h = dvpVar.h;
            this.i = dvpVar.i;
            this.j = dvpVar.j;
            this.k = dvpVar.k;
            this.l = dvpVar.l;
            this.m = dvpVar.m;
            this.n = dvpVar.n;
            this.o = dvpVar.o;
            this.p = dvpVar.p;
            this.q = dvpVar.q;
            this.s = dvpVar.s;
            this.r.clear();
            for (dur durVar : dvpVar.r.values()) {
                this.r.put(durVar.a, new dur(durVar));
            }
        }
    }

    public dvp(dvp dvpVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
        this.a = dvpVar.a;
        this.b = dvpVar.b;
        this.c = dvpVar.c;
        this.d = dvpVar.d;
        this.e = dvpVar.e;
        a(dvpVar);
    }

    public dvp(dwc dwcVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
        this.a = dwcVar;
    }
}
