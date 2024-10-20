package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxf extends ajxd {
    public static final ajxl b;
    public final ajxj c;
    public final algw d;
    public final ajyp e;
    public final akbo f;
    public final ajyy g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final akbp k = new akbp<apdj<ajxl>, ajxc>() { // from class: ajxf.1
        /* JADX WARN: Multi-variable type inference failed */
        private final void d(ajxl ajxlVar, ajxt ajxtVar) {
            int i;
            String name;
            ajxf ajxfVar = ajxf.this;
            if (ajxfVar.j) {
                akri s2 = aktp.s(ajxf.s);
                if (s2.b()) {
                    i = ((Integer) s2.a()).intValue();
                } else {
                    i = 0;
                }
                int i2 = i + 1;
                if (i2 > 10) {
                    if (ajxf.this.d.f()) {
                        name = ((Activity) ajxf.this.d.b()).getClass().getName();
                    } else {
                        name = ajxf.this.q.getClass().getName();
                    }
                    ((alvg) ((alvg) ajxf.a.h()).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "fallbackOrSetErrorDetectingInfiniteLoop", 377, "AccountControllerImpl.java")).t("A highly probable infinite loop detected in host: %s", new aomj(aomi.NO_USER_DATA, name));
                    throw new IllegalStateException("Account error triggered too many times in the same call chain, the app is likely trapped in an infinite loop. This is likely an app bug where the onNoAccountAvailable method is triggering the account error again. Please check the preceding log in logcat to see which host is causing the problem.", aktu.c());
                }
                akrj b2 = akrl.b();
                b2.a(ajxf.s, Integer.valueOf(i2));
                akrh f = aktp.f("AccountController account error", ((akrl) b2).f());
                try {
                    if (ajxlVar.i) {
                        ajxf.this.g.j(ajxtVar);
                        f.close();
                        return;
                    } else {
                        ajxf.this.e.l(ajxtVar);
                        f.close();
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (ajxlVar.i) {
                ajxfVar.g.j(ajxtVar);
            } else {
                ajxfVar.e.l(ajxtVar);
            }
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void a(Object obj, Throwable th) {
            akrh e;
            boolean z;
            ajxl ajxlVar = (ajxl) ((apdj) obj).a(ajxl.a, aozs.a());
            ajxd.b(ajxlVar);
            if (!ajxlVar.equals(ajxf.this.m)) {
                return;
            }
            ajxf.this.k();
            if (th instanceof akbv) {
                int i = ajxlVar.h;
                if (i < 4) {
                    aomi aomiVar = aomi.NO_USER_DATA;
                    int aD = a.aD(ajxlVar.e);
                    boolean z2 = true;
                    if (aD == 0) {
                        aD = 1;
                    }
                    ((alvg) ((alvg) ((alvg) ajxf.a.i()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 246, "AccountControllerImpl.java")).J("Android killed the app process before the account operation completes.retrying the failed operation. AccountControllerOperation type enum number: %s, time(s) attempted: %s, exit reason code: %s", new aomj(aomiVar, Integer.valueOf(aD - 1)), new aomj(aomi.NO_USER_DATA, Integer.valueOf(i)), new aomj(aomi.NO_USER_DATA, ((akbv) th).a.e()));
                    int aD2 = a.aD(ajxlVar.e);
                    if (aD2 == 0) {
                        aD2 = 1;
                    }
                    alob alobVar = new alob();
                    if (aD2 == 2 || aD2 == 3 || aD2 == 6) {
                        Iterator<E> it = ajxlVar.f.iterator();
                        while (it.hasNext()) {
                            try {
                                alobVar.h(Class.forName((String) it.next()).asSubclass(ajyj.class));
                            } catch (ClassNotFoundException e2) {
                                throw new IllegalStateException(e2);
                            }
                        }
                    }
                    algw algwVar = alfd.a;
                    if (aD2 == 6) {
                        if ((ajxlVar.b & 64) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        albo.T(z);
                        algwVar = algw.i(Integer.valueOf(ajxlVar.j));
                    }
                    int i2 = ajxlVar.h;
                    int i3 = aD2 - 1;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        ajxf ajxfVar = ajxf.this;
                                        alog g = alobVar.g();
                                        ajyx b2 = ajxf.this.g.b(((Integer) algwVar.b()).intValue());
                                        ajxfVar.j();
                                        g.getClass();
                                        albo.T(!g.isEmpty());
                                        ajxfVar.o = ajxfVar.n;
                                        ajxfVar.g.l(b2);
                                        e = aktp.e("Switch Account With Custom Selectors Keep State");
                                        try {
                                            ListenableFuture f = ajxfVar.f(g, new ajxb(), true);
                                            if (!f.isDone()) {
                                                ajxfVar.g.k();
                                                ajxfVar.r(6, null, algw.i(g), alfd.a, true, algw.i(b2), f, i2);
                                            } else {
                                                ProtoParsers$InternalDontUse protoParsers$InternalDontUse = new ProtoParsers$InternalDontUse(null, ajxfVar.q(6, null, algw.i(g), alfd.a, true, algw.i(b2), i2));
                                                try {
                                                    ajxfVar.k.c(protoParsers$InternalDontUse, (ajxc) albo.bQ(f));
                                                } catch (ExecutionException e3) {
                                                    ajxfVar.k.a(protoParsers$InternalDontUse, e3.getCause());
                                                }
                                            }
                                            e.close();
                                            return;
                                        } finally {
                                        }
                                    } else {
                                        throw new IllegalStateException("AccountControllerOperation type is UNKNOWN. Shouldn't reach here because we already checked this field at the beginning of the method.");
                                    }
                                } else {
                                    ajxf ajxfVar2 = ajxf.this;
                                    ajxfVar2.o = true;
                                    ajxfVar2.h(i2);
                                    return;
                                }
                            } else {
                                int i4 = ajxlVar.d;
                                if (i4 < 0) {
                                    z2 = false;
                                }
                                albo.T(z2);
                                ajxf.this.o(ajwt.a(i4), ajxlVar.g, i2);
                                return;
                            }
                        } else {
                            ajxf ajxfVar3 = ajxf.this;
                            alog g2 = alobVar.g();
                            ajxfVar3.j();
                            ajxfVar3.i();
                            e = aktp.e("Retry Switch Account Interactive with Specified Selectors");
                            try {
                                ajxfVar3.n(g2, i2);
                                e.close();
                                return;
                            } finally {
                            }
                        }
                    } else {
                        ajxf.this.p(alobVar.g(), i2);
                        return;
                    }
                } else {
                    d(ajxlVar, new ajxv(th));
                }
            } else {
                d(ajxlVar, ajki.v(th));
            }
            if ((ajxlVar.b & 2) != 0) {
                ajwt a2 = ajwt.a(ajxlVar.d);
                if (th instanceof ajxt) {
                    ((alvg) ((alvg) ((alvg) ajxf.a.g()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 268, "AccountControllerImpl.java")).t("Failed to use %s.", a2);
                } else {
                    ((alvg) ((alvg) ((alvg) ajxf.a.h()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 271, "AccountControllerImpl.java")).t("Failed to use %s.", a2);
                }
            }
            ajxf.this.m();
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void c(Object obj, Object obj2) {
            ajwt ajwtVar;
            boolean z;
            ajxc ajxcVar = (ajxc) obj2;
            ajxl ajxlVar = (ajxl) ((apdj) obj).a(ajxl.a, aozs.a());
            ajxd.b(ajxlVar);
            if (!ajxlVar.equals(ajxf.this.m)) {
                return;
            }
            if ((ajxlVar.b & 2) != 0) {
                if (ajxcVar.a.a == ajxlVar.d) {
                    z = true;
                } else {
                    z = false;
                }
                albo.T(z);
                ajwtVar = ajwt.a(ajxlVar.d);
            } else {
                if (ajxcVar.d != null) {
                    if (!ajxf.this.e.c()) {
                        ajxf.this.e.m();
                    }
                    Intent intent = ajxcVar.d;
                    if (ajxf.this.e.c()) {
                        ajya.c(intent, ajwt.a(ajxf.this.e.a()));
                    }
                    ajxf.this.c.c().c(intent);
                    ajxf.this.g.c();
                    return;
                }
                if (ajxcVar.c != null) {
                    ajwtVar = ajxcVar.a;
                } else {
                    d(ajxlVar, new ajxy());
                    ajxf.this.k();
                    ajxf.this.m();
                    return;
                }
            }
            ajyz ajyzVar = ajxcVar.c;
            ajyzVar.getClass();
            ajxb ajxbVar = ajxcVar.e;
            if (ajyzVar.a) {
                ajxf ajxfVar = ajxf.this;
                ajxfVar.e.n(ajxcVar.a, ajxcVar.b, ajxbVar);
                ajxf.this.k();
            } else if (ajxf.this.c.e()) {
                if (ajyzVar.b) {
                    ajxf.this.e.m();
                }
                Intent intent2 = ajyzVar.c;
                ajya.c(intent2, ajwtVar);
                ajya.b(intent2);
                ajki.r(intent2, ajxf.this.l.a);
                intent2.addFlags(65536);
                ajxf.this.c.b().c(intent2);
            } else {
                ajxf.this.k();
                Intent intent3 = ajyzVar.c;
                ajxw ajxwVar = new ajxw();
                d(ajxlVar, ajxwVar);
                ((alvg) ((alvg) ((alvg) ajxf.a.g()).g(ajxwVar)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onSuccess", 198, "AccountControllerImpl.java")).t("Account with id %s does not fulfill all the requirements.", ajwtVar);
                ajxf.this.m();
                return;
            }
            ajxf.this.m();
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public ajyu l;
    public ajxl m;
    public boolean n;
    public boolean o;
    public ListenableFuture p;
    public final aklj q;
    public final ajyc r;
    public final aogy t;
    private final agcp u;
    public static final aktp s = new aktp();
    public static final alvi a = alvi.m("com/google/apps/tiktok/account/api/controller/AccountControllerImpl");

    static {
        aozy createBuilder = ajxl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ajxl ajxlVar = (ajxl) createBuilder.b;
        ajxlVar.b |= 1;
        ajxlVar.c = -1;
        b = (ajxl) createBuilder.s();
    }

    public ajxf(aklj akljVar, final ajxj ajxjVar, algw algwVar, ajyp ajypVar, akbo akboVar, agcp agcpVar, ajyy ajyyVar, aogy aogyVar, ajyc ajycVar, algw algwVar2, algw algwVar3) {
        this.q = akljVar;
        this.c = ajxjVar;
        this.d = algwVar;
        this.e = ajypVar;
        this.f = akboVar;
        this.u = agcpVar;
        this.g = ajyyVar;
        this.t = aogyVar;
        this.r = ajycVar;
        Boolean bool = false;
        this.h = ((Boolean) algwVar2.d(bool)).booleanValue();
        this.i = ((Boolean) algwVar3.d(bool)).booleanValue();
        bool.getClass();
        this.j = true;
        bool.getClass();
        bool.getClass();
        ajypVar.k(this);
        akljVar.N().c(new akuj(new ajxi(this)));
        akljVar.aK().c("tiktok_account_controller_saved_instance_state", new gjy() { // from class: ajxe
            @Override // defpackage.gjy
            public final Bundle a() {
                Bundle bundle = new Bundle();
                ajxf ajxfVar = ajxf.this;
                bundle.putBoolean("state_pending_op", ajxfVar.n);
                aowt.i(bundle, "state_latest_operation", ajxfVar.m);
                boolean z = true;
                if (!ajxfVar.o && ajxjVar.f()) {
                    z = false;
                }
                bundle.putBoolean("state_do_not_revalidate", z);
                bundle.putBoolean("tiktok_accounts_disabled", ajxfVar.h);
                return bundle;
            }
        });
        ajxjVar.d(new yjk(this, 7), new yjk(this, 8));
    }

    @Override // defpackage.ajxd
    public final void a(alog alogVar) {
        p(alogVar, 0);
    }

    @Override // defpackage.ajxd
    public final void c(ajyk ajykVar) {
        j();
        this.u.h(ajykVar);
    }

    @Override // defpackage.ajxd
    public final void d(ajyu ajyuVar) {
        boolean z;
        j();
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Config can be set once, in the constructor only.");
        this.l = ajyuVar;
    }

    public final ListenableFuture e(alog alogVar, ajxb ajxbVar) {
        return f(alogVar, ajxbVar, false);
    }

    public final ListenableFuture f(alog alogVar, ajxb ajxbVar, boolean z) {
        ajyi ajyiVar = new ajyi(this.c.a());
        if (!z) {
            this.o = false;
        }
        aogy aogyVar = this.t;
        return aogyVar.v(aogyVar.w(ajyiVar, alogVar, ajxbVar), this.l.c, this.c.a());
    }

    public final ListenableFuture g() {
        return h(0);
    }

    public final ListenableFuture h(int i) {
        ListenableFuture listenableFuture;
        if (!this.o) {
            return albo.bI(null);
        }
        this.o = false;
        akrh e = aktp.e("Revalidate Account");
        try {
            int a2 = this.e.a();
            if (a2 == -1) {
                listenableFuture = albo.bI(null);
            } else {
                ajwt a3 = ajwt.a(a2);
                ListenableFuture x = this.t.x(a3, this.l.c, this.c.a(), new ajxb());
                alfd alfdVar = alfd.a;
                e.b(x);
                r(5, a3, alfdVar, alfdVar, false, alfdVar, x, i);
                listenableFuture = x;
            }
            e.close();
            return listenableFuture;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i() {
        albo.U(this.l.a, "Activity not configured for account selection.");
    }

    public final void j() {
        albo.U(!this.h, "Attempted to use the account controller when accounts are disabled");
    }

    public final void k() {
        this.n = false;
        if (!this.e.c()) {
            this.o = false;
        }
    }

    public final void l(alog alogVar, ListenableFuture listenableFuture, int i) {
        if (!listenableFuture.isDone()) {
            this.e.m();
            algw i2 = algw.i(alogVar);
            alfd alfdVar = alfd.a;
            r(2, null, i2, alfdVar, false, alfdVar, listenableFuture, i);
            return;
        }
        this.e.j();
        algw i3 = algw.i(alogVar);
        alfd alfdVar2 = alfd.a;
        ajxl q = q(2, null, i3, alfdVar2, false, alfdVar2, i);
        try {
            this.k.c(new ProtoParsers$InternalDontUse(null, q), (ajxc) albo.bQ(listenableFuture));
        } catch (ExecutionException e) {
            this.k.a(new ProtoParsers$InternalDontUse(null, q), e.getCause());
        }
    }

    public final void m() {
        if (this.n) {
            return;
        }
        this.g.c();
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(alog alogVar, int i) {
        alogVar.getClass();
        albo.T(!alogVar.isEmpty());
        for (int i2 = 0; i2 < ((alsx) alogVar).c; i2++) {
            Class cls = (Class) alogVar.get(i2);
            albo.N(ajyh.class.isAssignableFrom(cls), "selector %s is not an interactive selector", cls);
        }
        ListenableFuture w = this.t.w(new ajyi(this.c.a()), alogVar, new ajxb());
        algw i3 = algw.i(alogVar);
        alfd alfdVar = alfd.a;
        r(3, null, i3, alfdVar, false, alfdVar, w, i);
    }

    public final void o(ajwt ajwtVar, boolean z, int i) {
        ListenableFuture x;
        akrh e = aktp.e("Switch Account");
        try {
            this.o = false;
            if (z) {
                x = this.t.u(ajwtVar, this.l.c, this.c.a(), new ajxb());
            } else {
                x = this.t.x(ajwtVar, this.l.c, this.c.a(), new ajxb());
            }
            ListenableFuture listenableFuture = x;
            if (!listenableFuture.isDone() && ajwtVar.a != this.e.a()) {
                this.e.m();
            }
            alfd alfdVar = alfd.a;
            algw i2 = algw.i(Boolean.valueOf(z));
            alfd alfdVar2 = alfd.a;
            e.b(listenableFuture);
            r(4, ajwtVar, alfdVar, i2, false, alfdVar2, listenableFuture, i);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void p(alog alogVar, int i) {
        alogVar.getClass();
        albo.T(!alogVar.isEmpty());
        akrh e = aktp.e("Switch Account With Custom Selectors");
        try {
            l(alogVar, e(alogVar, new ajxb()), i);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [ajyx, java.lang.Object] */
    public final ajxl q(int i, ajwt ajwtVar, algw algwVar, algw algwVar2, boolean z, algw algwVar3, int i2) {
        int i3;
        int i4 = this.m.c;
        if (i4 == Integer.MAX_VALUE) {
            i3 = 0;
        } else {
            i3 = i4 + 1;
        }
        aozy createBuilder = ajxl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ajxl ajxlVar = (ajxl) apagVar;
        ajxlVar.b |= 1;
        ajxlVar.c = i3;
        if (ajwtVar != null) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ajxl ajxlVar2 = (ajxl) createBuilder.b;
            ajxlVar2.b |= 2;
            ajxlVar2.d = ajwtVar.a;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ajxl ajxlVar3 = (ajxl) createBuilder.b;
        ajxlVar3.e = i - 1;
        ajxlVar3.b |= 4;
        if (algwVar.f()) {
            ?? b2 = algwVar.b();
            albo.T(!((alog) b2).isEmpty());
            alsx alsxVar = (alsx) b2;
            ArrayList arrayList = new ArrayList(alsxVar.c);
            int i5 = alsxVar.c;
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(((Class) b2.get(i6)).getName());
            }
            createBuilder.ax(arrayList);
        }
        if (algwVar2.f()) {
            boolean booleanValue = ((Boolean) algwVar2.b()).booleanValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ajxl ajxlVar4 = (ajxl) createBuilder.b;
            ajxlVar4.b |= 8;
            ajxlVar4.g = booleanValue;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ajxl ajxlVar5 = (ajxl) createBuilder.b;
        ajxlVar5.b |= 32;
        ajxlVar5.i = z;
        if (algwVar3.f()) {
            int a2 = this.g.a(algwVar3.b());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ajxl ajxlVar6 = (ajxl) createBuilder.b;
            ajxlVar6.b |= 64;
            ajxlVar6.j = a2;
        }
        int i7 = i2 + 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ajxl ajxlVar7 = (ajxl) createBuilder.b;
        ajxlVar7.b |= 16;
        ajxlVar7.h = i7;
        ajxl ajxlVar8 = (ajxl) createBuilder.s();
        this.m = ajxlVar8;
        ajxd.b(ajxlVar8);
        return this.m;
    }

    public final void r(int i, ajwt ajwtVar, algw algwVar, algw algwVar2, boolean z, algw algwVar3, ListenableFuture listenableFuture, int i2) {
        ajxl q = q(i, ajwtVar, algwVar, algwVar2, z, algwVar3, i2);
        this.n = true;
        try {
            this.f.k(new ahlp(listenableFuture), ahlp.m(q), this.k);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    public final void s(ajwt ajwtVar) {
        o(ajwtVar, false, 0);
    }
}
