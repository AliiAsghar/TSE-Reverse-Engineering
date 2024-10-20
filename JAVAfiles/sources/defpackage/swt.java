package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swt extends agpc {
    public swt(String[] strArr) {
        super("message_spam", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sws b() {
        l();
        return new sws(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new swv());
        k(new agpw((swv) apply));
    }
}
