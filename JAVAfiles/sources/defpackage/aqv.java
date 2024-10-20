package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqv implements asr {
    final /* synthetic */ aqr a;

    public aqv(aqr aqrVar) {
        this.a = aqrVar;
    }

    @Override // defpackage.asr
    public final float a() {
        aqr aqrVar = this.a;
        return ass.a(aqrVar.b(), aqrVar.c(), aqrVar.h());
    }

    @Override // defpackage.asr
    public final float b() {
        aqr aqrVar = this.a;
        return ass.b(aqrVar.b(), aqrVar.c());
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
        return new dgo(-1, -1);
    }

    @Override // defpackage.asr
    public final Object f(int i, arpe arpeVar) {
        Object e;
        ceh cehVar = aqr.a;
        aqr aqrVar = this.a;
        e = aqrVar.e(afd.a, new aqs(aqrVar, i, null), arpeVar);
        arpl arplVar = arpl.a;
        if (e != arplVar) {
            e = arnb.a;
        }
        if (e == arplVar) {
            return e;
        }
        return arnb.a;
    }
}
