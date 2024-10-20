package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vv extends arrp implements arqv<wv, wv, Boolean> {
    final /* synthetic */ xn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(xn xnVar) {
        super(2);
        this.a = xnVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        wv wvVar = (wv) obj2;
        boolean z = false;
        if (((wv) obj) == wv.c && wvVar == wv.c && !this.a.b().e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
