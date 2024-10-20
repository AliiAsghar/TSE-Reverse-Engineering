package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tiv extends agpc {
    public tiv(String[] strArr) {
        super("restore_workflow_files", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tiu b() {
        l();
        return new tiu(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new tix());
        k(new agpw((tix) apply));
    }
}
