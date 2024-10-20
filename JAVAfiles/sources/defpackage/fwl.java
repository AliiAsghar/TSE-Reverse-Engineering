package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwl implements fbh {
    private final fxo a = new fxo();
    private final boolean b;
    private final fvk c;
    private final int d;
    private final fvc e;

    public fwl(boolean z, fvk fvkVar, int i, fvc fvcVar) {
        this.b = z;
        this.c = fvkVar;
        this.d = i;
        this.e = fvcVar;
    }

    @Override // defpackage.fbh
    public final fbd[] a(Handler handler, faa faaVar, faa faaVar2, faa faaVar3, faa faaVar4) {
        ArrayList arrayList = new ArrayList();
        if (!this.b) {
            arrayList.add(new fwg(this.c, this.a, this.e));
        }
        arrayList.add(new fwi(this.c, this.d, this.a, this.e));
        return (fbd[]) arrayList.toArray(new fbd[arrayList.size()]);
    }
}
