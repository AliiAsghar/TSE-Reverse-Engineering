package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdm extends arsm {
    final /* synthetic */ agdo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdm(agdo agdoVar) {
        super(null);
        this.a = agdoVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        agen agenVar;
        afzg afzgVar;
        agem agemVar = (agem) obj2;
        agem agemVar2 = (agem) obj;
        ((alvg) agdo.b.g().h("com/google/android/libraries/compose/ui/rendering/RenderingManager$special$$inlined$distinctObservable$1", "afterChange", 78, "RenderingManager.kt")).D("Screen switched from %s to %s", agemVar2, agemVar);
        agdo agdoVar = this.a;
        if (agemVar2 != null) {
            agdoVar.f.g(agemVar2);
            if (agdoVar.b() != agdp.d) {
                agdoVar.i(agemVar2);
            }
        }
        if (agemVar != null) {
            Object obj3 = agdoVar.g.get(agemVar.aM());
            afzg afzgVar2 = null;
            if (obj3 instanceof agen) {
                agenVar = (agen) obj3;
            } else {
                agenVar = null;
            }
            agemVar.bp(agenVar);
            afzg afzgVar3 = new afzg(agdoVar, 17);
            if (true != agemVar.br()) {
                afzgVar = afzgVar3;
            } else {
                afzgVar = null;
            }
            if (afzgVar == null) {
                afzgVar3.a();
            } else {
                afzgVar2 = afzgVar;
            }
            agemVar.aM = afzgVar2;
            agdoVar.f(agemVar);
            aged agedVar = agdoVar.f;
            agedVar.e = agemVar;
            agee c = agedVar.c();
            if (c != null) {
                c.a(agemVar, agedVar.c);
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
