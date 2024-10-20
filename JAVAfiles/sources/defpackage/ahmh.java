package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmh extends ahmj {
    public static final ahmh a = new ahmh();

    private ahmh() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // defpackage.ahmj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.apbt a(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            android.os.health.HealthStats r6 = defpackage.d$$ExternalSyntheticApiModelOutline0.m317m(r6)
            ashi r0 = defpackage.ashi.a
            aozy r0 = r0.createBuilder()
            ahmk r1 = defpackage.ahmk.a
            r2 = 40001(0x9c41, float:5.6053E-41)
            java.util.Map r2 = defpackage.ahmc.m(r6, r2)
            java.util.List r1 = r1.d(r2)
            r0.bQ(r1)
            ahmg r1 = defpackage.ahmg.a
            if (r6 == 0) goto L2c
            r2 = 40002(0x9c42, float:5.6055E-41)
            boolean r3 = defpackage.d$$ExternalSyntheticApiModelOutline0.m$4(r6, r2)
            if (r3 == 0) goto L2c
            java.util.Map r6 = defpackage.d$$ExternalSyntheticApiModelOutline0.m$2(r6, r2)
            goto L30
        L2c:
            java.util.Map r6 = java.util.Collections.emptyMap()
        L30:
            java.util.List r6 = r1.d(r6)
            r0.bR(r6)
            if (r5 == 0) goto L57
            ashh r5 = defpackage.ahmc.n(r5)
            apag r6 = r0.b
            boolean r6 = r6.isMutable()
            if (r6 != 0) goto L48
            r0.u()
        L48:
            apag r6 = r0.b
            ashi r6 = (defpackage.ashi) r6
            r5.getClass()
            r6.e = r5
            int r5 = r6.b
            r5 = r5 | 1
            r6.b = r5
        L57:
            apag r5 = r0.s()
            ashi r5 = (defpackage.ashi) r5
            boolean r6 = defpackage.ahmc.s(r5)
            if (r6 == 0) goto L64
            r5 = 0
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmh.a(java.lang.String, java.lang.Object):apbt");
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt b(apbt apbtVar, apbt apbtVar2) {
        ashi ashiVar = (ashi) apbtVar;
        ashi ashiVar2 = (ashi) apbtVar2;
        if (ashiVar != null && ashiVar2 != null) {
            aozy createBuilder = ashi.a.createBuilder();
            createBuilder.bQ(ahmk.a.e(ashiVar.c, ashiVar2.c));
            createBuilder.bR(ahmg.a.e(ashiVar.d, ashiVar2.d));
            ashh ashhVar = ashiVar.e;
            if (ashhVar == null) {
                ashhVar = ashh.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashi ashiVar3 = (ashi) createBuilder.b;
            ashhVar.getClass();
            ashiVar3.e = ashhVar;
            ashiVar3.b |= 1;
            ashi ashiVar4 = (ashi) createBuilder.s();
            if (ahmc.s(ashiVar4)) {
                return null;
            }
            return ashiVar4;
        }
        return ashiVar;
    }

    @Override // defpackage.ahmj
    public final /* bridge */ /* synthetic */ String c(apbt apbtVar) {
        ashh ashhVar = ((ashi) apbtVar).e;
        if (ashhVar == null) {
            ashhVar = ashh.a;
        }
        return ashhVar.d;
    }
}
