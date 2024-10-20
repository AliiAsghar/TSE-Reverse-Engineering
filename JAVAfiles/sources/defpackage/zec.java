package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zec {
    public final boolean a;
    public final aeym b;

    public zec(boolean z, aeym aeymVar) {
        this.a = z;
        this.b = aeymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zec)) {
            return false;
        }
        zec zecVar = (zec) obj;
        if (this.a == zecVar.a && d.F(this.b, zecVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aeym aeymVar = this.b;
        if (aeymVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeymVar.hashCode();
        }
        return (a.v(this.a) * 31) + hashCode;
    }

    public final String toString() {
        return "SimSelectorRowUiData(visible=" + this.a + ", simBarUiData=" + this.b + ")";
    }

    public /* synthetic */ zec() {
        this(false, null);
    }
}
