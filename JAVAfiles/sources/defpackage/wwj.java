package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wwj implements akcq {
    public static final alwo a = alwo.o("BugleSimStateTracker");
    public final wvm b;
    private final arwe c;
    private final arpi d;

    public wwj(arwe arweVar, arpi arpiVar, wvm wvmVar) {
        arweVar.getClass();
        arpiVar.getClass();
        wvmVar.getClass();
        this.c = arweVar;
        this.d = arpiVar;
        this.b = wvmVar;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        akul c;
        workerParameters.getClass();
        c = qjh.c(this.c, arpj.a, arwf.a, new wwh(this, workerParameters, (arpe) null, 0));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wwe
            if (r0 == 0) goto L13
            r0 = r5
            wwe r0 = (defpackage.wwe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wwe r0 = new wwe
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            wvm r5 = r4.b
            arwl r5 = r5.c()
            r0.c = r3
            java.lang.Object r5 = r5.n(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            gsw r5 = new gsw
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwj.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.gsi r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.wwf
            if (r0 == 0) goto L13
            r0 = r10
            wwf r0 = (defpackage.wwf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wwf r0 = new wwf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.aqil.P(r10)
            goto L97
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.aqil.P(r10)
            java.util.Map r9 = r9.b
            java.lang.String r10 = "unstable_subscription_id_list"
            java.lang.Object r9 = r9.get(r10)
            boolean r10 = r9 instanceof java.lang.Object[]
            r2 = 0
            r4 = 0
            if (r10 == 0) goto L66
            r10 = r9
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            boolean r5 = r10 instanceof java.lang.Object[]
            if (r5 == 0) goto L66
            int r10 = r10.length
            gsh r5 = new gsh
            r5.<init>(r9, r3)
            int[] r9 = new int[r10]
            r6 = r2
        L51:
            if (r6 >= r10) goto L67
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.a(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r9[r6] = r7
            int r6 = r6 + 1
            goto L51
        L66:
            r9 = r4
        L67:
            if (r9 == 0) goto L7f
            java.util.ArrayList r4 = new java.util.ArrayList
            int r10 = r9.length
            r4.<init>(r10)
        L6f:
            int r10 = r9.length
            if (r2 >= r10) goto L7f
            r10 = r9[r2]
            adix r5 = new adix
            r5.<init>(r10)
            r4.add(r5)
            int r2 = r2 + 1
            goto L6f
        L7f:
            if (r4 == 0) goto L9d
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L88
            goto L9d
        L88:
            wvm r9 = r8.b
            arwl r9 = r9.b(r4)
            r0.c = r3
            java.lang.Object r9 = r9.n(r0)
            if (r9 != r1) goto L97
            return r1
        L97:
            gsw r9 = new gsw
            r9.<init>()
            return r9
        L9d:
            alwo r9 = defpackage.wwj.a
            alvw r9 = r9.m()
            java.lang.String r10 = "No unstable subscription Ids provided."
            r9.q(r10)
            gsu r9 = new gsu
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwj.d(gsi, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wwg
            if (r0 == 0) goto L13
            r0 = r7
            wwg r0 = (defpackage.wwg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wwg r0 = new wwg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            arpi r7 = r6.d
            vck r2 = new vck
            r4 = 0
            r5 = 18
            r2.<init>(r6, r4, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwj.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[Catch: IllegalArgumentException -> 0x00cf, TryCatch #0 {IllegalArgumentException -> 0x00cf, blocks: (B:12:0x0029, B:13:0x00b3, B:18:0x0036, B:19:0x00bf, B:21:0x003b, B:22:0x00cb, B:29:0x0061, B:43:0x00a6, B:46:0x00ab, B:49:0x00b7, B:52:0x00c3, B:55:0x009d, B:56:0x00a2), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(androidx.work.WorkerParameters r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwj.f(androidx.work.WorkerParameters, arpe):java.lang.Object");
    }
}
