package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tko extends agpc {
    public tko(String[] strArr) {
        super("self_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tkn b() {
        l();
        return new tkn(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new tkq());
        k(new agpw((tkq) apply));
    }
}
