package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdq extends arpw implements arqr {
    final /* synthetic */ hdr a;
    final /* synthetic */ hbb b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdq(hdr hdrVar, hbb hbbVar, float f, boolean z, arpe arpeVar) {
        super(1, arpeVar);
        this.a = hdrVar;
        this.b = hbbVar;
        this.c = f;
        this.d = z;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new hdq(this.a, this.b, this.c, this.d, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        this.a.i(this.b);
        this.a.l(this.c);
        this.a.j(1);
        this.a.k(false);
        if (this.d) {
            this.a.q(Long.MIN_VALUE);
        }
        return arnb.a;
    }
}
