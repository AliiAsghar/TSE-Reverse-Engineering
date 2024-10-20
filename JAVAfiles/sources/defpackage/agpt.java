package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpt {
    public agni a;
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private alpr f;
    private alpt g;
    private byte h;

    public agpt() {
    }

    public final agpu a() {
        b();
        return b();
    }

    public final agpu b() {
        agni agniVar;
        alpr alprVar = this.f;
        if (alprVar != null) {
            this.g = alprVar.g();
        } else if (this.g == null) {
            this.g = altg.a;
        }
        if (this.h == 15 && (agniVar = this.a) != null) {
            return new agpu(this.c, this.d, this.e, agniVar, this.b, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" disableTableFilters");
        }
        if ((this.h & 2) == 0) {
            sb.append(" omitUnchangedRows");
        }
        if ((this.h & 4) == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.a == null) {
            sb.append(" loggingTag");
        }
        if ((this.h & 8) == 0) {
            sb.append(" conflictAlgorithm");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final alpr c() {
        if (this.f == null) {
            if (this.g == null) {
                this.f = new alpr();
            } else {
                alpr alprVar = new alpr();
                this.f = alprVar;
                alprVar.j(this.g);
                this.g = null;
            }
        }
        return this.f;
    }

    public final void d(boolean z) {
        this.c = z;
        this.h = (byte) (this.h | 1);
    }

    public final void e(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 4);
    }

    public final void f(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 2);
    }

    public final void g() {
        this.h = (byte) (this.h | 8);
    }

    public agpt(agpu agpuVar) {
        this.c = agpuVar.a;
        this.d = agpuVar.b;
        this.e = agpuVar.c;
        this.a = agpuVar.d;
        this.b = agpuVar.e;
        this.g = agpuVar.f;
        this.h = (byte) 15;
    }
}
