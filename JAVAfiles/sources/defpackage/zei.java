package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zei {
    public final boolean a;
    private final boolean b;

    public zei(boolean z) {
        this.b = false;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zei)) {
            return false;
        }
        zei zeiVar = (zei) obj;
        boolean z = zeiVar.b;
        if (this.a == zeiVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(false) * 31) + a.v(this.a);
    }

    public final String toString() {
        return "Flags(useComposeBackHandler=false, enableBackBehaviorFix=" + this.a + ")";
    }

    public zei() {
        this(false);
    }
}
