package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlr implements hvt {
    final /* synthetic */ hls a;
    private final hwj b;

    public hlr(hls hlsVar, hwj hwjVar) {
        this.a = hlsVar;
        this.b = hwjVar;
    }

    @Override // defpackage.hvt
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                hwj hwjVar = this.b;
                for (hwx hwxVar : hyv.g(hwjVar.a)) {
                    if (!hwxVar.l() && !hwxVar.k()) {
                        hwxVar.c();
                        if (!hwjVar.c) {
                            hwxVar.b();
                        } else {
                            hwjVar.b.add(hwxVar);
                        }
                    }
                }
            }
        }
    }
}
