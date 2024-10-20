package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tim extends agpc {
    public tim(String[] strArr) {
        super("restore_workflow_executions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final til b() {
        l();
        return new til(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new tio());
        k(new agpw((tio) apply));
    }
}
