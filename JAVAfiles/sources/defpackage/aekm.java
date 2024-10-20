package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekm {
    public final Duration a;
    public final Duration b;

    public aekm() {
        this(albo.cd(0), albo.cd(120));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekm)) {
            return false;
        }
        aekm aekmVar = (aekm) obj;
        if (d.F(this.a, aekmVar.a) && d.F(this.b, aekmVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TimerUiData(elapsedTime=" + this.a + ", maxDuration=" + this.b + ")";
    }

    public aekm(Duration duration, Duration duration2) {
        duration.getClass();
        duration2.getClass();
        this.a = duration;
        this.b = duration2;
    }
}
