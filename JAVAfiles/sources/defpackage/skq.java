package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skq extends agpc {
    public skq(String[] strArr) {
        super("conversation_participants_audit_log", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final skp b() {
        l();
        return new skp(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new skr());
        k(new agpw((skr) apply));
    }
}
