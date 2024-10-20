package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctx implements cti {
    private final cyc a;

    public ctx(cyc cycVar) {
        this.a = cycVar;
    }

    private final long b() {
        cyc a = cty.a(this.a);
        return a.Q(ek(a.n, 0L), a().ek(a.g, 0L));
    }

    public final cyn a() {
        return this.a.g;
    }

    @Override // defpackage.cti
    public final long ek(cti ctiVar, long j) {
        if (ctiVar instanceof ctx) {
            cyc cycVar = ((ctx) ctiVar).a;
            cycVar.g.af();
            cyc z = a().Y(cycVar.g).z();
            if (z != null) {
                long c = dre.c(dre.d(cycVar.D(z), drf.c(j)), this.a.D(z));
                return (Float.floatToRawIntBits(dre.b(c)) & 4294967295L) | (Float.floatToRawIntBits(dre.a(c)) << 32);
            }
            cyc a = cty.a(cycVar);
            long d = dre.d(dre.d(cycVar.D(a), a.h), drf.c(j));
            cyc cycVar2 = this.a;
            cyc a2 = cty.a(cycVar2);
            long c2 = dre.c(d, dre.d(cycVar2.D(a2), a2.h));
            long floatToRawIntBits = Float.floatToRawIntBits(dre.a(c2));
            long floatToRawIntBits2 = Float.floatToRawIntBits(dre.b(c2)) & 4294967295L;
            cyn cynVar = a2.g.v;
            cynVar.getClass();
            cyn cynVar2 = a.g.v;
            cynVar2.getClass();
            return cynVar.ek(cynVar2, floatToRawIntBits2 | (floatToRawIntBits << 32));
        }
        cyc a3 = cty.a(this.a);
        long ek = ek(a3.n, j);
        long j2 = a3.h;
        int a4 = dre.a(j2);
        int b = dre.b(j2);
        long Q = a.Q(ek, (4294967295L & Float.floatToRawIntBits(b)) | (Float.floatToRawIntBits(a4) << 32));
        cyn cynVar3 = a3.g;
        if (!cynVar3.r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cynVar3.af();
        cyn cynVar4 = cynVar3.v;
        if (cynVar4 == null) {
            cynVar4 = a3.g;
        }
        return d.aH(Q, cynVar4.ek(ctiVar, 0L));
    }

    @Override // defpackage.cti
    public final long g() {
        cyc cycVar = this.a;
        return (cycVar.a << 32) | (cycVar.b & 4294967295L);
    }

    @Override // defpackage.cti
    public final long h(cti ctiVar, long j) {
        return ek(ctiVar, j);
    }

    @Override // defpackage.cti
    public final long i(long j) {
        return a().i(d.aH(j, b()));
    }

    @Override // defpackage.cti
    public final long j(long j) {
        return a().j(d.aH(0L, b()));
    }

    @Override // defpackage.cti
    public final long k(long j) {
        return a().k(d.aH(j, b()));
    }

    @Override // defpackage.cti
    public final long l(long j) {
        return d.aH(a().l(j), b());
    }

    @Override // defpackage.cti
    public final long m(long j) {
        return d.aH(a().m(j), b());
    }

    @Override // defpackage.cti
    public final cjp n(cti ctiVar, boolean z) {
        return a().n(ctiVar, z);
    }

    @Override // defpackage.cti
    public final cti o() {
        cyc z;
        if (!r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cyn cynVar = a().r.y().v;
        if (cynVar == null || (z = cynVar.z()) == null) {
            return null;
        }
        return z.n;
    }

    @Override // defpackage.cti
    public final void p(cti ctiVar, float[] fArr) {
        a().p(ctiVar, fArr);
    }

    @Override // defpackage.cti
    public final boolean r() {
        return a().r();
    }
}
