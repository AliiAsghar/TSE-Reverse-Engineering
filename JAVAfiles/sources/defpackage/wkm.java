package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkm extends unp {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcsprovisioning/tychogrpc/FiMultiSyncGrpcHandler");
    private final arwe b;
    private final whj c;
    private final armf d;
    private final wkp e;

    public wkm(arwe arweVar, wkp wkpVar, whj whjVar, armf armfVar) {
        arweVar.getClass();
        whjVar.getClass();
        armfVar.getClass();
        this.b = arweVar;
        this.e = wkpVar;
        this.c = whjVar;
        this.d = armfVar;
    }

    private final void k(String str, abhv abhvVar) {
        int ordinal = abhvVar.ordinal();
        int i = 2;
        if (ordinal != 1) {
            int i2 = 3;
            if (ordinal != 2) {
                i = 4;
                if (ordinal != 3) {
                    i2 = 5;
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            i = 7;
                        } else {
                            i = 6;
                        }
                    }
                }
            }
            i = i2;
        }
        ((wpp) this.d.b()).y(str, i);
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.WORKMANAGER_ONLY);
        a2.g(gry.EXPONENTIAL);
        a2.h(((Long) aczv.s().a.az.a()).longValue() * 1000);
        a2.d(((Integer) aczv.s().a.aA.a()).intValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("FiMultiSyncGrpcHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        wkn wknVar = (wkn) apbtVar;
        wknVar.getClass();
        c = qjh.c(this.b, arpj.a, arwf.a, new vpi(this, wknVar, (arpe) null, 14));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = wkn.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "fi_multi_sync_grpc_queue";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.wkn r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkm.j(wkn, arpe):java.lang.Object");
    }
}
