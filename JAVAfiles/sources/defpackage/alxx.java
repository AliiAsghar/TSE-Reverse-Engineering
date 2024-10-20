package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxx {
    public final alzs a;
    public final String b;

    public alxx(alzs alzsVar, String str) {
        alzsVar.getClass();
        this.a = alzsVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alxx) {
            alxx alxxVar = (alxx) obj;
            if (this.a.equals(alxxVar.a) && this.b.equals(alxxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return str.hashCode() ^ this.a.hashCode();
    }
}
