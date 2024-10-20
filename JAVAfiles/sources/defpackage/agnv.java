package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agnv {
    public final boolean a;

    public agnv() {
        throw null;
    }

    public static ajpj a() {
        ajpj ajpjVar = new ajpj();
        ajpjVar.d(false);
        return ajpjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof agnv) && this.a == ((agnv) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ 1000003;
    }

    public final String toString() {
        return "TransactionParameters{withoutSqliteTransaction=" + this.a + "}";
    }

    public agnv(boolean z) {
        this.a = z;
    }
}
