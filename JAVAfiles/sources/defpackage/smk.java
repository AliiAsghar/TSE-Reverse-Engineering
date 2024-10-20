package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smk extends agnx {
    public smk() {
        super("conversation_to_participants", "$primary");
    }

    public final void b(Function function) {
        Object apply;
        apply = function.apply(new smo());
        this.a = new agpw((smo) apply);
    }

    @Override // defpackage.agnx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new smo());
        }
        return new aday(n, agpwVar);
    }
}
