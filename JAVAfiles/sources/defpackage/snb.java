package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snb extends agnx {
    public snb() {
        super("conversations", "$primary");
    }

    @Override // defpackage.agnx
    public final /* bridge */ /* synthetic */ aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new snh());
        }
        return new aday(n, agpwVar);
    }

    public final void b(Function function) {
        Object apply;
        apply = function.apply(new snh());
        this.a = new agpw((snh) apply);
    }
}
