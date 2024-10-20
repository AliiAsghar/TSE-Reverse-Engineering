package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upw extends agnx {
    public upw() {
        super("work_queue", "$primary");
    }

    public final void b(Function function) {
        Object apply;
        apply = function.apply(new uqa());
        this.a = new agpw((uqa) apply);
    }

    @Override // defpackage.agnx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new uqa());
        }
        return new aday(n, agpwVar);
    }
}
