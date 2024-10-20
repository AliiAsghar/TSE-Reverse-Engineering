package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugu {
    public static final uuf a = uuh.q(154643523);
    public static final alwo b = alwo.o("BugleJobs");
    public final armf c;
    private final Set i;
    public final alhr e = albo.D(new ubz(5));
    public final alhr f = albo.D(new ubz(6));
    public final alhr g = albo.D(new ubz(7));
    public final alhr h = albo.D(new ubz(8));
    public final AtomicBoolean d = new AtomicBoolean(false);

    public ugu(Set set, armf armfVar) {
        this.i = set;
        this.c = armfVar;
    }

    public final ugp a(int i) {
        return new ugp(this.i, b, i);
    }
}
