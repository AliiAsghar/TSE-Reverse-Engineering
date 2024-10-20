package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rmf extends agpc {
    public rmf(String[] strArr) {
        super("message_reactions_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rme b() {
        l();
        return new rme(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new rmg());
        k(new agpw((rmg) apply));
    }
}
