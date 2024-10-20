package com.google.android.apps.messaging.shared.rcs.availability.metrics;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.acnu;
import defpackage.acvz;
import defpackage.acxr;
import defpackage.adiw;
import defpackage.adjl;
import defpackage.adtn;
import defpackage.advp;
import defpackage.advr;
import defpackage.adwl;
import defpackage.adwu;
import defpackage.akec;
import defpackage.aktp;
import defpackage.amfp;
import defpackage.amfq;
import defpackage.amfr;
import defpackage.amva;
import defpackage.amwt;
import defpackage.amwu;
import defpackage.anen;
import defpackage.ansy;
import defpackage.aozy;
import defpackage.apag;
import defpackage.armf;
import defpackage.d;
import defpackage.gsx;
import defpackage.maq;
import defpackage.okq;
import defpackage.oma;
import defpackage.vbo;
import defpackage.vco;
import defpackage.vib;
import defpackage.vmd;
import defpackage.wwn;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsAvailabilityLogWorker extends gsx {
    public static final advp e = new advp("RcsAvailabilityLogWorker");
    public final armf f;
    public final anen g;
    public final wwn h;
    private final anen i;
    private final adwu j;
    private final adtn k;
    private final oma l;
    private final acxr m;
    private final armf n;
    private final vco o;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        armf LH();

        armf LP();

        vco RT();

        oma bb();

        wwn fr();

        acxr gO();

        adtn gW();

        adwu gX();

        anen hQ();

        anen k();
    }

    public RcsAvailabilityLogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.f = aVar.LH();
        this.o = aVar.RT();
        this.i = aVar.k();
        this.g = aVar.hQ();
        this.j = aVar.gX();
        this.k = aVar.gW();
        this.h = aVar.fr();
        this.l = aVar.bb();
        this.m = aVar.gO();
        this.n = aVar.LP();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        advr.d(e, "%s is started", "RcsAvailabilityLogWorker");
        if (((okq) this.n.b()).a()) {
            return aktp.aj(new vbo(this, 4), this.g);
        }
        if (!this.l.a() && !((ansy) ((acvz) this.m).a.b()).e("cslib.use_sim_subscription_info_retriever_bugle_comparison_logging")) {
            return aktp.ai(new vib(this, 8), this.i);
        }
        return aktp.aj(new vbo(this, 3), this.g);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [armf, java.lang.Object] */
    public final void c(amwt amwtVar, Optional optional) {
        int i;
        if (this.l.a()) {
            d.t(optional.isPresent(), "No SimSubscriptionInfo present.");
        }
        adiw adiwVar = new adiw((String) optional.map(new vmd(17)).orElse(this.k.l()));
        adwl a2 = this.j.a(((Integer) optional.map(new vmd(18)).orElse(Integer.valueOf(this.k.b()))).intValue());
        if (adwl.SINGLE_REG.equals(a2)) {
            i = 5;
        } else if (adwl.DUAL_REG.equals(a2)) {
            i = 4;
        } else {
            i = 1;
        }
        vco vcoVar = this.o;
        vco vcoVar2 = new vco(amwtVar, amwtVar);
        maq maqVar = (maq) vcoVar.a.b();
        aozy createBuilder = amwu.a.createBuilder();
        Object obj = vcoVar2.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amwt amwtVar2 = ((adjl) obj).a;
        apag apagVar = createBuilder.b;
        amwu amwuVar = (amwu) apagVar;
        amwuVar.c = amwtVar2.E;
        amwuVar.b |= 1;
        Object obj2 = vcoVar2.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amwt amwtVar3 = ((adjl) obj2).a;
        apag apagVar2 = createBuilder.b;
        amwu amwuVar2 = (amwu) apagVar2;
        amwuVar2.d = amwtVar3.E;
        amwuVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amwu amwuVar3 = (amwu) createBuilder.b;
        amwuVar3.e = i - 1;
        amwuVar3.b |= 4;
        amva a3 = ((acnu) vcoVar.b.b()).a(adiwVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amwu amwuVar4 = (amwu) createBuilder.b;
        a3.getClass();
        amwuVar4.f = a3;
        amwuVar4.b |= 8;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.AVAILABILITY_LOG;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amwu amwuVar5 = (amwu) createBuilder.s();
        amwuVar5.getClass();
        amfrVar2.ah = amwuVar5;
        amfrVar2.d |= 128;
        maqVar.j(amfqVar);
    }
}
