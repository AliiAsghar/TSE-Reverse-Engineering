package defpackage;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aomd implements aqvt {
    public final aomb[] a;

    public aomd(aomb... aombVarArr) {
        this.a = aombVarArr;
    }

    @Override // defpackage.aqvt
    public final apzj a(aqvr aqvrVar, aqut aqutVar, aqvs aqvsVar) {
        aqvsVar.getClass();
        aqsm k = aqsm.k();
        k.getClass();
        for (char c = 0; c <= 0; c = 1) {
            aomb aombVar = this.a[0];
            k = k.l(aombVar.c, new AtomicReference()).l(aombVar.d, new AtomicReference());
            if (aqutVar.j(aombVar.a)) {
                k = k.l(aombVar.b, aqutVar.b(aombVar.a));
            }
        }
        aomc aomcVar = new aomc(aqvrVar, this, k);
        aqsm a = k.a();
        try {
            return new aqvj(aqvsVar.a(aomcVar, aqutVar), k);
        } finally {
            k.f(a);
        }
    }

    public final void b(aqut aqutVar, aqsm aqsmVar, boolean z) {
        aqsj aqsjVar;
        aomb aombVar = this.a[0];
        if (z) {
            aqsjVar = aombVar.c;
        } else {
            aqsjVar = aombVar.d;
        }
        Parcelable parcelable = (Parcelable) ((AtomicReference) aqsjVar.a(aqsmVar)).getAndSet(null);
        if (parcelable != null) {
            aqutVar.h(aombVar.a, parcelable);
        }
    }
}
