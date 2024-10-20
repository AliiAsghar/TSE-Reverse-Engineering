package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acf<T> implements aaj<T> {
    private final int a;
    private final int b;
    private final aak c;

    public acf() {
        this(0, (aak) null, 7);
    }

    @Override // defpackage.zr
    public final /* bridge */ /* synthetic */ ack a(acg acgVar) {
        return c();
    }

    @Override // defpackage.aaj
    public final /* bridge */ /* synthetic */ acq b(acg acgVar) {
        return c();
    }

    public final acy c() {
        return new acy(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof acf) {
            acf acfVar = (acf) obj;
            if (acfVar.a == this.a && acfVar.b == this.b && d.F(acfVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public acf(int i, int i2, aak aakVar) {
        this.a = i;
        this.b = i2;
        this.c = aakVar;
    }

    public /* synthetic */ acf(int i, aak aakVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? aao.a : aakVar);
    }
}
