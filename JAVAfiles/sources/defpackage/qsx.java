package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsx extends agpc {
    public qsx(String[] strArr) {
        super("destinations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qsw b() {
        l();
        return new qsw(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new qsy());
        k(new agpw((qsy) apply));
    }
}
