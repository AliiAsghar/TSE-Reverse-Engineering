package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxg {
    public static final rxg a;
    public static final rxg b;
    public static final rxg c;
    public final long d;
    public final long e;

    static {
        rxg rxgVar = new rxg(0L, 0L);
        a = rxgVar;
        rxg rxgVar2 = new rxg(-1L, -1L);
        b = rxgVar2;
        rxg rxgVar3 = new rxg(-2L, -2L);
        c = rxgVar3;
        aqjn.B(rxgVar, rxgVar2, rxgVar3);
    }

    public rxg(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxg)) {
            return false;
        }
        rxg rxgVar = (rxg) obj;
        if (this.d == rxgVar.d && this.e == rxgVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.d) * 31) + a.A(this.e);
    }

    public final String toString() {
        return "ModifiedByKey(amVersionCode=" + this.d + ", stackTraceHash=" + this.e + ")";
    }
}
