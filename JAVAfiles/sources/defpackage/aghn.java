package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghn extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ aghp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghn(aghp aghpVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = aghpVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aghn aghnVar = new aghn(this.c, (arpe) obj3);
        aghnVar.b = (Exception) obj2;
        return aghnVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            Object obj2 = this.b;
            aghp aghpVar = this.c;
            this.a = 1;
            if (aghpVar.e((Exception) obj2, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }
}
