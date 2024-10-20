package defpackage;

import defpackage.yx;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yy extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ yx.a b;
    final /* synthetic */ long c;
    final /* synthetic */ yx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(yx.a aVar, long j, yx yxVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = aVar;
        this.c = j;
        this.d = yxVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yy) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            yx.a aVar = this.b;
            dri driVar = new dri(this.c);
            zr zrVar = this.d.a;
            this.a = 1;
            obj = zj.j(aVar.a, driVar, zrVar, this, 12);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        zo zoVar = ((zp) obj).a;
        zo zoVar2 = zo.a;
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new yy(this.b, this.c, this.d, arpeVar);
    }
}
