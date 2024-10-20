package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prk {
    public static final xze a = xze.g("Bugle", "RbmBusinessInfoDownloadHelper");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper");
    public static final aonx c;
    static final uuf d;
    static final uuf e;
    public final prq f;
    public final anen g;
    public final anen h;
    public final armf i;
    public final apwt j;
    public final apwt k;
    public final Context l;
    public final prd m;
    public final xnv n;
    public final psi o;
    public final mce p;
    public final prt q;
    public final aneo r;
    public final armf s;

    static {
        aony aonyVar = new aony();
        aonyVar.b();
        c = aonyVar.a();
        d = uuh.h(uuh.b, "rbm_domain_regex_for_default_hero_image_eligibility", "@.+[.]vodafone[.]com$");
        e = uuh.h(uuh.b, "rbm_default_hero_image_url", "https://storage.googleapis.com/agent-logos/default_hero_image.png");
    }

    public prk(prq prqVar, anen anenVar, anen anenVar2, armf armfVar, apwt apwtVar, apwt apwtVar2, Context context, prd prdVar, xnv xnvVar, psi psiVar, mce mceVar, prt prtVar, aneo aneoVar, armf armfVar2) {
        this.f = prqVar;
        this.g = anenVar;
        this.h = anenVar2;
        this.i = armfVar;
        this.j = apwtVar;
        this.k = apwtVar2;
        this.l = context;
        this.m = prdVar;
        this.n = xnvVar;
        this.o = psiVar;
        this.p = mceVar;
        this.q = prtVar;
        new uhq();
        this.r = aneoVar;
        this.s = armfVar2;
    }

    public static pre a() {
        aozy createBuilder = pre.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((pre) apagVar).b = false;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((pre) createBuilder.b).c = false;
        return (pre) createBuilder.s();
    }

    public final akul b(String str) {
        return aktp.ai(new mig(str, 9), this.h);
    }

    public final akul c(prl prlVar) {
        String str = prlVar.a;
        xze xzeVar = a;
        xzeVar.o("Request made for ".concat(str));
        xyo c2 = xzeVar.c();
        c2.H("Initiating business info retrieval handler...");
        c2.z("RBM bot id", str);
        c2.q();
        return b(str).i(new mhv(this, str, prlVar, 13, (char[]) null), this.g).h(new ndd(this, 14), this.g);
    }

    public final akul d(String str, String str2) {
        return aktp.ai(new mzn(str2, str, 11, null), this.g).i(new mhv(this, str, str2, 14), this.h).f(Throwable.class, new pri(str2, str, 2), this.g);
    }

    public final akul e(akul akulVar, final prl prlVar, Optional optional) {
        final String str = (String) optional.map(new prj(0)).orElseGet(new ngq(prlVar, 4));
        return akulVar.i(new ancs() { // from class: prg
            /* JADX WARN: Removed duplicated region for block: B:41:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x01da  */
            @Override // defpackage.ancs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 718
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.prg.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.g).f(Throwable.class, new pri(this, prlVar, 1), this.g).h(new mmq(this, prlVar, 8), this.h);
    }

    public final akul f(final prr prrVar, final prl prlVar) {
        return aktp.ai(new Callable() { // from class: prh
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0170, code lost:
            
                if (((java.lang.Boolean) ((defpackage.utz) defpackage.psc.a.get()).e()).booleanValue() != false) goto L59;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0155. Please report as an issue. */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 466
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.prh.call():java.lang.Object");
            }
        }, this.g);
    }

    public final akul g(prl prlVar) {
        this.p.b("Bugle.Rbm.BusinessInfo.BotMetadataDownloadLatency");
        return e(this.f.a(prlVar.a, true), prlVar, Optional.empty());
    }
}
