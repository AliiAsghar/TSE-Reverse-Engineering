package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zq<T, V extends zz> {
    public final long a;
    public final byn b;
    public zz c;
    public long d;
    private final acg f;
    private final arqg g;
    public long e = Long.MIN_VALUE;
    private final byn h = new byu(true, cav.a);

    public zq(Object obj, acg acgVar, zz zzVar, long j, long j2, arqg arqgVar) {
        this.f = acgVar;
        this.a = j2;
        this.g = arqgVar;
        this.b = new byu(obj, cav.a);
        this.c = aaa.a(zzVar);
        this.d = j;
    }

    public final Object a() {
        return this.b.a();
    }

    public final Object b() {
        return this.f.a().a(this.c);
    }

    public final void c() {
        e();
        this.g.a();
    }

    public final boolean d() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final void e() {
        this.h.h(false);
    }
}
