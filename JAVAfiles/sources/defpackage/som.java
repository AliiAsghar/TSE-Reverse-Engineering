package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class som extends agnx {
    public som() {
        super("desktop", "$primary");
    }

    public final void b(Function function) {
        Object apply;
        apply = function.apply(new soq());
        this.a = new agpw((soq) apply);
    }

    @Override // defpackage.agnx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new soq());
        }
        return new aday(n, agpwVar);
    }
}
