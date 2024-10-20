package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzj extends arsm {
    final /* synthetic */ afzk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzj(afzk afzkVar) {
        super(null);
        this.a = afzkVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afzi afziVar = (afzi) obj2;
        afzi afziVar2 = (afzi) obj;
        if (afziVar2 != null) {
            afzk afzkVar = this.a;
            afkr afkrVar = afzkVar.d;
            if (afkrVar != null) {
                afzkVar.e.l(afkrVar);
            }
            afzk afzkVar2 = this.a;
            aflj afljVar = afzkVar2.b;
            if (afljVar != null) {
                afzkVar2.e.k(afljVar);
            }
            afzh afzhVar = this.a.c;
            if (afzhVar != null) {
                eek.p(afziVar2.a, afzhVar.a(), null);
            }
            this.a.e.n(null);
        }
        if (afziVar != null) {
            afzk afzkVar3 = this.a;
            afzkVar3.e.n(afziVar.b);
            afzk afzkVar4 = this.a;
            afkr afkrVar2 = afzkVar4.d;
            if (afkrVar2 != null) {
                afzkVar4.e.i(afkrVar2);
            }
            afzk afzkVar5 = this.a;
            aflj afljVar2 = afzkVar5.b;
            if (afljVar2 != null) {
                afzkVar5.e.j(afljVar2);
            }
            final afzh afzhVar2 = this.a.c;
            if (afzhVar2 != null) {
                eek.p(afziVar.a, afzhVar2.a(), new edi() { // from class: afzf
                    @Override // defpackage.edi
                    public final ecv a(View view, ecv ecvVar) {
                        view.getClass();
                        return (ecv) afzh.this.b.a(ecvVar);
                    }
                });
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
