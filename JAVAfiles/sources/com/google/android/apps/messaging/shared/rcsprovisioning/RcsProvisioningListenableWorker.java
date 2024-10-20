package com.google.android.apps.messaging.shared.rcsprovisioning;

import android.app.Notification;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aczv;
import defpackage.adiv;
import defpackage.adjm;
import defpackage.adlw;
import defpackage.admu;
import defpackage.adnk;
import defpackage.adoi;
import defpackage.adom;
import defpackage.adtl;
import defpackage.advq;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksa;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amfq;
import defpackage.amfr;
import defpackage.amww;
import defpackage.amxa;
import defpackage.amxd;
import defpackage.andi;
import defpackage.anen;
import defpackage.aozy;
import defpackage.apag;
import defpackage.d;
import defpackage.dtq;
import defpackage.gsi;
import defpackage.gsp;
import defpackage.gsu;
import defpackage.gsv;
import defpackage.gsw;
import defpackage.gsx;
import defpackage.gvf;
import defpackage.ikg;
import defpackage.lzz;
import defpackage.maq;
import defpackage.okr;
import defpackage.pcl;
import defpackage.pmo;
import defpackage.qiu;
import defpackage.uqe;
import defpackage.vau;
import defpackage.vco;
import defpackage.vhu;
import defpackage.via;
import defpackage.vrk;
import defpackage.vrn;
import defpackage.vtc;
import defpackage.wga;
import defpackage.whg;
import defpackage.wjr;
import defpackage.wjy;
import defpackage.wjz;
import defpackage.wwn;
import defpackage.xnv;
import defpackage.xyt;
import defpackage.yhu;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsProvisioningListenableWorker extends gsx implements adjm {
    private final lzz A;
    private final xyt B;
    private final long C;
    private final boolean D;
    private int E;
    private final xnv F;
    private volatile String G;
    private final wjz H;
    private final long I;
    private final aksr J;
    private final yhu K;
    private final via L;
    private final vau M;
    private final pmo N;
    private final vco O;
    public final Context f;
    public final wjr g;
    public adlw h;
    public final String i;
    public final amww j;
    public final String k;
    public dtq l;
    public final anen m;
    public akul n;
    public final wwn o;
    public final Optional p;
    public final boolean q;
    public final okr r;
    public final pcl s;
    public int t;
    public final adoi u;
    public gvf v;
    private final adnk x;
    private final adtl y;
    private final admu z;
    private static final AtomicLong w = new AtomicLong(0);
    public static final alwo e = alwo.o("BugleRcsWorker");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        adoi PT();

        vco RT();

        lzz X();

        aksr a();

        okr aV();

        pmo bM();

        pcl bw();

        vau eo();

        via eu();

        xnv fN();

        xyt fZ();

        wjr fe();

        wjz ff();

        wwn fr();

        adlw gR();

        admu gT();

        adnk gU();

        adtl gV();

        yhu h();

        anen hQ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcsProvisioningListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        adnk gU = p(context).gU();
        wjr fe = p(context).fe();
        adtl gV = p(context).gV();
        admu gT = p(context).gT();
        vco RT = p(context).RT();
        lzz X = p(context).X();
        xyt fZ = p(context).fZ();
        xnv fN = p(context).fN();
        wjz ff = p(context).ff();
        aksr a2 = p(context).a();
        yhu h = p(context).h();
        via eu = p(context).eu();
        anen hQ = p(context).hQ();
        adoi PT = p(context).PT();
        wwn fr = p(context).fr();
        vau eo = p(context).eo();
        okr aV = p(context).aV();
        pcl bw = p(context).bw();
        pmo bM = p(context).bM();
        this.v = new gsu();
        this.n = null;
        this.f = context;
        this.i = String.valueOf(w.getAndIncrement());
        this.I = fN.f().toEpochMilli();
        gsi gsiVar = workerParameters.b;
        this.C = gsiVar.b("scheduled_time_sec", 0L);
        this.D = gsiVar.h("is_config_refresh");
        this.x = gU;
        this.g = fe;
        this.y = gV;
        this.z = gT;
        this.O = RT;
        this.A = X;
        this.B = fZ;
        this.F = fN;
        this.H = ff;
        this.J = a2;
        this.K = h;
        this.L = eu;
        this.m = hQ;
        this.u = PT;
        this.o = fr;
        this.M = eo;
        this.r = aV;
        this.s = bw;
        amww b = amww.b(gsiVar.a("trigger_event", 0));
        this.j = b == null ? amww.UNDEFINED_TRIGGER_EVENT : b;
        this.k = albo.ag(gsiVar.d("worker_id"));
        boolean h2 = gsiVar.h("use_sim_subscription_info");
        this.q = h2;
        if (h2) {
            this.p = Optional.ofNullable(gsiVar.d("rcs_provisioning_id")).map(new wga(13));
        } else {
            this.p = Optional.empty();
        }
        this.N = bM;
    }

    public static String c(String str, Object[] objArr) {
        if (objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    private static a p(Context context) {
        return (a) akec.w(context, a.class);
    }

    private final aksa q(String str) {
        try {
            return this.J.b(str);
        } catch (IllegalStateException unused) {
            aktp.d();
            return aktp.e(str);
        }
    }

    private final akul r() {
        this.t = 2;
        return akul.g(d.m(new uqe(this, 4)));
    }

    private final void s(String str) {
        this.H.b(str).k(qiu.b(), andi.a);
    }

    private final void t(int i, String str) {
        boolean S;
        this.E = this.H.a(str);
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        m("Provisioning Engine entered RetryState, provisioning task will be rescheduled with exponential backoff", new Object[0]);
                        this.t = 7;
                        u(k(), 3);
                    } else {
                        m("Provisioning Engine needs manual msisdn entry, shutting down Provisioning Task", new Object[0]);
                        this.t = 5;
                        if (aczv.x() && aczv.X()) {
                            S = this.M.c(str).w;
                        } else {
                            S = aczv.S();
                        }
                        if (S) {
                            this.g.l(k(), Duration.ofMillis(aczv.o()), 3, amww.MANUAL_MSISDN_ENTRY_REQUIRED);
                        }
                        this.v = new gsw();
                    }
                } else {
                    m("Provisioning Engine needs user input, shutting down Provisioning Task", new Object[0]);
                    this.t = 5;
                    s(k());
                    this.v = new gsw();
                }
            } else {
                m("RCS is disabled, shutting down Provisioning Task", new Object[0]);
                this.t = 6;
                this.v = new gsw();
            }
        } else {
            this.t = 4;
            String k = k();
            long a2 = this.x.f(k).a();
            if (a2 > 0) {
                this.g.f(k, Duration.ofSeconds(a2), true, amww.RCS_CONFIGURATION_UPDATED);
            }
            if (this.q) {
                ((vrn) this.B.a()).p((adiv) this.p.orElseThrow(new vtc(16)), vrk.RCS_CONFIGURATION_UPDATE);
            } else {
                ((vrn) this.B.a()).n(vrk.RCS_CONFIGURATION_UPDATE);
            }
            String k2 = k();
            m("Configuration is updated for SIM %s, notifying listeners", advq.SIM_ID.c(k2));
            this.z.s(k2, Optional.of(this.x.f(k2)));
            vco vcoVar = this.O;
            aozy createBuilder = amxa.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amxa amxaVar = (amxa) apagVar;
            amxaVar.b |= 1;
            amxaVar.c = true;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amxa amxaVar2 = (amxa) createBuilder.b;
            amxaVar2.d = 1;
            amxaVar2.b = 2 | amxaVar2.b;
            long b = this.A.b(k2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxa amxaVar3 = (amxa) createBuilder.b;
            amxaVar3.b = 4 | amxaVar3.b;
            amxaVar3.e = b;
            long convert = TimeUnit.MINUTES.convert(r10.mValiditySecs, TimeUnit.SECONDS);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxa amxaVar4 = (amxa) createBuilder.b;
            amxaVar4.b |= 8;
            amxaVar4.f = convert;
            vcoVar.p((amxa) createBuilder.s());
            s(k2);
            this.v = new gsw();
        }
        l();
    }

    private final void u(String str, int i) {
        this.H.c(str).h(new ikg(this, i, 15), andi.a).k(qiu.b(), andi.a);
        this.v = new gsw();
    }

    @Override // defpackage.gsx
    public final ListenableFuture a() {
        if (this.H.a(k()) >= ((Integer) wjy.c.e()).intValue()) {
            return super.a();
        }
        this.K.b();
        int i = vhu.FOREGROUND_SERVICE.F;
        Notification b = this.L.b(this.f.getString(R.string.rcs_foreground_service_message_v2));
        b.getClass();
        return aktp.ag(new gsp(i, b, 0));
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        m("RCS provisioning task has started", new Object[0]);
        if (this.N.a()) {
            aksa q = q("RcsProvisioningListenableWorker: startWork");
            try {
                akul r = r();
                q.close();
                return r;
            } catch (Throwable th) {
                try {
                    q.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        akrc b = this.J.b("RcsProvisioningListenableWorker: startWork");
        try {
            akul r2 = r();
            b.close();
            return r2;
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.gsx
    public final void d() {
        m("Provisioning task is stopped by the system", new Object[0]);
        this.t = 3;
        u(k(), 2);
        l();
    }

    public final String k() {
        if (this.q) {
            return adom.n((adiv) this.p.orElseThrow(new vtc(15))).a;
        }
        return this.y.f();
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    public final void l() {
        int i = 1;
        m("finish provisioning task with result %s", this.v);
        m("RCS provisioning task has finished with result %s", this.v);
        aozy createBuilder = amxd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        boolean z = this.D;
        amxd amxdVar = (amxd) createBuilder.b;
        amxdVar.b |= 1;
        amxdVar.c = z;
        long j = 0;
        if (this.C != 0) {
            j = TimeUnit.MILLISECONDS.toSeconds(this.I) - this.C;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxd amxdVar2 = (amxd) createBuilder.b;
        amxdVar2.b |= 2;
        amxdVar2.d = j;
        long epochMilli = this.F.f().toEpochMilli() - this.I;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amxd amxdVar3 = (amxd) apagVar;
        amxdVar3.b |= 4;
        amxdVar3.e = epochMilli;
        String str = this.i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amxd amxdVar4 = (amxd) apagVar2;
        str.getClass();
        amxdVar4.b |= 8;
        amxdVar4.f = str;
        int i2 = this.t;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amxd amxdVar5 = (amxd) createBuilder.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            amxdVar5.g = i3;
            amxdVar5.b |= 16;
            gvf gvfVar = this.v;
            if (gvfVar.equals(new gsw())) {
                i = 3;
            } else if (gvfVar.equals(new gsv())) {
                i = 2;
            } else if (gvfVar.equals(new gsu())) {
                i = 4;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxd amxdVar6 = (amxd) createBuilder.b;
            amxdVar6.h = i - 1;
            amxdVar6.b |= 32;
            int e2 = e();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            amxd amxdVar7 = (amxd) apagVar3;
            amxdVar7.b |= 64;
            amxdVar7.i = e2;
            String str2 = this.k;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            amxd amxdVar8 = (amxd) createBuilder.b;
            amxdVar8.b |= 128;
            amxdVar8.j = str2;
            String ag = albo.ag(this.G);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            amxd amxdVar9 = (amxd) apagVar4;
            amxdVar9.b |= 256;
            amxdVar9.k = ag;
            int i4 = this.E;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            amxd amxdVar10 = (amxd) createBuilder.b;
            amxdVar10.b |= 512;
            amxdVar10.l = i4;
            vco vcoVar = this.O;
            amxd amxdVar11 = (amxd) createBuilder.s();
            maq maqVar = (maq) vcoVar.a.b();
            amfq m = vco.m();
            if (!m.b.isMutable()) {
                m.u();
            }
            amfr amfrVar = (amfr) m.b;
            amfr amfrVar2 = amfr.a;
            amxdVar11.getClass();
            amfrVar.aA = amxdVar11;
            amfrVar.e |= 4096;
            maqVar.j(m);
            akul akulVar = this.n;
            if (akulVar != null) {
                qiu.h(akulVar.h(new whg(this, 11), this.m));
            } else {
                adlw adlwVar = this.h;
                if (adlwVar != null) {
                    adlwVar.T();
                }
            }
            dtq dtqVar = this.l;
            if (dtqVar != null) {
                dtqVar.b(this.v);
                return;
            }
            return;
        }
        throw null;
    }

    public final void m(String str, Object... objArr) {
        ((alwl) ((alwl) e.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "logi", 662, "RcsProvisioningListenableWorker.java")).J("[seqId=%s][workId=%s] %s", this.i, this.k, c(str, objArr));
    }

    @Override // defpackage.adjm
    public final void n(String str) {
        this.G = str;
    }

    @Override // defpackage.adjm
    public final void o(int i, String str) {
        String str2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str2 = "MANUAL_MSISDN_ENTRY_REQUIRED";
                    } else {
                        str2 = "RETRY";
                    }
                } else {
                    str2 = "USER_INPUT_REQUIRED";
                }
            } else {
                str2 = "RCS_DISABLED";
            }
        } else {
            str2 = "CONFIGURATION_UPDATED";
        }
        m("Received a provisioning state changed event from the provisioning engine %s", str2);
        if (this.N.a()) {
            aksa q = q("RcsProvisioningListenableWorker: RcsProvisioningStateChanged");
            try {
                t(i, str);
                q.close();
                return;
            } catch (Throwable th) {
                try {
                    q.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        akrc b = this.J.b("RcsProvisioningListenableWorker: RcsProvisioningStateChanged");
        try {
            t(i, str);
            b.close();
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
