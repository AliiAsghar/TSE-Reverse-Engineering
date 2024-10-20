package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejb extends arpw implements arqw {
    int a;
    private /* synthetic */ Object b;

    public ejb(arpe arpeVar) {
        super(3, arpeVar);
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        ejb ejbVar = new ejb((arpe) obj3);
        ejbVar.b = (eil) obj;
        return ejbVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            Object obj2 = this.b;
            this.a = 1;
            eil eilVar = (eil) obj2;
            eilVar.b();
            obj = dyh.b(eilVar.a, new eik(eilVar, (arpe) null, 0), this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }
}
