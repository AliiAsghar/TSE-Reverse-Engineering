package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uoz implements uov {
    public static final utz a = uuh.b("force_scheduler_v2_for_tests", false);
    private static final xze f = xze.g("BugleWorkQueue", "WorkQueueMigrationLatchImpl");
    public final armf b;
    public final armf c;
    public final arwe d;
    public final arwe e;
    private final arml g;
    private final arml h;

    public uoz(armf armfVar, armf armfVar2, arwe arweVar, arwe arweVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = arweVar;
        this.e = arweVar2;
        this.g = armd.a(new qtq(this, 18));
        this.h = armd.a(new qtq(this, 17));
    }

    private final ascv i() {
        return (ascv) this.h.a();
    }

    @Override // defpackage.uov
    public final uou a(String str) {
        str.getClass();
        if (((Boolean) a.e()).booleanValue()) {
            return uou.b;
        }
        Map map = (Map) i().c();
        if (map == null) {
            return null;
        }
        return (uou) map.get(str);
    }

    @Override // defpackage.uov
    public final uou b(String str) {
        if (!((Boolean) a.e()).booleanValue()) {
            armf armfVar = (armf) ((Map) this.b.b()).get(str);
            if (armfVar == null) {
                armfVar = h(str);
            }
            if (((unx) armfVar.b()).a().k) {
                if (!((upc) e().l()).b.contains(str)) {
                    if (!upb.d(str)) {
                        xyo c = f.c();
                        c.H("Migrated to Scheduler V2 in transaction");
                        c.z("handlerKey", str);
                        c.q();
                        return uou.b;
                    }
                }
            }
            return uou.a;
        }
        return uou.b;
    }

    @Override // defpackage.uov
    public final akul c(uou uouVar) {
        akul c;
        uouVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new tyi(this, uouVar, (arpe) null, 10));
        return c;
    }

    @Override // defpackage.uov
    public final Object d(String str, arpe arpeVar) {
        return arro.q(this.d.b(), new tyi(this, str, (arpe) null, 12), arpeVar);
    }

    public final wul e() {
        return (wul) this.g.a();
    }

    public final Object f(arpe arpeVar) {
        return arrn.U(new lhh(i(), 8), arpeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (defpackage.arrn.V(r9, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.uoy
            if (r0 == 0) goto L13
            r0 = r9
            uoy r0 = (defpackage.uoy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            uoy r0 = new uoy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            java.lang.String r3 = "handlerKey"
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r5) goto L30
            java.lang.Object r8 = r0.a
            java.lang.String r8 = (java.lang.String) r8
            defpackage.aqil.P(r9)
            goto L85
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.String r8 = r0.e
            java.lang.Object r2 = r0.a
            uoz r2 = (defpackage.uoz) r2
            defpackage.aqil.P(r9)
            goto L5d
        L42:
            defpackage.aqil.P(r9)
            wul r9 = r7.e()
            qin r2 = new qin
            r6 = 19
            r2.<init>(r8, r6)
            r0.a = r7
            r0.e = r8
            r0.d = r4
            java.lang.Object r9 = r9.d(r2, r0)
            if (r9 == r1) goto L99
            r2 = r7
        L5d:
            xze r9 = defpackage.uoz.f
            xyo r9 = r9.c()
            java.lang.String r4 = "Migrated to Scheduler V2. Waiting for sync"
            r9.H(r4)
            r9.z(r3, r8)
            r9.q()
            ascv r9 = r2.i()
            qkj r2 = new qkj
            r4 = 0
            r2.<init>(r8, r4, r5)
            r0.a = r8
            r0.e = r4
            r0.d = r5
            java.lang.Object r9 = defpackage.arrn.V(r9, r2, r0)
            if (r9 != r1) goto L85
            goto L99
        L85:
            xze r9 = defpackage.uoz.f
            xyo r9 = r9.d()
            java.lang.String r0 = "Migration synced"
            r9.H(r0)
            r9.z(r3, r8)
            r9.q()
            arnb r8 = defpackage.arnb.a
            return r8
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoz.g(java.lang.String, arpe):java.lang.Object");
    }

    public final armf h(String str) {
        armf armfVar = (armf) ((Map) this.b.b()).get("__UNHANDLED_HANDLER");
        if (armfVar != null) {
            return armfVar;
        }
        throw new IllegalArgumentException("Invalid handler key and no unhandled handler: ".concat(str));
    }
}
