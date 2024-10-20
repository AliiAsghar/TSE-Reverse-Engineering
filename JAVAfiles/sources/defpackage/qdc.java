package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdc {
    public static final alhr a = uuh.x(200482121, "drop_bot_messages_received_in_groups");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/chatapi/incoming/MultiPartIncomingChatMessageProcessor");
    public final qdj c;
    public final pwa d;
    public final anen e;
    public final armf f;
    public final armf g;
    public final hmk h;
    private final armf i;

    public qdc(anen anenVar, qdj qdjVar, pwa pwaVar, hmk hmkVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = qdjVar;
        this.d = pwaVar;
        this.h = hmkVar;
        this.e = anenVar;
        this.f = armfVar;
        this.g = armfVar2;
        this.i = armfVar3;
    }

    public static amxb b(int i) {
        aozy createBuilder = amxb.a.createBuilder();
        aozy createBuilder2 = amxc.a.createBuilder();
        amwy amwyVar = amwy.CHAT_API_FAILED_PERMANENTLY;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.f = amwyVar.f;
        amxcVar.b |= 16;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amxc amxcVar2 = (amxc) createBuilder2.b;
        amxcVar2.g = i - 1;
        amxcVar2.b |= 32;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxb amxbVar = (amxb) createBuilder.b;
        amxc amxcVar3 = (amxc) createBuilder2.s();
        amxcVar3.getClass();
        amxbVar.c = amxcVar3;
        amxbVar.b |= 1;
        return (amxb) createBuilder.s();
    }

    public final akul a(final qfp qfpVar) {
        akrh e = aktp.e("MultiPartIncomingChatMessageProcessor#process");
        try {
            akrh e2 = aktp.e("MultiPartIncomingChatMessageProcessor#ensureProvisioningEngineIsInitialized");
            try {
                akul g = akul.g(((adjc) this.i.b()).g());
                e2.b(g);
                e2.close();
                akul i = g.i(new ancs() { // from class: qdb
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0267  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0298  */
                    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.concurrent.Executor, java.lang.Object] */
                    @Override // defpackage.ancs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r15) {
                        /*
                            Method dump skipped, instructions count: 749
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdb.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, this.e);
                e.b(i);
                e.close();
                return i;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
