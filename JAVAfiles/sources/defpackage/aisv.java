package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aisv extends aitg {
    private aitf c;
    private aitf d;
    private aitf e;
    private aitf f;

    public final void a() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof airw) {
                ((airw) aitxVar).a();
            }
        }
    }

    public final void b() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof airx) {
                ((airx) aitxVar).a();
            }
        }
    }

    public final void c() {
        aisu aisuVar = new aisu(0);
        G(aisuVar);
        this.f = aisuVar;
    }

    @Override // defpackage.aitg
    public final void d() {
        aitf aitfVar = this.d;
        if (aitfVar != null) {
            F(aitfVar);
            this.d = null;
        }
        aitf aitfVar2 = this.c;
        if (aitfVar2 != null) {
            F(aitfVar2);
            this.c = null;
        }
        super.d();
    }

    public final void e() {
        aitf aitfVar = this.f;
        if (aitfVar != null) {
            F(aitfVar);
            this.f = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            aitxVar.getClass();
            if (aitxVar instanceof aisd) {
                ((aisd) aitxVar).a();
            }
        }
    }

    @Override // defpackage.aitg
    public final void f() {
        aitf aitfVar = this.e;
        if (aitfVar != null) {
            F(aitfVar);
            this.e = null;
        }
        super.f();
    }

    public final void g(Bundle bundle) {
        aist aistVar = new aist(bundle, 1);
        G(aistVar);
        this.c = aistVar;
    }

    public final void h() {
        aisu aisuVar = new aisu(1);
        G(aisuVar);
        this.e = aisuVar;
    }

    public final void i(Bundle bundle) {
        aist aistVar = new aist(bundle, 0);
        G(aistVar);
        this.d = aistVar;
    }

    public final void j() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aisp) {
                ((aisp) aitxVar).a();
            }
        }
    }

    public final void k() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aisq) {
                ((aisq) aitxVar).a();
            }
        }
    }

    public final boolean l() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if ((aitxVar instanceof aisc) && ((aisc) aitxVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if ((aitxVar instanceof airv) && ((airv) aitxVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final void n() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aisa) {
                ((aisa) aitxVar).a();
            }
        }
    }

    public final void o() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aiue) {
                ((aiue) aitxVar).a();
            }
        }
    }

    public final void p(Consumer consumer) {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aise) {
                ((aise) aitxVar).a();
                return;
            }
        }
        consumer.accept(Collections.emptyList());
    }

    public final boolean q() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if ((aitxVar instanceof aisf) && ((aisf) aitxVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if ((aitxVar instanceof aisg) && ((aisg) aitxVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aish) {
                ((aish) aitxVar).a();
            }
        }
    }

    public final void t() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aisi) {
                ((aisi) aitxVar).a();
                return;
            }
        }
    }

    public final void u() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aisl) {
                ((aisl) aitxVar).a();
            }
        }
    }

    public final void v() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aism) {
                ((aism) aitxVar).a();
            }
        }
    }

    public final void w() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aisr) {
                ((aisr) aitxVar).a();
            }
        }
    }

    public final void x() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aiss) {
                ((aiss) aitxVar).a();
            }
        }
    }
}
