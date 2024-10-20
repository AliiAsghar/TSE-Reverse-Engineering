package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aite extends aitg {
    private aitf c;
    private aitf d;
    private aitf e;
    private aitf f;
    private aitf g;
    private aitf h;

    public static final void i(aitx aitxVar) {
        if (aitxVar instanceof aitc) {
            ((aitc) aitxVar).a();
        }
    }

    public final void a(Bundle bundle) {
        aist aistVar = new aist(bundle, 2);
        G(aistVar);
        this.d = aistVar;
    }

    public final void b() {
        aitf aitfVar = this.e;
        if (aitfVar != null) {
            F(aitfVar);
            this.e = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            aitxVar.getClass();
            if (aitxVar instanceof aisy) {
                ((aisy) aitxVar).a();
            }
        }
    }

    public final void c() {
        aitf aitfVar = this.c;
        if (aitfVar != null) {
            F(aitfVar);
            this.c = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            aitxVar.getClass();
            if (aitxVar instanceof aisz) {
                ((aisz) aitxVar).a();
            }
        }
    }

    @Override // defpackage.aitg
    public final void d() {
        super.d();
        aitf aitfVar = this.d;
        if (aitfVar != null) {
            F(aitfVar);
            this.d = null;
        }
        aitf aitfVar2 = this.f;
        if (aitfVar2 != null) {
            F(aitfVar2);
            this.f = null;
        }
        aitf aitfVar3 = this.h;
        if (aitfVar3 != null) {
            F(aitfVar3);
            this.h = null;
        }
    }

    public final void e() {
        if (this.h != null) {
            return;
        }
        aisu aisuVar = new aisu(4);
        G(aisuVar);
        this.h = aisuVar;
    }

    public final void g(Bundle bundle) {
        aist aistVar = new aist(bundle, 3);
        G(aistVar);
        this.f = aistVar;
    }

    public final void h(boolean z) {
        aitf aitfVar = this.g;
        if (aitfVar != null) {
            F(aitfVar);
            this.g = null;
        }
        if (z) {
            for (int i = 0; i < this.a.size(); i++) {
                i((aitx) this.a.get(i));
            }
            return;
        }
        aisu aisuVar = new aisu(3);
        G(aisuVar);
        this.g = aisuVar;
    }

    public final void j() {
        aisu aisuVar = new aisu(2);
        G(aisuVar);
        this.c = aisuVar;
    }

    public final void k(Bundle bundle) {
        aist aistVar = new aist(bundle, 4);
        G(aistVar);
        this.e = aistVar;
    }
}
