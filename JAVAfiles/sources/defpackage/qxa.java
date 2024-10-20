package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class qxa {
    private final String a;
    private final qwe b;

    public qxa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qxa) {
            qxa qxaVar = (qxa) obj;
            if (this.a.equals(qxaVar.a) && this.b.equals(qxaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RowIdAndTokenPair{rowId=" + this.a + ", token=" + this.b.toString() + "}";
    }

    public qxa(String str, qwe qweVar) {
        if (str == null) {
            throw new NullPointerException("Null rowId");
        }
        this.a = str;
        if (qweVar != null) {
            this.b = qweVar;
            return;
        }
        throw new NullPointerException("Null token");
    }
}
