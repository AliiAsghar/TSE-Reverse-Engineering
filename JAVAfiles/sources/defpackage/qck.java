package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qck implements qbv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor");
    public final armf b;
    public final armf c;
    public final agnq d;
    public final uhj e;
    public final mbl f;
    public final armf g;
    public final wzs h;
    public final vxp i;
    public final Context j;
    public final hmk k;
    private final armf l;
    private final armf m;
    private final qcb n;
    private final ryg o;
    private final uhg p;
    private final xnv q;
    private final anen r;

    public qck(armf armfVar, armf armfVar2, armf armfVar3, agnq agnqVar, armf armfVar4, qcb qcbVar, ryg rygVar, uhg uhgVar, xnv xnvVar, uhj uhjVar, anen anenVar, mbl mblVar, hmk hmkVar, armf armfVar5, wzs wzsVar, vxp vxpVar, Context context) {
        this.l = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = agnqVar;
        this.m = armfVar4;
        this.n = qcbVar;
        this.o = rygVar;
        this.p = uhgVar;
        this.q = xnvVar;
        this.e = uhjVar;
        this.r = anenVar;
        this.f = mblVar;
        this.k = hmkVar;
        this.g = armfVar5;
        this.h = wzsVar;
        this.i = vxpVar;
        this.j = context;
    }

    private final qwm d(qbs qbsVar) {
        if (((okf) this.g.b()).a()) {
            qwm e = this.o.e(qbsVar.k);
            e.getClass();
            return e;
        }
        return this.o.d();
    }

    @Override // defpackage.qbv
    public final akul a(final ConversationIdType conversationIdType, qfl qflVar) {
        final qfi qfiVar = qflVar.h;
        if (qfiVar == null) {
            qfiVar = qfi.a;
        }
        return this.n.f(conversationIdType).h(new algk() { // from class: qcj
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                qbs qbsVar = (qbs) obj;
                qfi qfiVar2 = qfiVar;
                qfh b = qfh.b(qfiVar2.c);
                ConversationIdType conversationIdType2 = conversationIdType;
                if (b == null) {
                    b = qfh.UNKNOWN_STATE;
                }
                qck qckVar = qck.this;
                if (b == qfh.KICKED_OUT) {
                    hmk hmkVar = qckVar.k;
                    if (qkf.m(qbsVar, qfiVar2)) {
                        ((zap) hmkVar.a).k(qbsVar.f, 4);
                    } else {
                        ((zap) hmkVar.a).k(qbsVar.f, 3);
                    }
                }
                qei qeiVar = qfiVar2.e;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                if (!qeiVar.d.isEmpty()) {
                    qei qeiVar2 = qfiVar2.e;
                    if (qeiVar2 == null) {
                        qeiVar2 = qei.a;
                    }
                    sng sngVar = new sng();
                    sngVar.aj("updateRcsGroupSelfMsisdnColumn");
                    sngVar.M(qeiVar2.d);
                    sngVar.e(qbsVar.a);
                    if (((okf) qckVar.g.b()).a()) {
                        String G = qckVar.h.G(qbsVar.b);
                        if (G == null) {
                            alvw i = qck.a.i();
                            i.X(alwp.a, "BugleGroupManagement");
                            alvg alvgVar = (alvg) i;
                            alvgVar.X(ydl.p, qbsVar.a);
                            alvgVar.X(ydl.I, qbsVar.f);
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "updateTelephonyCanonicalAddress", 192, "SelfMembershipGroupMetadataProcessor.java")).q("Skipping group canonical address changed because thread not found");
                        } else {
                            int c = qckVar.h.c(qckVar.j.getContentResolver(), G, qckVar.i.a(qeiVar2.d, qbsVar.f, qbsVar.c));
                            alvw g = qck.a.g();
                            g.X(alwp.a, "BugleGroupManagement");
                            alvg alvgVar2 = (alvg) g;
                            alvgVar2.X(ydl.p, qbsVar.a);
                            alvgVar2.X(ydl.I, qbsVar.f);
                            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "updateTelephonyCanonicalAddress", 206, "SelfMembershipGroupMetadataProcessor.java")).r("%s canonical address changed because of self change in group", c);
                        }
                    }
                }
                qfh b2 = qfh.b(qfiVar2.c);
                if (b2 == null) {
                    b2 = qfh.UNKNOWN_STATE;
                }
                int ordinal = b2.ordinal();
                if (ordinal != 1) {
                    if ((ordinal == 2 || ordinal == 3) && qbsVar.l != 2) {
                        alvw d = qck.a.d();
                        d.X(alwp.a, "BugleGroupManagement");
                        alvg alvgVar3 = (alvg) d;
                        alvgVar3.X(ydl.p, qbsVar.a);
                        alvgVar3.X(ydl.I, qbsVar.f);
                        ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "processSelfLeftGroup", 280, "SelfMembershipGroupMetadataProcessor.java")).q("Self left the group");
                        qckVar.d.e("SelfMembershipGroupMetadataProcessor#processSelfRejoinedGroup", new eex(qckVar, qbsVar, qfiVar2, qckVar.b(qbsVar, qfiVar2), 13));
                        qckVar.e.d(qbsVar.a);
                    }
                } else {
                    int i2 = qbsVar.l;
                    if (i2 != 0 && i2 != 1) {
                        alvw d2 = qck.a.d();
                        d2.X(alwp.a, "BugleGroupManagement");
                        alvg alvgVar4 = (alvg) d2;
                        alvgVar4.X(ydl.p, qbsVar.a);
                        alvgVar4.X(ydl.I, qbsVar.f);
                        ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "processSelfRejoinedGroup", 220, "SelfMembershipGroupMetadataProcessor.java")).q("Self rejoined the group");
                        qckVar.d.e("SelfMembershipGroupMetadataProcessor#processSelfRejoinedGroup", new eex(qckVar, qbsVar, qfiVar2, qckVar.b(qbsVar, qfiVar2), 14));
                        qckVar.e.c();
                        qckVar.e.d(qbsVar.a);
                        int i3 = qbsVar.l;
                        if (i3 == 4) {
                            qckVar.f.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Enabled.Counts");
                        } else if (i3 == 7) {
                            qckVar.f.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Enabled.Counts");
                        }
                    }
                }
                akrh e = aktp.e("SelfMembershipGroupMetadataProcessor::process_dsdrGroupsFlag");
                try {
                    if (((okf) qckVar.g.b()).a() && !qfiVar2.f.isEmpty()) {
                        ((rtz) qckVar.b.b()).ai(conversationIdType2, lga.V(qfiVar2.f));
                    }
                    upm b3 = upm.b();
                    e.close();
                    return b3;
                } finally {
                }
            }
        }, this.r);
    }

    public final ParticipantsTable.BindData b(qbs qbsVar, qfi qfiVar) {
        qwm d = d(qbsVar);
        if (qkf.m(qbsVar, qfiVar)) {
            return d.a();
        }
        qfm qfmVar = qfiVar.d;
        if (qfmVar == null) {
            qfmVar = qfm.a;
        }
        qei qeiVar = qfmVar.c;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        tap g = rxn.g(qeiVar.d);
        g.v(((rxq) this.l.b()).h(g));
        this.p.g(g, 3);
        return g.a();
    }

    public final Optional c(qbs qbsVar, qfi qfiVar, ParticipantsTable.BindData bindData) {
        int i;
        qwm d = d(qbsVar);
        qfh b = qfh.b(qfiVar.c);
        if (b == null) {
            b = qfh.UNKNOWN_STATE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i = 220;
            } else {
                i = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
            }
        } else {
            i = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        int i2 = i;
        return Optional.ofNullable(((ujv) this.m.b()).f(Optional.empty(), qbsVar.a, d, bindData, alog.r(d.a()), i2, this.q.f().toEpochMilli(), -1L, null));
    }
}
