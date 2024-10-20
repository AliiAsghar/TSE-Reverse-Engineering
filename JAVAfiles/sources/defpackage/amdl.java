package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amdl extends amdp {
    public amdl(long j) {
        super(j, 1.0d, 48);
    }

    public final String toString() {
        algv algvVar = new algv("uniformDelay");
        algvVar.g("delay", this.b);
        algvVar.f("tries", this.a);
        return algvVar.toString();
    }
}
