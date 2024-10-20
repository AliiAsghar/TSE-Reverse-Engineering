package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bra extends arrp implements arqr<bsx<brd>, arnb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bra(boolean z, boolean z2, float f, boolean z3) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = z3;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float f;
        float f2;
        bsx bsxVar = (bsx) obj;
        bsxVar.a(brd.c, brg.a);
        if (this.a) {
            boolean z = this.b;
            brd brdVar = brd.a;
            if (z) {
                f2 = -this.c;
            } else {
                f2 = this.c;
            }
            bsxVar.a(brdVar, f2);
        }
        if (this.d) {
            boolean z2 = this.b;
            brd brdVar2 = brd.b;
            if (z2) {
                f = this.c;
            } else {
                f = -this.c;
            }
            bsxVar.a(brdVar2, f);
        }
        return arnb.a;
    }
}
