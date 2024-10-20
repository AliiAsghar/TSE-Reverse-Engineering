package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swi extends agpc {
    public swi(String[] strArr) {
        super("message_send_receive_attempt", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final swh b() {
        l();
        return new swh(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new swj());
        k(new agpw((swj) apply));
    }

    public final void d(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sho(9)).collect(Collectors.joining(", ")));
    }
}
