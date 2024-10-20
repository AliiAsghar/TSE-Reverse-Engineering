package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypd {
    private final apef a;

    public ypd(apef apefVar) {
        this.a = apefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ypd) && d.F(this.a, ((ypd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        apef apefVar = this.a;
        if (apefVar == null) {
            return 0;
        }
        return apefVar.hashCode();
    }

    public final String toString() {
        return "ReinforcementParams(serverInfoParams=" + this.a + ")";
    }

    public ypd() {
        this(null);
    }
}
