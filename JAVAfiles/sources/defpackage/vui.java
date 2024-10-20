package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vui extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final anen c;
    public final armf d;
    public final ujv e;
    public final uhj f;
    public final agnq g;
    public final xnv h;
    public final pss i;
    public final psq j;
    public final vbu k;
    public final armf l;
    public final armf m;
    public final vqu n;
    public final armf o;
    public final armf p;
    public final qco q;
    private final rys r;
    private final qoz s;

    public vui(anen anenVar, anen anenVar2, armf armfVar, ujv ujvVar, uhj uhjVar, qoz qozVar, rys rysVar, agnq agnqVar, xnv xnvVar, pss pssVar, psq psqVar, vbu vbuVar, armf armfVar2, armf armfVar3, vqu vquVar, armf armfVar4, qco qcoVar, armf armfVar5) {
        this.b = anenVar;
        this.c = anenVar2;
        this.d = armfVar;
        this.e = ujvVar;
        this.f = uhjVar;
        this.s = qozVar;
        this.r = rysVar;
        this.g = agnqVar;
        this.h = xnvVar;
        this.i = pssVar;
        this.j = psqVar;
        this.k = vbuVar;
        this.m = armfVar3;
        this.n = vquVar;
        this.l = armfVar2;
        this.o = armfVar4;
        this.q = qcoVar;
        this.p = armfVar5;
    }

    public static boolean m(vuk vukVar) {
        vuj b = vuj.b(vukVar.d);
        if (b == null) {
            b = vuj.UNRECOGNIZED;
        }
        if (!b.equals(vuj.DELETE)) {
            vuj b2 = vuj.b(vukVar.d);
            if (b2 == null) {
                b2 = vuj.UNRECOGNIZED;
            }
            if (!b2.equals(vuj.DELETE_IF_EMPTY)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean n(qeg qegVar) {
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        if (!Objects.equals(b, qef.OK)) {
            qef b2 = qef.b(qegVar.c);
            if (b2 == null) {
                b2 = qef.UNKNOWN_STATUS;
            }
            if (!Objects.equals(b2, qef.PENDING)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c = amdy.LEAVE_RCS_CONVERSATION_ACTION;
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("LeaveRcsGroupConversationHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        final vuk vukVar = (vuk) apbtVar;
        return aktp.aj(new ancr() { // from class: vud
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                akul h;
                vuk vukVar2 = vukVar;
                ConversationIdType b = ruy.b(vukVar2.c);
                vui vuiVar = vui.this;
                armf armfVar = vuiVar.d;
                UUID randomUUID = UUID.randomUUID();
                int i = ((alsx) ((rtz) armfVar.b()).K(b)).c;
                int i2 = i - 1;
                vti vtiVar = (vti) vuiVar.m.b();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                aozy createBuilder = amfu.a.createBuilder();
                createBuilder.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amfu amfuVar = (amfu) apagVar;
                amfuVar.b |= 1;
                amfuVar.c = i;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                amfu amfuVar2 = (amfu) createBuilder.b;
                amfuVar2.b |= 2;
                amfuVar2.d = i2;
                apag s = createBuilder.s();
                s.getClass();
                vti.n(vtiVar, 20, 0, uuid, null, (amfu) s, null, 42);
                smr q = ((rtz) vuiVar.d.b()).q(b);
                if (q == null) {
                    alvw m = vui.a.m();
                    m.X(ydl.o, b.toString());
                    ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 182, "LeaveRcsGroupConversationHandler.java")).q("Cannot leave RCS group conversation. The conversation does not exist.");
                    ((vti) vuiVar.m.b()).g(randomUUID.toString());
                    return aktp.ag(upm.d());
                }
                if (q.h() != 2) {
                    alwl alwlVar = (alwl) vui.a.i();
                    alwlVar.X(ydl.o, b.toString());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 193, "LeaveRcsGroupConversationHandler.java")).q("Cannot leave conversation because this is not an RCS group conversation.");
                    ((vti) vuiVar.m.b()).g(randomUUID.toString());
                    return aktp.ag(upm.d());
                }
                int l = q.l();
                switch (l) {
                    case 0:
                    case 1:
                        if (albo.ah(q.U())) {
                            alwl alwlVar2 = (alwl) vui.a.i();
                            alwlVar2.X(ydl.o, q.x().toString());
                            alwlVar2.X(ydl.I, q.V());
                            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "leaveConversationWithoutValidConferenceUri", 450, "LeaveRcsGroupConversationHandler.java")).q("Attempting to leave RCS group conversation without conference URI.");
                            if (vui.m(vukVar2)) {
                                return vuiVar.k(vukVar2, q.x());
                            }
                            vuiVar.l(q, null, randomUUID, null, !vukVar2.f);
                            return aktp.ag(upm.d());
                        }
                        if (((okf) vuiVar.l.b()).a()) {
                            if ((vukVar2.b & 4) != 0) {
                                alwl alwlVar3 = (alwl) vui.a.d();
                                alwlVar3.X(ydl.p, q.x());
                                alwlVar3.X(ydl.I, q.V());
                                alwlVar3.X(ydl.t, Integer.valueOf(vukVar2.g));
                                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "getSelfChatEndpointLegacy", 426, "LeaveRcsGroupConversationHandler.java")).q("Request contains subId, using it for getting self identity");
                                h = aktp.ag(((vpk) vuiVar.o.b()).b(vukVar2.g));
                            } else {
                                alwl alwlVar4 = (alwl) vui.a.d();
                                alwlVar4.X(ydl.p, q.x());
                                alwlVar4.X(ydl.I, q.V());
                                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "getSelfChatEndpointLegacy", 434, "LeaveRcsGroupConversationHandler.java")).q("Getting self identity based on Conversation table");
                                h = ((vpk) vuiVar.o.b()).c(q.x());
                            }
                        } else {
                            vbu vbuVar = vuiVar.k;
                            vbuVar.getClass();
                            h = aktp.ai(new vib(vbuVar, 11), vuiVar.c).h(new vgd(vuiVar, 16), vuiVar.c);
                        }
                        return h.i(new vug((Object) vuiVar, (Object) q, (Object) randomUUID, (apag) vukVar2, 0), vuiVar.c).e(psr.class, new mhr(vuiVar, q, randomUUID, vukVar2, 8), vuiVar.b).e(vpd.class, new mhr(vuiVar, q, randomUUID, vukVar2, 9), vuiVar.b);
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        alvw m2 = vui.a.m();
                        m2.X(ydl.o, b.toString());
                        m2.X(ydl.F, wcm.J(l));
                        ((alwl) m2.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 213, "LeaveRcsGroupConversationHandler.java")).q("Leaving RCS group in a join state that should not trigger a server leave group request.");
                        if (vui.m(vukVar2)) {
                            ((vti) vuiVar.m.b()).h(randomUUID.toString());
                            return vuiVar.k(vukVar2, b);
                        }
                        vuiVar.l(q, null, randomUUID, null, !vukVar2.f);
                        return aktp.ag(upm.d());
                    case 4:
                    case 7:
                    case 8:
                        alvw m3 = vui.a.m();
                        m3.X(ydl.o, b.toString());
                        m3.X(ydl.F, wcm.J(l));
                        ((alwl) m3.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 242, "LeaveRcsGroupConversationHandler.java")).q("Leaving RCS group in a pending setup join state.");
                        vuiVar.l(q, null, randomUUID, null, !vukVar2.f);
                        return aktp.ag(upm.d());
                    case 9:
                        return aktp.ag(upm.b());
                    default:
                        throw new IllegalStateException("Unhandled join state while leaving RCS group.");
                }
            }
        }, this.b);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vuk.a.getParserForType();
    }

    public final upm j(smr smrVar, Throwable th, UUID uuid, vuk vukVar) {
        l(smrVar, th, uuid, null, !vukVar.f);
        return upm.d();
    }

    public final akul k(vuk vukVar, ConversationIdType conversationIdType) {
        alvw m = a.m();
        m.X(ydl.o, conversationIdType.toString());
        alwl alwlVar = (alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "deleteConversation", 526, "LeaveRcsGroupConversationHandler.java");
        vuj b = vuj.b(vukVar.d);
        if (b == null) {
            b = vuj.UNRECOGNIZED;
        }
        alwlVar.t("We have successfully left the conversation. Deleting the conversation with a deletion strategy of %s.", b);
        qoz qozVar = this.s;
        qox a2 = qoy.a();
        a2.b(conversationIdType);
        apct apctVar = vukVar.e;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        a2.c(apds.a(apctVar));
        vuj b2 = vuj.b(vukVar.d);
        if (b2 == null) {
            b2 = vuj.UNRECOGNIZED;
        }
        a2.e(b2.equals(vuj.DELETE_IF_EMPTY));
        a2.f(amfe.CONVERSATION_FROM_LIST);
        return qozVar.a(a2.a()).h(new vsw(5), andi.a);
    }

    public final void l(smr smrVar, Throwable th, UUID uuid, qeg qegVar, boolean z) {
        alwl alwlVar = (alwl) a.i();
        alwlVar.X(ydl.o, smrVar.x().toString());
        alwlVar.X(ydl.I, smrVar.V());
        alwlVar.X(ydl.G, Long.valueOf(smrVar.s()));
        ((alwl) ((alwl) alwlVar.g(th)).h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "handleLeaveGroupFailed", 569, "LeaveRcsGroupConversationHandler.java")).q("Error while leaving RCS group conversation.");
        if (z) {
            this.r.d(R.string.self_left_group_conversation_failed);
        }
        vti vtiVar = (vti) this.m.b();
        String uuid2 = uuid.toString();
        uuid2.getClass();
        vti.j(vtiVar, uuid2, qegVar, 4);
    }
}
