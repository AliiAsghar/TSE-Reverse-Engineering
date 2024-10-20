package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrs {
    public final boolean a;
    private final boolean b;

    public yrs() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrs)) {
            return false;
        }
        yrs yrsVar = (yrs) obj;
        if (this.a != yrsVar.a) {
            return false;
        }
        boolean z = yrsVar.b;
        return true;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.v(false);
    }

    public final String toString() {
        return "SpatulaSettings(isEnabled=" + this.a + ", canEdit=false)";
    }

    public /* synthetic */ yrs(boolean z, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.b = false;
    }
}
