package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class scn extends agpc {
    public scn(String[] strArr) {
        super("messages_annotations INNER JOIN conversations ON (conversations.latest_message_id=messages_annotations.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final scm b() {
        l();
        return new scm(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sco());
        k(new agpw((sco) apply));
    }
}
