package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zaa {
    public final mkj a;
    public final mkj b;

    public zaa(mkj mkjVar, mkj mkjVar2) {
        this.a = mkjVar;
        this.b = mkjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaa)) {
            return false;
        }
        zaa zaaVar = (zaa) obj;
        if (d.F(this.a, zaaVar.a) && d.F(this.b, zaaVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        mkj mkjVar = this.a;
        int i = 0;
        if (mkjVar == null) {
            hashCode = 0;
        } else {
            hashCode = mkjVar.hashCode();
        }
        mkj mkjVar2 = this.b;
        if (mkjVar2 != null) {
            i = mkjVar2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "PagingKeyPair(prev=" + this.a + ", next=" + this.b + ")";
    }
}
