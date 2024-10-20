package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqm implements fmk {
    final /* synthetic */ fqn a;

    public fqm(fqn fqnVar) {
        this.a = fqnVar;
    }

    @Override // defpackage.fmk
    public final long a() {
        fqn fqnVar = this.a;
        return fqnVar.c.e(fqnVar.d);
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        fqn fqnVar = this.a;
        BigInteger valueOf = BigInteger.valueOf(fqnVar.c.f(j));
        fqn fqnVar2 = this.a;
        fml fmlVar = new fml(j, eul.q((fqnVar.a + valueOf.multiply(BigInteger.valueOf(fqnVar2.b - fqnVar2.a)).divide(BigInteger.valueOf(this.a.d)).longValue()) - 30000, this.a.a, r0.b - 1));
        return new fmi(fmlVar, fmlVar);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }
}
