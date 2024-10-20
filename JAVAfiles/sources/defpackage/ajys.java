package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajys implements ajyp, emx {
    private final ajyy c;
    private final akkw d;
    private final arml e;
    private final List f;
    private final boolean g;
    private Object h;
    private final aklj i;
    private final agcp j;
    public static final ajki b = new ajki();
    public static final alvi a = alvi.m("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked");

    public ajys(aklj akljVar, agcp agcpVar, ajyy ajyyVar, algw algwVar, akkw akkwVar) {
        akljVar.getClass();
        agcpVar.getClass();
        ajyyVar.getClass();
        akkwVar.getClass();
        this.i = akljVar;
        this.j = agcpVar;
        this.c = ajyyVar;
        this.d = akkwVar;
        int i = arsc.a;
        this.e = new eot(new arrh(ajyv.class), new agef(akljVar, 14), new agef(akljVar, 15), new agef(akljVar, 16));
        this.f = new ArrayList();
        this.g = ((Boolean) algwVar.d(false)).booleanValue();
        akljVar.N().c(this);
    }

    private final ajyv p() {
        return (ajyv) this.e.a();
    }

    private final void q() {
        this.i.a().ag();
    }

    private final boolean r(int i, ajzb ajzbVar, int i2) {
        boolean z;
        boolean z2;
        aiut.c();
        this.c.c();
        int a2 = a();
        if (i2 != p().c) {
            z = true;
        } else {
            z = false;
        }
        if (i != a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            q();
        }
        if (z2 || (z && p().c != 0)) {
            b.t(this.i.a());
        }
        if (z2) {
            int a3 = a();
            p().a = i;
            this.d.b(ajwt.a(a()));
            if (Log.isLoggable("ActivityAccountState", 3)) {
                Log.d("ActivityAccountState", "Account Transition: " + a3 + " > " + a());
            }
        }
        if (p().c == 0) {
            a();
            if (p().c == 0) {
                s();
            } else {
                a();
                s();
            }
        }
        p().b = ajzbVar;
        p().c = i2;
        if (z2 || z) {
            return true;
        }
        return false;
    }

    private final void s() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ajyq) it.next()).a();
        }
    }

    @Override // defpackage.ajyp
    public final int a() {
        aiut.c();
        return p().a;
    }

    @Override // defpackage.ajyp
    public final ajzb b() {
        aiut.c();
        return p().b;
    }

    @Override // defpackage.ajyp
    public final boolean c() {
        aiut.c();
        if (p().a != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        boolean z;
        if (p().e && !this.g && p().d) {
            z = true;
        } else {
            z = false;
        }
        p().d = this.g;
        if (z) {
            ajyv p = p();
            p.a = -1;
            p.b = ajzb.a;
            p.c = 0;
            b.t(this.i.a());
            return;
        }
        int i = p().c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.j.k();
                        return;
                    }
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
                agcp agcpVar = this.j;
                ajwt.a(a());
                agcpVar.j(p().b);
                return;
            }
            this.j.l();
        }
    }

    @Override // defpackage.ajyp
    public final void j() {
        ajzb ajzbVar = ajzb.a;
        ajzbVar.getClass();
        r(-1, ajzbVar, 0);
    }

    @Override // defpackage.ajyp
    public final void k(Object obj) {
        Object obj2 = this.h;
        if (obj2 != null && !d.F(obj2, obj)) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = obj;
    }

    @Override // defpackage.ajyp
    public final void l(ajxt ajxtVar) {
        ajxtVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Error", ajxtVar);
        }
        ajzb ajzbVar = ajzb.a;
        ajzbVar.getClass();
        r(-1, ajzbVar, 3);
        this.j.k();
        this.j.m(ajxtVar);
    }

    @Override // defpackage.ajyp
    public final void m() {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Loading");
        }
        ajzb ajzbVar = ajzb.a;
        ajzbVar.getClass();
        if (r(-1, ajzbVar, 1)) {
            this.j.l();
            this.j.n();
        }
    }

    @Override // defpackage.ajyp
    public final void n(ajwt ajwtVar, ajzb ajzbVar, ajxb ajxbVar) {
        ajwtVar.getClass();
        ajzbVar.getClass();
        ajxbVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Objects.toString(ajwtVar);
            Log.d("ActivityAccountState", "Switch To Account: ".concat(ajwtVar.toString()));
        }
        if (r(ajwtVar.a, ajzbVar, 2)) {
            this.j.j(ajzbVar);
            this.j.o(ajwtVar, ajzbVar);
            q();
            this.j.i(ajzbVar);
        }
    }

    @Override // defpackage.ajyp
    public final void o(ajzb ajzbVar) {
        ajzbVar.getClass();
        q();
        if (c()) {
            this.j.i(ajzbVar);
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
