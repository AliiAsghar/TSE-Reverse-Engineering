package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usz {
    public static final xze a = xze.g("BugleWorkQueue", "WorkQueueWorkerV2");
    public final xnv b;
    public final uqo c;
    public final uvi d;
    public final armf e;
    public final uof f;
    public final uie g;
    private final uop h;
    private final uqg i;
    private final arwe j;

    public usz(uie uieVar, xnv xnvVar, uof uofVar, uop uopVar, uqo uqoVar, uvi uviVar, uqg uqgVar, armf armfVar, arwe arweVar) {
        uieVar.getClass();
        xnvVar.getClass();
        uofVar.getClass();
        uopVar.getClass();
        uqoVar.getClass();
        uviVar.getClass();
        uqgVar.getClass();
        armfVar.getClass();
        arweVar.getClass();
        this.g = uieVar;
        this.b = xnvVar;
        this.f = uofVar;
        this.h = uopVar;
        this.c = uqoVar;
        this.d = uviVar;
        this.i = uqgVar;
        this.e = armfVar;
        this.j = arweVar;
    }

    public static final void e(List list) {
        upw upwVar = new upw();
        upwVar.f("WorkQueueTikTokWorker#deleteItems");
        upwVar.b(new uol(list, 20));
        upwVar.d();
    }

    public static /* synthetic */ void f(List list, uqa uqaVar) {
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((upr) it.next()).k()));
        }
        uqaVar.c(arrayList);
    }

    public static final void g(xzx xzxVar, uss ussVar) {
        xzxVar.z("queue", ussVar.b);
        xzxVar.x("items", ussVar.c.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r0v10, types: [asai, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0114 -> B:11:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r18, defpackage.use r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usz.a(java.lang.String, use, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r11, defpackage.arwl r12, java.lang.Runnable r13, defpackage.arpe r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.usw
            if (r0 == 0) goto L13
            r0 = r14
            usw r0 = (defpackage.usw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            usw r0 = new usw
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r14)
            goto L52
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.aqil.P(r14)
            uie r14 = r10.g
            rka r2 = new rka
            r9 = 9
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r11 = "WorkQueueTikTokWorker::maybeScheduleNextWorkForQueue"
            akul r11 = r14.c(r11, r2)
            r11.getClass()
            r0.c = r3
            java.lang.Object r14 = defpackage.arro.F(r11, r0)
            if (r14 != r1) goto L52
            return r1
        L52:
            r14.getClass()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usz.b(java.lang.String, arwl, java.lang.Runnable, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r14, defpackage.arpe r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usz.c(java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0 A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #4 {all -> 0x011b, blocks: (B:18:0x00ba, B:21:0x00c0), top: B:17:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[Catch: all -> 0x0119, TryCatch #3 {all -> 0x0119, blocks: (B:23:0x00de, B:28:0x00e8, B:31:0x010d), top: B:19:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [usz] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [usz] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r19, defpackage.use r20, defpackage.arwl r21, java.lang.Runnable r22, defpackage.arpe r23) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usz.d(java.lang.String, use, arwl, java.lang.Runnable, arpe):java.lang.Object");
    }
}
