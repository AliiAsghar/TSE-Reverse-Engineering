package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qav extends unp {
    private static final alwo a = alwo.o("BugleGroupManagement");
    private final vti b;

    public qav(vti vtiVar) {
        this.b = vtiVar;
    }

    private static boolean j(qfx qfxVar) {
        if ((qfxVar.b & 2) != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("OnRemoveUserFromGroupChatCompleteHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        String str;
        String str2;
        qfz qfzVar = (qfz) apbtVar;
        qeg qegVar = qfzVar.c;
        if (qegVar == null) {
            qegVar = qeg.a;
        }
        qfx qfxVar = qfx.a;
        Optional empty = Optional.empty();
        try {
            qfxVar = (qfx) apag.parseFrom(qfx.a, qfzVar.d, aozs.a());
        } catch (apba e) {
            empty = Optional.of(e);
        }
        qef qefVar = qef.OK;
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        if (!qefVar.equals(b)) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(qas.a, qegVar);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 85, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RemoveUserFromGroupChatResponse failed.");
            if (j(qfxVar)) {
                this.b.m(qfxVar.e, qegVar, 3);
            } else {
                vti vtiVar = this.b;
                qgr qgrVar = qfxVar.f;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                qgr qgrVar2 = qgrVar;
                qgrVar2.getClass();
                qegVar.getClass();
                vti.n(vtiVar, 19, 3, null, qgrVar2, null, vtiVar.k(3, qegVar), 16);
            }
            return aktp.ag(upm.d());
        }
        if (empty.isEmpty()) {
            alvw m = a.m();
            alvz alvzVar = ydl.I;
            if (qfx.a.c.equals(qfxVar.c)) {
                str = "missing-rcs-group-id";
            } else {
                str = qfxVar.c;
            }
            m.X(alvzVar, str);
            alvz alvzVar2 = ydl.m;
            if (qfx.a.d.equals(qfxVar.d)) {
                str2 = "missing-participant-id";
            } else {
                str2 = qfxVar.d;
            }
            m.X(alvzVar2, str2);
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 115, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to remove user from the group chat.");
        } else {
            ((alwl) ((alwl) a.m().g((Throwable) empty.get())).h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 119, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to remove user from the group chat but we are unable to parse the opaque data in the response.");
        }
        if (j(qfxVar)) {
            this.b.h(qfxVar.e);
        } else {
            vti vtiVar2 = this.b;
            qgr qgrVar3 = qfxVar.f;
            if (qgrVar3 == null) {
                qgrVar3 = qgr.a;
            }
            qgr qgrVar4 = qgrVar3;
            qgrVar4.getClass();
            vti.n(vtiVar2, 19, 2, null, qgrVar4, null, null, 48);
        }
        return aktp.ag(upm.b());
    }

    @Override // defpackage.unx
    public final apca e() {
        return qfz.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "incoming_chat_api_queue";
    }
}
