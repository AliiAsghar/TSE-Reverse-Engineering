package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvh extends agpc {
    public qvh(String[] strArr) {
        super("my_identities", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qvg b() {
        l();
        return new qvg(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new qvj());
        k(new agpw((qvj) apply));
    }
}
