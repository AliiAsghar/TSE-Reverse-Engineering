package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aebi implements aeal {
    private final aeag a;
    private final aegu b;
    private final aedw c;
    private final arst d;
    private final aday e;

    public aebi(aday adayVar, aeag aeagVar, aegu aeguVar, aedw aedwVar) {
        aeguVar.getClass();
        aedwVar.getClass();
        arss arssVar = arst.a;
        arssVar.getClass();
        this.e = adayVar;
        this.a = aeagVar;
        this.b = aeguVar;
        this.c = aedwVar;
        this.d = arssVar;
    }

    private static final kkc h(aecm aecmVar, gsi gsiVar, long j) {
        gsz gszVar = new gsz(PersephoneDownloadWorker.class);
        gszVar.i(gsiVar);
        gsd gsdVar = new gsd();
        gsdVar.a = aecmVar.d;
        int R = a.R(aecmVar.c);
        if (R == 0) {
            R = 1;
        }
        gsdVar.c(aeam.d(R));
        gsdVar.b = aecmVar.e;
        gszVar.f(gsdVar.a());
        gszVar.g(j, TimeUnit.MILLISECONDS);
        gszVar.d(TimeUnit.DAYS);
        return gszVar.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r1.ab(r8, r3, r4, true, r6) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.aeal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.aecj r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aebe
            if (r0 == 0) goto L13
            r0 = r9
            aebe r0 = (defpackage.aebe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aebe r0 = new aebe
            r0.<init>(r7, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.aqil.P(r9)
            goto L80
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            aecj r8 = r6.e
            aebi r1 = r6.d
            defpackage.aqil.P(r9)
            goto L4b
        L3b:
            defpackage.aqil.P(r9)
            r6.d = r7
            r6.e = r8
            r6.c = r3
            java.lang.Object r9 = r7.f(r8, r6)
            if (r9 == r0) goto L83
            r1 = r7
        L4b:
            aeag r9 = r1.a
            java.lang.String r3 = r8.b
            aecq r9 = r9.b(r3)
            gsi r3 = defpackage.aeam.a(r8)
            aday r1 = r1.e
            java.lang.String r4 = "moirai_persephone_sync"
            java.lang.String r8 = defpackage.aeam.c(r4, r8)
            aecm r9 = r9.c
            if (r9 != 0) goto L65
            aecm r9 = defpackage.aecm.a
        L65:
            r9.getClass()
            r4 = 0
            kkc r3 = h(r9, r3, r4)
            gso r4 = defpackage.gso.REPLACE
            r9 = 0
            r6.d = r9
            r6.e = r9
            r6.c = r2
            r5 = 1
            r2 = r8
            java.lang.Object r8 = r1.ab(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L80
            goto L83
        L80:
            arnb r8 = defpackage.arnb.a
            return r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebi.a(aecj, arpe):java.lang.Object");
    }

    @Override // defpackage.aeal
    public final Object b(aecj aecjVar, arpe arpeVar) {
        return arnb.a;
    }

    @Override // defpackage.aeal
    public final Object c(aecj aecjVar, arpe arpeVar) {
        Object g = g(aecjVar, arpeVar);
        if (g == arpl.a) {
            return g;
        }
        return arnb.a;
    }

    @Override // defpackage.aeal
    public final Object d(aecj aecjVar, arpe arpeVar) {
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r2.g(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aeal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.aecj r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aebh
            if (r0 == 0) goto L13
            r0 = r7
            aebh r0 = (defpackage.aebh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aebh r0 = new aebh
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            aecj r6 = r0.e
            aebi r2 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L3a:
            defpackage.aqil.P(r7)
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = r5.f(r6, r0)
            if (r7 == r1) goto L5b
            r2 = r5
        L4a:
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.c = r3
            java.lang.Object r6 = r2.g(r6, r0)
            if (r6 != r1) goto L58
            goto L5b
        L58:
            arnb r6 = defpackage.arnb.a
            return r6
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebi.e(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8.H(r7) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.aecj r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aebf
            if (r0 == 0) goto L13
            r0 = r8
            aebf r0 = (defpackage.aebf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aebf r0 = new aebf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "moirai_persephone_scheduled_sync"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.aqil.P(r8)
            goto L62
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            aecj r7 = r0.e
            aebi r2 = r0.d
            defpackage.aqil.P(r8)
            goto L4e
        L3c:
            defpackage.aqil.P(r8)
            aday r8 = r6.e
            r0.d = r6
            r0.e = r7
            r0.c = r5
            java.lang.Object r8 = r8.H(r3)
            if (r8 == r1) goto L65
            r2 = r6
        L4e:
            aday r8 = r2.e
            java.lang.String r7 = defpackage.aeam.c(r3, r7)
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r4
            java.lang.Object r7 = r8.H(r7)
            if (r7 != r1) goto L62
            goto L65
        L62:
            arnb r7 = defpackage.arnb.a
            return r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebi.f(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e5, code lost:
    
        if (r6.ab(r1, r2, r7, false, r9) != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.aecj r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebi.g(aecj, arpe):java.lang.Object");
    }
}
