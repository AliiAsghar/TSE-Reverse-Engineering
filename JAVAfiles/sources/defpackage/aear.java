package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aear implements aeal {
    private final aeag a;
    private final aegu b;
    private final aedw c;
    private final arst d;
    private final aday e;

    public aear(aday adayVar, aeag aeagVar, aegu aeguVar, aedw aedwVar) {
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

    static /* synthetic */ kkc g(aecj aecjVar, aecm aecmVar, gsi gsiVar, boolean z, long j, int i) {
        boolean z2;
        Class cls;
        int i2 = 1;
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z & z2;
        if (z3) {
            cls = PersephoneDownloadWorker.class;
        } else {
            cls = PersephoneSchedulerWorker.class;
        }
        gsz gszVar = new gsz(cls);
        gszVar.i(gsiVar);
        if (!z3) {
            gszVar.c(aeam.c("moirai_persephone_scheduled_sync", aecjVar));
        }
        gsd gsdVar = new gsd();
        gsdVar.a = aecmVar.d;
        int R = a.R(aecmVar.c);
        if (R != 0) {
            i2 = R;
        }
        if ((i & 16) != 0) {
            j = 0;
        }
        gsdVar.c(aeam.d(i2));
        gsdVar.b = aecmVar.e;
        gszVar.f(gsdVar.a());
        gszVar.g(j, TimeUnit.MILLISECONDS);
        gszVar.d(TimeUnit.DAYS);
        return gszVar.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r4.ab(r2, r6, r7, true, r9) != r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.aeal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.aecj r18, defpackage.arpe r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.aeao
            if (r3 == 0) goto L19
            r3 = r2
            aeao r3 = (defpackage.aeao) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            aeao r3 = new aeao
            r3.<init>(r0, r2)
        L1e:
            r9 = r3
            java.lang.Object r2 = r9.a
            arpl r3 = defpackage.arpl.a
            int r4 = r9.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            defpackage.aqil.P(r2)
            goto L8b
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            aecj r1 = r9.e
            aear r4 = r9.d
            defpackage.aqil.P(r2)
            goto L51
        L41:
            defpackage.aqil.P(r2)
            r9.d = r0
            r9.e = r1
            r9.c = r6
            java.lang.Object r2 = r0.f(r1, r9)
            if (r2 == r3) goto L8e
            r4 = r0
        L51:
            r10 = r1
            gsi r12 = defpackage.aeam.a(r10)
            aeag r1 = r4.a
            java.lang.String r2 = r10.b
            aecq r1 = r1.b(r2)
            aday r4 = r4.e
            java.lang.String r2 = "moirai_persephone_sync"
            java.lang.String r2 = defpackage.aeam.c(r2, r10)
            aecm r1 = r1.c
            if (r1 != 0) goto L6c
            aecm r1 = defpackage.aecm.a
        L6c:
            r11 = r1
            r11.getClass()
            r14 = 0
            r16 = 16
            r13 = 1
            kkc r6 = g(r10, r11, r12, r13, r14, r16)
            gso r7 = defpackage.gso.REPLACE
            r1 = 0
            r9.d = r1
            r9.e = r1
            r9.c = r5
            r8 = 1
            r5 = r2
            java.lang.Object r1 = r4.ab(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L8b
            goto L8e
        L8b:
            arnb r1 = defpackage.arnb.a
            return r1
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aear.a(aecj, arpe):java.lang.Object");
    }

    @Override // defpackage.aeal
    public final Object b(aecj aecjVar, arpe arpeVar) {
        gsz gszVar = new gsz(PersephoneDownloadWorker.class);
        gszVar.i(aeam.a(aecjVar));
        gszVar.d(TimeUnit.DAYS);
        Object ab = this.e.ab(aeam.c("moirai_persephone_sync", aecjVar), gszVar.j(), gso.KEEP, false, arpeVar);
        if (ab == arpl.a) {
            return ab;
        }
        return arnb.a;
    }

    @Override // defpackage.aeal
    public final Object c(aecj aecjVar, arpe arpeVar) {
        Object e = e(aecjVar, arpeVar);
        if (e == arpl.a) {
            return e;
        }
        return arnb.a;
    }

    @Override // defpackage.aeal
    public final Object d(aecj aecjVar, arpe arpeVar) {
        Object f = f(aecjVar, arpeVar);
        if (f == arpl.a) {
            return f;
        }
        return arnb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d2 -> B:18:0x00dd). Please report as a decompilation issue!!! */
    @Override // defpackage.aeal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.aecj r23, defpackage.arpe r24) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aear.e(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (((defpackage.gtm) r9.b).a(r8) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r9.H(r5) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.aecj r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aeap
            if (r0 == 0) goto L13
            r0 = r9
            aeap r0 = (defpackage.aeap) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aeap r0 = new aeap
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "moirai_persephone_scheduled_sync"
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.aqil.P(r9)
            goto L83
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            aecj r8 = r0.e
            aear r2 = r0.d
            defpackage.aqil.P(r9)
            goto L6b
        L3f:
            aecj r8 = r0.e
            aear r2 = r0.d
            defpackage.aqil.P(r9)
            goto L59
        L47:
            defpackage.aqil.P(r9)
            aday r9 = r7.e
            r0.d = r7
            r0.e = r8
            r0.c = r5
            java.lang.Object r9 = r9.H(r6)
            if (r9 == r1) goto L86
            r2 = r7
        L59:
            aday r9 = r2.e
            java.lang.String r5 = defpackage.aeam.c(r6, r8)
            r0.d = r2
            r0.e = r8
            r0.c = r4
            java.lang.Object r9 = r9.H(r5)
            if (r9 == r1) goto L86
        L6b:
            aday r9 = r2.e
            java.lang.String r8 = defpackage.aeam.c(r6, r8)
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r9 = r9.b
            gtm r9 = (defpackage.gtm) r9
            gtd r8 = r9.a(r8)
            if (r8 != r1) goto L83
            goto L86
        L83:
            arnb r8 = defpackage.arnb.a
            return r8
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aear.f(aecj, arpe):java.lang.Object");
    }
}
