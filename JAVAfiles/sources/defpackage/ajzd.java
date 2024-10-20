package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzd {
    public final ajwt a;
    private final ajzb b;

    public ajzd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzd) {
            ajzd ajzdVar = (ajzd) obj;
            if (this.a.equals(ajzdVar.a) && this.b.equals(ajzdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ajzb ajzbVar = this.b;
        return "AccountContext{id=" + this.a.toString() + ", info=" + ajzbVar.toString() + "}";
    }

    public ajzd(ajwt ajwtVar, ajzb ajzbVar) {
        if (ajwtVar == null) {
            throw new NullPointerException("Null id");
        }
        this.a = ajwtVar;
        this.b = ajzbVar;
    }
}
