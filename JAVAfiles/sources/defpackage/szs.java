package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szs extends agpc {
    public szs(String[] strArr) {
        super("p2p_suggestions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final szr b() {
        l();
        return new szr(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new szt());
        k(new agpw((szt) apply));
    }
}
