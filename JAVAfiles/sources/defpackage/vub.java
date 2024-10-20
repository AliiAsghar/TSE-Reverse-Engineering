package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vub extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final vsh b;
    public final agnq c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final xnv h;
    public final armf i;
    public final vqu j;
    private final Context k;
    private final aneo l;
    private final anen m;
    private final armf n;
    private final uhg o;

    public vub(Context context, aneo aneoVar, anen anenVar, vsh vshVar, agnq agnqVar, armf armfVar, armf armfVar2, armf armfVar3, uhg uhgVar, armf armfVar4, armf armfVar5, xnv xnvVar, armf armfVar6, vqu vquVar) {
        this.k = context;
        this.l = aneoVar;
        this.m = anenVar;
        this.b = vshVar;
        this.c = agnqVar;
        this.n = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.o = uhgVar;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = xnvVar;
        this.i = armfVar6;
        this.j = vquVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("IncomingRcsGroupInvitationHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        vuc vucVar = (vuc) apbtVar;
        if (yhx.g(this.k)) {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 137, "IncomingRcsGroupInvitationHandler.java")).q("Ignoring incoming RCS group invitation for secondary user");
            return aktp.ag(upm.b());
        }
        return aktp.ag(vucVar).h(new algk() { // from class: vtz
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                ConversationIdType conversationIdType;
                vuc vucVar2 = (vuc) obj;
                if (vucVar2.c.isEmpty()) {
                    ((alwl) ((alwl) vub.a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 246, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. RCS group ID not set");
                } else if (vucVar2.d.isEmpty()) {
                    ((alwl) ((alwl) vub.a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 251, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. RCS conference URI not set");
                } else if (vucVar2.f.size() == 0) {
                    ((alwl) ((alwl) vub.a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 256, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. Empty participants");
                } else {
                    vub vubVar = vub.this;
                    vsi a2 = vsj.a();
                    a2.h(true);
                    a2.n(amku.INCOMING_GROUP_INVITE_HANDLER);
                    a2.g(false);
                    a2.p(vucVar2.b);
                    a2.k(vucVar2.c);
                    a2.e(vucVar2.e);
                    a2.b(false);
                    ConversationIdType a3 = vubVar.b.a(a2.a());
                    if (!a3.b()) {
                        alvw m = vub.a.m();
                        m.X(ydl.o, a3.toString());
                        m.X(ydl.G, Long.valueOf(vucVar2.b));
                        ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 173, "IncomingRcsGroupInvitationHandler.java")).q("Received a group invitation for an existing conversation");
                        vubVar.c.e("IncomingRcsGroupInvitationHandler.handleIncomingInviteForExistingConversation", new maa((unp) vubVar, a3, vucVar2.b, 6));
                        conversationIdType = a3;
                    } else {
                        vsh vshVar = vubVar.b;
                        a2.b(true);
                        a2.j(vucVar2.d);
                        Stream map = Collection.EL.stream(vucVar2.f).map(new vrx(18));
                        int i = alog.d;
                        a2.i((List) map.collect(alls.a));
                        ConversationIdType a4 = vshVar.a(a2.a());
                        if (a4.b()) {
                            alwl alwlVar = (alwl) vub.a.h();
                            alwlVar.X(ydl.G, Long.valueOf(vucVar2.b));
                            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 195, "IncomingRcsGroupInvitationHandler.java")).q("Unable to get or create conversation for incoming RCS group.");
                            return upm.e();
                        }
                        alvw m2 = vub.a.m();
                        m2.X(ydl.o, a4.toString());
                        m2.X(ydl.G, Long.valueOf(vucVar2.b));
                        ((alwl) m2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "IncomingRcsGroupInvitationHandler.java")).q("Received a group invitation for a new conversation");
                        vubVar.c.e("IncomingRcsGroupInvitationHandler.handleIncomingInviteForNewConversation", new rak(vubVar, vucVar2.f, vucVar2.g, a4, vucVar2.b, 4));
                        conversationIdType = a4;
                    }
                    MessageCoreData k = ((rwd) vubVar.d.b()).k(conversationIdType);
                    long j = vucVar2.b;
                    vubVar.c.e("IncomingRcsGroupInvitationHandler.updateConversationMetadata", new rak(vubVar, vucVar2.g, conversationIdType, k, j, 5));
                    return upm.b();
                }
                alwl alwlVar2 = (alwl) vub.a.i();
                alwlVar2.X(ydl.I, vucVar2.c);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 148, "IncomingRcsGroupInvitationHandler.java")).r("IncomingRcsGroupInvitationParameters still invalid after retrieving information from RCS process. Participant count: %d", vucVar2.f.size());
                return upm.e();
            }
        }, this.l).f(TimeoutException.class, new uva(17), this.m).f(ajny.class, new uva(18), this.m);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vuc.a.getParserForType();
    }

    public final ParticipantsTable.BindData j(String str) {
        armf armfVar = this.n;
        tap g = rxn.g(str);
        g.v(((rxq) armfVar.b()).h(g));
        this.o.g(g, 3);
        return g.a();
    }
}
