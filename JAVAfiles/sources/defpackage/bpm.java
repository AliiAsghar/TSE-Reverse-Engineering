package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpm implements cpz {
    final /* synthetic */ bpq a;
    final /* synthetic */ arqr b;
    final /* synthetic */ ahp c;

    public bpm(bpq bpqVar, arqr arqrVar, ahp ahpVar) {
        this.a = bpqVar;
        this.b = arqrVar;
        this.c = ahpVar;
    }

    private final float e(long j) {
        if (this.c == ahp.b) {
            return cjn.b(j);
        }
        return cjn.c(j);
    }

    private final float f(long j) {
        if (this.c == ahp.b) {
            return drp.a(j);
        }
        return drp.b(j);
    }

    private final long g(float f) {
        float f2;
        ahp ahpVar = this.c;
        ahp ahpVar2 = ahp.b;
        ahp ahpVar3 = ahp.a;
        if (ahpVar == ahpVar2) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if (ahpVar != ahpVar3) {
            f = 0.0f;
        }
        return a.z(f2, f);
    }

    @Override // defpackage.cpz
    public final long a(long j, long j2, int i) {
        if (a.bA(i, 1)) {
            return g(this.a.d.a(e(j2)));
        }
        return 0L;
    }

    @Override // defpackage.cpz
    public final long b(long j, int i) {
        float e = e(j);
        if (e < brg.a && a.bA(i, 1)) {
            return g(this.a.d.a(e));
        }
        return 0L;
    }

    @Override // defpackage.cpz
    public final Object c(long j, long j2, arpe arpeVar) {
        this.b.a(new Float(f(j2)));
        return new drp(j2);
    }

    @Override // defpackage.cpz
    public final Object d(long j, arpe arpeVar) {
        float f = f(j);
        bpq bpqVar = this.a;
        float b = bpqVar.b();
        float b2 = bpqVar.d.f().b();
        if (f < brg.a && b > b2) {
            this.b.a(new Float(f));
        } else {
            j = 0;
        }
        return new drp(j);
    }
}
