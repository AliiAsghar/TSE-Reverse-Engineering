package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeic implements aeig {
    public final int a;
    public final int b;
    private final String c = null;
    private final arqr d = null;

    public aeic(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.aeig
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aeig
    public final int b() {
        return this.a;
    }

    @Override // defpackage.aeig
    public final /* bridge */ /* synthetic */ aeig c(int i, int i2) {
        return new aeic(i, i2);
    }

    @Override // defpackage.aeig
    public final String d() {
        return null;
    }

    @Override // defpackage.aeig
    public final arqr e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeic)) {
            return false;
        }
        aeic aeicVar = (aeic) obj;
        if (this.a != aeicVar.a || this.b != aeicVar.b) {
            return false;
        }
        String str = aeicVar.c;
        if (!d.F(null, null)) {
            return false;
        }
        arqr arqrVar = aeicVar.d;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a * 31) + this.b) * 961;
    }

    public final String toString() {
        return "CodeBlock(start=" + this.a + ", end=" + this.b + ", onClickLabel=null, onClick=null)";
    }
}
