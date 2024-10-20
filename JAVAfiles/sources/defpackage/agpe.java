package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpe {
    private boolean A;
    private boolean B;
    private byte C;
    public String a;
    public alog b;
    public String c;
    public alob d;
    public alog e;
    public String f;
    public alob g;
    public alog h;
    public agpj i;
    public String j;
    public String k;
    public String l;
    public Boolean m;
    public alob n;
    public alog o;
    public alok p;
    public alor q;
    public agni r;
    public String s;
    public alhr t;
    public String u;
    private boolean v;
    private alog w;
    private alob x;
    private alog y;
    private boolean z;

    public agpe() {
    }

    public final String a() {
        return b().a;
    }

    public final agpf b() {
        String str;
        alog alogVar;
        alob alobVar = this.d;
        if (alobVar != null) {
            this.e = alobVar.g();
        } else if (this.e == null) {
            int i = alog.d;
            this.e = alsx.a;
        }
        alob alobVar2 = this.g;
        if (alobVar2 != null) {
            this.h = alobVar2.g();
        } else if (this.h == null) {
            int i2 = alog.d;
            this.h = alsx.a;
        }
        alob alobVar3 = this.n;
        if (alobVar3 != null) {
            this.o = alobVar3.g();
        } else if (this.o == null) {
            int i3 = alog.d;
            this.o = alsx.a;
        }
        alok alokVar = this.p;
        if (alokVar != null) {
            this.q = alokVar.b();
        } else if (this.q == null) {
            this.q = altc.a;
        }
        alob alobVar4 = this.x;
        if (alobVar4 != null) {
            this.y = alobVar4.g();
        } else if (this.y == null) {
            int i4 = alog.d;
            this.y = alsx.a;
        }
        if (this.C == 15 && (str = this.a) != null && (alogVar = this.w) != null) {
            return new agpf(str, this.v, alogVar, this.b, this.c, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.o, this.q, this.y, this.z, this.r, this.A, this.s, this.t, this.u, this.B);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" table");
        }
        if ((this.C & 1) == 0) {
            sb.append(" distinct");
        }
        if (this.w == null) {
            sb.append(" defaultColumns");
        }
        if ((this.C & 2) == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if ((this.C & 4) == 0) {
            sb.append(" isEmptyProjection");
        }
        if ((this.C & 8) == 0) {
            sb.append(" queryForColumnSizes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final alob c() {
        if (this.x == null) {
            if (this.y == null) {
                this.x = new alob();
            } else {
                alob alobVar = new alob();
                this.x = alobVar;
                alobVar.j(this.y);
                this.y = null;
            }
        }
        return this.x;
    }

    public final void d(List list) {
        this.w = alog.n(list);
    }

    public final void e(boolean z) {
        this.v = z;
        this.C = (byte) (this.C | 1);
    }

    public final void f(boolean z) {
        this.z = z;
        this.C = (byte) (this.C | 2);
    }

    public final void g(boolean z) {
        this.A = z;
        this.C = (byte) (this.C | 4);
    }

    public final void h(boolean z) {
        this.B = z;
        this.C = (byte) (this.C | 8);
    }

    public agpe(agpf agpfVar) {
        this.a = agpfVar.a;
        this.v = agpfVar.b;
        this.w = agpfVar.c;
        this.b = agpfVar.d;
        this.c = agpfVar.e;
        this.e = agpfVar.f;
        this.f = agpfVar.g;
        this.h = agpfVar.h;
        this.i = agpfVar.i;
        this.j = agpfVar.j;
        this.k = agpfVar.k;
        this.l = agpfVar.l;
        this.m = agpfVar.m;
        this.o = agpfVar.n;
        this.q = agpfVar.o;
        this.y = agpfVar.p;
        this.z = agpfVar.q;
        this.r = agpfVar.r;
        this.A = agpfVar.s;
        this.s = agpfVar.t;
        this.t = agpfVar.u;
        this.u = agpfVar.v;
        this.B = agpfVar.w;
        this.C = (byte) 15;
    }
}
