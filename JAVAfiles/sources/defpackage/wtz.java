package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wtz implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ wtz(mmg mmgVar, BugleConversationId bugleConversationId, String str, boolean z, int i) {
        this.e = i;
        this.b = mmgVar;
        this.c = bugleConversationId;
        this.d = str;
        this.a = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.b;
                Object obj2 = this.d;
                boolean z = this.a;
                Object obj3 = this.c;
                if (z) {
                    ((vyv) ((xac) obj3).g.b()).J((amvm) obj2, 1, false, alog.r(obj));
                } else {
                    ((vyv) ((xac) obj3).g.b()).K((amvm) obj2, 1, alog.r(obj));
                }
                return true;
            }
            sng sngVar = new sng();
            String str = (String) this.d;
            sngVar.x(str);
            sngVar.y(tqh.NAME_IS_MANUAL);
            ConversationIdType conversationIdType = ((BugleConversationId) this.c).a;
            if (!sngVar.e(conversationIdType)) {
                return false;
            }
            boolean z2 = this.a;
            ujr ujrVar = (ujr) ((Optional) ((mmg) this.b).g.b()).orElseThrow();
            if (z2) {
                ujrVar.d(conversationIdType, str);
            } else {
                ujrVar.c(conversationIdType, str);
            }
            return true;
        }
        Object obj4 = this.d;
        Object obj5 = this.c;
        boolean z3 = this.a;
        Object obj6 = this.b;
        if (z3) {
            return ((wub) obj6).b.forceRefreshCapabilities(wub.a((qei) obj5, (String) obj4));
        }
        return ((wub) obj6).b.refreshCapabilities(wub.a((qei) obj5, (String) obj4));
    }

    public /* synthetic */ wtz(wub wubVar, boolean z, qei qeiVar, String str, int i) {
        this.e = i;
        this.b = wubVar;
        this.a = z;
        this.c = qeiVar;
        this.d = str;
    }

    public /* synthetic */ wtz(xac xacVar, boolean z, amvm amvmVar, amvl amvlVar, int i) {
        this.e = i;
        this.c = xacVar;
        this.a = z;
        this.d = amvmVar;
        this.b = amvlVar;
    }
}
