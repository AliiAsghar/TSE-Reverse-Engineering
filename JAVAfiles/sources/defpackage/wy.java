package defpackage;

import defpackage.abt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wy extends arrp implements arqr<abt.b<wv>, aap<Float>> {
    final /* synthetic */ xl a;
    final /* synthetic */ xn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xl xlVar, xn xnVar) {
        super(1);
        this.a = xlVar;
        this.b = xnVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aap aapVar;
        aap aapVar2;
        abt.b bVar = (abt.b) obj;
        if (bVar.c(wv.a, wv.b)) {
            xp xpVar = this.a.b().a;
            if (xpVar == null || (aapVar2 = xpVar.b) == null) {
                return wx.a;
            }
            return aapVar2;
        }
        if (bVar.c(wv.b, wv.c)) {
            xp xpVar2 = this.b.b().a;
            if (xpVar2 == null || (aapVar = xpVar2.b) == null) {
                return wx.a;
            }
            return aapVar;
        }
        return wx.a;
    }
}
