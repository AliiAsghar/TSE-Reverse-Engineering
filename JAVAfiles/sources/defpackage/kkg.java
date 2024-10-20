package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public kkg(apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.c = apwtVar;
        this.b = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.a = armfVar4;
    }

    public static /* synthetic */ Map a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uvm uvmVar = (uvm) it.next();
            hashMap.put(uvmVar.a, uvmVar.b);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul b() {
        boolean z;
        long incrementAndGet = ((AtomicLong) this.c).incrementAndGet();
        int i = 1;
        if (incrementAndGet != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        return akul.g(((ahmn) this.b).k(new ajzj(this, incrementAndGet, i), this.d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r3v10, types: [qha] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.rve r18, defpackage.ajrt r19, defpackage.qei r20, defpackage.aoia r21, defpackage.qft r22, defpackage.apwq r23, boolean r24, defpackage.arpe r25) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkg.c(rve, ajrt, qei, aoia, qft, apwq, boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0157, code lost:
    
        if (r2 != r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c3, code lost:
    
        if (r2 == r4) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v33, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qfo r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkg.d(qfo, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final qap e(Duration duration, unx unxVar) {
        anen anenVar = (anen) this.e.b();
        anenVar.getClass();
        Optional optional = (Optional) ((apxx) this.c).a;
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        duration.getClass();
        return new qap(anenVar, (armf) this.d, optional, xnvVar, (armf) this.a, duration, unxVar, 1);
    }

    public kkg(ksv ksvVar, kst kstVar, armf armfVar, ksv ksvVar2, kss kssVar) {
        this.d = ksvVar;
        this.b = kstVar;
        this.e = armfVar;
        this.a = ksvVar2;
        this.c = kssVar;
    }

    public kkg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
    }

    public kkg(arwe arweVar, aiwu aiwuVar, xnv xnvVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        aiwuVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.d = arweVar;
        this.c = aiwuVar;
        this.b = xnvVar;
        this.e = armfVar;
        this.a = armfVar2;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ascv, java.lang.Object] */
    public kkg(arwe arweVar, khl khlVar, armf armfVar, armf armfVar2, jxv jxvVar, kke kkeVar, mgu mguVar, iji ijiVar) {
        arweVar.getClass();
        khlVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        ijiVar.getClass();
        this.a = arweVar;
        this.b = khlVar;
        this.c = armfVar;
        this.e = armfVar2;
        asai a = qkf.a(ijiVar.c, "EffectIsRunning");
        ascv b = qkf.b(mguVar.b, "BackBehavior");
        asai asaiVar = kkeVar.m;
        long j = arut.a;
        Object b2 = armfVar2.b();
        b2.getClass();
        asai a2 = qkf.a(qkq.a(asaiVar, arsd.p(((Number) b2).longValue(), aruv.c), 0, new jcx((arpe) null, 4, (int[]) null)), "MiddleUiAdapter");
        asai a3 = qkf.a(jxvVar.a, "ActionsUiAdapter");
        Object b3 = armfVar.b();
        b3.getClass();
        asai c = qkq.c(a, b, a2, a3, arweVar, arsd.p(((Number) b3).longValue(), aruv.c), new kkf(this, (arpe) null, 0));
        int i = ascp.a;
        this.d = arrn.T(c, arweVar, asco.a(0L, 3), null);
    }

    public kkg(qdc qdcVar, hmk hmkVar, prk prkVar, arwe arweVar) {
        qdcVar.getClass();
        prkVar.getClass();
        arweVar.getClass();
        this.a = qdcVar;
        this.b = hmkVar;
        this.e = prkVar;
        this.c = arweVar;
        this.d = alvi.m("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingRbmMessageProcessor");
    }

    public kkg(ajsd ajsdVar, wxz wxzVar, qha qhaVar, qha qhaVar2, pvw pvwVar, yyb yybVar) {
        wxzVar.getClass();
        pvwVar.getClass();
        yybVar.getClass();
        this.a = ajsdVar;
        this.c = wxzVar;
        this.e = qhaVar;
        this.d = qhaVar2;
        this.b = pvwVar;
    }

    public kkg(ancr ancrVar, Executor executor) {
        this.e = ancrVar;
        this.d = executor;
        this.b = new ahmn((short[]) null);
        this.c = new AtomicLong(Long.MIN_VALUE);
        this.a = new AtomicLong(Long.MIN_VALUE);
    }
}
