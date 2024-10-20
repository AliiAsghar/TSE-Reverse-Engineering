package defpackage;

import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afux implements afuy {
    public final Instant a;
    public final Size b;
    public final Duration c;

    public afux(Instant instant, Size size, Duration duration) {
        this.a = instant;
        this.b = size;
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afux)) {
            return false;
        }
        afux afuxVar = (afux) obj;
        if (d.F(this.a, afuxVar.a) && d.F(this.b, afuxVar.b) && d.F(this.c, afuxVar.c)) {
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
        return (((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Video(dateModified=" + this.a + ", dimensions=" + this.b + ", duration=" + this.c + ")";
    }
}
