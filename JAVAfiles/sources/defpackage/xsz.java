package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsz extends yyb {
    public final xsc a;

    public xsz(xsc xscVar) {
        super((char[]) null, (short[]) null);
        this.a = xscVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xsz) && d.F(this.a, ((xsz) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response(fileUploadResult=" + this.a + ")";
    }
}
