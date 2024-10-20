package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aitg {
    private static final Bundle c = new Bundle();
    public final List a = new ArrayList();
    protected final List b = new ArrayList();
    private aitf d;
    private aitf e;
    private aitf f;
    private aitf g;
    private aitf h;

    public aitg() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public static final String H(aitx aitxVar) {
        if (aitxVar instanceof aitu) {
            if (aitxVar instanceof aity) {
                return ((aity) aitxVar).a();
            }
            return aitxVar.getClass().getName();
        }
        return null;
    }

    public static final Bundle I(aitx aitxVar, Bundle bundle) {
        if (bundle != null) {
            String H = H(aitxVar);
            if (H != null) {
                return bundle.getBundle(H);
            }
            return c;
        }
        return null;
    }

    public static final void J(aitx aitxVar) {
        if (aitxVar instanceof aiso) {
            ((aiso) aitxVar).a();
        }
    }

    public final void A() {
        aisu aisuVar = new aisu(7);
        G(aisuVar);
        this.f = aisuVar;
    }

    public final void B(Bundle bundle) {
        aist aistVar = new aist(bundle, 6);
        G(aistVar);
        this.g = aistVar;
    }

    public final void C() {
        aisu aisuVar = new aisu(6);
        G(aisuVar);
        this.e = aisuVar;
    }

    public final void D() {
        aitf aitfVar = this.e;
        if (aitfVar != null) {
            F(aitfVar);
            this.e = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            aitxVar.getClass();
            if (aitxVar instanceof aitw) {
                ((aitw) aitxVar).a();
            }
        }
    }

    public final void E(boolean z) {
        if (z) {
            aisu aisuVar = new aisu(5);
            G(aisuVar);
            this.h = aisuVar;
            return;
        }
        aitf aitfVar = this.h;
        if (aitfVar != null) {
            F(aitfVar);
            this.h = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            J((aitx) this.a.get(i));
        }
    }

    public final void F(aitf aitfVar) {
        this.b.remove(aitfVar);
    }

    public final void G(aitf aitfVar) {
        aiut.c();
        for (int i = 0; i < this.a.size(); i++) {
            aitfVar.a((aitx) this.a.get(i));
        }
        this.b.add(aitfVar);
    }

    public final void K() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aith) {
                ((aith) aitxVar).a();
            }
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aiti) {
                ((aiti) aitxVar).a();
            }
        }
    }

    public final boolean M() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if ((aitxVar instanceof aitj) && ((aitj) aitxVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final void N() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aitl) {
                ((aitl) aitxVar).a();
            }
        }
    }

    public final boolean O() {
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aitm) {
                z |= ((aitm) aitxVar).a();
            }
        }
        return z;
    }

    public final boolean P() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if ((aitxVar instanceof aitp) && ((aitp) aitxVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Q() {
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aitr) {
                z |= ((aitr) aitxVar).a();
            }
        }
        return z;
    }

    public final void R() {
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            if (aitxVar instanceof aits) {
                ((aits) aitxVar).a();
            }
        }
    }

    public void d() {
        aitf aitfVar = this.g;
        if (aitfVar != null) {
            F(aitfVar);
            this.g = null;
        }
        aitf aitfVar2 = this.d;
        if (aitfVar2 != null) {
            F(aitfVar2);
            this.d = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            aitxVar.getClass();
            if (aitxVar instanceof aitn) {
                ((aitn) aitxVar).a();
            }
        }
    }

    public void f() {
        aitf aitfVar = this.f;
        if (aitfVar != null) {
            F(aitfVar);
            this.f = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aitx aitxVar = (aitx) this.a.get(i);
            aitxVar.getClass();
            if (aitxVar instanceof aitq) {
                ((aitq) aitxVar).a();
            }
        }
    }

    public final void y(Bundle bundle) {
        aist aistVar = new aist(bundle, 5);
        G(aistVar);
        this.d = aistVar;
    }

    public final void z() {
        for (aitx aitxVar : this.a) {
            if (aitxVar instanceof aito) {
                ((aito) aitxVar).a();
            }
        }
    }
}
