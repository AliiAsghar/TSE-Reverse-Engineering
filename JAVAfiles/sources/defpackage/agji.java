package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agji implements agjj {
    public final Duration a;
    public final Duration b;
    public final agim c;

    public agji() {
        this(Duration.ZERO, agiq.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agji)) {
            return false;
        }
        agji agjiVar = (agji) obj;
        if (!d.F(this.a, agjiVar.a) || !d.F(this.b, agjiVar.b)) {
            return false;
        }
        agim agimVar = agjiVar.c;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "Recording(elapsedTime=" + this.a + ", maxDuration=" + this.b + ", noiseCancellationUiData=null)";
    }

    public agji(Duration duration, Duration duration2) {
        duration.getClass();
        duration2.getClass();
        this.a = duration;
        this.b = duration2;
        this.c = null;
    }
}
