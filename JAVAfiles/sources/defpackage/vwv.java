package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwv extends unp {
    static final alhr a = uuh.x(207979420, "check_group_state_before_add_users_to_rcs_group");
    public static final alwo b = alwo.o("BugleGroupManagement");
    public final anen c;
    public final anen d;
    public final armf e;
    public final armf f;
    public final pss g;
    public final psq h;
    public final armf i;
    public final vbu j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final pvw o;

    public vwv(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, pss pssVar, psq psqVar, armf armfVar3, vbu vbuVar, armf armfVar4, pvw pvwVar, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.c = anenVar;
        this.d = anenVar2;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = pssVar;
        this.h = psqVar;
        this.i = armfVar3;
        this.j = vbuVar;
        this.k = armfVar4;
        this.o = pvwVar;
        this.l = armfVar5;
        this.m = armfVar6;
        this.n = armfVar7;
    }

    public static void j(Level level, ConversationIdType conversationIdType, String str, String str2) {
        alwl a2 = b.a(level);
        a2.X(ydl.o, conversationIdType.toString());
        a2.X(ydl.I, str);
        ((alwl) a2.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "logForLogcat", 529, "AddMembersToRcsConversationHandler.java")).q(str2);
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c = amdy.ADD_MEMBERS_TO_RCS_CONVERSATION_ACTION;
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("AddMembersToRcsConversationHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        final vww vwwVar = (vww) apbtVar;
        final ConversationIdType b2 = ruy.b(vwwVar.c);
        return aktp.ai(new vwu(this, b2, 0), this.c).i(new ancs() { // from class: vwt
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v35, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v48, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v9, types: [armf, java.lang.Object] */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                akul c;
                boolean z;
                ConversationIdType conversationIdType;
                akul h;
                smr smrVar = (smr) obj;
                if (smrVar == null) {
                    vwv.j(Level.WARNING, b2, null, "Conversation is null when attempting to add users to RCS group conversation.");
                    return aktp.ag(upm.d());
                }
                vww vwwVar2 = vwwVar;
                vwv vwvVar = vwv.this;
                ConversationIdType x = smrVar.x();
                boolean z2 = 1;
                if (!((okf) vwvVar.l.b()).a()) {
                    ((alwl) vwv.b.m().h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "getSelfChatEndpoint", 256, "AddMembersToRcsConversationHandler.java")).t("Using default RcsMsisdnAccessor ChatEndpoint for conversationId: %s", smrVar.x());
                    c = vwvVar.j.a();
                } else if ((vwwVar2.b & 1) != 0) {
                    qei qeiVar = vwwVar2.e;
                    if (qeiVar == null) {
                        qeiVar = qei.a;
                    }
                    c = aktp.ag(Optional.of(qeiVar));
                } else {
                    vpk vpkVar = (vpk) vwvVar.n.b();
                    ConversationIdType x2 = smrVar.x();
                    x2.getClass();
                    c = ((pce) vpkVar.d.b()).a() ? qjh.c(vpkVar.h, arpj.a, arwf.a, new uwn(vpkVar, x2, (arpe) null, 15)) : qjh.c(vpkVar.g, arpj.a, arwf.a, new uwn(vpkVar, x2, (arpe) null, 16, (byte[]) null));
                }
                if (smrVar.w().equals(qpd.RCS_GROUP_SELF_ONLY)) {
                    qgr qgrVar = (qgr) vwvVar.o.fu(yyb.ba());
                    ((qxr) vwvVar.k.b()).j(albo.ag(smrVar.V()), vwwVar2.d.size(), 2, qgrVar);
                    if (albo.ah(smrVar.V())) {
                        vwv.j(Level.WARNING, smrVar.x(), smrVar.V(), "Cannot add users to a conversation without RCS conversation ID.");
                        ((qxr) vwvVar.k.b()).g(albo.ag(smrVar.V()), amwx.CHAT_API_INVALID_CONVERSATION_ID, qgrVar);
                        return aktp.ag(upm.d());
                    }
                    vwv.j(Level.INFO, smrVar.x(), smrVar.V(), "Attempting to re-create the group instead of adding participants to empty group");
                    String V = smrVar.V();
                    V.getClass();
                    akul h2 = c.h(new vsw(10), vwvVar.c).h(new mhr((Object) vwvVar, (apag) vwwVar2, (Object) smrVar, (Object) qgrVar, 10), vwvVar.d);
                    pss pssVar = vwvVar.g;
                    pssVar.getClass();
                    return h2.i(new vek(pssVar, 13), vwvVar.d).h(new mhr(vwvVar, smrVar, V, qgrVar, 11), vwvVar.d).e(IllegalArgumentException.class, new mhr(vwvVar, smrVar, V, qgrVar, 12), vwvVar.d);
                }
                alog alogVar = (alog) Collection.EL.stream(alog.n(vwwVar2.d)).map(new vte(vwvVar, 18)).collect(alls.a);
                vyv vyvVar = (vyv) vwvVar.i.b();
                int size = alogVar.size();
                if (size > 0) {
                    z = true;
                } else {
                    z = false;
                }
                albo.U(z, "Number of users added must be positive.");
                ((mbl) vyvVar.a.b()).e("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.UserCount", size);
                vwv.j(Level.FINE, smrVar.x(), smrVar.V(), "Adding users to RCS group using ChatApi");
                if (((Boolean) ((utz) vwv.a.get()).e()).booleanValue()) {
                    if (albo.ah(smrVar.V())) {
                        vwv.j(Level.WARNING, smrVar.x(), smrVar.V(), "Cannot add users to a conversation without RCS conversation ID.");
                        ((mbl) ((vyv) vwvVar.i.b()).a.b()).c("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.NoRcsConversationId");
                        ((vti) vwvVar.f.b()).c();
                        h = aktp.ag(false);
                    } else if (albo.ah(smrVar.U())) {
                        vwv.j(Level.WARNING, smrVar.x(), smrVar.V(), "Cannot add users to a conversation without RCS conference URI.");
                        ((mbl) ((vyv) vwvVar.i.b()).a.b()).c("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.NoRcsConferenceUri");
                        ((vti) vwvVar.f.b()).c();
                        h = aktp.ag(false);
                    }
                    conversationIdType = x;
                    return h.i(new vfj(conversationIdType, smrVar, 10, null), vwvVar.c);
                }
                ArrayList arrayList = new ArrayList();
                int size2 = alogVar.size();
                int i = 0;
                while (i < size2) {
                    msh mshVar = (msh) alogVar.get(i);
                    armf armfVar = vwvVar.f;
                    UUID randomUUID = UUID.randomUUID();
                    vti vtiVar = (vti) armfVar.b();
                    randomUUID.getClass();
                    vti.n(vtiVar, 16, 0, randomUUID.toString(), null, null, null, 58);
                    String V2 = smrVar.V();
                    V2.getClass();
                    String U = smrVar.U();
                    U.getClass();
                    aozy createBuilder = qfb.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    qfb qfbVar = (qfb) createBuilder.b;
                    qfbVar.b |= z2;
                    qfbVar.c = V2;
                    qei a2 = vwvVar.h.a(U, z2);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    qfb qfbVar2 = (qfb) createBuilder.b;
                    a2.getClass();
                    qfbVar2.d = a2;
                    qfbVar2.b |= 2;
                    qfb qfbVar3 = (qfb) createBuilder.s();
                    if (!mshVar.e().isEmpty()) {
                        qei qeiVar2 = (qei) mshVar.e().get();
                        aozy createBuilder2 = qeb.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        qeb qebVar = (qeb) createBuilder2.b;
                        qebVar.b |= z2;
                        qebVar.c = V2;
                        String uuid = randomUUID.toString();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        qeb qebVar2 = (qeb) createBuilder2.b;
                        uuid.getClass();
                        qebVar2.b |= 2;
                        qebVar2.e = uuid;
                        arrayList.add(c.h(new vsw(11), vwvVar.c).i(new vug(vwvVar, qfbVar3, qeiVar2, (qeb) createBuilder2.s(), 2), vwvVar.c));
                        i++;
                        z2 = 1;
                    } else {
                        vti vtiVar2 = (vti) vwvVar.f.b();
                        randomUUID.getClass();
                        String uuid2 = randomUUID.toString();
                        aozy createBuilder3 = amxb.a.createBuilder();
                        createBuilder3.getClass();
                        aozy createBuilder4 = amxc.a.createBuilder();
                        createBuilder4.getClass();
                        aktp.bb(2, createBuilder4);
                        aktp.ba(amwy.CHAT_API_FAILED_PERMANENTLY, createBuilder4);
                        aktp.aZ(amwx.CHAT_API_INVALID_REMOTE_PARTICIPANT, createBuilder4);
                        aktp.bd(aktp.aY(createBuilder4), createBuilder3);
                        vti.n(vtiVar2, 17, 3, uuid2, null, null, aktp.bc(createBuilder3), 24);
                        throw new IllegalStateException("no RCS identifier found for the participant to add");
                    }
                }
                conversationIdType = x;
                h = aktp.ao(arrayList).h(new imh(vwvVar, (List) arrayList, smrVar, alogVar, 12), vwvVar.d);
                return h.i(new vfj(conversationIdType, smrVar, 10, null), vwvVar.c);
            }
        }, this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vww.a.getParserForType();
    }
}
