package defpackage;

import defpackage.abt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xb extends arrp implements arqr<abt.b<wv>, aap<Float>> {
    final /* synthetic */ xl a;
    final /* synthetic */ xn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(xl xlVar, xn xnVar) {
        super(1);
        this.a = xlVar;
        this.b = xnVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        abt.b bVar = (abt.b) obj;
        if (bVar.c(wv.a, wv.b)) {
            xw xwVar = this.a.b().d;
            if (xwVar != null) {
                return xwVar.c;
            }
            return wx.a;
        }
        if (bVar.c(wv.b, wv.c)) {
            xw xwVar2 = this.b.b().d;
            if (xwVar2 != null) {
                return xwVar2.c;
            }
            return wx.a;
        }
        return wx.a;
    }
}
