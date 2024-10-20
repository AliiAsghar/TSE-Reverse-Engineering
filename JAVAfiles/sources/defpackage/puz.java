package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class puz implements puu {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer");
    private final puu b;
    private final armf c;
    private final anen d;
    private final vco e;

    public puz(puu puuVar, vco vcoVar, armf armfVar, anen anenVar) {
        this.b = puuVar;
        this.e = vcoVar;
        this.c = armfVar;
        this.d = anenVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    private final boolean c(qei qeiVar) {
        qeiVar.getClass();
        vco vcoVar = this.e;
        try {
            Object obj = vcoVar.b;
            String str = qeiVar.d;
            str.getClass();
            return ((adjc) vcoVar.a.b()).u(((adae) obj).d(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        alok alokVar = new alok();
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qei qeiVar = (qei) it.next();
            if ((qeiVar.b & 2) != 0 && !qeiVar.d.isEmpty()) {
                qeh b = qeh.b(qeiVar.c);
                if (b == null) {
                    b = qeh.UNKNOWN_TYPE;
                }
                if (b != qeh.GROUP) {
                    alobVar.h(qeiVar);
                }
            }
            alokVar.h(qeiVar, pto.d());
        }
        alor b2 = alokVar.b();
        alog g = alobVar.g();
        alvw d = a.d();
        d.X(alwp.a, "BugleRcsCapabilities");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer", "getBatchCapabilities", 79, "RcsCapabilitiesProviderPreconditionsLayer.java")).u("RcsCapabilitiesProviderPreconditionsLayer#getBatchCapabilities: Received %s invalid and %s valid ChatEndpoints", ((altc) b2).d, ((alsx) g).c);
        return this.b.a(g).h(new puy(b2, 0), this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (c(r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (c(r7) == false) goto L33;
     */
    @Override // defpackage.puu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul b(defpackage.qei r7) {
        /*
            r6 = this;
            armf r0 = r6.c
            java.lang.Object r0 = r0.b()
            oqm r0 = (defpackage.oqm) r0
            boolean r0 = r0.a()
            java.lang.String r1 = "getCapabilities"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer"
            java.lang.String r3 = "RcsCapabilitiesProviderPreconditionsLayer.java"
            java.lang.String r4 = "BugleRcsCapabilities"
            if (r0 == 0) goto L4f
            int r0 = r7.b
            r0 = r0 & 2
            if (r0 == 0) goto L9d
            java.lang.String r0 = r7.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            int r0 = r7.c
            qeh r0 = defpackage.qeh.b(r0)
            if (r0 != 0) goto L2e
            qeh r0 = defpackage.qeh.UNKNOWN_TYPE
        L2e:
            qeh r5 = defpackage.qeh.GROUP
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L9d
            int r0 = r7.c
            qeh r0 = defpackage.qeh.b(r0)
            if (r0 != 0) goto L40
            qeh r0 = defpackage.qeh.UNKNOWN_TYPE
        L40:
            qeh r5 = defpackage.qeh.PHONE
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 == 0) goto L76
            boolean r0 = r6.c(r7)
            if (r0 == 0) goto L76
            goto L9d
        L4f:
            int r0 = r7.c
            qeh r0 = defpackage.qeh.b(r0)
            if (r0 != 0) goto L59
            qeh r0 = defpackage.qeh.UNKNOWN_TYPE
        L59:
            qeh r5 = defpackage.qeh.PHONE
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 == 0) goto L9d
            int r0 = r7.b
            r0 = r0 & 2
            if (r0 == 0) goto L9d
            java.lang.String r0 = r7.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            boolean r0 = r6.c(r7)
            if (r0 == 0) goto L76
            goto L9d
        L76:
            alvi r0 = defpackage.puz.a
            alvw r0 = r0.d()
            alvz r5 = defpackage.alwp.a
            r0.X(r5, r4)
            alvg r0 = (defpackage.alvg) r0
            r4 = 58
            alvw r0 = r0.h(r2, r1, r4, r3)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r1 = r7.d
            java.lang.String r1 = defpackage.yyb.bh(r1)
            java.lang.String r2 = "RcsCapabilitiesProviderPreconditionsLayer: return downstreamProvider.getCapabilities for chatEndpoint %s"
            r0.t(r2, r1)
            puu r0 = r6.b
            akul r7 = r0.b(r7)
            return r7
        L9d:
            alvi r0 = defpackage.puz.a
            alvw r0 = r0.d()
            alvz r5 = defpackage.alwp.a
            r0.X(r5, r4)
            alvg r0 = (defpackage.alvg) r0
            r4 = 52
            alvw r0 = r0.h(r2, r1, r4, r3)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r7 = r7.d
            java.lang.String r7 = defpackage.yyb.bh(r7)
            java.lang.String r1 = "RcsCapabilitiesProviderPreconditionsLayer: return RcsCapabilitiesWithMetadata.empty for chatEndpoint %s"
            r0.t(r1, r7)
            pto r7 = defpackage.pto.d()
            akul r7 = defpackage.aktp.ag(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puz.b(qei):akul");
    }
}
