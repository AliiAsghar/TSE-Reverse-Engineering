package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwt extends agpc {
    public qwt(String[] strArr) {
        super("subscriptions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qws b() {
        l();
        return new qws(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new qwv());
        k(new agpw((qwv) apply));
    }
}
