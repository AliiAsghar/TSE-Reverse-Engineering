package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ans implements asr {
    final /* synthetic */ aov a;
    final /* synthetic */ boolean b;

    public ans(aov aovVar, boolean z) {
        this.a = aovVar;
        this.b = z;
    }

    @Override // defpackage.asr
    public final float a() {
        aov aovVar = this.a;
        return ass.a(aovVar.b(), aovVar.c(), aovVar.h());
    }

    @Override // defpackage.asr
    public final float b() {
        aov aovVar = this.a;
        return ass.b(aovVar.b(), aovVar.c());
    }

    @Override // defpackage.asr
    public final int c() {
        return this.a.d().b() + this.a.d().a();
    }

    @Override // defpackage.asr
    public final int d() {
        long g;
        if (this.a.d().h() == ahp.a) {
            g = this.a.d().g() & 4294967295L;
        } else {
            g = this.a.d().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.asr
    public final dgo e() {
        if (this.b) {
            return new dgo(-1, 1);
        }
        return new dgo(1, -1);
    }

    @Override // defpackage.asr
    public final Object f(int i, arpe arpeVar) {
        Object k = aov.k(this.a, i, arpeVar);
        if (k == arpl.a) {
            return k;
        }
        return arnb.a;
    }
}
