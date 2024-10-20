package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqv extends agpc {
    public mqv(String[] strArr) {
        super("conversations INNER JOIN conversation_participants ON (conversation_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mqu b() {
        l();
        return new mqu(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new mqw());
        k(new agpw((mqw) apply));
    }

    public final void d(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new mqm(2)).collect(Collectors.joining(", ")));
    }
}
