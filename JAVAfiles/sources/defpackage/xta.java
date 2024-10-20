package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xta extends yyb {
    public final pwr a;

    public xta(pwr pwrVar) {
        super((char[]) null, (short[]) null);
        this.a = pwrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xta) && d.F(this.a, ((xta) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadFailure(fileTransferFailure=" + this.a + ")";
    }
}
