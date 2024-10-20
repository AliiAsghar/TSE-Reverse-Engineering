package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wss extends agpc {
    public wss(String[] strArr) {
        super("scheduled_send INNER JOIN messages ON (messages._id=scheduled_send.message_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN message_captions ON (message_captions.message_id=messages._id)", strArr, "messages._id", null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wsr b() {
        l();
        return new wsr(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new wst());
        k(new agpw((wst) apply));
    }
}
