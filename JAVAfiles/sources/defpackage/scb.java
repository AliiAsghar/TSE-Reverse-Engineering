package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class scb extends agpc {
    public scb(String[] strArr) {
        super("draft_parts_view", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sca b() {
        l();
        return new sca(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new scc());
        k(new agpw((scc) apply));
    }
}
