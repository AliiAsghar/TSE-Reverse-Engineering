package defpackage;

import android.text.TextUtils;
import defpackage.aglz;
import defpackage.agmh;
import defpackage.agmq;
import defpackage.agoz;
import defpackage.agpc;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agpc<C extends agmq<C, Q, B, D, R>, Q extends agoz<C, Q, B, D, R>, B extends agpc<C, Q, B, D, R>, D extends aglz<C, Q, B, D, R>, R extends agmh<R>> {
    public final agpe a;

    /* JADX INFO: Access modifiers changed from: protected */
    public agpc(String str, String[] strArr, String str2, String str3, String str4, String str5) {
        agpl agplVar;
        agpe a = agpf.a();
        this.a = a;
        a.u = str5;
        a.a = str;
        a.e(false);
        a.d(Arrays.asList(strArr));
        a.j = str2;
        if (str3 == null) {
            agplVar = null;
        } else {
            agplVar = new agpl(str3);
        }
        a.i = agplVar;
        a.f = str4;
        a.f(false);
        a.g(false);
    }

    private final void a(agoh agohVar, int i) {
        boolean z;
        agoz agozVar = agohVar.a;
        if (!agozVar.b()) {
            alog alogVar = agozVar.e.n;
            if (alogVar != null && !alogVar.isEmpty()) {
                throw new IllegalArgumentException("cannot specify union on joined table");
            }
            if (TextUtils.isEmpty(agozVar.j)) {
                if (TextUtils.isEmpty(agozVar.e.l)) {
                    agpf agpfVar = agozVar.e;
                    if (!agpfVar.b) {
                        if (agpfVar.i == null) {
                            agmh agmhVar = agohVar.b;
                            boolean z2 = false;
                            if (agmhVar != null) {
                                z = false;
                            } else {
                                z = true;
                            }
                            agmh agmhVar2 = agohVar.c;
                            if (agmhVar2 == null) {
                                z2 = true;
                            }
                            if (z == z2) {
                                this.a.c().h(new agoa(agohVar.a, agmhVar, agmhVar2, agohVar.d, agohVar.e, i, agohVar.g, agohVar.f));
                                return;
                            }
                            throw new IllegalArgumentException("joinColumn and parentJoinColumn must both be null or both be not null");
                        }
                        throw new IllegalArgumentException("cannot specify order by on joined table");
                    }
                    throw new IllegalArgumentException("cannot specify distinct on joined table");
                }
                throw new IllegalArgumentException("cannot specify offset on joined table");
            }
            throw new IllegalArgumentException("cannot specify limit on joined table");
        }
        throw new IllegalArgumentException("cannot join on @Query");
    }

    public final void A(agoh agohVar) {
        a(agohVar, 4);
    }

    public final void B(agoh agohVar) {
        a(agohVar, 1);
    }

    public final void C(agog agogVar) {
        a(agogVar.a(), 2);
    }

    public final void D(agoh agohVar) {
        a(agohVar, 2);
    }

    public abstract agoz b();

    public final agpc j(agog agogVar) {
        A(agogVar.a());
        return this;
    }

    public final void k(agpw agpwVar) {
        agpe agpeVar = this.a;
        if (agpeVar.g == null) {
            if (agpeVar.h == null) {
                agpeVar.g = new alob();
            } else {
                agpeVar.g = new alob();
                agpeVar.g.j(agpeVar.h);
                agpeVar.h = null;
            }
        }
        agpeVar.g.h(agpwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        agpf b = this.a.b();
        if (TextUtils.isEmpty(b.k) && !TextUtils.isEmpty(b.l)) {
            throw new IllegalStateException("offset requires limit");
        }
    }

    public final void m(agmh... agmhVarArr) {
        alog n;
        alog e = agnc.e(agmhVarArr);
        if (e == null) {
            n = null;
        } else {
            n = alog.n(e);
        }
        this.a.b = n;
    }

    public final void n(agpj agpjVar, String str) {
        agpe agpeVar = this.a;
        if (agpeVar.d == null) {
            if (agpeVar.e == null) {
                agpeVar.d = new alob();
            } else {
                agpeVar.d = new alob();
                agpeVar.d.j(agpeVar.e);
                agpeVar.e = null;
            }
        }
        agpeVar.d.h(new agly(agpjVar, str));
    }

    public final void o(String str, String str2) {
        agpe agpeVar = this.a;
        if (agpeVar.p == null) {
            if (agpeVar.q == null) {
                agpeVar.p = new alok();
            } else {
                agpeVar.p = new alok();
                agpeVar.p.l(agpeVar.q);
                agpeVar.q = null;
            }
        }
        agpeVar.p.h(str, str2);
    }

    public final void p(agoz agozVar) {
        agpe agpeVar = this.a;
        if (agpeVar.n == null) {
            if (agpeVar.o == null) {
                agpeVar.n = new alob();
            } else {
                agpeVar.n = new alob();
                agpeVar.n.j(agpeVar.o);
                agpeVar.o = null;
            }
        }
        agpeVar.n.h(agozVar);
    }

    public final void q() {
        this.a.f(true);
    }

    public final void r() {
        this.a.e(true);
    }

    public final void s() {
        this.a.g(true);
    }

    public final void t(agmh... agmhVarArr) {
        this.a.j = (String) DesugarArrays.stream(agmhVarArr).map(new agnz(6)).collect(Collectors.joining(","));
    }

    public final void u(int i) {
        this.a.k = String.valueOf(i);
    }

    public final void v(String str) {
        this.a.k = str;
    }

    public final void w(String str) {
        this.a.r = new agni(str);
    }

    public final void x(int i) {
        this.a.l = String.valueOf(i);
    }

    public final void y(agpj agpjVar) {
        this.a.i = agpjVar;
    }

    @Deprecated
    public final void z(String str) {
        this.a.i = new agpl(str);
    }
}
