package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srj extends agpc {
    public srj(String[] strArr) {
        super("generic_worker_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sri b() {
        l();
        return new sri(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new srl());
        k(new agpw((srl) apply));
    }

    public final void d(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sho(6)).collect(Collectors.joining(", ")));
    }
}
