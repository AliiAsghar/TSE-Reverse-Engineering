package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rru extends rto implements rtm {
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData");
    public final armf a;
    private final armf h;
    private final armf i;
    private final vqu j;
    private final psz k;
    private final oqq l;
    private final xyt m;
    private final wfe n;
    private final psw o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final Context s;
    private final armf t;
    private final ryg u;

    public rru(armf armfVar, armf armfVar2, vqu vquVar, psz pszVar, oqq oqqVar, xyt xytVar, wfe wfeVar, armf armfVar3, psw pswVar, ryg rygVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, Context context) {
        this.h = armfVar;
        this.q = armfVar6;
        this.c = sav.a().a();
        this.d = saj.b().b();
        this.i = armfVar2;
        this.j = vquVar;
        this.k = pszVar;
        this.l = oqqVar;
        this.m = xytVar;
        this.n = wfeVar;
        this.a = armfVar3;
        this.o = pswVar;
        this.u = rygVar;
        this.t = armfVar4;
        this.p = armfVar5;
        this.r = armfVar7;
        this.s = context;
    }

    private final Optional W() {
        if (f() == null) {
            alvw i = g.i();
            i.X(alwp.a, "BugleConversation");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getSubIdFromSelfId", 885, "ConversationListItemData.java")).q("currentSelfId is null");
            return Optional.empty();
        }
        Optional map = Optional.ofNullable(((ryg) this.t.b()).e(f())).map(new rqr(18));
        if (map.isEmpty()) {
            alvw i2 = g.i();
            i2.X(alwp.a, "BugleConversation");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getSubIdFromSelfId", 899, "ConversationListItemData.java")).q("subId is not present");
        }
        return map;
    }

    @Override // defpackage.rtm
    public final boolean A() {
        if (((okf) this.e.b()).a()) {
            return this.d.r();
        }
        return this.c.r();
    }

    public final boolean B() {
        if (!L().b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rtm
    public final boolean C() {
        int h;
        if (((okf) this.e.b()).a()) {
            h = this.d.h();
        } else {
            h = this.c.h();
        }
        if (h == 4) {
            return false;
        }
        if (((okf) this.e.b()).a()) {
            return rtp.d(this.d.r(), this.d.i());
        }
        return rtp.d(this.c.r(), this.c.i());
    }

    final boolean D() {
        if (d() == 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rto
    public final boolean E() {
        int g2;
        if (!ttd.a()) {
            return false;
        }
        if (((okf) this.e.b()).a()) {
            g2 = this.d.g();
        } else {
            g2 = this.c.g();
        }
        if (g2 == 0) {
            return false;
        }
        return true;
    }

    public final lrf F() {
        Integer valueOf;
        String o;
        String p;
        if (c() == 2) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((yje) this.h.b()).c().a);
        }
        if (((okf) this.e.b()).a()) {
            o = this.d.o();
        } else {
            o = this.c.o();
        }
        if (((okf) this.e.b()).a()) {
            p = this.d.p();
        } else {
            p = this.c.p();
        }
        return new lrf(valueOf, o, p);
    }

    @Override // defpackage.rto
    public final int a() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(29, "join_state");
            return sacVar.D;
        }
        san sanVar = this.c;
        sanVar.ao(29, "join_state");
        return sanVar.D;
    }

    @Override // defpackage.rtm
    public final int b() {
        if (((okf) this.e.b()).a()) {
            return this.d.i();
        }
        return this.c.i();
    }

    public final int c() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(22, "participant_count");
            return sacVar.w;
        }
        san sanVar = this.c;
        sanVar.ao(22, "participant_count");
        return sanVar.w;
    }

    @Override // defpackage.rto
    public final int d() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(31, "send_mode");
            return sacVar.F;
        }
        san sanVar = this.c;
        sanVar.ao(31, "send_mode");
        return sanVar.F;
    }

    @Override // defpackage.rto
    public final long e() {
        if (((okf) this.e.b()).a()) {
            return this.d.k();
        }
        return this.c.k();
    }

    @Override // defpackage.rto
    public final SelfIdentityId f() {
        String n;
        if (((okf) this.e.b()).a()) {
            n = this.d.n();
        } else {
            n = this.c.n();
        }
        return lga.W(n);
    }

    @Override // defpackage.rto
    public final MessageUsageStatisticsData g(amgj amgjVar, DeviceData deviceData, long j) {
        amgi j2;
        akrh e = aktp.e("ConversationListItemData::createMessageUsageStatisticsData");
        try {
            int G = G();
            if (((Boolean) ((utz) MessageUsageStatisticsData.b.get()).e()).booleanValue()) {
                j2 = amgi.FIRST_ATTEMPT_TO_SEND;
            } else {
                j2 = j();
            }
            MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl(amgjVar, deviceData, G, j2, amge.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON, k(), i(), l(), m().E, j);
            e.close();
            return messageUsageStatisticsDataImpl;
        } finally {
        }
    }

    @Override // defpackage.rto
    public final xhv h() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(1, "sms_thread_id");
            return sacVar.b;
        }
        san sanVar = this.c;
        sanVar.ao(1, "sms_thread_id");
        return sanVar.b;
    }

    public final amgh i() {
        int j;
        Optional m;
        if (G() == 0) {
            if (d() != 1) {
                if (((okf) this.e.b()).a()) {
                    j = this.d.j();
                } else {
                    j = this.c.j();
                }
                if (((olj) this.q.b()).a()) {
                    Optional W = W();
                    if (!W.isEmpty()) {
                        j = ((Integer) W.get()).intValue();
                    }
                    return amgh.SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES;
                }
                if (((adjc) this.p.b()).w(j)) {
                    Optional n = n();
                    if (!n.isEmpty()) {
                        if (this.o.a()) {
                            m = Optional.of(this.u.n((msh) n.get()));
                        } else {
                            m = this.j.m((msh) n.get());
                        }
                        if (!m.isEmpty() && ((psv) m.get()).f()) {
                            if (D()) {
                                return amgh.CONVERSATION_LATCHED_TO_XMS;
                            }
                            return amgh.OTHER_REASON;
                        }
                    }
                    return amgh.RECEIVER_NOT_AVAILABLE;
                }
                return amgh.SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES;
            }
            return amgh.CONVERSATION_SET_TO_XMS_ONLY;
        }
        return amgh.GROUP_CONVERSATION;
    }

    public final amgi j() {
        int b = b();
        if (b != 6 && b != 7 && b != 8 && b != 19 && b != 9) {
            return amgi.FIRST_ATTEMPT_TO_SEND;
        }
        return amgi.RESEND_ATTEMPT;
    }

    public final amgk k() {
        if (e() != -1) {
            return amgk.WAS_RCS_CONVERSATION;
        }
        return amgk.HAS_ALWAYS_BEEN_XMS_CONVERSATION;
    }

    public final amjk l() {
        amhu amhuVar;
        int i;
        ammd ammdVar;
        aozy createBuilder = amjk.a.createBuilder();
        int i2 = 2;
        if (!((ansy) ((nuh) this.l).a.b()).e("bugle.rcs_contacts_cleanup")) {
            Optional n = n();
            if (n.isPresent()) {
                ammdVar = this.k.d((msh) n.get());
            } else {
                aozy createBuilder2 = ammd.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ammd ammdVar2 = (ammd) createBuilder2.b;
                ammdVar2.d = 0;
                ammdVar2.c = 2;
                ammdVar = (ammd) createBuilder2.s();
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amjk amjkVar = (amjk) createBuilder.b;
            ammdVar.getClass();
            amjkVar.i = ammdVar;
            amjkVar.b |= 128;
        }
        if (!((olj) this.q.b()).a()) {
            amhuVar = this.n.c();
        } else {
            Optional W = W();
            int i3 = 9;
            if (W.filter(new qxi(i3)).isPresent()) {
                alvw i4 = g.i();
                i4.X(alwp.a, "BugleConversation");
                ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getRcsReadinessConditions", 873, "ConversationListItemData.java")).q("Unexpected default subId in rcs readiness conditions");
                amhuVar = this.n.c();
            } else {
                Optional filter = W.filter(new qxi(10));
                wfe wfeVar = this.n;
                wfeVar.getClass();
                amhuVar = (amhu) filter.map(new rpf(wfeVar, i3)).orElseGet(new roi(4));
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amjk amjkVar2 = (amjk) createBuilder.b;
        amhuVar.getClass();
        amjkVar2.c = amhuVar;
        amjkVar2.b |= 1;
        amfg v = lgb.v(Integer.valueOf(G()));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amjk amjkVar3 = (amjk) createBuilder.b;
        amjkVar3.f = v.f;
        amjkVar3.b |= 8;
        if (d() == 1) {
            i = 3;
        } else {
            i = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amjk amjkVar4 = (amjk) createBuilder.b;
        amjkVar4.g = i - 1;
        amjkVar4.b |= 16;
        if (true == D()) {
            i2 = 3;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amjk amjkVar5 = (amjk) createBuilder.b;
        amjkVar5.h = i2 - 1;
        amjkVar5.b |= 32;
        return (amjk) createBuilder.s();
    }

    public final amwt m() {
        return ((vrn) this.m.a()).d();
    }

    @Override // defpackage.rtm
    public final Optional n() {
        String p;
        if (((okf) this.e.b()).a()) {
            p = this.d.p();
        } else {
            p = this.c.p();
        }
        return Optional.ofNullable(p).map(new rpf(this, 10));
    }

    public final Boolean o() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
            n().ifPresent(new rgd(atomicBoolean, 12));
        }
        return Boolean.valueOf(atomicBoolean.get());
    }

    public final Boolean p() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((orj) this.r.b()).a()) {
            n().ifPresent(new rgd(atomicBoolean, 13));
        }
        return Boolean.valueOf(atomicBoolean.get());
    }

    @Override // defpackage.rto
    public final String q() {
        if (K() == mmy.c) {
            return uxh.a.toString();
        }
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(16, "icon");
            return sacVar.q;
        }
        san sanVar = this.c;
        sanVar.ao(16, "icon");
        return sanVar.q;
    }

    @Override // defpackage.rtm
    public final String r() {
        if (uzz.g() && K() == mmy.c && tvu.c(G())) {
            return this.s.getString(R.string.unapproved_group_conversation_name);
        }
        if (((okf) this.e.b()).a()) {
            return this.d.o();
        }
        return this.c.o();
    }

    @Override // defpackage.rtm
    public final String s() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(7, "preview_content_type");
            return sacVar.h;
        }
        san sanVar = this.c;
        sanVar.ao(7, "preview_content_type");
        return sanVar.h;
    }

    @Override // defpackage.rto
    public final String t() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(37, "rcs_group_id");
            return sacVar.L;
        }
        san sanVar = this.c;
        sanVar.ao(37, "rcs_group_id");
        return sanVar.L;
    }

    @Override // defpackage.rto
    public final String u() {
        if (((okf) this.e.b()).a()) {
            rtp rtpVar = this.b;
            sac sacVar = this.d;
            sacVar.ao(58, "first_name");
            String str = sacVar.ag;
            sac sacVar2 = this.d;
            sacVar2.ao(57, "full_name");
            String str2 = sacVar2.af;
            sac sacVar3 = this.d;
            sacVar3.ao(56, "display_destination");
            return rtpVar.a(str, str2, sacVar3.ae);
        }
        rtp rtpVar2 = this.b;
        san sanVar = this.c;
        sanVar.ao(58, "first_name");
        String str3 = sanVar.ag;
        san sanVar2 = this.c;
        sanVar2.ao(57, "full_name");
        String str4 = sanVar2.af;
        san sanVar3 = this.c;
        sanVar3.ao(56, "display_destination");
        return rtpVar2.a(str3, str4, sanVar3.ae);
    }

    public final String v() {
        if (((okf) this.e.b()).a()) {
            if (this.d.at("SNIPPET_TO_USE")) {
                return this.d.an("SNIPPET_TO_USE");
            }
            sac sacVar = this.d;
            sacVar.ao(4, "snippet_text");
            return sacVar.e;
        }
        if (this.c.at("SNIPPET_TO_USE")) {
            return this.c.an("SNIPPET_TO_USE");
        }
        san sanVar = this.c;
        sanVar.ao(4, "snippet_text");
        return sanVar.e;
    }

    @Override // defpackage.rto
    public final String w(String str) {
        String v = v();
        if (A()) {
            return v;
        }
        if (b() == 210) {
            return str;
        }
        return v;
    }

    public final boolean x() {
        String p;
        if (((okf) this.e.b()).a()) {
            p = this.d.p();
        } else {
            p = this.c.p();
        }
        if (!rxn.q(p)) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
            n().ifPresent(new rgd(atomicBoolean, 14));
        }
        if (!x() || atomicBoolean.get()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.rto
    public final boolean z() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(23, "notification_enabled");
            return sacVar.x;
        }
        san sanVar = this.c;
        sanVar.ao(23, "notification_enabled");
        return sanVar.x;
    }
}
