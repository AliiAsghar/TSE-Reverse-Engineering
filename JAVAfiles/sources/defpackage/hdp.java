package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdp extends arpw implements arqr {
    int a;
    final /* synthetic */ hdr b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ float e;
    final /* synthetic */ hdv f;
    final /* synthetic */ hbb g;
    final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdp(hdr hdrVar, int i, int i2, float f, hdv hdvVar, hbb hbbVar, float f2, arpe arpeVar) {
        super(1, arpeVar);
        this.b = hdrVar;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = hdvVar;
        this.g = hbbVar;
        this.h = f2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new hdp(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (arpe) obj).b(arnb.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        try {
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                this.b.j(this.c);
                this.b.a.h(Integer.valueOf(this.d));
                this.b.b.h(false);
                this.b.d.h(Float.valueOf(this.e));
                hdr hdrVar = this.b;
                hdrVar.c.h(this.f);
                this.b.i(this.g);
                this.b.l(this.h);
                this.b.e.h(false);
                this.b.q(Long.MIN_VALUE);
                if (this.g == null) {
                    this.b.k(false);
                    return arnb.a;
                }
                if (Float.isInfinite(this.e)) {
                    hdr hdrVar2 = this.b;
                    hdrVar2.l(hdrVar2.b());
                    this.b.k(false);
                    this.b.j(this.d);
                    return arnb.a;
                }
                this.b.k(true);
                arpj arpjVar = arpj.a;
                ras rasVar = new ras(arwi.v(u()), this.d, this.c, this.b, (arpe) null, 1);
                this.a = 1;
                if (arro.q(arpjVar, rasVar, this) == arplVar) {
                    return arplVar;
                }
            }
            arwi.y(u());
            this.b.k(false);
            return arnb.a;
        } catch (Throwable th) {
            this.b.k(false);
            throw th;
        }
    }
}
