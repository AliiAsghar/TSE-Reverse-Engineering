package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnv extends agpc {
    public rnv(String[] strArr) {
        super("parts_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rnu b() {
        l();
        return new rnu(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new rnw());
        k(new agpw((rnw) apply));
    }
}
