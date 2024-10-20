package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khx {
    public final boolean a;
    private final boolean b;

    public khx(boolean z) {
        this.a = z;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khx)) {
            return false;
        }
        khx khxVar = (khx) obj;
        if (this.a != khxVar.a) {
            return false;
        }
        boolean z = khxVar.b;
        return true;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.v(false);
    }

    public final String toString() {
        return "Flags(shareSnackbarHostStateWithProjector=" + this.a + ", useProjectorThemeForBottomSheetsAndBottomContentInProjectorMode=false)";
    }

    public khx() {
        this(false);
    }
}
