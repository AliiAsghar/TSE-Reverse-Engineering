package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqy extends agnx {
    public uqy() {
        super("work_queue_work_manager_ids", "$primary");
    }

    public final void b(Function function) {
        Object apply;
        apply = function.apply(new urc());
        this.a = new agpw((urc) apply);
    }

    @Override // defpackage.agnx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new urc());
        }
        return new aday(n, agpwVar);
    }
}
