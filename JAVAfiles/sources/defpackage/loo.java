package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loo implements lkf {
    public final lon a;
    private final int b = 3;

    public loo(lon lonVar) {
        this.a = lonVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loo)) {
            return false;
        }
        loo looVar = (loo) obj;
        int i = looVar.b;
        if (d.F(this.a, looVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        a.bm(3);
        return this.a.hashCode() + 93;
    }

    public final String toString() {
        return yyb.bh(super.toString()).toString();
    }
}
