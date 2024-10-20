package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qps extends agnx {
    public qps() {
        super("conversation_matcher_cache", "$primary");
    }

    public final void b(Function function) {
        Object apply;
        apply = function.apply(new qpv());
        this.a = new agpw((qpv) apply);
    }

    @Override // defpackage.agnx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new qpv());
        }
        return new aday(n, agpwVar);
    }
}
