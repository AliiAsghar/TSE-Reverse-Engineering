package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rue implements alhr {
    public final /* synthetic */ rul a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ SelfIdentityId d;
    public final /* synthetic */ tqc e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    private final /* synthetic */ int i;

    public /* synthetic */ rue(rul rulVar, List list, long j, SelfIdentityId selfIdentityId, int i, tqc tqcVar, String str, long j2, int i2) {
        this.i = i2;
        this.a = rulVar;
        this.b = list;
        this.c = j;
        this.d = selfIdentityId;
        this.f = i;
        this.e = tqcVar;
        this.g = str;
        this.h = j2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        agnw d;
        agnw d2;
        if (this.i != 0) {
            rul rulVar = this.a;
            List<ParticipantsTable.BindData> list = this.b;
            int as = rulVar.as(0, false, list.size());
            boolean z = false;
            for (ParticipantsTable.BindData bindData : list) {
                if (as != 2) {
                    xyl.k(true ^ ryg.l(bindData));
                }
                z |= vcp.j(bindData);
            }
            long j = this.h;
            String str = this.g;
            tqc tqcVar = this.e;
            int i = this.f;
            SelfIdentityId selfIdentityId = this.d;
            long j2 = this.c;
            smt c = sni.c();
            c.ar(xhv.b(j2));
            c.at(0L);
            c.k(((SelfIdentityIdImpl) selfIdentityId).a);
            c.Y(rulVar.at(list, as));
            c.C(z);
            c.au(i);
            c.c(tqcVar);
            c.S(true);
            c.U(true);
            c.T(null);
            c.aa(str);
            c.i(as);
            c.E(0);
            c.av(false);
            if (j != -1) {
                if (xyp.c() || ((Boolean) utw.ad.e()).booleanValue()) {
                    albo.T(rulVar.p(j).b());
                }
                c.al(j);
            }
            rulVar.ay(c, list, as);
            smr a = c.a();
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            ConversationIdType conversationIdType = new ConversationIdType(agnc.a(d2, "conversations", a, new skt(d, 7), new smq(a, 1)));
            if (!conversationIdType.b()) {
                rulVar.al(list, conversationIdType, false);
                rulVar.T(conversationIdType, null, as, true);
                rulVar.aD(conversationIdType);
                qqq b = ((qxr) rulVar.r.b()).b();
                alwl alwlVar = (alwl) ((alwl) rul.b.g()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 830, "ConversationDatabaseOperationsImpl.java");
                Stream map = Collection.EL.stream(list).map(new ruh(12));
                int i2 = alog.d;
                alwlVar.J("ConversationDatabaseOperationsImp: created id=%s with participantIds=%s and destinations=%s", conversationIdType, map.collect(alls.a), Collection.EL.stream(list).map(new rub(8)).map(new ruf(b, 16)).collect(alls.a));
                ((lrf) rulVar.q.b()).m(conversationIdType, 1);
                return conversationIdType;
            }
            rul.a.m("failed to insert conversation into table.");
            throw new IllegalStateException("unable to insert Conversation got -1 ".concat(String.valueOf(a.toString())));
        }
        List list2 = this.b;
        rul rulVar2 = this.a;
        if (list2.isEmpty()) {
            rul.a.q("Creating conversation with empty list; using unknown sender.");
            armf armfVar = rulVar2.g;
            tap h = vcp.h("ʼUNKNOWN_SENDER!ʼ");
            ((rxq) armfVar.b()).h(h);
            list2.add(h.a());
        }
        long j3 = this.h;
        String str2 = this.g;
        int i3 = this.f;
        tqc tqcVar2 = this.e;
        SelfIdentityId selfIdentityId2 = this.d;
        long j4 = this.c;
        rulVar2.d.isPresent();
        ((xzu) rulVar2.d.get().b()).i();
        return (ConversationIdType) rulVar2.f.c("ConversationDatabaseOperationsImpl#createConversation", new rue(rulVar2, list2, j4, selfIdentityId2, i3, tqcVar2, str2, j3, 1));
    }

    public /* synthetic */ rue(rul rulVar, List list, long j, SelfIdentityId selfIdentityId, tqc tqcVar, int i, String str, long j2, int i2) {
        this.i = i2;
        this.a = rulVar;
        this.b = list;
        this.c = j;
        this.d = selfIdentityId;
        this.e = tqcVar;
        this.f = i;
        this.g = str;
        this.h = j2;
    }
}
