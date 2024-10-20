package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhu extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ zj b;
    final /* synthetic */ boolean c;
    final /* synthetic */ zr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhu(zj zjVar, boolean z, zr zrVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = zjVar;
        this.c = z;
        this.d = zrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bhu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        float f;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            zj zjVar = this.b;
            if (true != this.c) {
                f = 0.8f;
            } else {
                f = 1.0f;
            }
            Float f2 = new Float(f);
            zr zrVar = this.d;
            this.a = 1;
            if (zj.j(zjVar, f2, zrVar, this, 12) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bhu(this.b, this.c, this.d, arpeVar);
    }
}
