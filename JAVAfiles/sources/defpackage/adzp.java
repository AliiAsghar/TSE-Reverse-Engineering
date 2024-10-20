package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class adzp extends adcx {
    public final boolean a;
    private final boolean b;

    public adzp(boolean z) {
        super(null, null);
        this.a = z;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adzp)) {
            return false;
        }
        adzp adzpVar = (adzp) obj;
        if (this.a != adzpVar.a) {
            return false;
        }
        boolean z = adzpVar.b;
        return true;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.v(false);
    }
}
