package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class uex extends xzq {
    final /* synthetic */ uey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uex(uey ueyVar) {
        super("Bugle.Async.VCardResource.destroyAsync.Duration");
        this.a = ueyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (ufb ufbVar : this.a.a) {
            xyl.h();
            if (uhl.k(ufbVar.c, ufbVar.a)) {
                ufbVar.a.getContentResolver().delete(ufbVar.c, null, null);
            }
        }
    }
}
