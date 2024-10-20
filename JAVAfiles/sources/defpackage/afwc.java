package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwc extends arsm {
    final /* synthetic */ afwf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwc(afwf afwfVar) {
        super(null);
        this.a = afwfVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        agem agemVar = (agem) obj2;
        agem agemVar2 = (agem) obj;
        if (agemVar2 != null) {
            agemVar2.aX();
            afwf afwfVar = this.a;
            agdq agdqVar = afwfVar.f;
            if (agdqVar == null) {
                arro.b("renderingStrategy");
                agdqVar = null;
            }
            da G = afwfVar.d.G();
            G.getClass();
            afzv.r(agdqVar, G, true, new afmo(agemVar2, 9));
        }
        if (agemVar != null) {
            this.a.e(agemVar);
        }
        this.a.e.a(agemVar);
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
