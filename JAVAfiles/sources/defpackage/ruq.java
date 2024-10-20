package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ruq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataDatabaseOperations");
    public final Context b;
    public final armf c;
    public final agnq d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final xnv h;
    public final uhj i;
    public final ocr j;
    public final armf k;
    private final armf l;
    private final occ m;

    public ruq(Context context, armf armfVar, agnq agnqVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, xnv xnvVar, uhj uhjVar, occ occVar, ocr ocrVar, armf armfVar6) {
        this.b = context;
        this.c = armfVar;
        this.d = agnqVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.l = armfVar5;
        this.h = xnvVar;
        this.i = uhjVar;
        this.m = occVar;
        this.j = ocrVar;
        this.k = armfVar6;
    }

    private final void k(Runnable runnable, final String str, ConversationIdType conversationIdType, boolean z) {
        String str2;
        if (((ansy) ((nle) this.m).a.b()).e("bugle.enable_deduping_update_conversation_meta_data_runnable_in_silo_execution")) {
            str2 = str.concat(String.valueOf(String.valueOf(conversationIdType)));
        } else {
            str2 = null;
        }
        this.d.i(new agnp() { // from class: rup
            @Override // defpackage.agnp
            public final akrh a() {
                return aktp.e(str);
            }
        }, str2, new rhh(this, runnable, z, conversationIdType, 5), agnt.TXN_1);
    }

    public final void a(ConversationIdType conversationIdType, boolean z, tqc tqcVar) {
        if (((Boolean) this.l.b()).booleanValue()) {
            agnq agnqVar = this.d;
            mla mlaVar = new mla(18);
            String valueOf = String.valueOf(String.valueOf(conversationIdType));
            agnqVar.h(mlaVar, "ConversationMetadataDatabaseOperations#refreshConversationMetadataRunAfterCommit#conversationId#".concat(valueOf), new rhh(this, conversationIdType, z, tqcVar, 3));
            return;
        }
        c(new rhh(this, conversationIdType, z, tqcVar, 4), "ConversationMetadataDatabaseOperations#refreshConversationMetadata", conversationIdType);
    }

    public final void b(ConversationIdType conversationIdType, boolean z, tqc tqcVar) {
        MessageIdType E;
        sxy d = MessagesTable.d();
        d.w("runRefreshConversationMetadataReaction");
        svo a2 = svq.a();
        qxr qxrVar = svq.d;
        a2.c((svk) qxrVar.d, (svk) qxrVar.b);
        agog b = agoh.b(a2.b(), (agmh) svq.d.c, MessagesTable.c.a);
        b.f = "message_reactions";
        d.B(b.a());
        syc x = rwd.x(conversationIdType, true);
        int i = 16;
        x.b(new rvy(i), new rvy(20));
        d.k(new syb(x));
        d.h(new atkn((Object) MessagesTable.c.i, false));
        d.u(1);
        d.d(new ruh(i));
        sxt sxtVar = (sxt) d.b().n();
        try {
            sxy d2 = MessagesTable.d();
            d2.w("runRefreshConversationMetadata");
            d2.k(new syb(rwd.y(conversationIdType)));
            d2.h(new atkn((Object) MessagesTable.c.i, false));
            d2.u(1);
            d2.d(new ruh(14));
            sxt sxtVar2 = (sxt) d2.b().n();
            try {
                if (sxtVar.moveToFirst() && sxtVar2.moveToFirst()) {
                    svj svjVar = (svj) ((MessagesTable.BindData) sxtVar.cK()).al("message_reactions", svj.class);
                    svjVar.getClass();
                    svjVar.ao(4, "reaction");
                    wky wkyVar = svjVar.e;
                    wky wkyVar2 = wky.REACTION_TYPE_UNSPECIFIED;
                    long s = sxtVar.s();
                    long s2 = sxtVar2.s();
                    if (wkyVar != wkyVar2 && s > s2) {
                        E = sxtVar.E();
                    } else {
                        E = sxtVar2.E();
                    }
                    d(conversationIdType, E, Long.valueOf(sxtVar2.s()), tqcVar, z);
                } else if (sxtVar2.moveToFirst()) {
                    d(conversationIdType, sxtVar2.E(), Long.valueOf(sxtVar2.s()), tqcVar, z);
                }
                sxtVar2.close();
                sxtVar.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                sxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(Runnable runnable, String str, ConversationIdType conversationIdType) {
        k(runnable, str, conversationIdType, false);
    }

    public final void d(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, tqc tqcVar, boolean z) {
        xyl.h();
        f(conversationIdType, messageIdType, l, tqcVar, null, z);
    }

    public final void e(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, tqc tqcVar, long j, Integer num) {
        xyl.h();
        g(conversationIdType, messageIdType, l, tqcVar, null, true, j, num, null);
    }

    public final void f(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, tqc tqcVar, String str, boolean z) {
        g(conversationIdType, messageIdType, l, tqcVar, str, z, -1L, null, null);
    }

    public final void g(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, tqc tqcVar, String str, boolean z, long j, Integer num, SelfIdentityId selfIdentityId) {
        h(conversationIdType, messageIdType, l, tqcVar, str, z, j, num, selfIdentityId, false);
    }

    public final void h(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final Long l, final tqc tqcVar, final String str, final boolean z, final long j, final Integer num, final SelfIdentityId selfIdentityId, boolean z2) {
        k(new Runnable() { // from class: run
            @Override // java.lang.Runnable
            public final void run() {
                SelfIdentityId h;
                MessageCoreData q;
                ryg rygVar;
                qwm e;
                xyl.h();
                ConversationIdType conversationIdType2 = conversationIdType;
                MessageIdType messageIdType2 = messageIdType;
                ruq ruqVar = ruq.this;
                if (ruqVar.j.a()) {
                    alvw g = ruq.a.g();
                    g.X(alwp.a, "BugleDatabase");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(ydl.p, conversationIdType2);
                    alvgVar.X(ydl.b, messageIdType2);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataDatabaseOperations", "updateConversationMetadata", 184, "ConversationMetadataDatabaseOperations.java")).q("UpdateConversationMetadata: Setting latest message ID for conversation");
                }
                sng sngVar = new sng();
                sngVar.ag();
                if (!messageIdType2.b()) {
                    if (messageIdType2 == null) {
                        sngVar.a.putNull("latest_message_id");
                    } else {
                        sngVar.a.put("latest_message_id", Long.valueOf(rvc.a(messageIdType2)));
                    }
                }
                SelfIdentityId selfIdentityId2 = selfIdentityId;
                if (!TextUtils.isEmpty(lga.X(selfIdentityId2))) {
                    selfIdentityId2.getClass();
                    sngVar.k(((SelfIdentityIdImpl) selfIdentityId2).a);
                }
                Long l2 = l;
                if (l2 != null) {
                    sngVar.T(l2.longValue());
                }
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    agnc.r(sngVar.a, "sms_service_center", str2);
                }
                long j2 = j;
                if (j2 != -1) {
                    if (xyp.c()) {
                        xyl.b(((rtz) ruqVar.g.b()).p(j2), conversationIdType2);
                    }
                    sngVar.N(j2);
                }
                Integer num2 = num;
                if (num2 != null) {
                    num2.intValue();
                    sngVar.v(0);
                }
                tqc tqcVar2 = tqcVar;
                tqc r = ((rtz) ruqVar.g.b()).r(conversationIdType2);
                if (tqcVar2 != null && (r == null || (tqcVar2 != r && !r.h()))) {
                    ((xwt) ruqVar.e.b()).b(conversationIdType2, tqcVar2, amfe.CONVERSATION_FROM_METADATA_UPDATE);
                }
                boolean z3 = z;
                if (!messageIdType2.b() && (q = ((rwd) ruqVar.f.b()).q(messageIdType2)) != null) {
                    if (yig.a() && q.cs() && Collection.EL.stream(((MessageData) q).i).anyMatch(new rsi(10))) {
                        rwd.P(q, sngVar, ruqVar.b.getString(R.string.conversation_photomoji_snippet));
                    } else {
                        rwd.P(q, sngVar, null);
                    }
                    if (z3) {
                        akrh e2 = aktp.e("ConversationMetadataDatabaseOperations#addSelfIdAutoSwitchInfoToContentValues");
                        try {
                            if (q.cw()) {
                                SelfIdentityId h2 = ((rtz) ruqVar.g.b()).h(conversationIdType2);
                                SelfIdentityId v = q.v();
                                if (v != null && ((((pdc) ruqVar.k.b()).a() || h2 != null) && (e = (rygVar = (ryg) ruqVar.c.b()).e(v)) != null && e.i() && !e.j())) {
                                    if (((pdc) ruqVar.k.b()).a()) {
                                        ((rtz) ruqVar.g.b()).Y(e.g(), sngVar);
                                    } else if (h2 != null) {
                                        qwm e3 = rygVar.e(h2);
                                        if (e3 != null && e3.j()) {
                                            e3 = rygVar.b();
                                        }
                                        if (e3 != null && e3.e() != e.e()) {
                                            ((rtz) ruqVar.g.b()).Y(e.g(), sngVar);
                                        }
                                    }
                                }
                            }
                            e2.close();
                        } catch (Throwable th) {
                            try {
                                e2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
                ((rtz) ruqVar.g.b()).U(conversationIdType2, sngVar);
                if (z3 && (h = ((rtz) ruqVar.g.b()).h(conversationIdType2)) != null) {
                    qop.b(ruqVar.b, conversationIdType2, h);
                }
            }
        }, "ConversationMetadataDatabaseOperations#updateConversationMetadata", conversationIdType, z2);
    }

    public final boolean i(ConversationIdType conversationIdType) {
        MessageIdType B;
        MessageIdType messageIdType;
        MessageCoreData k = ((rwd) this.f.b()).k(conversationIdType);
        if (k == null) {
            B = rvc.a;
        } else {
            B = k.B();
        }
        akrh e = aktp.e("ConversationMetadataDatabaseOperations#getStoredLatestMessageId");
        try {
            xyl.h();
            snf e2 = sni.e();
            e2.w("getStoredLatestMessageId");
            e2.f(new ruh(15));
            e2.h(new ruf(conversationIdType, 20));
            sna snaVar = (sna) e2.b().n();
            try {
                if (snaVar.moveToFirst()) {
                    messageIdType = snaVar.D();
                } else {
                    messageIdType = rvc.a;
                }
                snaVar.close();
                e.close();
                if (!B.b() && B.equals(messageIdType)) {
                    return false;
                }
                return true;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(ConversationIdType conversationIdType, tqc tqcVar) {
        c(new rvz((Object) this, (Object) conversationIdType, (Object) tqcVar, 1, (byte[]) null), "ConversationMetadataDatabaseOperations#maybeRefreshConversationMetadata", conversationIdType);
    }
}
