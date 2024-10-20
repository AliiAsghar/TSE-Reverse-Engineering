package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajza {
    public final ajwt a;
    public final ajzb b;
    public final int c;

    public ajza() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajza) {
            ajza ajzaVar = (ajza) obj;
            if (this.a.equals(ajzaVar.a) && this.b.equals(ajzaVar.b) && this.c == ajzaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.bm(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        int M = a.M(this.c);
        ajzb ajzbVar = this.b;
        return "Account{id=" + this.a.toString() + ", info=" + ajzbVar.toString() + ", state=" + Integer.toString(M) + "}";
    }

    public ajza(ajwt ajwtVar, ajzb ajzbVar, int i) {
        this.a = ajwtVar;
        if (ajzbVar == null) {
            throw new NullPointerException("Null info");
        }
        this.b = ajzbVar;
        this.c = i;
    }
}
