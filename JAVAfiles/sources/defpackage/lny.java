package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lny implements lkg {
    public final yjh a;

    public lny(yjh yjhVar) {
        yjhVar.getClass();
        this.a = yjhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lny) && this.a == ((lny) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestPermission(permission=" + this.a + ")";
    }
}
