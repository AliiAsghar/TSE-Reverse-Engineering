package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxu extends agnx {
    public sxu() {
        super("messages", "$primary");
    }

    public final void b(Function function) {
        Object apply;
        apply = function.apply(new syc());
        this.a = new syb((syc) apply);
    }

    @Override // defpackage.agnx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new syb(new syc());
        }
        return new aday(n, agpwVar);
    }
}
