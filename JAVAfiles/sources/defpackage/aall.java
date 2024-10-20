package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aall extends xzs {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ Optional a;
    final /* synthetic */ aalt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aall(aalt aaltVar, Optional optional) {
        super("Bugle.Async.markLastConversationNotYetDelivered.Duration");
        this.a = optional;
        this.b = aaltVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        ConversationIdType conversationIdType = (ConversationIdType) this.a.map(new aakq(19)).orElseGet(new zhh(10));
        if (conversationIdType.b()) {
            return new Pair(ruy.a, rve.a);
        }
        MessageCoreData f = this.b.f(conversationIdType);
        f.getClass();
        rve E = f.E();
        if (rve.j(E)) {
            return new Pair(conversationIdType, rve.a);
        }
        if (((vqu) this.b.x.b()).i(E) != vqt.NONE) {
            ((rbb) this.b.j.b()).a(E, false).t();
        } else {
            xzb.n("BugleDataModel", "client side fallback is disabled.");
        }
        return new Pair(conversationIdType, E);
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        if (pair.first == null) {
            ((abbu) this.b.Z.b()).l("failed to find 1:1 RCS conversation");
            return;
        }
        if (pair.second == null) {
            ((abbu) this.b.Z.b()).l("last 1:1 RCS conversation doesn't have any undelivered");
            return;
        }
        ((abbu) this.b.Z.b()).l("marking rcs message " + rve.c((rve) pair.second) + " in conversation " + String.valueOf(pair.first) + " as not delivered");
    }
}
