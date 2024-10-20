package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcs extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    Object a;
    Object b;
    int c;
    final /* synthetic */ arzj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcs(arzj arzjVar, arpe arpeVar) {
        super(2, arpeVar);
        this.d = arzjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dcs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:5:0x000a, B:6:0x002b, B:8:0x0033, B:9:0x001a, B:17:0x0015), top: B:2:0x0004 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:6:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r4.c
            if (r1 == 0) goto L10
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.aqil.P(r5)     // Catch: java.lang.Throwable -> Le
            goto L2b
        Le:
            r5 = move-exception
            goto L4d
        L10:
            defpackage.aqil.P(r5)
            arzj r2 = r4.d
            aryz r5 = r2.B()     // Catch: java.lang.Throwable -> Le
            r1 = r5
        L1a:
            r4.a = r2     // Catch: java.lang.Throwable -> Le
            r4.b = r1     // Catch: java.lang.Throwable -> Le
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> Le
            r5 = r1
            aryz r5 = (defpackage.aryz) r5     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Throwable -> Le
            if (r5 != r0) goto L2b
            return r0
        L2b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Le
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r5 == 0) goto L46
            r5 = r1
            aryz r5 = (defpackage.aryz) r5     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Le
            arnb r5 = (defpackage.arnb) r5     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.dcu.b     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> Le
            ces.a.g()     // Catch: java.lang.Throwable -> Le
            goto L1a
        L46:
            r5 = 0
            defpackage.arhi.r(r2, r5)
            arnb r5 = defpackage.arnb.a
            return r5
        L4d:
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            defpackage.arhi.r(r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new dcs(this.d, arpeVar);
    }
}
