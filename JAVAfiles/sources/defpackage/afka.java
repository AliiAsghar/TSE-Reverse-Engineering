package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afka {
    public final double a;
    public final double b;
    public final Duration c;
    private final double d;
    private final double e;

    public afka() {
        this(31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afka)) {
            return false;
        }
        afka afkaVar = (afka) obj;
        if (Double.compare(this.a, afkaVar.a) != 0 || Double.compare(this.b, afkaVar.b) != 0) {
            return false;
        }
        double d = afkaVar.d;
        if (Double.compare(5.0d, 5.0d) != 0 || !d.F(this.c, afkaVar.c)) {
            return false;
        }
        double d2 = afkaVar.e;
        if (Double.compare(0.95d, 0.95d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((d.aI(this.a) * 31) + d.aI(this.b)) * 31) + d.aI(5.0d)) * 31) + this.c.hashCode()) * 31) + d.aI(0.95d);
    }

    public final String toString() {
        return "UsageFrecencyFactors(inContextScore=" + this.a + ", offContextScore=" + this.b + ", recencyScore=5.0, recencyDecreaseDuration=" + this.c + ", recencyDecrease=0.95)";
    }

    public /* synthetic */ afka(int i) {
        Duration ofDays = Duration.ofDays(1L);
        ofDays.getClass();
        this.a = 1 != (i & 1) ? 0.0d : 10.0d;
        this.b = (i & 2) != 0 ? 1.0d : 0.0d;
        this.d = 5.0d;
        this.c = ofDays;
        this.e = 0.95d;
    }
}
