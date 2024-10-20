package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agag extends arsm {
    final /* synthetic */ agai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agag(agai agaiVar) {
        super(null);
        this.a = agaiVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        agaj agajVar;
        agaj agajVar2 = (agaj) obj2;
        if (this.a.aL.b()) {
            alvg alvgVar = (alvg) agai.aE.g().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 69, "HugoFragment.kt");
            agai agaiVar = this.a;
            int i = arsc.a;
            alvgVar.t("%s configuration changed, updating flow", new arrh(agaiVar.getClass()).c());
            ascd ascdVar = (ascd) this.a.aL.a();
            if (agajVar2 == null) {
                agajVar = this.a.bi();
            } else {
                agajVar = agajVar2;
            }
            ascdVar.f(agajVar);
        } else {
            alvg alvgVar2 = (alvg) agai.aE.g().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 74, "HugoFragment.kt");
            agai agaiVar2 = this.a;
            int i2 = arsc.a;
            alvgVar2.t("%s configuration changed, but flow is not initialized", new arrh(agaiVar2.getClass()).c());
        }
        if (this.a.br() && this.a.gD()) {
            ((alvg) agai.aE.g().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 77, "HugoFragment.kt")).t("%s configuration changed, notifying screen", new arrh(this.a.getClass()).c());
            this.a.gC(agajVar2);
        } else {
            ((alvg) agai.aE.g().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 82, "HugoFragment.kt")).t("%s configuration changed but screen does not support using updated configuration", new arrh(this.a.getClass()).c());
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
