package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arzp extends arpw implements arqv {
    int a;
    final /* synthetic */ arzx b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arzp(arzx arzxVar, Object obj, arpe arpeVar) {
        super(2, arpeVar);
        this.b = arzxVar;
        this.c = obj;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((arzp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object O;
        Object arzlVar;
        arpl arplVar = arpl.a;
        try {
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                arzx arzxVar = this.b;
                Object obj2 = this.c;
                this.a = 1;
                if (arzxVar.a(obj2, this) == arplVar) {
                    return arplVar;
                }
            }
            O = arnb.a;
        } catch (Throwable th) {
            O = aqil.O(th);
        }
        if (armq.d(O)) {
            arzlVar = arnb.a;
        } else {
            arzlVar = new arzl(armq.c(O));
        }
        return new arzn(arzlVar);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        arzp arzpVar = new arzp(this.b, this.c, arpeVar);
        arzpVar.d = obj;
        return arzpVar;
    }
}
