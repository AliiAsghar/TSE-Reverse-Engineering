package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtn {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final boolean f;

    public dtn(boolean z, boolean z2, boolean z3, dto dtoVar, boolean z4, boolean z5) {
        int i = dsu.a;
        dto dtoVar2 = dto.b;
        int i2 = true != z ? 262152 : 262144;
        i2 = dtoVar == dtoVar2 ? i2 | 8192 : i2;
        i2 = z5 ? i2 : i2 | 512;
        boolean z6 = dtoVar == dto.a;
        this.a = i2;
        this.b = z6;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtn)) {
            return false;
        }
        dtn dtnVar = (dtn) obj;
        if (this.a != dtnVar.a || this.b != dtnVar.b || this.c != dtnVar.c || this.d != dtnVar.d || this.e != dtnVar.e) {
            return false;
        }
        boolean z = dtnVar.f;
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        boolean z = this.e;
        boolean z2 = this.d;
        return ((((((((i + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z2)) * 31) + a.v(z)) * 31) + a.v(false);
    }

    public /* synthetic */ dtn(boolean z, boolean z2, boolean z3, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), (i & 2) != 0, (i & 4) != 0, dto.a, z2, z3);
    }

    public /* synthetic */ dtn(boolean z, boolean z2, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), (i & 2) != 0, (i & 4) != 0, dto.a, true, (!((i & 8) == 0)) | z2);
    }
}
