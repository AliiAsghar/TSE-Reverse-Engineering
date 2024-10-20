package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class u implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final n b;
    public final r c;
    public final r d;

    public u(String str, n nVar, r rVar, r rVar2) {
        this.a = str;
        this.b = nVar;
        this.c = rVar;
        this.d = rVar2;
    }

    @Deprecated
    public final int hashCode() {
        n nVar = this.b;
        return nVar.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String concat;
        r rVar = this.c;
        String obj = this.b.toString();
        String str = "";
        if (rVar == null) {
            concat = "";
        } else {
            concat = " ".concat(rVar.toString());
        }
        r rVar2 = this.d;
        if (rVar2 != null) {
            str = " ".concat(rVar2.toString());
        }
        return this.a + ": " + obj + concat + str;
    }
}
