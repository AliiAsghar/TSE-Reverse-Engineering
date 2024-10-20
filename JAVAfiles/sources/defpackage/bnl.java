package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnl extends arrp implements arqr<bsx<bps>, arnb> {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ bpq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnl(float f, long j, bpq bpqVar) {
        super(1);
        this.a = f;
        this.b = j;
        this.c = bpqVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bsx bsxVar = (bsx) obj;
        bsxVar.a(bps.a, this.a);
        float f = this.a / 2.0f;
        if (dri.a(this.b) > f && !this.c.a) {
            bsxVar.a(bps.c, f);
        }
        if (dri.a(this.b) != 0) {
            bsxVar.a(bps.b, Math.max(brg.a, this.a - dri.a(r0)));
        }
        return arnb.a;
    }
}
