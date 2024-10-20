package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rul implements rtz {
    public static final xze a = xze.g("BugleDataModel", "ConversationDatabaseOperationsImpl");
    public static final alwo b = alwo.o("BugleDataModel");
    private final armf A;
    private final armf B;
    public final armf c;
    public final Optional d;
    public final armf e;
    public final agnq f;
    public final armf g;
    public final xnv h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;

    public rul(armf armfVar, Optional optional, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, agnq agnqVar, armf armfVar7, armf armfVar8, xnv xnvVar, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23) {
        this.c = armfVar;
        this.d = optional;
        this.s = armfVar2;
        this.t = armfVar3;
        this.e = armfVar4;
        this.u = armfVar5;
        this.v = armfVar6;
        this.f = agnqVar;
        this.g = armfVar7;
        this.w = armfVar8;
        this.h = xnvVar;
        this.x = armfVar9;
        this.i = armfVar10;
        this.y = armfVar11;
        this.j = armfVar12;
        this.k = armfVar13;
        this.l = armfVar14;
        this.z = armfVar15;
        this.m = armfVar16;
        this.n = armfVar17;
        this.o = armfVar18;
        this.p = armfVar19;
        this.q = armfVar20;
        this.r = armfVar21;
        this.A = armfVar22;
        this.B = armfVar23;
    }

    public static void aA(sng sngVar) {
        sngVar.Q(false);
        sngVar.q("");
        sngVar.r("");
        sngVar.n("");
        sngVar.o(Uri.EMPTY);
    }

    public static final alog aC(ConversationIdType conversationIdType, boolean z) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getParticipantsForConversation");
        try {
            xyl.h();
            alog t = aF(conversationIdType, z).t();
            e.close();
            return t;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final boolean aE(boolean z, int i) {
        if (!z && i != 2) {
            return false;
        }
        return true;
    }

    private static tay aF(ConversationIdType conversationIdType, boolean z) {
        xyl.h();
        if (z) {
            taz e = ParticipantsTable.e();
            e.w("getParticipantsForConversationQuery");
            e.g(new ruf(conversationIdType, 3));
            return e.b();
        }
        taz e2 = ParticipantsTable.e();
        e2.w("getParticipantsForConversationQuery");
        e2.g(new ruf(conversationIdType, 4));
        return e2.b();
    }

    private static alor aG(List list) {
        return (alor) Collection.EL.stream(list).distinct().collect(alls.a(new rsb(17), new rsb(18)));
    }

    private static Predicate aH(Function function) {
        return new rhq(Collections.newSetFromMap(new ConcurrentHashMap()), function, 2);
    }

    public static sxx au(ConversationIdType conversationIdType) {
        sxy d = MessagesTable.d();
        d.w("+ConversationDatabaseOperationsImpl#getLastTwoMessages");
        syc sycVar = new syc();
        sycVar.f(conversationIdType);
        sycVar.q(false);
        d.f(sycVar);
        d.h(new atkn((Object) MessagesTable.c.i, false));
        d.u(2);
        d.d(new rub(15));
        return d.b();
    }

    @Override // defpackage.rtz
    public final alog A() {
        alog f;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#queryAllUnreadConversations.1");
        try {
            if (uyh.a()) {
                sxy d = MessagesTable.d();
                d.w("queryAllUnreadConversations");
                d.c(MessagesTable.c.b);
                d.g(new rub(2));
                d.t(MessagesTable.c.b);
                srw a2 = srz.a();
                a2.c((srs) srz.e.d);
                a2.d(new rub(3));
                d.p(a2.b());
                snf e2 = sni.e();
                e2.c(sni.c.a);
                e2.h(new rub(4));
                d.p(e2.b());
                f = d.b().f();
            } else {
                sxy d2 = MessagesTable.d();
                d2.w("queryAllUnreadConversations#2");
                d2.g(new rub(5));
                d2.t(MessagesTable.c.b);
                d2.c(MessagesTable.c.b);
                snf e3 = sni.e();
                e3.c(sni.c.a);
                e3.h(new rub(6));
                d2.p(e3.b());
                f = d2.b().f();
            }
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final alog B(alog alogVar) {
        alog alogVar2;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#sanitizeConversationParticipants");
        try {
            xyl.h();
            if (alogVar.isEmpty()) {
                alogVar2 = alsx.a;
            } else {
                alogVar2 = (alog) Collection.EL.stream(alogVar).filter(aH(new rub(9))).collect(alls.a);
                alog alogVar3 = (alog) Collection.EL.stream(alogVar2).filter(new agok(this, ((yjr) this.y.b()).b(), ((yjr) this.y.b()).v(), 1)).collect(alls.a);
                if (!alogVar3.isEmpty()) {
                    alogVar2 = alogVar3;
                }
            }
            e.close();
            return alogVar2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final alog C(alog alogVar) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#sanitizeConversationParticipantsKeepingSelf");
        try {
            xyl.h();
            Stream filter = Collection.EL.stream(alogVar).filter(aH(new rub(9)));
            int i = alog.d;
            alog alogVar2 = (alog) filter.collect(alls.a);
            e.close();
            return alogVar2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final alor D(alog alogVar) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getExistingConversations");
        try {
            aiut.b();
            snf e2 = sni.e();
            e2.w("+getExistingConversations");
            e2.h(new rsc(alogVar, 10));
            alor alorVar = (alor) Collection.EL.stream(e2.b().t()).collect(alls.a(new rsb(19), new rsb(20)));
            e.close();
            return alorVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final alpt E(String str) {
        alpt alptVar;
        String k = ((rxq) this.g.b()).k(str);
        if (TextUtils.isEmpty(k)) {
            return altg.a;
        }
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationsForParticipant_dsdrGroupsFlag");
        try {
            int i = 0;
            int i2 = 1;
            if (((okf) this.j.b()).a()) {
                smm smmVar = new smm(smp.a);
                smmVar.w("getConversationsForParticipant");
                smmVar.e(new rsc(k, 11));
                smmVar.c((smi) smp.d.a);
                alptVar = (alpt) smmVar.b().w().map(new rub(i2)).collect(alls.b);
            } else {
                sla a2 = sld.a();
                a2.w("getConversationsForParticipant");
                a2.f(new rsc(k, 12));
                a2.c((skw) sld.e.d);
                alptVar = (alpt) a2.b().w().map(new rub(i)).collect(alls.b);
            }
            e.close();
            return alptVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final Optional F(ConversationIdType conversationIdType) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationTypeInfo");
        try {
            Optional map = Optional.ofNullable(q(conversationIdType)).map(new rub(18));
            e.close();
            return map;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final Optional G(ConversationIdType conversationIdType) {
        Optional empty = Optional.empty();
        sxt sxtVar = (sxt) au(conversationIdType).n();
        try {
            if (sxtVar.moveToFirst()) {
                empty = Optional.of(Long.valueOf(sxtVar.s()));
            }
            if (sxtVar.getCount() > 1) {
                if (sxtVar.n() == 3) {
                    sxtVar.moveToNext();
                }
                empty = Optional.of(Long.valueOf(sxtVar.s()));
            }
            sxtVar.close();
            return empty;
        } catch (Throwable th) {
            try {
                sxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final Optional H(ConversationIdType conversationIdType) {
        return Optional.ofNullable((vst) sni.g(conversationIdType, new ruh(9))).map(new ruh(10));
    }

    @Override // defpackage.rtz
    public final String I(ConversationIdType conversationIdType) {
        String str;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationName");
        try {
            xyl.h();
            smr q = q(conversationIdType);
            if (q != null) {
                str = q.P();
            } else {
                str = null;
            }
            e.close();
            return str;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    @Deprecated
    public final ArrayList J(xaz xazVar, int i) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationParticipants");
        try {
            ArrayList arrayList = new ArrayList();
            if (xazVar == null) {
                a.q("Failed to get conversation participants: thread data null.");
                e.close();
                return arrayList;
            }
            wyj wyjVar = xazVar.h;
            if (wyjVar != null) {
                int size = xazVar.b.size();
                if (size != 1) {
                    xyo e2 = a.e();
                    e2.H("ThreadData has RBM bot info but number of recipients is");
                    e2.F(size);
                    e2.q();
                }
                String ag = albo.ag((String) wyjVar.b);
                msk mskVar = (msk) this.i.b();
                aozy createBuilder = qei.a.createBuilder();
                qeh qehVar = qeh.BOT;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                qei qeiVar = (qei) apagVar;
                qeiVar.c = qehVar.e;
                qeiVar.b = 1 | qeiVar.b;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                qei qeiVar2 = (qei) createBuilder.b;
                qeiVar2.b |= 2;
                qeiVar2.d = ag;
                if (!xazVar.b.contains(mskVar.b((qei) createBuilder.s()))) {
                    xyo b2 = a.b();
                    b2.H("RBM bot recipient not found in thread data.");
                    b2.C("rbmBotId", ag);
                    b2.q();
                }
                tap f = rxn.f(ag, (String) wyjVar.a, (String) wyjVar.c);
                ((rxq) this.g.b()).h(f);
                arrayList.add(f.a());
                e.close();
                return arrayList;
            }
            this.f.e("ConversationDatabaseOperationsImpl#getConversationParticipants", new mib(this, xazVar, i, arrayList, 3));
            e.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    @Deprecated
    public final List L(xhv xhvVar) {
        alog t;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getParticipantsForThread");
        try {
            xyl.h();
            snf e2 = sni.e();
            e2.w("getParticipantsForThread-conversations");
            e2.f(new ruh(6));
            e2.h(new ruf(xhvVar, 9));
            sne b2 = e2.b();
            akrh e3 = aktp.e("ConversationDatabaseOperationsImpl#getParticipantsForThread_dsdrGroupsFlag");
            try {
                if (((okf) this.j.b()).a()) {
                    smm smmVar = new smm(smp.a);
                    smmVar.w("getParticipantsForThread-conversationParticipants");
                    smmVar.d(new ruh(7));
                    smmVar.e(new ruf(b2, 10));
                    sml b3 = smmVar.b();
                    taz e4 = ParticipantsTable.e();
                    e4.w("getParticipantsForThread-participants");
                    e4.g(new ruf(b3, 11));
                    t = e4.b().t();
                } else {
                    sla a2 = sld.a();
                    a2.w("getParticipantsForThread-conversationParticipants");
                    a2.d(new ruh(8));
                    a2.f(new ruf(b2, 12));
                    skz b4 = a2.b();
                    taz e5 = ParticipantsTable.e();
                    e5.w("getParticipantsForThread-participants");
                    e5.g(new ruf(b4, 13));
                    t = e5.b().t();
                }
                e3.close();
                e.close();
                return t;
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

    @Override // defpackage.rtz
    public final void M(ConversationIdType conversationIdType) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#orphanConversation");
        try {
            xyl.h();
            sng sngVar = new sng();
            sngVar.aj("orphanConversation");
            sngVar.v(2);
            ah(conversationIdType, sngVar);
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

    @Override // defpackage.rtz
    public final void N() {
        this.f.e("ConversationDatabaseOperationsImpl#rebuildConversationAvatars", new rui(this, 1));
    }

    @Override // defpackage.rtz
    public final void O(ConversationIdType conversationIdType) {
        this.f.e("ConversationDatabaseOperationsImpl#refreshConversation", new rah(this, conversationIdType, 15));
        ((uhj) this.u.b()).l(conversationIdType);
        ((uhj) this.u.b()).d(conversationIdType);
    }

    @Override // defpackage.rtz
    public final void P(String str) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#refreshConversationsForParticipant");
        try {
            xyl.h();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            Q(arrayList);
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

    @Override // defpackage.rtz
    public final void Q(ArrayList arrayList) {
        akrh e;
        akrh e2 = aktp.e("ConversationDatabaseOperationsImpl#refreshConversationsForParticipants");
        try {
            xyl.h();
            alpr alprVar = new alpr();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                e = aktp.e("ConversationDatabaseOperationsImpl#getConversationsForParticipants_dsdrGroupsFlag");
                try {
                    if (((okf) this.j.b()).a()) {
                        smm smmVar = new smm(smp.a);
                        smmVar.w("getConversationsForParticipants");
                        smmVar.e(new ruf(str, 1));
                        smj smjVar = (smj) smmVar.b().n();
                        while (smjVar.moveToNext()) {
                            try {
                                alprVar.c(smjVar.f());
                            } finally {
                            }
                        }
                        smjVar.close();
                    } else {
                        sla a2 = sld.a();
                        a2.w("getConversationsForParticipants");
                        a2.f(new ruf(str, 7));
                        skx skxVar = (skx) a2.b().n();
                        while (skxVar.moveToNext()) {
                            try {
                                alprVar.c(skxVar.f());
                            } finally {
                            }
                        }
                        skxVar.close();
                    }
                    e.close();
                } finally {
                }
            }
            alpt g = alprVar.g();
            ahqq a3 = ((mgv) this.x.b()).a();
            e = aktp.e("ConversationDatabaseOperationsImpl#refreshConversations");
            try {
                if (!g.isEmpty()) {
                    Iterator<E> it2 = g.iterator();
                    while (it2.hasNext()) {
                        O((ConversationIdType) it2.next());
                    }
                    ((uhj) this.u.b()).c();
                    xyo c = a.c();
                    c.H("Number of conversations refreshed.");
                    c.K("conversationIds", g);
                    c.q();
                    ((mbl) this.s.b()).e("Bugle.RefreshConversations.UpdatedConversations.Count", g.size());
                }
                e.close();
                ((mgv) this.x.b()).h(a3, new ahka("ConversationDatabaseOperationsImpl#refreshConversations"));
                e2.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final void R(ConversationIdType conversationIdType) {
        smr q = q(conversationIdType);
        if (q != null && q.h() != 2) {
            return;
        }
        this.f.e("ConversationDatabaseOperationsImpl#refreshParticipantCountForRcsGroup", new itl((Object) this, (Object) conversationIdType, (Object) ((ryg) this.c.b()).d().g(), 19, (byte[]) null));
    }

    @Override // defpackage.rtz
    public final void S(ConversationIdType conversationIdType, MessageCoreData messageCoreData, boolean z) {
        this.f.e("ConversationDatabaseOperationsImpl#updateConversationDraftSnippetAndPreview", new rhh(this, z, conversationIdType, messageCoreData, 2));
    }

    @Override // defpackage.rtz
    public final void T(ConversationIdType conversationIdType, String str, int i, boolean z) {
        xyl.h();
        this.f.e("ConversationDatabaseOperationsImpl#updateConversationNameAndAvatar", new ruk(this, str, conversationIdType, i, z, 0));
    }

    @Override // defpackage.rtz
    public final void U(ConversationIdType conversationIdType, sng sngVar) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#updateConversationRow");
        try {
            xyl.h();
            albo.T(ah(conversationIdType, sngVar));
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

    @Override // defpackage.rtz
    public final void V(String str, ParticipantCoreColor participantCoreColor) {
        ((rxq) this.g.b()).n(str, participantCoreColor);
        if (participantCoreColor.a() != 0) {
            P(str);
            ((uhj) this.u.b()).b();
            ((uhj) this.u.b()).a();
        }
    }

    @Override // defpackage.rtz
    public final void W(Set set, String str, String str2) {
        d.s(!set.isEmpty());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f.e("ConversationDatabaseOperationsImpl#updateParticipantIdList", new itl((ConversationIdType) it.next(), str2, str, 20));
        }
    }

    @Override // defpackage.rtz
    public final void X(Set set, ParticipantsTable.BindData bindData) {
        d.s(!set.isEmpty());
        sng sngVar = new sng();
        sngVar.aj("updateParticipantRelatedConversationDataForOneOnOneConversations");
        snh snhVar = new snh();
        snhVar.l(set);
        snhVar.e(0);
        sngVar.W(snhVar);
        sngVar.E(bindData.N());
        sngVar.F(bindData.O());
        sngVar.C(bindData.J());
        sngVar.A(bindData.s());
        if (sngVar.a().e() == 0) {
            alwl alwlVar = (alwl) b.h();
            alwlVar.Z(alwk.LARGE);
            alwlVar.X(ydl.m, bindData.M());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateParticipantRelatedConversationDataForOneOnOneConversations", 2039, "ConversationDatabaseOperationsImpl.java")).q("Failed to update conversation table with new participant data.");
        }
    }

    @Override // defpackage.rtz
    public final boolean Y(SelfIdentityId selfIdentityId, sng sngVar) {
        taz e = ParticipantsTable.e();
        e.w("addConversationSelfIdToContentValues");
        boolean z = false;
        e.g(new ruf(selfIdentityId, 0 == true ? 1 : 0));
        e.e(new rub(16));
        tav tavVar = (tav) e.b().n();
        try {
            if (tavVar.getCount() > 0) {
                sngVar.k(selfIdentityId.b());
                z = true;
            }
            tavVar.close();
            return z;
        } catch (Throwable th) {
            try {
                tavVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final boolean Z(Optional optional, final ParticipantsTable.BindData bindData, final rux ruxVar, final ConversationIdType conversationIdType, final boolean z, final boolean z2) {
        boolean z3;
        if (bindData.p() == -2) {
            z3 = true;
        } else {
            z3 = false;
        }
        d.t(z3, "Is possible to persist just other participants (subId = -2)");
        final boolean isPresent = optional.filter(new rhq(this, bindData, 3)).isPresent();
        return ((Boolean) this.f.c("ConversationDatabaseOperationsImpl#addParticipantToConversation", new alhr() { // from class: ruj
            /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
            @Override // defpackage.alhr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object get() {
                /*
                    r15 = this;
                    rul r0 = defpackage.rul.this
                    armf r1 = r0.g
                    java.lang.Object r1 = r1.b()
                    rxq r1 = (defpackage.rxq) r1
                    com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r2 = r2
                    boolean r3 = r3
                    java.lang.String r1 = r1.j(r2, r3)
                    r1.getClass()
                    long r2 = java.lang.Long.parseLong(r1)
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = r6
                    boolean r5 = r5
                    rux r6 = r4
                    qfe r6 = r6.a
                    r7 = 0
                    r8 = -1
                    r10 = 1
                    if (r5 == 0) goto L3a
                    xze r5 = defpackage.rul.a
                    xyo r5 = r5.a()
                    java.lang.String r11 = "Skipping insertion of self participant in ConversationParticipantsTable"
                    r5.H(r11)
                    r5.e(r1)
                    r5.q()
                L38:
                    r5 = r10
                    goto L78
                L3a:
                    java.lang.String[] r5 = defpackage.sld.a
                    int r5 = defpackage.ske.a
                    skv r5 = new skv
                    r5.<init>()
                    r5.c(r4)
                    r5.d(r2)
                    r5.e(r6)
                    sku r5 = r5.a()
                    agnw r11 = defpackage.d.P()
                    agnw r12 = defpackage.d.P()
                    skt r13 = new skt
                    r14 = 2
                    r13.<init>(r11, r14)
                    rug r11 = new rug
                    r14 = 18
                    r11.<init>(r5, r14)
                    java.lang.String r14 = "conversation_participants"
                    long r11 = defpackage.agnc.a(r12, r14, r5, r13, r11)
                    java.lang.Long r5 = java.lang.Long.valueOf(r11)
                    r5.getClass()
                    int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                    if (r5 == 0) goto L77
                    goto L38
                L77:
                    r5 = r7
                L78:
                    tcs r11 = defpackage.smp.c()
                    r11.k(r4)
                    r11.m(r2)
                    r11.n(r6)
                    smh r2 = r11.h()
                    agnw r3 = defpackage.d.P()
                    agnw r6 = defpackage.d.P()
                    skt r11 = new skt
                    r12 = 4
                    r11.<init>(r3, r12)
                    rbc r3 = new rbc
                    r12 = 12
                    r3.<init>(r12)
                    java.lang.String r12 = "conversation_to_participants"
                    long r2 = defpackage.agnc.a(r6, r12, r2, r11, r3)
                    java.lang.Long r6 = java.lang.Long.valueOf(r2)
                    r6.getClass()
                    xze r6 = defpackage.rul.a
                    xyo r6 = r6.a()
                    r6.b(r4)
                    r6.e(r1)
                    java.lang.String r1 = "ConversationToParticipantsTable convToPartRowId: "
                    java.lang.String r1 = defpackage.a.ck(r2, r1)
                    r6.H(r1)
                    r6.q()
                    int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r1 == 0) goto Lc8
                    r7 = r10
                Lc8:
                    r1 = r5 & r7
                    if (r1 == 0) goto Ld6
                    boolean r2 = r7
                    if (r2 == 0) goto Ld6
                    r0.O(r4)
                    r0.R(r4)
                Ld6:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ruj.get():java.lang.Object");
            }
        })).booleanValue();
    }

    @Override // defpackage.rtz
    public final int a(ConversationIdType conversationIdType) {
        int i;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationJoinState");
        try {
            xyl.h();
            smr q = q(conversationIdType);
            if (q != null) {
                i = q.l();
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

    public final void aB(int i) {
        ((mbl) this.t.b()).e("Bugle.DataModel.Data.CreateRcsGroupConversation.SelfParticipantInserted.Counts", i);
    }

    public final void aD(ConversationIdType conversationIdType) {
        xyl.h();
        this.f.e("ConversationDatabaseOperationsImpl#updateConversationAddContactBannerStatus", new rui(conversationIdType, 0));
    }

    @Override // defpackage.rtz
    public final boolean aa(ConversationIdType conversationIdType) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#conversationHasEmail");
        try {
            xyl.h();
            boolean booleanValue = ((Boolean) sni.f(conversationIdType, new ruh(1), new roi(8))).booleanValue();
            e.close();
            return booleanValue;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final boolean ab(ConversationIdType conversationIdType) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#hasRbmBotRecipient");
        try {
            xyl.h();
            smr q = q(conversationIdType);
            boolean z = false;
            if (q != null) {
                if (q.ac()) {
                    z = true;
                }
            }
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

    @Override // defpackage.rtz
    public final boolean ac(long j) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#isExistingMmsGroupConversation");
        try {
            akrh e2 = aktp.e("ConversationDatabaseOperationsImpl#isExistingConversation");
            try {
                xyl.h();
                snf e3 = sni.e();
                e3.w("isExistingConversation");
                e3.h(new ilg(j, 19));
                e3.f(new ruh(4));
                sna snaVar = (sna) e3.b().n();
                try {
                    boolean moveToFirst = snaVar.moveToFirst();
                    snaVar.close();
                    e2.close();
                    e.close();
                    return moveToFirst;
                } finally {
                }
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

    @Override // defpackage.rtz
    public final boolean ad(String str) {
        snf e = sni.e();
        e.w("rcsGroupConversationExists");
        e.f(new ruh(2));
        e.h(new ruf(str, 8));
        if (!e.b().f().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rtz
    public final boolean ae(ConversationIdType conversationIdType, String str) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#isParticipantInConversation");
        try {
            xyl.h();
            akrh e2 = aktp.e("ConversationDatabaseOperationsImpl#isParticipantInConversation_dsdrGroupsFlag");
            try {
                boolean z = true;
                if (((okf) this.j.b()).a()) {
                    smm smmVar = new smm(smp.a);
                    smmVar.w("isParticipantInConversation");
                    smmVar.e(new rbp(conversationIdType, str, 14));
                    smj smjVar = (smj) smmVar.b().n();
                    try {
                        if (smjVar.getCount() <= 0) {
                            z = false;
                        }
                        smjVar.close();
                    } finally {
                    }
                } else {
                    sla a2 = sld.a();
                    a2.w("isParticipantInConversation");
                    a2.f(new rbp(conversationIdType, str, 15));
                    skx skxVar = (skx) a2.b().n();
                    try {
                        if (skxVar.getCount() <= 0) {
                            z = false;
                        }
                        skxVar.close();
                    } finally {
                    }
                }
                e2.close();
                e.close();
                return z;
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

    @Override // defpackage.rtz
    public final boolean af(ConversationIdType conversationIdType) {
        aiut.b();
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#isRevocationSupported");
        try {
            smr q = q(conversationIdType);
            boolean z = false;
            if (q != null) {
                if (q.ah()) {
                    z = true;
                }
            }
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

    @Override // defpackage.rtz
    public final boolean ag(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, boolean z) {
        return ((Boolean) this.f.c("ConversationDatabaseOperationsImpl#removeParticipantFromConversation", new mma(this, (Object) bindData, conversationIdType, z, 8))).booleanValue();
    }

    @Override // defpackage.rtz
    public final boolean ah(ConversationIdType conversationIdType, sng sngVar) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#updateConversationRowIfExists");
        try {
            xyl.h();
            boolean e2 = sngVar.e(conversationIdType);
            e.close();
            return e2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final boolean ai(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        xyl.h();
        snf e = sni.e();
        e.w("updateConversationSelfIdCheck");
        e.e(new rub(10));
        e.h(new rbp(selfIdentityId, conversationIdType, 13));
        if (e.b().K()) {
            ((alwl) ((alwl) b.g()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateConversationSelfId", 2440, "ConversationDatabaseOperationsImpl.java")).t("Skipping self-id update, conversationId=%s", conversationIdType);
            return false;
        }
        return ((Boolean) this.f.c("ConversationDatabaseOperationsImpl#updateConversationSelfId", new raa(this, selfIdentityId, conversationIdType, 3))).booleanValue();
    }

    @Override // defpackage.rtz
    public final boolean aj(ConversationIdType conversationIdType, String str, rux ruxVar) {
        return ((Boolean) this.f.c("ConversationDatabaseOperationsImpl#updateParticipantJoinStatusInConversation", new rka(this, str, conversationIdType, ruxVar, 2))).booleanValue();
    }

    @Override // defpackage.rtz
    public final boolean ak(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType) {
        return Z(Optional.empty(), bindData, new rux(qfe.JOINED), conversationIdType, true, false);
    }

    @Override // defpackage.rtz
    public final void al(List list, ConversationIdType conversationIdType, boolean z) {
        ((Boolean) this.f.c("ConversationDatabaseOperationsImpl#addParticipantsToConversation", new mma(this, (Object) aG(list), conversationIdType, z, 7))).booleanValue();
    }

    @Override // defpackage.rtz
    public final boolean am(Optional optional, List list, ConversationIdType conversationIdType, boolean z) {
        return ((Boolean) this.f.c("ConversationDatabaseOperationsImpl#addParticipantsToConversation", new muc(this, aG(list), optional, conversationIdType, z, 2))).booleanValue();
    }

    @Override // defpackage.rtz
    public final ConversationIdType an(long j, tqc tqcVar, List list, int i, String str, long j2) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#createConversationId");
        try {
            ConversationIdType conversationIdType = (ConversationIdType) this.f.c("ConversationDatabaseOperationsImpl#createConversationIdTransaction", new rue(this, list, j, ((ryg) this.c.b()).d().g(), tqcVar, i, str, j2, 0));
            e.close();
            return conversationIdType;
        } finally {
        }
    }

    @Override // defpackage.rtz
    public final ConversationIdType ao(long j, tqc tqcVar, List list) {
        return ap(wym.a, j, tqcVar, list, -1L).a;
    }

    @Override // defpackage.rtz
    public final rut ap(wxs wxsVar, final long j, final tqc tqcVar, final List list, final long j2) {
        agnw d;
        xyl.h();
        agnm agnmVar = new agnm(new ruc(this, wxsVar, j, 0));
        agnk agnkVar = new agnk(new rub(13));
        agnl agnlVar = new agnl(new Function() { // from class: rud
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo416andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rut.b(rul.this.an(j, tqcVar, list, 0, null, j2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d = agnc.d("$primary");
        Object obj = agnc.a;
        Object obj2 = agnmVar.get();
        if (agnkVar.apply(obj2).booleanValue()) {
            agnc.G().b("getOrCreateConversationWithResult-slowpath");
            obj2 = d.s("optimisticUpdate", new tdw((Object) agnmVar, (Object) agnkVar, (Object) agnlVar, 20, (byte[]) null));
        } else {
            agnc.G().b("getOrCreateConversationWithResult-fastpath");
        }
        return (rut) obj2;
    }

    @Override // defpackage.rtz
    public final /* bridge */ /* synthetic */ List aq(ConversationIdType conversationIdType) {
        return aC(conversationIdType, true);
    }

    @Override // defpackage.rtz
    public final void ar(List list, ConversationIdType conversationIdType) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong(((rxq) this.g.b()).g((ParticipantsTable.BindData) it.next()))));
        }
        sky skyVar = new sky();
        skyVar.f("removeParticipantsFromConversation");
        byte[] bArr = null;
        skyVar.b(new rbp(arrayList, conversationIdType, 8, bArr));
        boolean z2 = true;
        if (skyVar.d() > 0) {
            z = true;
        } else {
            z = false;
        }
        smk smkVar = new smk();
        smkVar.f("removeParticipantsFromConversation");
        smkVar.b(new rbp(arrayList, conversationIdType, 9, bArr));
        if (smkVar.d() <= 0) {
            z2 = false;
        }
        if (z | z2) {
            O(conversationIdType);
        }
    }

    public final int as(int i, boolean z, int i2) {
        if (((orj) this.A.b()).a() && i == 9) {
            return 0;
        }
        if (i == 0 && !z) {
            if (i2 <= 1) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public final int at(List list, int i) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getParticipantCount_2_dsdrGroupsFlag");
        try {
            if (((okf) this.j.b()).a() && i == 2) {
                alpr alprVar = new alpr();
                Collection.EL.stream(list).forEach(new rug(alprVar, 0));
                alpt g = alprVar.g();
                taz e2 = ParticipantsTable.e();
                e2.w("getParticipantCount");
                e2.g(new ruf(g, 5));
                boolean K = e2.b().K();
                int size = list.size() - (K ? 1 : 0);
                e.close();
                return size;
            }
            int size2 = list.size();
            e.close();
            return size2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final alog av(wxs wxsVar, long j) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getAllExistingConversations");
        try {
            ((wxt) this.w.b()).a(wxsVar);
            snf e2 = sni.e();
            e2.w("getAllExistingConversations");
            e2.h(new ilg(j, 18));
            e2.f(new ruh(3));
            alog f = e2.b().f();
            if (!f.isEmpty() && ((alsx) f).c != 1) {
                xyo e3 = a.e();
                e3.H("Unexpected cursor size:");
                e3.F(((alsx) f).c);
                e3.r(new Throwable());
            }
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    /* renamed from: aw, reason: merged with bridge method [inline-methods] */
    public final alog K(ConversationIdType conversationIdType) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getParticipantsForConversation_dsdrGroupsFlag");
        try {
            alog aC = aC(conversationIdType, ((okf) this.j.b()).a());
            e.close();
            return aC;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog ax(Optional optional, ConversationIdType conversationIdType, Optional optional2) {
        alog K = K(conversationIdType);
        if (((Integer) optional2.orElseGet(new mau(this, conversationIdType, 15, null))).intValue() != 2) {
            return K;
        }
        if (optional.isPresent()) {
            Stream filter = Collection.EL.stream(K).filter(new qxp((qei) optional.get(), 14));
            int i = alog.d;
            return (alog) filter.collect(alls.a);
        }
        xyo e = a.e();
        e.H("Failed to remove self from the list of message recipients as selfParticipant is empty.");
        e.q();
        return K;
    }

    public final void ay(smt smtVar, List list, int i) {
        sng sngVar = new sng();
        sngVar.aj("fillParticipantData");
        az(sngVar, list, i);
        smtVar.X(sngVar.a.getAsLong("participant_contact_id").longValue());
        smtVar.ab(sngVar.d());
        smtVar.ac(sngVar.d());
        smtVar.Z(sngVar.a.getAsString("participant_display_destination"));
        smtVar.z(sngVar.a.getAsBoolean("has_ea2p_bot_recipient").booleanValue());
        if (sngVar.a().l(sni.c.t.toString())) {
            smtVar.A(sngVar.a.getAsString("icon"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void az(sng sngVar, List list, int i) {
        boolean z;
        long j;
        String str;
        String str2;
        int i2;
        boolean z2;
        String str3;
        Integer valueOf;
        Integer valueOf2;
        Uri b2;
        alog alogVar;
        long j2;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str4 = null;
        if (z) {
            boolean i3 = vcp.i(list);
            if (i == 0) {
                xyl.a(1, list.size());
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) list.get(0);
                long s = bindData.s();
                String N = bindData.N();
                String O = bindData.O();
                str3 = bindData.J();
                str2 = O;
                str = N;
                j2 = s;
                i2 = 0;
            } else {
                str = null;
                str2 = null;
                j2 = 0;
                i2 = i;
                str3 = null;
            }
            z2 = i3;
            j = j2;
        } else {
            j = 0;
            str = null;
            str2 = null;
            i2 = i;
            z2 = false;
            str3 = null;
        }
        sngVar.A(j);
        sngVar.E(str);
        sngVar.F(str2);
        sngVar.C(str3);
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 12001) {
            agnc.t("has_ea2p_bot_recipient", intValue2);
        }
        if (intValue >= 12001) {
            sngVar.a.put("has_ea2p_bot_recipient", Boolean.valueOf(z2));
        }
        if (((Boolean) this.z.b()).booleanValue()) {
            if (i2 == 0 && list.size() == 1) {
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) list.get(0);
                if (!TextUtils.isEmpty(bindData2.M())) {
                    String M = bindData2.M();
                    tdj a2 = ProfilesTable.a();
                    a2.w("getProfileForParticipant");
                    a2.d(new rub(12));
                    a2.e(new rsc(M, 19));
                    ProfilesTable.BindData bindData3 = (ProfilesTable.BindData) ((tdh) a2.b().n()).cO();
                    if (bindData3 != null && !TextUtils.isEmpty(bindData3.l()) && TextUtils.isEmpty(bindData2.K()) && TextUtils.isEmpty(bindData2.L())) {
                        str4 = vom.b(bindData3.l());
                    }
                }
            }
            sngVar.V(str4);
        }
        if (z) {
            akrh e = aktp.e("ConversationDatabaseOperationsImpl#fillParticipantData_dsdrGroupsFlag");
            try {
                if (((okf) this.j.b()).a()) {
                    ryt i4 = ((uie) this.n.b()).i(alog.n(list));
                    qya qyaVar = (qya) this.v.b();
                    if (i4.b.isEmpty()) {
                        alogVar = i4.a;
                    } else {
                        alogVar = i4.b;
                    }
                    d.t(!alogVar.isEmpty(), "Participants must be provided.");
                    if (alogVar.size() == 1) {
                        b2 = qyaVar.a((ParticipantsTable.BindData) alogVar.get(0));
                    } else {
                        b2 = xvc.f((Context) qyaVar.a, (alog) Collection.EL.stream(alogVar).limit(4L).map(new qwz(qyaVar, 4)).collect(alls.a));
                    }
                } else {
                    b2 = ((qya) this.v.b()).b(list);
                }
                e.close();
                sngVar.u(b2.toString());
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

    @Override // defpackage.rtz
    public final int b(ConversationIdType conversationIdType) {
        int i;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationSourceType");
        try {
            aiut.b();
            smr q = q(conversationIdType);
            if (q != null) {
                i = q.q();
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

    @Override // defpackage.rtz
    public final int c(ConversationIdType conversationIdType) {
        int i;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationType");
        try {
            smr q = q(conversationIdType);
            if (q != null) {
                i = q.h();
            } else {
                i = -1;
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

    @Override // defpackage.rtz
    public final int d(ConversationIdType conversationIdType) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getParticipantsForConversationCount_dsdrGroupsFlag");
        try {
            int i = aF(conversationIdType, ((okf) this.j.b()).a()).i();
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

    @Override // defpackage.rtz
    public final int e(List list, boolean z) {
        Integer valueOf;
        Integer valueOf2;
        aiut.b();
        snh snhVar = new snh();
        snhVar.l(list);
        if (!z) {
            snhVar.o();
        }
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#updateMarkAsUnread");
        try {
            sng sngVar = new sng();
            sngVar.aj("updateMarkedAsUnread");
            sngVar.Z(new agpw(snhVar));
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf2.intValue();
            if (intValue2 < 59220) {
                agnc.t("marked_as_unread", intValue2);
            }
            if (intValue >= 59220) {
                sngVar.a.put("marked_as_unread", Boolean.valueOf(z));
            }
            int e2 = sngVar.a().e();
            e.close();
            return e2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final long f(ConversationIdType conversationIdType) {
        long j;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationRcsSession");
        try {
            xyl.h();
            smr q = q(conversationIdType);
            if (q != null) {
                j = q.s();
            } else {
                j = -1;
            }
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final long g(ConversationIdType conversationIdType) {
        long j;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationSortTimestamp");
        try {
            smr q = q(conversationIdType);
            if (q != null) {
                j = q.u();
            } else {
                j = 0;
            }
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final SelfIdentityId h(ConversationIdType conversationIdType) {
        String str;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationSelfId");
        try {
            xyl.h();
            smr q = q(conversationIdType);
            if (q != null) {
                str = q.K();
            } else {
                str = null;
            }
            SelfIdentityId W = lga.W(str);
            e.close();
            return W;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final /* synthetic */ rut i(ruv ruvVar) {
        return j(ruvVar, false);
    }

    @Override // defpackage.rtz
    public final rut j(ruv ruvVar, boolean z) {
        return (rut) this.f.c("ConversationDatabaseOperationsImpl#getOrCreateConversation", new mry(this, z, ruvVar, 2));
    }

    @Override // defpackage.rtz
    public final ConversationIdType k(final ruv ruvVar) {
        ConversationIdType conversationIdType = (ConversationIdType) this.f.c("ConversationDatabaseOperationsImpl#createConversation", new alhr() { // from class: rua
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.alhr
            public final Object get() {
                Optional optional;
                ruv ruvVar2 = ruvVar;
                Optional optional2 = ruvVar2.d;
                rul rulVar = rul.this;
                SelfIdentityId selfIdentityId = (SelfIdentityId) optional2.orElseGet(new rnb(rulVar, 7));
                alog alogVar = ruvVar2.f;
                if (alogVar.isEmpty()) {
                    rul.a.q("Creating conversation with empty list; using unknown sender.");
                    armf armfVar = rulVar.g;
                    tap h = vcp.h("ʼUNKNOWN_SENDER!ʼ");
                    ((rxq) armfVar.b()).h(h);
                    alogVar = alog.r(h.a());
                }
                int as = rulVar.as(ruvVar2.j, ruvVar2.o, ruvVar2.f.size());
                Optional.empty();
                if (tvu.e(as)) {
                    optional = ruvVar2.e.or(new mau(rulVar, ruvVar2, 14, null));
                    akrh e = aktp.e("ConversationDatabaseOperationsImpl#createConversation_dsdrGroupsFlag");
                    try {
                        if (!((okf) rulVar.j.b()).a() || !ruvVar2.n) {
                            Optional map = optional.map(new ruh(11));
                            boolean z = ruvVar2.n;
                            int i = ruvVar2.u;
                            if (map.isEmpty()) {
                                if (rul.aE(z, i)) {
                                    if (rul.aE(z, i)) {
                                        rulVar.aB(4);
                                        ((alwl) ((alwl) rul.b.i()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "addSelfParticipantToParticipantList", 1110, "ConversationDatabaseOperationsImpl.java")).q("Self participant is not being set when recovering from telephony.");
                                    }
                                } else {
                                    rulVar.aB(3);
                                    throw new IllegalStateException("Self participant is not set.");
                                }
                            } else {
                                if (rul.aE(z, i)) {
                                    rulVar.aB(2);
                                } else {
                                    rulVar.aB(1);
                                }
                                if (!Collection.EL.stream(alogVar).anyMatch(new qxp((String) map.get(), 12))) {
                                    alob alobVar = new alob();
                                    alobVar.j(alogVar);
                                    alobVar.h(rxn.b((String) map.get()));
                                    alogVar = alobVar.g();
                                }
                            }
                            alogVar = alog.n(alogVar);
                        }
                        e.close();
                    } finally {
                    }
                } else {
                    optional = ruvVar2.e;
                }
                alog alogVar2 = ruvVar2.f;
                int size = alogVar2.size();
                boolean z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) alogVar2.get(i2);
                    if (as != 2) {
                        d.s(!ryg.l(bindData));
                    }
                    z2 |= vcp.j(bindData);
                }
                xhv xhvVar = ruvVar2.b;
                smt c = sni.c();
                c.ar(xhvVar);
                c.at(0L);
                c.k(selfIdentityId.b());
                c.Y(rulVar.at(alogVar, as));
                c.C(z2);
                c.au(0);
                c.c(ruvVar2.c);
                c.S(ruvVar2.g);
                c.U(ruvVar2.h);
                c.T((String) ruvVar2.i.orElse(null));
                c.aa((String) ruvVar2.k.orElse(null));
                c.i(as);
                c.al(ruvVar2.l);
                c.E(ruvVar2.j);
                c.av(false);
                long j = ruvVar2.l;
                if (j != -1) {
                    if (xyp.c() || ((Boolean) utw.ad.e()).booleanValue()) {
                        albo.T(rulVar.p(j).b());
                    }
                    c.al(j);
                }
                if (ruvVar2.o && !ruvVar2.n) {
                    c.ai(Optional.of(rulVar.h.f()));
                }
                if (ruvVar2.o || ruvVar2.n) {
                    ruvVar2.p.ifPresent(new rug(c, 6));
                    ruvVar2.q.ifPresent(new rgd(c, 18));
                    ruvVar2.r.ifPresent(new rgd(c, 19));
                }
                if (ruvVar2.n) {
                    c.g(xxw.RESTORED_FROM_TELEPHONY);
                }
                ruvVar2.s.ifPresent(new rug(c, 1));
                rulVar.ay(c, alogVar, as);
                ConversationIdType y = c.a().y();
                rulVar.am(optional, alogVar, y, ruvVar2.n);
                rulVar.T(y, (String) ruvVar2.m.orElse(null), as, true);
                if (!ruvVar2.n) {
                    rulVar.aD(y);
                }
                ((alwl) ((alwl) rul.b.g()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 1054, "ConversationDatabaseOperationsImpl.java")).J("ConversationDatabaseOperationsImpl: created id=%s with participantIds=%s and destinations=%s", y, Collection.EL.stream(alogVar).map(new rub(7)).collect(alls.a), Collection.EL.stream(alogVar).map(new rub(8)).map(new rsc(((qxr) rulVar.r.b()).b(), 16)).collect(alls.a));
                return y;
            }
        });
        ((lrf) this.q.b()).m(conversationIdType, ruvVar.v);
        return conversationIdType;
    }

    @Override // defpackage.rtz
    public final /* synthetic */ ConversationIdType l(long j) {
        return n(wym.a, j);
    }

    @Override // defpackage.rtz
    public final /* synthetic */ ConversationIdType m(xhv xhvVar) {
        return uxi.j(this, xhvVar);
    }

    @Override // defpackage.rtz
    public final ConversationIdType n(wxs wxsVar, long j) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getExistingConversation");
        try {
            xyl.h();
            ((wxt) this.w.b()).a(wxsVar);
            ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(av(wxsVar, j)).findFirst().orElse(ruy.a);
            e.close();
            return conversationIdType;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final ConversationIdType o(wxs wxsVar, xhv xhvVar) {
        if (xhvVar.d()) {
            return ruy.a;
        }
        ((wxt) this.w.b()).a(wxsVar);
        return n(wxsVar, yyb.cE(xhvVar));
    }

    @Override // defpackage.rtz
    public final ConversationIdType p(long j) {
        ConversationIdType conversationIdType;
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getExistingRcsConversation");
        try {
            xyl.h();
            xyl.e(-1L, j);
            snf e2 = sni.e();
            e2.w("getExistingRcsConversation");
            e2.f(new ruh(13));
            e2.h(new ilg(j, 20));
            sna snaVar = (sna) e2.b().n();
            try {
                if (snaVar.moveToFirst()) {
                    if (snaVar.getCount() != 1) {
                        xyo e3 = a.e();
                        e3.H("Unexpected cursor size:");
                        e3.F(snaVar.getCount());
                        e3.r(new Throwable());
                    }
                    conversationIdType = snaVar.C();
                } else {
                    conversationIdType = ruy.a;
                }
                snaVar.close();
                e.close();
                return conversationIdType;
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

    @Override // defpackage.rtz
    public final smr q(ConversationIdType conversationIdType) {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getConversationDataFromConversationId");
        try {
            smr smrVar = (smr) sni.g(conversationIdType, new ruh(0));
            e.close();
            return smrVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final tqc r(ConversationIdType conversationIdType) {
        return (tqc) sni.g(conversationIdType, new rub(17));
    }

    @Override // defpackage.rtz
    public final xxw s(ConversationIdType conversationIdType) {
        aiut.b();
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getCmsLifeCycleState");
        try {
            xxw xxwVar = (xxw) sni.g(conversationIdType, new rub(19));
            e.close();
            return xxwVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final alog t() {
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getAllConversationIds");
        try {
            snf e2 = sni.e();
            e2.w("getAllConversationIds");
            e2.f(new ruh(5));
            alog f = e2.b().f();
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final /* synthetic */ alog u(xhv xhvVar) {
        return v(wym.a, xhvVar);
    }

    @Override // defpackage.rtz
    public final alog v(wxs wxsVar, xhv xhvVar) {
        return av(wxsVar, yyb.cE(xhvVar));
    }

    @Override // defpackage.rtz
    public final alog w(ConversationIdType conversationIdType) {
        sbl a2 = sbn.a();
        a2.w("getRcsGroupJoinStatusOfParticipantsInConversation");
        a2.c(new rsc(conversationIdType, 13));
        return a2.b().t();
    }

    @Override // defpackage.rtz
    public final alog x(ConversationIdType conversationIdType) {
        sbq sbqVar = new sbq(sbs.a);
        sbqVar.w("getRcsGroupJoinStatusOfParticipantsInConversation");
        sbqVar.c(new ruf(conversationIdType, 14));
        return sbqVar.b().t();
    }

    @Override // defpackage.rtz
    public final alog y(Optional optional, ConversationIdType conversationIdType) {
        alog ax;
        aiut.b();
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getRecipientsForConversation");
        try {
            if (((pcb) this.B.b()).a()) {
                ax = (alog) this.f.c("ConversationDatabaseOperationsImpl#getRecipientsForConversation", new raa(this, optional, conversationIdType, 4));
            } else {
                ax = ax(optional, conversationIdType, Optional.empty());
            }
            e.close();
            return ax;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtz
    public final alog z(Optional optional, ConversationIdType conversationIdType, int i) {
        aiut.b();
        akrh e = aktp.e("ConversationDatabaseOperationsImpl#getRecipientsForConversationWithCachedType");
        try {
            alog alogVar = (alog) this.f.c("ConversationDatabaseOperationsImpl#getRecipientsForConversation", new qwb(this, optional, conversationIdType, i, 2));
            e.close();
            return alogVar;
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
