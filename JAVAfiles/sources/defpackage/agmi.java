package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agmi {
    public String a;
    public Supplier b;
    public agmj c;
    public int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private byte k;

    public final agmk a() {
        String str;
        int i;
        agmj agmjVar;
        if (this.k == 63 && (str = this.a) != null && (i = this.d) != 0 && (agmjVar = this.c) != null) {
            return new agmk(str, this.e, this.f, this.g, this.h, this.i, this.j, i, this.b, agmjVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" columnName");
        }
        if ((this.k & 1) == 0) {
            sb.append(" isForeignKey");
        }
        if ((this.k & 2) == 0) {
            sb.append(" unique");
        }
        if ((this.k & 4) == 0) {
            sb.append(" sqlNotNull");
        }
        if ((this.k & 8) == 0) {
            sb.append(" isPartOfUniqueMultiColumnIndex");
        }
        if ((this.k & 16) == 0) {
            sb.append(" isPrimaryKey");
        }
        if ((this.k & 32) == 0) {
            sb.append(" hasIndex");
        }
        if (this.d == 0) {
            sb.append(" sqlType");
        }
        if (this.c == null) {
            sb.append(" setterForTesting");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(boolean z) {
        this.j = z;
        this.k = (byte) (this.k | 32);
    }

    public final void d(boolean z) {
        this.e = z;
        this.k = (byte) (this.k | 1);
    }

    public final void e(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 8);
    }

    public final void f(boolean z) {
        this.i = z;
        this.k = (byte) (this.k | 16);
    }

    public final void g(Supplier supplier) {
        this.b = supplier;
    }

    public final void h(agmj agmjVar) {
        this.c = agmjVar;
    }

    public final void i(boolean z) {
        this.g = z;
        this.k = (byte) (this.k | 4);
    }

    public final void j(boolean z) {
        this.f = z;
        this.k = (byte) (this.k | 2);
    }

    public final void k(int i) {
        this.d = i;
    }
}
