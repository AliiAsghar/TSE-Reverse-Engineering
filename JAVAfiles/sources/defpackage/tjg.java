package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjg extends agpc {
    public tjg(String[] strArr) {
        super("restore_workflow_scratch_duplicates", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tjf b() {
        l();
        return new tjf(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new tjh());
        k(new agpw((tjh) apply));
    }
}
