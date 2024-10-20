package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhf extends akha implements emx {
    private final akha a;
    private final Executor b;
    private final Map c;
    private final ahiy d;

    public akhf(akha akhaVar, akmy akmyVar, ahiy ahiyVar, Executor executor, enm enmVar) {
        this.a = akhaVar;
        this.d = ahiyVar;
        this.b = executor;
        this.c = (Map) akmyVar.a(R.id.result_propagator_map, enmVar, new akhd(0), new akhe(0));
        enmVar.N().c(this);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [akgr, java.lang.Object] */
    @Override // defpackage.akha
    public final akec b(int i, akgs akgsVar, algw algwVar) {
        aiut.c();
        Map map = this.c;
        akec b = this.a.b(i, akgsVar, algwVar);
        Integer valueOf = Integer.valueOf(i);
        akhq akhqVar = (akhq) map.get(valueOf);
        if (akhqVar == null) {
            akhq akhqVar2 = new akhq(this.d, this.b);
            this.c.put(valueOf, akhqVar2);
            ?? r4 = ((alha) algwVar).a;
            aiut.c();
            albo.T(!akhqVar2.d);
            akhp akhpVar = akhqVar2.b;
            if (akhpVar != null) {
                akhpVar.close();
                ahiy ahiyVar = akhqVar2.e;
                akhp akhpVar2 = akhqVar2.b;
                ahiyVar.t(akhpVar2.a, akhpVar2);
            }
            akhqVar2.b = new akhp(akhqVar2, r4, akhqVar2.a);
            ahiy ahiyVar2 = akhqVar2.e;
            akhp akhpVar3 = akhqVar2.b;
            ahiyVar2.s(akhpVar3.a, akhpVar3);
            akhqVar = akhqVar2;
        }
        aiut.c();
        albo.T(!akhqVar.d);
        akhqVar.f = b;
        akhp akhpVar4 = akhqVar.b;
        if (akhpVar4 != null) {
            akhpVar4.b();
        }
        return new akec(null, null);
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        aiut.c();
        for (akhq akhqVar : this.c.values()) {
            aiut.c();
            albo.T(!akhqVar.d);
            akhqVar.f = null;
        }
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        aiut.c();
        for (akhq akhqVar : this.c.values()) {
            aiut.c();
            akhqVar.c = true;
            akhp akhpVar = akhqVar.b;
            if (akhpVar != null) {
                akhpVar.b();
            }
        }
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        aiut.c();
        for (akhq akhqVar : this.c.values()) {
            aiut.c();
            akhqVar.c = false;
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }
}
