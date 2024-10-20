package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qat extends unp {
    private static final alwo a = alwo.o("BugleGroupManagement");
    private final vti b;

    public qat(vti vtiVar) {
        this.b = vtiVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("OnAddUserToGroupChatCompleteHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        qed qedVar = (qed) apbtVar;
        qeg qegVar = qedVar.c;
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
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 76, "OnAddUserToGroupChatCompleteHandler.java")).q("AddUserToGroupChatResponse failed.");
            this.b.b(qedVar);
            return aktp.ag(upm.d());
        }
        try {
            qeb qebVar = (qeb) apag.parseFrom(qeb.a, qedVar.d, aozs.a());
            for (String str : qebVar.d) {
                alvw m = a.m();
                m.X(ydl.I, qebVar.c);
                m.X(ydl.m, str);
                ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 92, "OnAddUserToGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user to the group chat.");
            }
            vti vtiVar = this.b;
            String str2 = qebVar.e;
            str2.getClass();
            vti.n(vtiVar, 17, 2, str2, null, null, null, 56);
        } catch (apba e) {
            ((alwl) ((alwl) a.m().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 98, "OnAddUserToGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user(s) to the group chat but we are unable to parse the opaque data in the response.");
        }
        return aktp.ag(upm.b());
    }

    @Override // defpackage.unx
    public final apca e() {
        return qed.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "incoming_chat_api_queue";
    }
}
