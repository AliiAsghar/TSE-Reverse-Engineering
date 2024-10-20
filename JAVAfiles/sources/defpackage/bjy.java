package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjy extends arrp implements arqr<bsx<bps>, arnb> {
    final /* synthetic */ bpq a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjy(bpq bpqVar, float f, float f2, float f3) {
        super(1);
        this.a = bpqVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bsx bsxVar = (bsx) obj;
        if (!this.a.a) {
            bsxVar.a(bps.c, this.b - this.c);
        }
        float f = this.d;
        if (f != this.c) {
            bsxVar.a(bps.b, Math.max(this.b - f, brg.a));
        }
        if (!this.a.b) {
            bsxVar.a(bps.a, this.b);
        }
        return arnb.a;
    }
}
