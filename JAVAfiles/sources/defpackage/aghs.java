package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aghs extends arpw implements arqv {
    int a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghs(arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((aghs) c((aghp) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((aghs) c((aghp) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.c != 0) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                aghp aghpVar = (aghp) this.b;
                this.a = 1;
                if (aghpVar.f(this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }
        arpl arplVar2 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            aghp aghpVar2 = (aghp) this.b;
            this.a = 1;
            if (aghpVar2.g(this) == arplVar2) {
                return arplVar2;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.c != 0) {
            aghs aghsVar = new aghs(arpeVar, 1, null);
            aghsVar.b = obj;
            return aghsVar;
        }
        aghs aghsVar2 = new aghs(arpeVar, 0);
        aghsVar2.b = obj;
        return aghsVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghs(arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
    }
}
