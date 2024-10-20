package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arsv extends arso {
    @Override // defpackage.arso
    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    @Override // defpackage.arst
    public final long f(long j) {
        return ThreadLocalRandom.current().nextLong(0L, j);
    }

    @Override // defpackage.arst
    public final long ha(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }
}
