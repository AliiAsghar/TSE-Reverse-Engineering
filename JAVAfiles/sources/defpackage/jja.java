package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jja implements jjc {
    private final jji a;

    public jja() {
        this((byte[]) null);
    }

    @Override // defpackage.jjc
    public final jji a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jja) && d.F(this.a, ((jja) obj).a)) {
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
        return "MASS_SMS(textCounterData=" + this.a + ")";
    }

    public jja(jji jjiVar) {
        this.a = jjiVar;
    }

    public /* synthetic */ jja(byte[] bArr) {
        this((jji) null);
    }
}
