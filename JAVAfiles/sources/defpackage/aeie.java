package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeie implements aeig {
    public final aein a;
    public final int b;
    public final int c;
    private final String d;
    private final arqr e;

    public aeie(aein aeinVar, int i, int i2, String str, arqr arqrVar) {
        aeinVar.getClass();
        this.a = aeinVar;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = arqrVar;
    }

    @Override // defpackage.aeig
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aeig
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aeig
    public final /* bridge */ /* synthetic */ aeig c(int i, int i2) {
        return new aeie(this.a, i, i2, this.d, this.e);
    }

    @Override // defpackage.aeig
    public final String d() {
        return this.d;
    }

    @Override // defpackage.aeig
    public final arqr e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeie)) {
            return false;
        }
        aeie aeieVar = (aeie) obj;
        if (this.a == aeieVar.a && this.b == aeieVar.b && this.c == aeieVar.c && d.F(this.d, aeieVar.d) && d.F(this.e, aeieVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((((hashCode2 + this.b) * 31) + this.c) * 31) + hashCode) * 31;
        arqr arqrVar = this.e;
        if (arqrVar != null) {
            i = arqrVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Standard(type=" + this.a + ", start=" + this.b + ", end=" + this.c + ", onClickLabel=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ aeie(aein aeinVar, int i, int i2, arqr arqrVar, int i3) {
        this(aeinVar, i, i2, (String) null, (i3 & 16) != 0 ? null : arqrVar);
    }
}
