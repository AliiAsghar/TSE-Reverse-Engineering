package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfu {
    public final mjb a;
    public final mjb b;

    public kfu(mjb mjbVar, mjb mjbVar2) {
        this.a = mjbVar;
        this.b = mjbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfuVar = (kfu) obj;
        if (d.F(this.a, kfuVar.a) && d.F(this.b, kfuVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        mjb mjbVar = this.a;
        int i = 0;
        if (mjbVar == null) {
            hashCode = 0;
        } else {
            hashCode = mjbVar.hashCode();
        }
        mjb mjbVar2 = this.b;
        if (mjbVar2 != null) {
            i = mjbVar2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "PagingKeyPair(prev=" + this.a + ", next=" + this.b + ")";
    }
}
