package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdn extends arsm {
    final /* synthetic */ agdo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdn(Object obj, agdo agdoVar) {
        super(obj);
        this.a = agdoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, agea] */
    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        int a;
        agdp agdpVar = (agdp) obj2;
        agdp agdpVar2 = (agdp) obj;
        ((alvg) agdo.b.g().h("com/google/android/libraries/compose/ui/rendering/RenderingManager$special$$inlined$distinctObservable$2", "afterChange", 84, "RenderingManager.kt")).D("State switched from %s to %s", agdpVar2, agdpVar);
        agem d = this.a.d();
        if (d != null) {
            d.gy(agdpVar);
        }
        this.a.e.a(agdpVar);
        agdo agdoVar = this.a;
        agdpVar2.getClass();
        agdpVar.getClass();
        int ordinal = agdpVar.ordinal();
        aged agedVar = agdoVar.f;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        agem agemVar = agedVar.e;
                        if (agemVar != null) {
                            agemVar.gz();
                        }
                        agedVar.e();
                        return;
                    }
                    throw new armm();
                }
                agedVar.k(0, -1);
                return;
            }
            aged.m(agedVar, 0, 3);
            agdu agduVar = agedVar.d;
            if (agduVar != null) {
                agduVar.h = false;
                return;
            }
            return;
        }
        if (agdpVar2 == agdp.b) {
            a = agedVar.c.a();
        } else {
            a = agedVar.a();
        }
        agedVar.j(a);
        agedVar.k(0, agedVar.b());
        agdu agduVar2 = agedVar.d;
        if (agduVar2 != 0) {
            agduVar2.h = true;
            ?? a2 = agduVar2.d.a();
            if (a2 != 0) {
                agduVar2.h(a2);
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
