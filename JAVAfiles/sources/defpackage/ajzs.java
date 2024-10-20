package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzs {
    public final Object a;
    public final ajzw b;

    public ajzs() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzs) {
            ajzs ajzsVar = (ajzs) obj;
            if (alzz.am(this.a, ajzsVar.a) && this.b.equals(ajzsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        return "ResultAndAccountData{result=" + alzz.ai(this.a) + ", accountData=" + this.b.toString() + "}";
    }

    public ajzs(Object obj, ajzw ajzwVar) {
        this.a = obj;
        if (ajzwVar == null) {
            throw new NullPointerException("Null accountData");
        }
        this.b = ajzwVar;
    }
}
