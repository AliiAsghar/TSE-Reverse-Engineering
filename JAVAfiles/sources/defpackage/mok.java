package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mok implements moj {
    public static final /* synthetic */ int d = 0;
    private static final alwo e = alwo.o("Bugle");
    public final armf a;
    public final armf b;
    public final armf c;
    private final anen f;
    private final anen g;
    private final armf h;

    public mok(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.f = anenVar;
        this.g = anenVar2;
        this.a = armfVar;
        this.b = armfVar2;
        this.h = armfVar3;
        this.c = armfVar4;
    }

    @Override // defpackage.moj
    public final akul a(alog alogVar) {
        ((alwl) ((alwl) e.g()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/markunread/MarkAsUnreadManagerImpl", "markConversationsAsRead", 82, "MarkAsUnreadManagerImpl.java")).q("beginning MarkAsUnreadManager#markConversationsAsRead");
        d.t(Collection.EL.stream(alogVar).allMatch(new mmd(5)), "Only BugleConversationIds are supported.");
        Stream map = Collection.EL.stream(alogVar).map(new mmv(15));
        int i = alog.d;
        ((rix) this.h.b()).i((ConversationIdType[]) ((alog) map.collect(alls.a)).toArray(new ConversationIdType[0]), rvc.a).t();
        ((lqn) this.c.b()).o(2, alogVar.size());
        return aktp.ag(null);
    }

    @Override // defpackage.moj
    public final akul b(alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).map(new mmv(14));
        int i = alog.d;
        return qiu.a(aktp.ah(new irs(this, (alog) map.collect(alls.a), 20, null), this.f)).h(new mmq(this, alogVar, 2), this.g);
    }
}
