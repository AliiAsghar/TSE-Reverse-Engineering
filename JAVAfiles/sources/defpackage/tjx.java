package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjx extends agpc {
    public tjx(String[] strArr) {
        super("restore_workflow_scratch_timestamps", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tjw b() {
        l();
        return new tjw(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new tjy());
        k(new agpw((tjy) apply));
    }
}
