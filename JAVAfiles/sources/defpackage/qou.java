package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qou extends unp {
    private static final alwo a = alwo.o("BugleBCM");
    private final armf b;

    public qou(armf armfVar) {
        this.b = armfVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.WAKELOCK);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ConversationThreadIdUpdaterWorker");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul d;
        apla aplaVar = (apla) apbtVar;
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdUpdaterWorker", "processPendingWorkItemAsync", 64, "ConversationThreadIdUpdaterWorker.java")).C("ConversationThreadIdUpdaterWorker: Processing conversation=%s, newThreadId=%s", aplaVar.b, aplaVar.c);
        smr a2 = sni.a(ruy.b(aplaVar.b));
        if (a2 == null) {
            ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdUpdaterWorker", "processPendingWorkItemAsync", 71, "ConversationThreadIdUpdaterWorker.java")).t("ConversationThreadIdUpdaterWorker: Conversation does no longer exist. conversation_id=%s", aplaVar.b);
            return aktp.ag(upm.b());
        }
        qot qotVar = (qot) this.b.b();
        xhv xhvVar = new xhv(aplaVar.c);
        if (!((Boolean) qot.c.e()).booleanValue()) {
            d = aktp.ag(null);
        } else if (xhvVar.d()) {
            ((alwl) ((alwl) qot.a.i()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "logMismatchAndUpdateThreadId", 282, "ConversationThreadIdGetterImpl.java")).D("BCM updating thread id for conversation failed. resolvedThread is unknown. conversationId=%s, existingThreadId=%s", a2.x(), a2.F());
            d = ((qrb) qotVar.d.b()).d(a2.x(), new eyg(5), amra.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION);
        } else if (a2.F().d()) {
            qot.c(a2, xhvVar);
            d = aktp.ag(null);
        } else {
            d = ((qrb) qotVar.d.b()).d(a2.x(), new nan(a2, xhvVar, 15), amra.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION);
        }
        return d.h(new qda(15), andi.a);
    }

    @Override // defpackage.unx
    public final apca e() {
        return apla.a.getParserForType();
    }
}
