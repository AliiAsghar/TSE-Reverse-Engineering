package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqn extends agpc {
    public mqn(String[] strArr) {
        super("conversations INNER JOIN conversation_to_participants ON (conversation_to_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mql b() {
        l();
        return new mql(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new mqo());
        k(new agpw((mqo) apply));
    }

    public final void d(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new mqm(0)).collect(Collectors.joining(", ")));
    }
}
