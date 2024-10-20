package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mjx {
    public static final xze a = xze.g("BugleContacts", "BugleContactPager");
    public final AtomicReference b = new AtomicReference(Optional.empty());
    public final ifq c;
    private final anen d;

    public mjx(anen anenVar, ifq ifqVar) {
        this.d = anenVar;
        this.c = ifqVar;
    }

    public static final mkj c(Integer num) {
        return new mkj(num.intValue());
    }

    public final akul a(akul akulVar, akul akulVar2, int i) {
        return akul.g(aktp.as(akulVar, akulVar2).m(new mjw(akulVar, akulVar2, i, 0), this.d));
    }

    public final void b() {
        a.o("cleaning up contacts preloaded state");
        this.b.set(Optional.empty());
    }
}
