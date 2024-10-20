package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzn implements arcw {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.arcw
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
