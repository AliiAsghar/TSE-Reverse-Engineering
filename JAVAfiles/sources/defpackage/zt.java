package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zt<T, V extends zz> implements cas<T> {
    public final acg a;
    public zz b;
    public long c;
    public long d;
    public boolean e;
    private final byn f;

    public zt(acg acgVar, Object obj, zz zzVar, long j, long j2, boolean z) {
        this.a = acgVar;
        this.f = new byu(obj, cav.a);
        this.b = zzVar != null ? aaa.a(zzVar) : zu.a(acgVar, obj);
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    @Override // defpackage.cas
    public final Object a() {
        return this.f.a();
    }

    public final Object b() {
        return this.a.a().a(this.b);
    }

    public final void c(Object obj) {
        this.f.h(obj);
    }

    public final String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.e + ", lastFrameTimeNanos=" + this.c + ", finishedTimeNanos=" + this.d + ')';
    }

    public /* synthetic */ zt(acg acgVar, Object obj, zz zzVar, int i) {
        this(acgVar, obj, (i & 4) != 0 ? null : zzVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
