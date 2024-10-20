package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xc extends arrp implements arqr<wv, Float> {
    final /* synthetic */ xl a;
    final /* synthetic */ xn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(xl xlVar, xn xnVar) {
        super(1);
        this.a = xlVar;
        this.b = xnVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        wv wvVar = wv.a;
        int ordinal = ((wv) obj).ordinal();
        float f = 1.0f;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    xw xwVar = this.b.b().d;
                    if (xwVar != null) {
                        f = xwVar.a;
                    }
                } else {
                    throw new armm();
                }
            }
        } else {
            xw xwVar2 = this.a.b().d;
            if (xwVar2 != null) {
                f = xwVar2.a;
            }
        }
        return Float.valueOf(f);
    }
}
