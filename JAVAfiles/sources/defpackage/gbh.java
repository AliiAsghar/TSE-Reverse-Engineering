package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbh extends dyh {
    public final gba a;
    public final gba b;

    public gbh(gba gbaVar) {
        super(null);
        this.a = gbaVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbh)) {
            return false;
        }
        gbh gbhVar = (gbh) obj;
        if (!d.F(this.a, gbhVar.a)) {
            return false;
        }
        gba gbaVar = gbhVar.b;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return arsd.s(("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ").concat("|)"));
    }
}
