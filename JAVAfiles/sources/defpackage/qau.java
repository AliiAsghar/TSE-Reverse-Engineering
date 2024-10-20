package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qau extends unp {
    public static final alhr a = uuh.x(200046194, "enable_populate_group_destination_on_create_group_response");
    public static final alwo b = alwo.o("BugleGroupManagement");
    public final uhj c;
    private final vsh d;
    private final armf e;
    private final armf f;
    private final agnq g;
    private final hgj h;

    public qau(vsh vshVar, uhj uhjVar, hgj hgjVar, armf armfVar, agnq agnqVar, armf armfVar2) {
        this.d = vshVar;
        this.c = uhjVar;
        this.h = hgjVar;
        this.e = armfVar;
        this.g = agnqVar;
        this.f = armfVar2;
    }

    private final ConversationIdType j(qem qemVar) {
        vsi a2 = vsj.a();
        a2.b(false);
        a2.g(false);
        a2.h(true);
        a2.n(amku.CREATE_GROUP_CHAT_COMPLETE_CALLBACK);
        a2.k(qemVar.c);
        return this.d.a(a2.a());
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("OnCreateGroupChatCompleteHandler");
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [armf, java.lang.Object] */
    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        qem qemVar;
        qeo qeoVar = (qeo) apbtVar;
        try {
            qemVar = (qem) apag.parseFrom(qem.a, qeoVar.e, aozs.a());
        } catch (apba e) {
            ((alwl) ((alwl) b.m().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "getCreateGroupChatData", 162, "OnCreateGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to create the group chat but we are unable to parse the opaque data in the response.");
            qemVar = null;
        }
        if (qemVar != null && !qemVar.c.isEmpty()) {
            String str = qemVar.c;
            qgr qgrVar = qemVar.e;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            qgr qgrVar2 = qgrVar;
            qeg qegVar = qeoVar.c;
            if (qegVar == null) {
                qegVar = qeg.a;
            }
            qef qefVar = qef.OK;
            qef b2 = qef.b(qegVar.c);
            if (b2 == null) {
                b2 = qef.UNKNOWN_STATUS;
            }
            if (!qefVar.equals(b2)) {
                alwo alwoVar = b;
                alwl alwlVar = (alwl) alwoVar.i();
                alwlVar.X(qas.a, qegVar);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 118, "OnCreateGroupChatCompleteHandler.java")).q("CreateGroupChatResponse failed.");
                ((vti) this.f.b()).d(qemVar, qegVar);
                ConversationIdType j = j(qemVar);
                if (j.b()) {
                    alwl alwlVar2 = (alwl) alwoVar.i();
                    alwlVar2.X(ydl.I, qemVar.c);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "disableConversationComposeBox", 214, "OnCreateGroupChatCompleteHandler.java")).q("Unable to find conversation for failed CreateGroupChatCompleteResponse. Skipping disabling compose box.");
                } else {
                    sng sngVar = new sng();
                    sngVar.aj("disableConversationComposeBox");
                    sngVar.v(5);
                    qee qeeVar = qee.GROUP_TOO_MANY_PARTICIPANTS;
                    qee b3 = qee.b(qegVar.d);
                    if (b3 == null) {
                        b3 = qee.UNKNOWN_CAUSE;
                    }
                    if (qeeVar.equals(b3)) {
                        sngVar.s(qpd.RCS_GROUP_CREATED_TOO_LARGE);
                    }
                    sngVar.e(j);
                    this.c.d(j);
                }
                if (qemVar.d) {
                    qkf.n(2, (mbl) this.h.a.b());
                    qxr qxrVar = (qxr) this.e.b();
                    Object obj = qxrVar.g;
                    qef b4 = qef.b(qegVar.c);
                    if (b4 == null) {
                        b4 = qef.UNKNOWN_STATUS;
                    }
                    amwy amwyVar = (amwy) ((algf) obj).fu(b4);
                    Object obj2 = qxrVar.a;
                    qee b5 = qee.b(qegVar.d);
                    if (b5 == null) {
                        b5 = qee.UNKNOWN_CAUSE;
                    }
                    qxrVar.i(str, 3, amwyVar, (amwx) ((algf) obj2).fu(b5), qgrVar2);
                }
                return aktp.ag(upm.b());
            }
            qei qeiVar = qeoVar.d;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            qei qeiVar2 = qeiVar;
            qeh qehVar = qeh.GROUP;
            qeh b6 = qeh.b(qeiVar2.c);
            if (b6 == null) {
                b6 = qeh.UNKNOWN_TYPE;
            }
            if (qehVar.equals(b6) && !qeiVar2.d.isEmpty()) {
                this.g.e("updateConferenceUriAndJoinState", new eex(this, j(qemVar), qemVar, qeiVar2, 12));
                vti vtiVar = (vti) this.f.b();
                if (!qemVar.d) {
                    qgr qgrVar3 = qemVar.e;
                    if (qgrVar3 == null) {
                        qgrVar3 = qgr.a;
                    }
                    vti.n(vtiVar, 3, 2, qemVar.f, qgrVar3, null, null, 48);
                }
                if (qemVar.d) {
                    qkf.n(1, (mbl) this.h.a.b());
                    qxr qxrVar2 = (qxr) this.e.b();
                    aozy k = qxrVar2.k(str);
                    if (!k.b.isMutable()) {
                        k.u();
                    }
                    amfv amfvVar = (amfv) k.b;
                    amfv amfvVar2 = amfv.a;
                    amfvVar.c = 14;
                    amfvVar.b |= 1;
                    if (!k.b.isMutable()) {
                        k.u();
                    }
                    amfv amfvVar3 = (amfv) k.b;
                    amfvVar3.d = 1;
                    amfvVar3.b |= 2;
                    aozy createBuilder = amvs.a.createBuilder();
                    atok atokVar = (atok) ((algf) qxrVar2.h).m().fu(qgrVar2);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amvs amvsVar = (amvs) createBuilder.b;
                    atokVar.getClass();
                    amvsVar.c = atokVar;
                    amvsVar.b = 1 | amvsVar.b;
                    if (!k.b.isMutable()) {
                        k.u();
                    }
                    amfv amfvVar4 = (amfv) k.b;
                    amvs amvsVar2 = (amvs) createBuilder.s();
                    amvsVar2.getClass();
                    amfvVar4.m = amvsVar2;
                    amfvVar4.b |= 8192;
                    qxrVar2.h((amfv) k.s());
                }
                return aktp.ag(upm.b());
            }
            ((alwl) ((alwl) b.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 133, "OnCreateGroupChatCompleteHandler.java")).q("Ignoring CreateGroupChatResponse with invalid group destination");
            ((vti) this.f.b()).d(qemVar, qegVar);
            if (qemVar.d) {
                ((qxr) this.e.b()).i(str, 3, amwy.CHAT_API_FAILED_PERMANENTLY, amwx.CHAT_API_INVALID_CONFERENCE_URI, qgrVar2);
            }
            return aktp.ag(upm.d());
        }
        ((alwl) ((alwl) b.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 106, "OnCreateGroupChatCompleteHandler.java")).q("Ignoring CreateGroupChatResponse with invalid opaque data.");
        ((vti) this.f.b()).e();
        return aktp.ag(upm.d());
    }

    @Override // defpackage.unx
    public final apca e() {
        return qeo.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "incoming_chat_api_queue";
    }
}
