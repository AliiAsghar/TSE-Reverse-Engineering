package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgc {
    public final miz a;
    public final miz b;

    public kgc(miz mizVar, miz mizVar2) {
        this.a = mizVar;
        this.b = mizVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgc)) {
            return false;
        }
        kgc kgcVar = (kgc) obj;
        if (d.F(this.a, kgcVar.a) && d.F(this.b, kgcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        miz mizVar = this.b;
        if (mizVar == null) {
            hashCode = 0;
        } else {
            hashCode = mizVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CachedMessage(current=" + this.a + ", prev=" + this.b + ")";
    }
}
