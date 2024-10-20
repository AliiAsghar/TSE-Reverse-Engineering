package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srk extends agps {
    public srk() {
        super("generic_worker_queue");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(boolean z) {
        this.a.put("in_flight", Boolean.valueOf(z));
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new srl());
        Z(new agpw((srl) apply));
    }
}
