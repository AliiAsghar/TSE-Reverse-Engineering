package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqa extends agpc {
    public qqa(String[] strArr) {
        super("conversations INNER JOIN conversation_to_participants ON (conversation_to_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qpz b() {
        l();
        return new qpz(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new qqb());
        k(new agpw((qqb) apply));
    }
}
