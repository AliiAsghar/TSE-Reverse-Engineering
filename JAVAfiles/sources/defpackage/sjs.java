package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjs extends agpc {
    public sjs(String[] strArr) {
        super("conversation_classifications_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sjr b() {
        l();
        return new sjr(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sju());
        k(new agpw((sju) apply));
    }
}
