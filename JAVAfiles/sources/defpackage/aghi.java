package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghi implements aghk {
    public final Duration a;

    public aghi(Duration duration) {
        duration.getClass();
        this.a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aghi) && d.F(this.a, ((aghi) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Recording(elapsedTime=" + this.a + ")";
    }
}
