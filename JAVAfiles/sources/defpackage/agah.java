package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agah extends arsm {
    final /* synthetic */ agai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agah(Object obj, agai agaiVar) {
        super(obj);
        this.a = agaiVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((Boolean) obj).booleanValue();
        agai agaiVar = this.a;
        agaiVar.bq(agaiVar.bl().a());
        alvg alvgVar = (alvg) agai.aE.g().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$2", "afterChange", 137, "HugoFragment.kt");
        int i = arsc.a;
        alvgVar.C("%s loaded in %dms", new arrh(this.a.getClass()).c(), this.a.bm().toMillis());
        arqg arqgVar = this.a.aM;
        if (arqgVar != null) {
            arqgVar.a();
        }
        agai agaiVar2 = this.a;
        View view = agaiVar2.Q;
        if (view != null) {
            view.post(new aefw(agaiVar2, 7));
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
