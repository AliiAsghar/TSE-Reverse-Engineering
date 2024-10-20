package defpackage;

import android.util.Size;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afuw implements afuy {
    public final Instant a;
    public final Size b;

    public afuw(Instant instant, Size size) {
        size.getClass();
        this.a = instant;
        this.b = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afuw)) {
            return false;
        }
        afuw afuwVar = (afuw) obj;
        if (d.F(this.a, afuwVar.a) && d.F(this.b, afuwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Instant instant = this.a;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Image(dateModified=" + this.a + ", dimensions=" + this.b + ")";
    }
}
