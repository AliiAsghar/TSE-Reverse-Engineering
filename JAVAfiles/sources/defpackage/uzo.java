package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzo {
    public static final xze a = xze.g("BugleDataModel", "DeleteDatabaseOperations");
    public final armf b;
    public final agnq c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    private final armf h;

    public uzo(armf armfVar, agnq agnqVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.b = armfVar;
        this.c = agnqVar;
        this.h = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
    }

    private final uzl h(final ConversationIdType conversationIdType, final long j, final SuperSortLabel superSortLabel, final boolean z) {
        xyl.h();
        ((lgg) this.h.b()).g(new uoa(conversationIdType, 8));
        xyo c = a.c();
        c.H("Delete conversation in transaction");
        c.b(conversationIdType);
        c.y("CutoffTimestamp", j);
        c.A("ClearCMSId", z);
        c.A("IsSpecific", superSortLabel.b());
        c.q();
        return (uzl) this.c.c("DeleteDatabaseOperations#deleteConversation", new alhr() { // from class: uzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.alhr
            public final Object get() {
                String str;
                alog W;
                Object obj;
                Integer valueOf;
                Integer valueOf2;
                Integer valueOf3;
                Integer valueOf4;
                boolean z2;
                int i = alog.d;
                alog alogVar = alsx.a;
                zso zsoVar = new zso();
                boolean z3 = false;
                zsoVar.c(false);
                ConversationIdType conversationIdType2 = conversationIdType;
                int i2 = 1;
                if (z) {
                    xyl.h();
                    sng sngVar = new sng();
                    sngVar.aj("setConversationCmsId");
                    sngVar.X(new xol(conversationIdType2, 11));
                    valueOf3 = Integer.valueOf(a.bp().c());
                    int intValue = valueOf3.intValue();
                    valueOf4 = Integer.valueOf(a.bp().c());
                    int intValue2 = valueOf4.intValue();
                    if (intValue2 < 32000) {
                        agnc.t("cms_id", intValue2);
                    }
                    if (intValue >= 32000) {
                        agnc.r(sngVar.a, "cms_id", "");
                    }
                    if (sngVar.a().e() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xyo c2 = uzo.a.c();
                    c2.A("clearCmsIdSuccess", z2);
                    c2.q();
                }
                smr a2 = sni.a(conversationIdType2);
                if (a2 != null) {
                    str = a2.J();
                } else {
                    str = null;
                }
                if (str != null && !str.isEmpty()) {
                    akrh e = aktp.e("DeleteDatabaseOperations#deleteConversation#excludeMessagesFromCms");
                    try {
                        sya syaVar = new sya();
                        syaVar.aj("DeleteDatabaseOperations#deleteConversation#excludeMessagesFromCms");
                        xxw xxwVar = xxw.EXCLUDED;
                        valueOf = Integer.valueOf(a.bp().c());
                        int intValue3 = valueOf.intValue();
                        valueOf2 = Integer.valueOf(a.bp().c());
                        int intValue4 = valueOf2.intValue();
                        if (intValue4 < 58210) {
                            agnc.t("cms_life_cycle", intValue4);
                        }
                        if (intValue3 >= 58210) {
                            if (xxwVar == null) {
                                syaVar.a.putNull("cms_life_cycle");
                            } else {
                                syaVar.a.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
                            }
                        }
                        syaVar.P(new uuy(conversationIdType2, 13));
                        int e2 = syaVar.a().e();
                        xyo c3 = uzo.a.c();
                        c3.x("excludedMessagesFromCmsCount", e2);
                        c3.q();
                        e.close();
                    } finally {
                    }
                }
                long j2 = j;
                int i3 = 14;
                if (j2 != Long.MAX_VALUE && j2 >= 0) {
                    xyo c4 = uzo.a.c();
                    c4.H("Delete all messages prior to cutoff.");
                    c4.b(conversationIdType2);
                    c4.y("Cut Off", j2);
                    c4.q();
                    sxy d = MessagesTable.d();
                    d.w("deleteConversation");
                    d.e(new uzd(10));
                    d.g(new lce(conversationIdType2, j2, i3));
                    sxx b = d.b();
                    sxu sxuVar = new sxu();
                    sxuVar.b(new uuy(b, 16));
                    W = sxuVar.a().W();
                } else {
                    xyo c5 = uzo.a.c();
                    c5.z("Delete messages, ConversationId", conversationIdType2);
                    c5.q();
                    sxu sxuVar2 = new sxu();
                    sxuVar2.b(new uuy(conversationIdType2, 15));
                    W = sxuVar2.a().W();
                }
                xyo c6 = uzo.a.c();
                c6.H("Messages in conversation were deleted");
                c6.b(conversationIdType2);
                c6.x("DeleteCount", W.size());
                c6.q();
                zsoVar.c = W.size();
                zsoVar.b = (byte) (zsoVar.b | 1);
                alog alogVar2 = (alog) Collection.EL.stream(W).map(new uzd(3)).filter(new uzr(i2)).collect(alls.a);
                if (alogVar2 != null) {
                    zsoVar.d = alogVar2;
                    if (j2 < Long.MAX_VALUE && j2 > 0) {
                        uzo.a.o("Look for any messages left in conversation which are restricted.");
                        sxy d2 = MessagesTable.d();
                        d2.w("deleteConversation2");
                        d2.e(new uzd(4));
                        d2.g(new uuy(conversationIdType2, 7));
                        d2.h(new atkn((Object) MessagesTable.c.i, false));
                        d2.u(1);
                        alogVar = d2.b().g();
                    }
                    if (alogVar.isEmpty()) {
                        snb snbVar = new snb();
                        snbVar.f("deleteConversation");
                        snbVar.b(new uuy(conversationIdType2, 8));
                        int d3 = snbVar.d();
                        if (d3 > 0) {
                            z3 = true;
                        }
                        zsoVar.c(z3);
                        xyo c7 = uzo.a.c();
                        c7.H("Conversations deleted");
                        c7.b(conversationIdType2);
                        c7.x("DeletedCount", d3);
                        c7.A("DeleteSuccess", z3);
                        c7.q();
                    } else {
                        SuperSortLabel superSortLabel2 = superSortLabel;
                        uzo uzoVar = uzo.this;
                        if (superSortLabel2.b()) {
                            MessageCoreData q = ((rwd) uzoVar.d.b()).q((MessageIdType) alogVar.get(0));
                            q.getClass();
                            sng sngVar2 = new sng();
                            sngVar2.aj("DeleteDatabaseOperations#deleteConversation");
                            rwd.P(q, sngVar2, null);
                            sngVar2.X(new uuy(conversationIdType2, 14));
                            sngVar2.a().e();
                            zsoVar.c(true);
                            xyo c8 = uzo.a.c();
                            c8.H("Specific conversation delete success");
                            c8.b(conversationIdType2);
                            c8.z("RestrictedLabel", superSortLabel2);
                            c8.q();
                        } else {
                            xyo c9 = uzo.a.c();
                            c9.H("Conversation delete failure");
                            c9.b(conversationIdType2);
                            c9.A("IsSpecific", superSortLabel2.b());
                            c9.z("LastMessageId", ((MessageIdType) alogVar.get(0)).a());
                            c9.q();
                            ((mbl) uzoVar.g.b()).c("Bugle.ConversationDeletion.Failure.Counts");
                        }
                    }
                    if (zsoVar.b == 3 && (obj = zsoVar.d) != null) {
                        return new uzl(zsoVar.c, (alog) obj, zsoVar.a);
                    }
                    StringBuilder sb = new StringBuilder();
                    if ((zsoVar.b & 1) == 0) {
                        sb.append(" numberOfDeletedMessages");
                    }
                    if (zsoVar.d == null) {
                        sb.append(" messageUrisDeleted");
                    }
                    if ((zsoVar.b & 2) == 0) {
                        sb.append(" isConversationDeleted");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                throw new NullPointerException("Null messageUrisDeleted");
            }
        });
    }

    public final int a(MessageIdType messageIdType) {
        int i;
        akrh e = aktp.e("DeleteDatabaseOperations#deleteMessage");
        try {
            MessageCoreData u = ((rwd) this.d.b()).u(messageIdType);
            if (u != null) {
                i = b(Collections.singletonList(messageIdType), u.z());
            } else {
                i = 0;
            }
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int b(List list, ConversationIdType conversationIdType) {
        int intValue;
        akrh e = aktp.e("DeleteDatabaseOperations#deleteMessagesInConversation");
        try {
            xyl.h();
            if (list.isEmpty()) {
                intValue = 0;
            } else {
                ((lgg) this.h.b()).g(new rge(conversationIdType, list, 14));
                intValue = ((Integer) this.c.c("DeleteDatabaseOperations#deleteMessagesInConversation", new tdw(this, conversationIdType, list, 10, (char[]) null))).intValue();
            }
            e.close();
            return intValue;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final uzl c(ConversationIdType conversationIdType, long j) {
        return d(conversationIdType, SuperSortLabel.ALL, j);
    }

    public final uzl d(ConversationIdType conversationIdType, SuperSortLabel superSortLabel, long j) {
        return h(conversationIdType, j, superSortLabel, false);
    }

    public final uzl e(ConversationIdType conversationIdType, SuperSortLabel superSortLabel, long j) {
        return h(conversationIdType, j, superSortLabel, true);
    }

    public final boolean f(ConversationIdType conversationIdType) {
        Object apply;
        akrh e = aktp.e("DeleteDatabaseOperations#deleteConversationIfEmpty");
        try {
            xyl.h();
            sxy d = MessagesTable.d();
            d.w("deleteConversationIfEmpty#hasNoMessagesQuery");
            d.g(new uuy(conversationIdType, 9));
            boolean z = true;
            d.h(new atkn((Object) MessagesTable.c.i, false));
            d.u(1);
            d.e(new uzd(7));
            boolean M = d.b().M();
            spg b = spj.b();
            b.w("deleteConversationIfEmpty");
            apply = new uuy(conversationIdType, 10).apply(new spi());
            b.k(new agpw((spi) apply));
            b.u(1);
            if (b.b().M()) {
                if (M) {
                    snb snbVar = new snb();
                    snbVar.f("deleteConversationIfEmpty#deleteConversation");
                    snbVar.b(new uuy(conversationIdType, 11));
                    snbVar.d();
                    xyo c = a.c();
                    c.H("Deleted empty");
                    c.b(conversationIdType);
                    c.q();
                    e.close();
                    return z;
                }
                xyo c2 = a.c();
                c2.H("Could not delete empty conversation; has message");
                c2.b(conversationIdType);
                c2.q();
            } else {
                xyo c3 = a.c();
                c3.H("Could not delete empty conversation; has draft");
                c3.b(conversationIdType);
                c3.q();
            }
            z = false;
            e.close();
            return z;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(ConversationIdType conversationIdType, long j) {
        akrh e = aktp.e("DeleteDatabaseOperations#resetConversationDeleteTimeStampIfNoOldMessageExists");
        try {
            xyl.h();
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.C(j);
            syb sybVar = new syb(sycVar);
            sxy d = MessagesTable.d();
            d.w("resetConversationDeleteTimeStampIfNoOldMessageExists");
            d.e(new uzd(8));
            d.k(sybVar);
            sxx b = d.b();
            snh snhVar = new snh();
            snhVar.W(new agow(b));
            snhVar.j(conversationIdType);
            agpw agpwVar = new agpw(snhVar);
            sng sngVar = new sng();
            sngVar.aj("DeleteDatabaseOperations#resetConversationDeleteTimeStampIfNoOldMessageExists.conversations");
            sngVar.l(0L);
            sngVar.Z(agpwVar);
            sngVar.a().e();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
