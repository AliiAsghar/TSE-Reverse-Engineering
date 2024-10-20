package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqj extends agpc {
    public qqj(String[] strArr) {
        super("conversations INNER JOIN conversation_participants ON (conversation_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qqh b() {
        l();
        return new qqh(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new qqk());
        k(new agpw((qqk) apply));
    }
}
