package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agey implements agfc {
    private final int a;
    private final Duration b;

    public agey(int i, Duration duration) {
        this.a = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agey)) {
            return false;
        }
        agey ageyVar = (agey) obj;
        if (this.a == ageyVar.a && d.F(this.b, ageyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Closing(selectedItemCount=" + this.a + ", timeSpent=" + this.b + ")";
    }
}
