package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agez implements agfc {
    private final int a;
    private final Duration b;

    public agez(int i, Duration duration) {
        this.a = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agez)) {
            return false;
        }
        agez agezVar = (agez) obj;
        if (this.a == agezVar.a && d.F(this.b, agezVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Loaded(selectedItemCount=" + this.a + ", loadingTime=" + this.b + ")";
    }
}
