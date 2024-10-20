package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktg extends rg {
    final /* synthetic */ kth a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktg(kth kthVar) {
        super(true);
        this.a = kthVar;
    }

    @Override // defpackage.rg
    public final void b() {
        kth kthVar = this.a;
        int i = kthVar.d;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    return;
                }
                kthVar.a();
                return;
            }
            kthVar.c.h(false);
            kthVar.a.c().d();
            return;
        }
        throw null;
    }
}
