package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arii extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ aqvr d;
    final /* synthetic */ arzj e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arii(AtomicBoolean atomicBoolean, aqvr aqvrVar, arzj arzjVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = atomicBoolean;
        this.d = aqvrVar;
        this.e = arzjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((arii) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:6:0x000f, B:8:0x0068, B:9:0x0039, B:12:0x004b, B:14:0x0053, B:23:0x001a, B:27:0x0033), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0065 -> B:7:0x0012). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L14
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.f
            asaj r3 = (defpackage.asaj) r3
            defpackage.aqil.P(r7)     // Catch: java.lang.Exception -> L6e
        L12:
            r7 = r3
            goto L68
        L14:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.f
            asaj r3 = (defpackage.asaj) r3
            defpackage.aqil.P(r7)     // Catch: java.lang.Exception -> L6e
            goto L4b
        L1e:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.f
            asaj r7 = (defpackage.asaj) r7
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.c
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L85
            aqvr r1 = r6.d
            r1.d(r2)
            arzj r1 = r6.e     // Catch: java.lang.Exception -> L6e
            aryz r1 = r1.B()     // Catch: java.lang.Exception -> L6e
        L39:
            r6.f = r7     // Catch: java.lang.Exception -> L6e
            r6.a = r1     // Catch: java.lang.Exception -> L6e
            r6.b = r2     // Catch: java.lang.Exception -> L6e
            r3 = r1
            aryz r3 = (defpackage.aryz) r3     // Catch: java.lang.Exception -> L6e
            java.lang.Object r3 = r3.a(r6)     // Catch: java.lang.Exception -> L6e
            if (r3 == r0) goto L73
            r5 = r3
            r3 = r7
            r7 = r5
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L6e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L6e
            if (r7 == 0) goto L70
            r7 = r1
            aryz r7 = (defpackage.aryz) r7     // Catch: java.lang.Exception -> L6e
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Exception -> L6e
            r6.f = r3     // Catch: java.lang.Exception -> L6e
            r6.a = r1     // Catch: java.lang.Exception -> L6e
            r4 = 2
            r6.b = r4     // Catch: java.lang.Exception -> L6e
            java.lang.Object r7 = r3.fv(r7, r6)     // Catch: java.lang.Exception -> L6e
            if (r7 != r0) goto L12
            return r0
        L68:
            aqvr r3 = r6.d     // Catch: java.lang.Exception -> L6e
            r3.d(r2)     // Catch: java.lang.Exception -> L6e
            goto L39
        L6e:
            r7 = move-exception
            goto L74
        L70:
            arnb r7 = defpackage.arnb.a
            return r7
        L73:
            return r0
        L74:
            arzj r0 = r6.e
            java.lang.String r1 = "Exception thrown while collecting requests"
            java.util.concurrent.CancellationException r1 = defpackage.arsd.ao(r1, r7)
            r0.v(r1)
            aqvr r0 = r6.d
            r0.d(r2)
            throw r7
        L85:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "requests flow can only be collected once"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arii.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        arii ariiVar = new arii(this.c, this.d, this.e, arpeVar);
        ariiVar.f = obj;
        return ariiVar;
    }
}
