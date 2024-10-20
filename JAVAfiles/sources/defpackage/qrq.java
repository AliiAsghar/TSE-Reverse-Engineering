package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrq implements xzh {
    private final qro a;
    private final armf b;
    private final ozl c;
    private final LruCache d;

    public qrq(qro qroVar, armf armfVar, ozl ozlVar) {
        armfVar.getClass();
        this.a = qroVar;
        this.b = armfVar;
        this.c = ozlVar;
        this.d = new LruCache(qroVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, defpackage.arqv r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.qrp
            if (r0 == 0) goto L13
            r0 = r7
            qrp r0 = (defpackage.qrp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qrp r0 = new qrp
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qrq r5 = r0.e
            java.lang.Object r6 = r0.a
            defpackage.aqil.P(r7)
            goto L5f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r7)
            r5.getClass()
            armf r7 = r4.b
            java.lang.Object r7 = r7.b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L49
            r7 = 0
            goto L4f
        L49:
            android.util.LruCache r7 = r4.d
            java.lang.Object r7 = r7.get(r5)
        L4f:
            if (r7 != 0) goto L77
            r0.a = r5
            r0.e = r4
            r0.d = r3
            java.lang.Object r7 = r6.a(r5, r0)
            if (r7 == r1) goto L76
            r6 = r5
            r5 = r4
        L5f:
            android.util.LruCache r0 = r5.d
            monitor-enter(r0)
            android.util.LruCache r1 = r5.d     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L6c
            monitor-exit(r0)
            return r1
        L6c:
            android.util.LruCache r5 = r5.d     // Catch: java.lang.Throwable -> L73
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r0)
            goto L77
        L73:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L76:
            return r1
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrq.a(java.lang.Object, arqv, arpe):java.lang.Object");
    }

    public final void b(Object obj, Object obj2) {
        obj2.getClass();
        if (((Boolean) this.b.b()).booleanValue()) {
            return;
        }
        this.d.put(obj, obj2);
    }

    public final void c(Object obj) {
        obj.getClass();
        this.d.remove(obj);
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        if (((ansy) ((ozh) this.c).a.b()).e("bugle.enable_destination_cache_memory_reclaimer_delegate") && i >= 40 && !((Boolean) this.b.b()).booleanValue()) {
            this.d.evictAll();
        }
    }
}
