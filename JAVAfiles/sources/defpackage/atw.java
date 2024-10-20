package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atw implements asr {
    final /* synthetic */ avc a;
    final /* synthetic */ boolean b;

    public atw(avc avcVar, boolean z) {
        this.a = avcVar;
        this.b = z;
    }

    @Override // defpackage.asr
    public final float a() {
        avc avcVar = this.a;
        return (float) avf.a(avcVar.p(), avcVar.b());
    }

    @Override // defpackage.asr
    public final float b() {
        return (float) auz.a(this.a);
    }

    @Override // defpackage.asr
    public final int c() {
        return this.a.p().b() + this.a.p().a();
    }

    @Override // defpackage.asr
    public final int d() {
        long e;
        if (this.a.p().f() == ahp.a) {
            e = this.a.p().e() & 4294967295L;
        } else {
            e = this.a.p().e() >> 32;
        }
        return (int) e;
    }

    @Override // defpackage.asr
    public final dgo e() {
        if (this.b) {
            return new dgo(this.a.b(), 1);
        }
        return new dgo(1, this.a.b());
    }

    @Override // defpackage.asr
    public final Object f(int i, arpe arpeVar) {
        Object z = avc.z(this.a, i, arpeVar);
        if (z == arpl.a) {
            return z;
        }
        return arnb.a;
    }
}
