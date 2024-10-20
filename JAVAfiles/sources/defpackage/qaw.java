package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qaw extends unp {
    private static final alwo a = alwo.o("BugleGroupManagement");

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("OnTriggerChatGroupFullStateUpdateCompleteHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        qgu qguVar = (qgu) apbtVar;
        qeg qegVar = qguVar.c;
        if (qegVar == null) {
            qegVar = qeg.a;
        }
        qef qefVar = qef.OK;
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        if (!qefVar.equals(b)) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(qas.a, qegVar);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 64, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("TriggerChatGroupFullStateUpdateResponse failed.");
            return aktp.ag(upm.d());
        }
        try {
            qgs qgsVar = (qgs) apag.parseFrom(qgs.a, qguVar.d, aozs.a());
            alvw m = a.m();
            m.X(ydl.I, qgsVar.c);
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 78, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("Group full state successfully requested.");
        } catch (apba e) {
            ((alwl) ((alwl) a.m().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 80, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("Group full state successfully requested but we were unable to parse the opaque data in the response.");
        }
        return aktp.ag(upm.b());
    }

    @Override // defpackage.unx
    public final apca e() {
        return qgu.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "incoming_chat_api_queue";
    }
}
