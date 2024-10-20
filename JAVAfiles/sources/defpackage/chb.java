package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class chb extends arrp implements arqr<cle, arnb> {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ cmb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chb(float f, float f2, cmb cmbVar) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = cmbVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cle cleVar = (cle) obj;
        float em = cleVar.em(this.a);
        float em2 = cleVar.em(this.b);
        ckn cknVar = null;
        if (em > brg.a && em2 > brg.a) {
            cknVar = new ckn(em, em2);
        }
        cleVar.t(cknVar);
        cleVar.A(this.c);
        cleVar.r(true);
        return arnb.a;
    }
}
