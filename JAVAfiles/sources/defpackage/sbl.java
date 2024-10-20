package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbl extends agpc {
    public sbl(String[] strArr) {
        super("conversation_participants LEFT JOIN participants ON (participants._id=conversation_participants.participant_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sbk b() {
        l();
        return new sbk(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sbm());
        k(new agpw((sbm) apply));
    }
}
