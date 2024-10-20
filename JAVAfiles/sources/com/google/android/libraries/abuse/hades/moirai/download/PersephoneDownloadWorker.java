package com.google.android.libraries.abuse.hades.moirai.download;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.adzm;
import defpackage.aead;
import defpackage.aeaf;
import defpackage.aeag;
import defpackage.aeak;
import defpackage.aeal;
import defpackage.aebc;
import defpackage.aebz;
import defpackage.aecj;
import defpackage.aedw;
import defpackage.aeec;
import defpackage.aegu;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.aozb;
import defpackage.aozy;
import defpackage.arnb;
import defpackage.arsd;
import defpackage.gsu;
import defpackage.gsv;
import defpackage.gvf;
import defpackage.iak;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PersephoneDownloadWorker extends CoroutineWorker {
    private static final alvi f = alvi.m("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker");
    public final Context e;
    private final aeec g;
    private final aebc h;
    private final aegu i;
    private final adzm j;
    private final aedw k;
    private final aeak l;
    private final aeaf m;
    private final aeal n;
    private final aebz o;
    private final aeag p;
    private final aead q;
    private final aozy r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersephoneDownloadWorker(Context context, WorkerParameters workerParameters, aeec aeecVar, aebc aebcVar, aegu aeguVar, adzm adzmVar, aedw aedwVar, aeak aeakVar, aeaf aeafVar, aeal aealVar, aebz aebzVar, aeag aeagVar, aead aeadVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        aeecVar.getClass();
        aebcVar.getClass();
        aeguVar.getClass();
        aedwVar.getClass();
        aeakVar.getClass();
        aeafVar.getClass();
        aealVar.getClass();
        aebzVar.getClass();
        aeagVar.getClass();
        this.e = context;
        this.g = aeecVar;
        this.h = aebcVar;
        this.i = aeguVar;
        this.j = adzmVar;
        this.k = aedwVar;
        this.l = aeakVar;
        this.m = aeafVar;
        this.n = aealVar;
        this.o = aebzVar;
        this.p = aeagVar;
        this.q = aeadVar;
        aozy createBuilder = iak.a.createBuilder();
        createBuilder.getClass();
        this.r = createBuilder;
    }

    static /* synthetic */ void m(PersephoneDownloadWorker persephoneDownloadWorker, aecj aecjVar, aozb aozbVar, int i) {
        persephoneDownloadWorker.o(aecjVar, aozbVar, i, 0);
    }

    private final Object n(aecj aecjVar) {
        aozb aozbVar = aozb.b;
        aozbVar.getClass();
        o(aecjVar, aozbVar, 4, 0);
        return arnb.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.aecj r4, defpackage.aozb r5, int r6, int r7) {
        /*
            r3 = this;
            aozy r0 = r3.r
            apag r1 = r0.b
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto Ld
            r0.u()
        Ld:
            apag r0 = r0.b
            iak r0 = (defpackage.iak) r0
            iak r1 = defpackage.iak.a
            int r6 = r6 + (-1)
            r0.c = r6
            int r6 = r0.b
            r1 = 1
            r6 = r6 | r1
            r0.b = r6
            if (r7 != 0) goto L20
            goto L2c
        L20:
            int r7 = r7 + (-2)
            if (r7 == 0) goto L4a
            r6 = 2
            if (r7 == r1) goto L49
            r1 = 3
            if (r7 == r6) goto L4a
            if (r7 == r1) goto L47
        L2c:
            alvi r6 = com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.f
            alvw r6 = r6.g()
            java.lang.String r7 = "addLog"
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r1 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker"
            java.lang.String r2 = "PersephoneDownloadWorker.kt"
            alvw r6 = r6.h(r1, r7, r0, r2)
            alvg r6 = (defpackage.alvg) r6
            java.lang.String r7 = "No download status to provide to protectionDownload"
            r6.q(r7)
            r1 = 0
            goto L4a
        L47:
            r1 = 4
            goto L4a
        L49:
            r1 = r6
        L4a:
            if (r1 == 0) goto L67
            aozy r6 = r3.r
            apag r7 = r6.b
            boolean r7 = r7.isMutable()
            if (r7 != 0) goto L59
            r6.u()
        L59:
            apag r6 = r6.b
            iak r6 = (defpackage.iak) r6
            int r1 = r1 + (-1)
            r6.f = r1
            int r7 = r6.b
            r7 = r7 | 8
            r6.b = r7
        L67:
            aebz r6 = r3.o
            java.lang.String r7 = r4.b
            aecd r6 = r6.a(r7)
            if (r6 == 0) goto L7f
            aozy r7 = r3.r
            apag r7 = r7.s()
            r7.getClass()
            iak r7 = (defpackage.iak) r7
            r6.a(r4, r5, r7)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.o(aecj, aozb, int, int):void");
    }

    private final gvf p(int i) {
        alvi alviVar = f;
        ((alvg) alviVar.g().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 205, "PersephoneDownloadWorker.kt")).r("Current retry count: %s", i);
        ((alvg) alviVar.g().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 206, "PersephoneDownloadWorker.kt")).r("Max download retry attempts: %s", Integer.MAX_VALUE);
        if (i < Integer.MAX_VALUE) {
            ((alvg) alviVar.i().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 209, "PersephoneDownloadWorker.kt")).q("Retrying.");
            return new gsv();
        }
        ((alvg) alviVar.i().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 214, "PersephoneDownloadWorker.kt")).q("Download worker reached max retry attempts. Abandoning download work.");
        return new gsu();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object c(defpackage.arpe r31) {
        /*
            Method dump skipped, instructions count: 1886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.aecj r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aeat
            if (r0 == 0) goto L13
            r0 = r8
            aeat r0 = (defpackage.aeat) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aeat r0 = new aeat
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.aqil.P(r8)
            goto L87
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.aqil.P(r8)
            aeag r8 = r6.p
            java.lang.String r2 = r7.b
            iap r8 = r8.a(r2)
            apax r8 = r8.b
            r8.getClass()
            r2 = 10
            int r2 = defpackage.aqjn.J(r8, r2)
            int r2 = defpackage.aqjn.i(r2)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 16
            int r2 = defpackage.arrn.r(r2, r5)
            r4.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L5a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r8.next()
            aoth r2 = (defpackage.aoth) r2
            java.lang.String r5 = r2.b
            r5.getClass()
            java.lang.String r2 = r2.c
            r4.put(r5, r2)
            goto L5a
        L71:
            aead r8 = r6.q
            if (r8 != 0) goto L76
            return r4
        L76:
            java.lang.String r7 = r7.b
            com.google.common.util.concurrent.ListenableFuture r7 = r8.a()
            r0.a = r4
            r0.d = r3
            java.lang.Object r8 = defpackage.arro.F(r7, r0)
            if (r8 == r1) goto L8e
            r7 = r4
        L87:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Map r7 = defpackage.aqjn.p(r7, r8)
            return r7
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.k(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.aebb r21, defpackage.arpe r22) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.l(aebb, arpe):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PersephoneDownloadWorker(Context context, WorkerParameters workerParameters, aeec aeecVar, aebc aebcVar, aegu aeguVar, Optional<adzm> optional, aedw aedwVar, aeak aeakVar, aeaf aeafVar, aeal aealVar, aebz aebzVar, aeag aeagVar, Optional<aead> optional2) {
        this(context, workerParameters, aeecVar, aebcVar, aeguVar, (adzm) arsd.k(optional), aedwVar, aeakVar, aeafVar, aealVar, aebzVar, aeagVar, (aead) arsd.k(optional2));
        context.getClass();
        workerParameters.getClass();
        aeecVar.getClass();
        aebcVar.getClass();
        aeguVar.getClass();
        optional.getClass();
        aedwVar.getClass();
        aeakVar.getClass();
        aeafVar.getClass();
        aealVar.getClass();
        aebzVar.getClass();
        aeagVar.getClass();
        optional2.getClass();
    }
}
