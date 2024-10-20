package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alwi implements alvs {
    private final alvs a;
    private final Object b;

    public alwi(alvs alvsVar, Object obj) {
        this.a = alvsVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alwi)) {
            return false;
        }
        alwi alwiVar = (alwi) obj;
        if (!this.a.equals(alwiVar.a) || !this.b.equals(alwiVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
