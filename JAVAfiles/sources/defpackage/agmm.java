package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agmm implements agmo {
    private final /* synthetic */ int a;

    public /* synthetic */ agmm(int i) {
        this.a = i;
    }

    @Override // defpackage.agmo
    public final Object a(Object obj) {
        if (this.a != 0) {
            return new BugleConversationId(((smr) obj).x());
        }
        int i = agmp.j;
        return obj;
    }
}
