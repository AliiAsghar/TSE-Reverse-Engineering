package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akj implements aki, ake {
    private final dqv a;
    private final long b;
    private final /* synthetic */ akf c = akf.a;

    public akj(dqv dqvVar, long j) {
        this.a = dqvVar;
        this.b = j;
    }

    @Override // defpackage.ake
    public final cga a(cga cgaVar, cfq cfqVar) {
        return this.c.a(cgaVar, cfqVar);
    }

    @Override // defpackage.ake
    public final cga b(cga cgaVar) {
        return this.c.b(cgaVar);
    }

    @Override // defpackage.aki
    public final float c() {
        long j = this.b;
        if (dqs.g(j)) {
            return this.a.eh(dqs.a(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.aki
    public final float d() {
        long j = this.b;
        if (dqs.h(j)) {
            return this.a.eh(dqs.b(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.aki
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akj)) {
            return false;
        }
        akj akjVar = (akj) obj;
        if (d.F(this.a, akjVar.a) && a.bB(this.b, akjVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.A(this.b);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) dqs.e(this.b)) + ')';
    }
}
