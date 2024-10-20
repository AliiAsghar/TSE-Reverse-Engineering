package defpackage;

import j$.time.Instant;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmh implements xkt {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer");
    public final xma b;
    public final arwe c;
    public final arwe d;
    public final AtomicReference e;
    public final zxy f;
    private final Set g;
    private final mbl h;
    private final vyv i;

    public xmh(xma xmaVar, zxy zxyVar, Set set, vyv vyvVar, mbl mblVar, arwe arweVar, arwe arweVar2) {
        xmaVar.getClass();
        zxyVar.getClass();
        mblVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.b = xmaVar;
        this.f = zxyVar;
        this.g = set;
        this.i = vyvVar;
        this.h = mblVar;
        this.c = arweVar;
        this.d = arweVar2;
        this.e = new AtomicReference(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        if (defpackage.arro.F(r9, r0) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        if (r11.a(r9, r10, r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v4, types: [armf, java.lang.Object] */
    @Override // defpackage.xkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.xlb r9, defpackage.amvm r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmh.a(xlb, amvm, arpe):java.lang.Object");
    }

    @Override // defpackage.xkt
    public final void b(Instant instant) {
        this.b.b(instant);
    }

    @Override // defpackage.xkt
    public final boolean c() {
        return this.b.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
    
        if (r11.n(r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r2.g(r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r12 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.xkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(final defpackage.xkf r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmh.d(xkf, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.xmd
            if (r0 == 0) goto L13
            r0 = r10
            xmd r0 = (defpackage.xmd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xmd r0 = new xmd
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r10)
            goto L6b
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2f:
            defpackage.aqil.P(r10)
            java.util.Set r10 = r9.g
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.aqjn.J(r10, r4)
            r2.<init>(r4)
            altx r10 = (defpackage.altx) r10
            aluq r10 = r10.listIterator()
        L45:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r10.next()
            xhd r4 = (defpackage.xhd) r4
            arwe r5 = r9.d
            xjs r6 = new xjs
            r7 = 4
            r8 = 0
            r6.<init>(r4, r8, r7)
            r4 = 3
            arwl r4 = defpackage.arrn.I(r5, r8, r8, r6, r4)
            r2.add(r4)
            goto L45
        L63:
            r0.c = r3
            java.lang.Object r10 = defpackage.arrj.j(r2, r0)
            if (r10 == r1) goto L98
        L6b:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L7d
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7d
        L7b:
            r3 = r1
            goto L93
        L7d:
            java.util.Iterator r10 = r10.iterator()
        L81:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r10.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
        L93:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmh.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.xme
            if (r0 == 0) goto L13
            r0 = r9
            xme r0 = (defpackage.xme) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xme r0 = new xme
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "pause"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer"
            java.lang.String r5 = "PausingForwardSyncWorkOrganizer.kt"
            java.lang.String r6 = "BugleTelephony"
            r7 = 1
            if (r2 == 0) goto L39
            if (r2 != r7) goto L31
            xmh r0 = r0.d
            defpackage.aqil.P(r9)
            goto L61
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            defpackage.aqil.P(r9)
            alvi r9 = defpackage.xmh.a
            alvw r9 = r9.g()
            alvz r2 = defpackage.alwp.a
            r9.X(r2, r6)
            r2 = 56
            alvw r9 = r9.h(r4, r3, r2, r5)
            alvg r9 = (defpackage.alvg) r9
            java.lang.String r2 = "Pausing forward sync"
            r9.q(r2)
            zxy r9 = r8.f
            r0.d = r8
            r0.c = r7
            java.lang.Object r9 = r9.D(r7, r0)
            if (r9 == r1) goto L9c
            r0 = r8
        L61:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L84
            alvi r9 = defpackage.xmh.a
            alvw r9 = r9.g()
            alvz r0 = defpackage.alwp.a
            r9.X(r0, r6)
            r0 = 58
            alvw r9 = r9.h(r4, r3, r0, r5)
            alvg r9 = (defpackage.alvg) r9
            java.lang.String r0 = "Sync already paused"
            r9.q(r0)
            arnb r9 = defpackage.arnb.a
            return r9
        L84:
            mbl r9 = r0.h
            java.lang.String r1 = "Bugle.Telephony.ForwardSync.Paused"
            r9.c(r1)
            java.util.concurrent.atomic.AtomicReference r9 = r0.e
            r0 = 0
            java.lang.Object r9 = r9.getAndSet(r0)
            arwl r9 = (defpackage.arwl) r9
            if (r9 == 0) goto L99
            defpackage.arsd.am(r9)
        L99:
            arnb r9 = defpackage.arnb.a
            return r9
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmh.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r2.f(r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmh.g(arpe):java.lang.Object");
    }
}
