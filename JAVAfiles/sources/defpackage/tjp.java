package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjp extends agpc {
    public tjp(String[] strArr) {
        super("restore_workflow_scratch_suffix", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tjo b() {
        l();
        return new tjo(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new tjq());
        k(new agpw((tjq) apply));
    }
}
