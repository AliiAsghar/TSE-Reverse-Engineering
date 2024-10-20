package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqi {
    public final List a;
    private final boolean b = false;

    public lqi(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqi)) {
            return false;
        }
        lqi lqiVar = (lqi) obj;
        boolean z = lqiVar.b;
        if (d.F(this.a, lqiVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 38348;
    }

    public final String toString() {
        return "PenpalAvailabilityResult(isAvailable=false, unavailableReasons=" + this.a + ")";
    }
}
