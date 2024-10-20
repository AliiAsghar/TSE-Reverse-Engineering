package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amdn extends amdp {
    public amdn(long j, double d, int i) {
        super(j, d, i);
    }

    public final String toString() {
        algv algvVar = new algv("exponentialBackoff");
        algvVar.g("firstDelayMs", this.b);
        algvVar.d("multiplier", this.c);
        algvVar.f("tries", this.a);
        return algvVar.toString();
    }
}
