package defpackage;

import android.os.Bundle;
import android.util.Log;
import defpackage.ajyp;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyr implements ajyp, emx {
    private static final alvi e = alvi.m("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked");
    public final boolean a;
    private final ajyy f;
    private final akkw h;
    private final aklj j;
    private final agcp k;
    private final List g = new ArrayList();
    private Object i = null;
    public int b = -1;
    public ajzb c = ajzb.a;
    public int d = 0;

    public ajyr(aklj akljVar, agcp agcpVar, ajyy ajyyVar, algw algwVar, akkw akkwVar) {
        this.j = akljVar;
        this.k = agcpVar;
        this.f = ajyyVar;
        this.a = ((Boolean) algwVar.d(false)).booleanValue();
        this.h = akkwVar;
        akljVar.N().c(this);
        akljVar.aK().c("tiktok_activity_account_state_saved_instance_state", new cp(this, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void p(da daVar) {
        try {
            daVar.ak(null);
            List<cg> l = daVar.l();
            if (l != null && !l.isEmpty()) {
                bd bdVar = new bd(daVar);
                for (cg cgVar : l) {
                    if ((cgVar instanceof apxq) && (((apxq) cgVar).aS() instanceof ajyp.a)) {
                        bdVar.n(cgVar);
                    } else {
                        da G = cgVar.G();
                        G.ag();
                        p(G);
                    }
                }
                if (!bdVar.h()) {
                    bdVar.y();
                    bdVar.b();
                }
            }
        } catch (IllegalStateException e2) {
            StringWriter stringWriter = new StringWriter();
            daVar.G("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((alvg) ((alvg) ((alvg) e.h()).g(e2)).h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked", "clearFragments", 333, "ActivityAccountStateActivityBacked.java")).t("popBackStackImmediate failure, fragment state %s", new aomj(aomi.NO_USER_DATA, stringWriter.toString()));
            throw e2;
        }
    }

    private final void q() {
        this.j.a().ag();
    }

    private final boolean r(int i, ajzb ajzbVar, int i2) {
        boolean z;
        boolean z2;
        ajzbVar.getClass();
        aiut.c();
        this.f.c();
        int i3 = this.b;
        if (i2 != this.d) {
            z = true;
        } else {
            z = false;
        }
        if (i != i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            q();
        }
        if (z2 || (z && this.d != 0)) {
            p(this.j.a());
        }
        if (z2) {
            int i4 = this.b;
            this.b = i;
            this.h.b(ajwt.a(i));
            if (Log.isLoggable("ActivityAccountState", 3)) {
                Log.d("ActivityAccountState", "Account Transition: " + i4 + " > " + this.b);
            }
        }
        if (this.d == 0) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((ajyq) it.next()).a();
            }
        }
        this.c = ajzbVar;
        this.d = i2;
        if (z2 || z) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ajyp
    public final int a() {
        aiut.c();
        return this.b;
    }

    @Override // defpackage.ajyp
    public final ajzb b() {
        aiut.c();
        return this.c;
    }

    @Override // defpackage.ajyp
    public final boolean c() {
        aiut.c();
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        Bundle bundle;
        if (this.j.aK().e()) {
            bundle = this.j.aK().b("tiktok_activity_account_state_saved_instance_state");
        } else {
            bundle = null;
        }
        if (bundle != null) {
            if (!this.a && bundle.getBoolean("tiktok_accounts_disabled")) {
                p(this.j.a());
                return;
            }
            this.b = bundle.getInt("state_account_id", -1);
            try {
                this.c = (ajzb) aowt.d(bundle, "state_account_info", ajzb.a, aozs.a());
                int i = bundle.getInt("state_account_state", 0);
                this.d = i;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                this.k.k();
                                return;
                            }
                            throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                        }
                        agcp agcpVar = this.k;
                        ajwt.a(this.b);
                        agcpVar.j(this.c);
                        return;
                    }
                    this.k.l();
                }
            } catch (apba e2) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e2);
            }
        }
    }

    @Override // defpackage.ajyp
    public final void j() {
        r(-1, ajzb.a, 0);
    }

    @Override // defpackage.ajyp
    public final void k(Object obj) {
        Object obj2 = this.i;
        boolean z = true;
        if (obj2 != null && obj2 != obj) {
            z = false;
        }
        albo.T(z);
        this.i = obj;
    }

    @Override // defpackage.ajyp
    public final void l(ajxt ajxtVar) {
        ajxtVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Error", ajxtVar);
        }
        r(-1, ajzb.a, 3);
        this.k.k();
        this.k.m(ajxtVar);
    }

    @Override // defpackage.ajyp
    public final void m() {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Loading");
        }
        if (r(-1, ajzb.a, 1)) {
            this.k.l();
            this.k.n();
        }
    }

    @Override // defpackage.ajyp
    public final void n(ajwt ajwtVar, ajzb ajzbVar, ajxb ajxbVar) {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Account: ".concat(String.valueOf(String.valueOf(ajwtVar))));
        }
        if (r(ajwtVar.a, ajzbVar, 2)) {
            this.k.j(ajzbVar);
            this.k.o(ajwtVar, ajzbVar);
            q();
            this.k.i(ajzbVar);
        }
    }

    @Override // defpackage.ajyp
    public final void o(ajzb ajzbVar) {
        q();
        if (c()) {
            this.k.i(ajzbVar);
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
