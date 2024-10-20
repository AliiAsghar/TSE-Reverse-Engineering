package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tlg extends agpc {
    public tlg(String[] strArr) {
        super("settings", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tlf b() {
        l();
        return new tlf(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new tli());
        k(new agpw((tli) apply));
    }
}
