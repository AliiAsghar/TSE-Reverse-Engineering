package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghq extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ aghy e;
    final /* synthetic */ arqv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghq(aghy aghyVar, arqv arqvVar, arpe arpeVar) {
        super(2, arpeVar);
        this.e = aghyVar;
        this.f = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aghq) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arqv arqvVar;
        Object obj2;
        Object obj3;
        Object obj4;
        arpl arplVar = arpl.a;
        int i = this.d;
        try {
            if (i != 0) {
                if (i != 1) {
                    obj4 = this.a;
                    try {
                        aqil.P(obj);
                        ((asgm) obj4).d();
                        return arnb.a;
                    } catch (Throwable th) {
                        th = th;
                        ((asgm) obj4).d();
                        throw th;
                    }
                }
                Object obj5 = this.c;
                Object obj6 = this.b;
                Object obj7 = this.a;
                aqil.P(obj);
                obj3 = obj5;
                arqvVar = obj6;
                obj2 = obj7;
            } else {
                aqil.P(obj);
                aghy aghyVar = this.e;
                arqv arqvVar2 = this.f;
                asgm asgmVar = aghyVar.d;
                this.a = asgmVar;
                this.b = arqvVar2;
                this.c = aghyVar;
                this.d = 1;
                if (asgmVar.b(this) != arplVar) {
                    arqvVar = arqvVar2;
                    obj3 = aghyVar;
                    obj2 = asgmVar;
                }
                return arplVar;
            }
            aghp aghpVar = ((aghy) obj3).b;
            this.a = obj2;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (arqvVar.a(aghpVar, this) != arplVar) {
                obj4 = obj2;
                ((asgm) obj4).d();
                return arnb.a;
            }
            return arplVar;
        } catch (Throwable th2) {
            th = th2;
            obj4 = obj2;
            ((asgm) obj4).d();
            throw th;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aghq(this.e, this.f, arpeVar);
    }
}
