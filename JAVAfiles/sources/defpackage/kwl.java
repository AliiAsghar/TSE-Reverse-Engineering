package defpackage;

import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwl implements emx {
    public static final uuf a = uuh.n(uuh.b, "enable_fab_v2", false);
    public final aksr b;
    public final armf c;
    public final armf d;
    public final apwt e;
    public final armf f;
    public View g;
    public ExtendedFloatingActionButton h;
    public int i;
    public boolean j;
    public final xvv k;
    private final armf l;
    private final oho m;

    public kwl(armf armfVar, aksr aksrVar, oho ohoVar, armf armfVar2, armf armfVar3, armf armfVar4, apwt apwtVar, armf armfVar5) {
        armfVar.getClass();
        aksrVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        apwtVar.getClass();
        armfVar5.getClass();
        this.l = armfVar;
        this.b = aksrVar;
        this.m = ohoVar;
        this.c = armfVar2;
        this.d = armfVar4;
        this.e = apwtVar;
        this.f = armfVar5;
        this.k = new xvv("migrate_start_chat_fab_to_compose", new jwl((Object) ohoVar, 14, (char[][][]) null));
    }

    private final void c() {
        ((Optional) this.e.b()).ifPresent(new ktm(jyp.l, 13));
    }

    public final View a() {
        if (this.k.b()) {
            return null;
        }
        return this.h;
    }

    public final void b() {
        akrh e = aktp.e("StartChatFabPresenter#updateFabVisibility");
        try {
            if (((yjr) this.l.b()).y()) {
                ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.q(0);
                }
                if (((Optional) this.e.b()).isPresent() && ((lqm) ((Optional) this.e.b()).get()).d()) {
                    ((Optional) this.e.b()).ifPresent(new ktm(jyp.m, 15));
                    armd.i(e, null);
                }
            } else {
                ExtendedFloatingActionButton extendedFloatingActionButton2 = this.h;
                if (extendedFloatingActionButton2 != null) {
                    extendedFloatingActionButton2.m();
                }
            }
            c();
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.emx
    public final void f(enm enmVar) {
        if (this.k.b()) {
            return;
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.m();
        }
        c();
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        b();
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
