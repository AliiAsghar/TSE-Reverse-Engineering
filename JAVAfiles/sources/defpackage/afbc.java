package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbc implements afbd {
    private final afay a = new afay(null);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afbc) && d.F(this.a, ((afbc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "ManualTrigger(flags=" + this.a + ")";
    }

    @Override // defpackage.afbd
    public final void b() {
    }
}
