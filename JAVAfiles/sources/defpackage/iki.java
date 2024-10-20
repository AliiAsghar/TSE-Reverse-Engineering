package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iki implements akfb, xth {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper");
    private final armf A;
    private final ansy B;
    public final alhr b;
    public final ikf c;
    public final armf d;
    public final anen e;
    public final anen f;
    public final armf h;
    public final ConversationIdType i;
    public final AtomicInteger k;
    public final xnv l;
    public final AtomicReference m;
    public final psw n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final qsa t;
    public final lgg u;
    public final lgg v;
    public final ahiy w;
    private final alhr x;
    private final armf y;
    private final enh z;
    public final Object g = new Object();
    public final andr j = new andr();
    public akfa s = akfa.a;

    /* JADX WARN: Type inference failed for: r10v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [armf, java.lang.Object] */
    public iki(armf armfVar, mlt mltVar, ljp ljpVar, armf armfVar2, anen anenVar, anen anenVar2, lgg lggVar, lgg lggVar2, armf armfVar3, ansy ansyVar, xnv xnvVar, ahiy ahiyVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, psw pswVar, qsa qsaVar, armf armfVar8, armf armfVar9, Context context, enh enhVar, ConversationIdType conversationIdType, int i) {
        this.y = armfVar2;
        this.o = armfVar4;
        this.t = qsaVar;
        this.r = armfVar5;
        this.q = armfVar7;
        this.p = armfVar6;
        this.d = armfVar9;
        this.n = pswVar;
        this.m = new AtomicReference(((xtj) armfVar.b()).d());
        this.e = anenVar;
        this.f = anenVar2;
        this.z = enhVar;
        this.u = lggVar;
        this.v = lggVar2;
        this.h = armfVar3;
        this.i = conversationIdType;
        this.B = ansyVar;
        this.w = ahiyVar;
        this.k = new AtomicInteger(i);
        this.l = xnvVar;
        this.A = armfVar8;
        this.b = albo.D(new qzy(ljpVar, context, enhVar, conversationIdType, i, 1));
        anen anenVar3 = (anen) mltVar.n.b();
        anenVar3.getClass();
        anen anenVar4 = (anen) mltVar.a.b();
        anenVar4.getClass();
        anen anenVar5 = (anen) mltVar.i.b();
        anenVar5.getClass();
        wfe wfeVar = (wfe) mltVar.h.b();
        wfeVar.getClass();
        nct nctVar = (nct) mltVar.c.b();
        psz pszVar = (psz) mltVar.l.b();
        pszVar.getClass();
        xnv xnvVar2 = (xnv) mltVar.e.b();
        xnvVar2.getClass();
        ahiy ahiyVar2 = (ahiy) mltVar.m.b();
        ahiyVar2.getClass();
        msk mskVar = (msk) mltVar.b.b();
        mskVar.getClass();
        yxx yxxVar = (yxx) mltVar.f.b();
        yxxVar.getClass();
        lgg lggVar3 = (lgg) mltVar.d.b();
        lggVar3.getClass();
        this.c = new ikf(anenVar3, anenVar4, anenVar5, wfeVar, nctVar, pszVar, xnvVar2, ahiyVar2, mskVar, yxxVar, lggVar3, mltVar.k, mltVar.j, mltVar.g, enhVar, conversationIdType, i);
        this.x = albo.D(new qwb(this, enhVar, conversationIdType, i, 1));
        enhVar.c(new ikh(this));
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#RcsCapabilitiesDataSourceWrapper#LoadData");
        try {
            andc d = e().a().d(akto.g(new lpx(this, 1)), this.e);
            e.close();
            return d;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        akul h;
        akrh e = aktp.e("MessageDataSource#RcsCapabilitiesDataSourceWrapper#FetchAndStoreData");
        try {
            int d = d();
            if (d < 0) {
                synchronized (this.g) {
                    this.s = akfa.a(Optional.empty(), this.l.f());
                    alvw g = a.g();
                    g.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "fetchAndStoreData", 214, "RcsCapabilitiesDataSourceWrapper.java")).r("fetchAndStoreData called with subId=%d", d);
                }
                h = aktp.ag(null);
            } else {
                akfb e2 = e();
                ansy ansyVar = this.B;
                ListenableFuture b = e2.b();
                ((ahiy) ansyVar.b).q(b, e2.c());
                h = akul.g(ancj.f(b, new algm(null), andi.a)).i(new ici(e2, 12), this.e).h(new ikg(this, d, 0), this.e);
                e.b(h);
            }
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akfb
    public final /* synthetic */ Object c() {
        return "rcs_capabilities";
    }

    public final int d() {
        int i = this.k.get();
        if (i < 0 && ((omb) this.y.b()).a()) {
            alvw i2 = a.i();
            i2.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i2;
            alvgVar.X(ydl.t, Integer.valueOf(i));
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "getCurrentlySelectedSubId", 270, "RcsCapabilitiesDataSourceWrapper.java")).q("Coercing invalid subId to the system default");
            return ((yjy) this.A.b()).f();
        }
        return i;
    }

    final akfb e() {
        if (this.n.a()) {
            return (akfb) this.x.get();
        }
        int ordinal = ((amuk) this.m.get()).ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return (akfb) this.b.get();
        }
        return this.c;
    }

    @Override // defpackage.xth
    public final void f(xtg xtgVar) {
        this.m.set(xtgVar.f);
        this.w.r(aktp.ag(null), "rcs_capabilities");
    }
}
