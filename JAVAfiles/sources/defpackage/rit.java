package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rit implements rhi {
    private final /* synthetic */ int a;
    private final Object b;

    public rit(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ris] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ris] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [rin, java.lang.Object] */
    @Override // defpackage.rhi
    public final /* synthetic */ void a(rhj rhjVar, Action action, Object obj, Object obj2) {
        if (this.a != 0) {
            ConversationIdType conversationIdType = (ConversationIdType) obj2;
            if (conversationIdType == null) {
                this.b.a(rhjVar, obj);
                return;
            } else {
                this.b.b(rhjVar, obj, conversationIdType);
                return;
            }
        }
        List list = (List) obj2;
        if (list == null) {
            this.b.a();
        } else {
            this.b.b(list);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ris] */
    /* JADX WARN: Type inference failed for: r4v4, types: [rin, java.lang.Object] */
    @Override // defpackage.rhi
    public final /* synthetic */ void b(rhj rhjVar, Object obj, Object obj2) {
        if (this.a != 0) {
            xyl.c("Unreachable");
            this.b.a(rhjVar, obj);
        } else {
            this.b.a();
        }
    }
}
