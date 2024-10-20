package defpackage;

import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvq implements pvp {
    final /* synthetic */ Supplier a;

    public pvq(Supplier supplier) {
        this.a = supplier;
    }

    @Override // defpackage.pvp
    public final Duration a() {
        Object obj;
        obj = this.a.get();
        return ((pvp) obj).a();
    }

    @Override // defpackage.pvp
    public final Duration b() {
        Object obj;
        obj = this.a.get();
        return ((pvp) obj).b();
    }
}
