package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmm {
    public final ashn a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final ashd f;
    public final String g;
    public final ashu h;
    public final Integer i;

    public ahmm(ashn ashnVar, Long l, Long l2, Long l3, Long l4, ashd ashdVar, String str, ashu ashuVar, Integer num) {
        this.a = ashnVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = ashdVar;
        this.g = str;
        this.h = ashuVar;
        this.i = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
