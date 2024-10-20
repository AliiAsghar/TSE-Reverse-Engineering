package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sge extends agpc {
    public sge(String[] strArr) {
        super("business_conversations_metadata", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sgd b() {
        l();
        return new sgd(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sgg());
        k(new agpw((sgg) apply));
    }
}
