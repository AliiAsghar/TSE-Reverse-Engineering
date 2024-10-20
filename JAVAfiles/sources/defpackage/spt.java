package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spt extends agpc {
    public spt(String[] strArr) {
        super("etouffee_rcs_metadata", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sps b() {
        l();
        return new sps(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new spu());
        k(new agpw((spu) apply));
    }
}
