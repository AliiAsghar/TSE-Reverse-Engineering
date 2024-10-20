package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvr implements pvp {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public pvr(Duration duration, Duration duration2, int i) {
        this.c = i;
        this.a = duration;
        this.b = duration2;
    }

    private static final Duration c(Duration duration, Duration duration2) {
        if (duration.compareTo(duration2) < 0) {
            return duration;
        }
        return duration2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pvp] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pvp] */
    @Override // defpackage.pvp
    public final Duration a() {
        if (this.c != 0) {
            return c(this.b.a(), this.a.a());
        }
        return (Duration) this.b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pvp] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pvp] */
    @Override // defpackage.pvp
    public final Duration b() {
        if (this.c != 0) {
            return c(this.b.b(), this.a.b());
        }
        return (Duration) this.a;
    }

    public pvr(pvp pvpVar, pvp pvpVar2, int i) {
        this.c = i;
        this.b = pvpVar;
        this.a = pvpVar2;
    }
}
