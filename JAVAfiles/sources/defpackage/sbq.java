package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbq extends agpc {
    public sbq(String[] strArr) {
        super("conversation_to_participants LEFT JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sbp b() {
        l();
        return new sbp(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sbr());
        k(new agpw((sbr) apply));
    }
}
