package com.google.android.libraries.abuse.hades.moirai.download;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.aeal;
import defpackage.alvi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PersephoneSchedulerWorker extends CoroutineWorker {
    private static final alvi e = alvi.m("com/google/android/libraries/abuse/hades/moirai/download/PersephoneSchedulerWorker");
    private final aeal f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersephoneSchedulerWorker(Context context, WorkerParameters workerParameters, aeal aealVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        aealVar.getClass();
        this.f = aealVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aeaz
            if (r0 == 0) goto L13
            r0 = r5
            aeaz r0 = (defpackage.aeaz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aeaz r0 = new aeaz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L69
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            gsi r5 = r4.f()
            r5.getClass()
            aecj r5 = defpackage.aeam.b(r5)
            if (r5 != 0) goto L5e
            alvi r5 = com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker.e
            alvw r5 = r5.i()
            java.lang.String r0 = "doWork"
            r1 = 26
            java.lang.String r2 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneSchedulerWorker"
            java.lang.String r3 = "PersephoneSchedulerWorker.kt"
            alvw r5 = r5.h(r2, r0, r1, r3)
            alvg r5 = (defpackage.alvg) r5
            java.lang.String r0 = "ClientId was not found in the input data."
            r5.q(r0)
            gsu r5 = new gsu
            r5.<init>()
            return r5
        L5e:
            aeal r2 = r4.f
            r0.c = r3
            java.lang.Object r5 = r2.b(r5, r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            gsw r5 = new gsw
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker.c(arpe):java.lang.Object");
    }
}
