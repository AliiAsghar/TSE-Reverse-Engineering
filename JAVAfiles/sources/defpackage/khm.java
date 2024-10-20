package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khm implements khl {
    public final armf a;
    public final armf b;
    public final AtomicReference c;
    private final ajwt d;
    private final ahqr e;
    private final ahpf f;
    private final ohm g;
    private final xcs h;
    private final Optional i;
    private final armf j;
    private final arwe k;
    private final armf l;
    private final armf m;
    private final armf n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final AtomicInteger t;
    private final xcj u;
    private mdg v;
    private mdx w;
    private final mgu x;
    private final kor y;

    public khm(ajwt ajwtVar, ahqr ahqrVar, ahpf ahpfVar, xcj xcjVar, ohm ohmVar, mgu mguVar, xcs xcsVar, kor korVar, Optional optional, armf armfVar, armf armfVar2, arwe arweVar, armf armfVar3, AtomicReference atomicReference, armf armfVar4, armf armfVar5, armf armfVar6) {
        ajwtVar.getClass();
        ahqrVar.getClass();
        ahpfVar.getClass();
        xcjVar.getClass();
        mguVar.getClass();
        xcsVar.getClass();
        korVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        armfVar3.getClass();
        atomicReference.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.d = ajwtVar;
        this.e = ahqrVar;
        this.f = ahpfVar;
        this.u = xcjVar;
        this.g = ohmVar;
        this.x = mguVar;
        this.h = xcsVar;
        this.y = korVar;
        this.i = optional;
        this.j = armfVar;
        this.a = armfVar2;
        this.k = arweVar;
        this.b = armfVar3;
        this.c = atomicReference;
        this.l = armfVar4;
        this.m = armfVar5;
        this.n = armfVar6;
        this.t = new AtomicInteger();
    }

    private final void j(Context context) {
        if (!this.s && this.o && this.p && this.q) {
            this.s = true;
            akrh e = aktp.e("ConversationStartupTracker#onReady");
            try {
                ahqe.a.b(aabr.al(context));
                if (((asho) this.c.get()).equals(asho.UNKNOWN_CLOUD_SYNC_STATUS)) {
                    qjh.c(this.k, arpj.a, arwf.a, new kbl(this, (arpe) null, 6));
                } else {
                    ashu o = kor.o((asho) this.c.get());
                    o.getClass();
                    i(o);
                }
                armd.i(e, null);
                mdg mdgVar = this.v;
                if (mdgVar != null) {
                    mdgVar.b();
                }
                mdx mdxVar = this.w;
                if (mdxVar != null) {
                    mdxVar.a();
                }
                qiu.h(this.u.a(this.d));
                if (((oxm) this.n.b()).a()) {
                    ((hmk) this.m.b()).j(true);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    armd.i(e, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.khl
    public final void a(boolean z) {
        ahka ahkaVar;
        if (z) {
            ahkaVar = khk.g;
        } else {
            ahkaVar = khk.f;
        }
        this.y.k(ahkaVar, this.t.get(), null, ahqp.CANCEL);
    }

    @Override // defpackage.khl
    public final void b() {
        if (!this.r) {
            akrh e = aktp.e("ConversationStartupTracker#onComposeRowDraftLoaded");
            try {
                this.r = true;
                this.y.j(khk.d, this.t.get(), null);
                armd.i(e, null);
            } finally {
            }
        }
    }

    @Override // defpackage.khl
    public final void c(Context context) {
        aiut.c();
        if (!this.q) {
            akrh e = aktp.e("ConversationStartupTracker#onComposeRowInteractive");
            try {
                this.q = true;
                this.y.j(khk.c, this.t.get(), null);
                j(context);
                armd.i(e, null);
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.khl
    public final void d() {
        mdg h;
        mdx mdxVar;
        akrh e = aktp.e("ConversationStartupTracker#onFragmentCreation");
        try {
            aiut.c();
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.v = null;
            if (((oxm) this.n.b()).a()) {
                ((hmk) this.m.b()).j(false);
            }
            int incrementAndGet = this.t.incrementAndGet();
            this.y.g(mgv.u, incrementAndGet);
            this.y.g(khk.a, incrementAndGet);
            this.y.g(khk.b, incrementAndGet);
            this.y.g(khk.c, incrementAndGet);
            this.y.g(khk.d, incrementAndGet);
            this.y.g(khk.e, incrementAndGet);
            this.y.g(khk.f, incrementAndGet);
            this.y.g(khk.g, incrementAndGet);
            h = this.x.h(176569, null);
            this.v = h;
            jat jatVar = (jat) arsd.k(this.i);
            if (jatVar != null) {
                Object b = this.j.b();
                b.getClass();
                long longValue = ((Number) b).longValue();
                int andIncrement = ((AtomicInteger) jatVar.f).getAndIncrement();
                mdxVar = new mdx(jatVar, andIncrement);
                jatVar.g.put(Integer.valueOf(andIncrement), mdxVar);
                jatVar.e.put(Integer.valueOf(mdxVar.a), qjh.l(jatVar.c, null, new jmn(longValue, jatVar, mdxVar, (arpe) null, 3), 3));
            } else {
                mdxVar = null;
            }
            this.w = mdxVar;
            this.h.c();
            armd.i(e, null);
        } finally {
        }
    }

    @Override // defpackage.khl
    public final void e(Context context) {
        aiut.c();
        if (!this.p) {
            akrh e = aktp.e("ConversationStartupTracker#onMessageListInteractive");
            try {
                this.p = true;
                this.y.j(khk.b, this.t.get(), null);
                j(context);
                armd.i(e, null);
            } finally {
            }
        }
    }

    @Override // defpackage.khl
    public final void f() {
        mdg mdgVar = this.v;
        if (mdgVar != null) {
            mdgVar.a();
        }
        mdx mdxVar = this.w;
        if (mdxVar != null) {
            mdxVar.a();
        }
    }

    @Override // defpackage.khl
    public final void g(boolean z) {
        ahka ahkaVar;
        if (z) {
            ahkaVar = khk.g;
        } else {
            ahkaVar = khk.f;
        }
        this.y.j(ahkaVar, this.t.get(), null);
    }

    @Override // defpackage.khl
    public final void h(Context context) {
        aiut.c();
        if (!this.o) {
            akrh e = aktp.e("ConversationStartupTracker#onTopAppBarInteractive");
            try {
                this.o = true;
                this.y.j(khk.a, this.t.get(), null);
                j(context);
                armd.i(e, null);
            } finally {
            }
        }
    }

    public final void i(ashu ashuVar) {
        this.y.j(mgv.r, 0, ashuVar);
        this.y.j(mgv.u, this.t.get(), ashuVar);
        this.y.j(mgv.t, this.t.get(), ashuVar);
        this.y.j(mgv.s, this.t.get(), ashuVar);
        if (this.g.a()) {
            this.y.j(yci.h, 0, ashuVar);
        }
        if (((osb) this.l.b()).a()) {
            this.e.g(yci.o, null, ahqp.SUCCESS);
            this.e.g(yci.n, null, ahqp.SUCCESS);
        }
        this.y.j(mgw.a, 0, ashuVar);
        this.f.b(new ahka("Conversation data loaded"), ashuVar);
    }
}
