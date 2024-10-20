package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiz implements jjd {
    public final jji a;

    public jiz() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jiz) && d.F(this.a, ((jiz) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        jji jjiVar = this.a;
        if (jjiVar == null) {
            return 0;
        }
        return jjiVar.hashCode();
    }

    public final String toString() {
        return "SATELLITE(textCounterData=" + this.a + ")";
    }

    public jiz(jji jjiVar) {
        this.a = jjiVar;
    }

    public /* synthetic */ jiz(byte[] bArr) {
        this((jji) null);
    }
}
