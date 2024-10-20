package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdg extends agpc {
    public sdg(String[] strArr) {
        super("messages LEFT JOIN message_reactions AS b ON (b.message_id=messages._id)", strArr, null, "%TIMESTAMP_COLUMN_VAL% %ORDER_DIRECTION%, messages._id %ORDER_DIRECTION%", "messages.conversation_id=%CONVERSATION_ID% AND %EXCLUDE_DRAFTS% AND messages.message_status <> 16", "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sdf b() {
        l();
        return new sdf(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sdh());
        k(new agpw((sdh) apply));
    }
}
