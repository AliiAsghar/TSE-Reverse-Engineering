package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asao extends arpw implements arqv {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ arsb d;
    final /* synthetic */ asaj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asao(arsb arsbVar, asaj asajVar, arpe arpeVar) {
        super(2, arpeVar);
        this.d = arsbVar;
        this.e = asajVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asao) c(new arzn(((arzn) obj).b), (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            obj2 = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            Object obj3 = ((arzn) this.c).b;
            arsb arsbVar = this.d;
            boolean z = obj3 instanceof arzm;
            if (!z) {
                arsbVar.a = obj3;
            }
            asaj asajVar = this.e;
            if (z) {
                Throwable b = arzn.b(obj3);
                if (b == null) {
                    Object obj4 = arsbVar.a;
                    if (obj4 != null) {
                        if (obj4 == asdy.a) {
                            obj4 = null;
                        }
                        this.c = obj3;
                        this.a = arsbVar;
                        this.b = 1;
                        if (asajVar.fv(obj4, this) == arplVar) {
                            return arplVar;
                        }
                    }
                    obj2 = arsbVar;
                } else {
                    throw b;
                }
            }
            return arnb.a;
        }
        ((arsb) obj2).a = asdy.c;
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        asao asaoVar = new asao(this.d, this.e, arpeVar);
        asaoVar.c = obj;
        return asaoVar;
    }
}
