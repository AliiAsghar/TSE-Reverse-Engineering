package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abeq extends unp {
    public static final alwo a = alwo.o("BugleWearable");
    public final armf b;
    public final abrc c;
    private final armf d;
    private final arwe e;
    private final arpi f;

    public abeq(armf armfVar, abrc abrcVar, arwe arweVar, arpi arpiVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        abrcVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.d = armfVar;
        this.c = abrcVar;
        this.e = arweVar;
        this.f = arpiVar;
        this.b = armfVar2;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(10);
        a2.c(unv.WORKMANAGER_ONLY);
        a2.g(gry.LINEAR);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SyncConversationDataToWearableHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        aber aberVar = (aber) apbtVar;
        aberVar.getClass();
        c = qjh.c(this.e, arpj.a, arwf.a, new jog(aberVar, this, (arpe) null, 9));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = aber.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "wear_sync_queue";
    }

    @Override // defpackage.unp, defpackage.unx
    public final /* bridge */ /* synthetic */ boolean h(apbt apbtVar) {
        ((aber) apbtVar).getClass();
        akrh e = aktp.e("SyncConversationDataToWearableHandler#preflight");
        try {
            if (((aagg) this.d.b()).c()) {
                armd.i(e, null);
                return true;
            }
            alvw n = a.n();
            n.X(ydl.M, "SyncConversationDataToWearableHandler");
            n.q("Skipping sync conversation data to wear devices.");
            armd.i(e, null);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    public final Object j(acir acirVar, arpe arpeVar) {
        return arro.F(agkx.f(acirVar), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.abeo
            if (r0 == 0) goto L13
            r0 = r7
            abeo r0 = (defpackage.abeo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abeo r0 = new abeo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.aqil.P(r7)
            arpi r7 = r5.f
            abep r2 = new abep
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abeq.k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }
}
