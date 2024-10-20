package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvz {
    private final armf a;
    private final Executor b;
    private Optional c = Optional.empty();

    public tvz(armf armfVar, Executor executor) {
        this.a = armfVar;
        this.b = executor;
    }

    public final twa a() {
        return new twa(this.a, this.c, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(amhz amhzVar) {
        this.c = Optional.of(amhzVar);
    }
}
