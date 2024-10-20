package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptv extends agpc {
    public ptv(String[] strArr) {
        super("rcs_remote_capabilities_cache", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ptu b() {
        l();
        return new ptu(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new ptx());
        k(new agpw((ptx) apply));
    }
}
