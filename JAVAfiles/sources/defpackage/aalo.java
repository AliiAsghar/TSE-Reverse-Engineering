package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aalo extends xzs {
    final /* synthetic */ hkz a;
    final /* synthetic */ aalt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aalo(aalt aaltVar, hkz hkzVar) {
        super("Bugle.Async.DebugUtils.clearGlideCache.Duration");
        this.a = hkzVar;
        this.b = aaltVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        this.a.f();
        return null;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        ((abbu) this.b.Z.b()).l("Glide cache cleared.");
    }
}
