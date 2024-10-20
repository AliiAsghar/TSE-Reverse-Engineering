package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoa extends agpc {
    public yoa(String[] strArr) {
        super("spam_logging_ids_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ynz b() {
        l();
        return new ynz(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new yob());
        k(new agpw((yob) apply));
    }
}
