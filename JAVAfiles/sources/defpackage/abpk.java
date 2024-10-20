package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abpk implements acig {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abpk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.acig
    public final Object a(acir acirVar) {
        abra abraVar;
        int i = 1;
        switch (this.c) {
            case 0:
                if (acirVar.l() && abpn.d((Bundle) acirVar.h())) {
                    return ((abpn) this.a).a((Bundle) this.b).f(abpn.a, new ahxt(i));
                }
                return acirVar;
            case 1:
                if (!acirVar.l()) {
                    Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", acirVar.g());
                    return acirVar;
                }
                Object obj = this.b;
                Object obj2 = this.a;
                abrc abrcVar = (abrc) obj2;
                abox aboxVar = new abox((aboy) obj2, (abno) obj, abrcVar.i);
                abrcVar.r(aboxVar);
                return abhg.o(aboxVar);
            case 2:
                Exception g = acirVar.g();
                if (g instanceof abra) {
                    abraVar = (abra) g;
                } else {
                    abraVar = null;
                }
                if ((abraVar == null || abraVar.a() != 17) && !(acirVar.g() instanceof abrn)) {
                    return acirVar.h();
                }
                zfm zfmVar = acce.n;
                Exception g2 = acirVar.g();
                if (zfmVar.f(2)) {
                    Log.v("ParentalControlsClient", "Failed to connect to ParentalControlsClient. Not a child account.", g2);
                }
                ?? r5 = this.a;
                ((acce) this.b).b = true;
                return r5.a();
            case 3:
                ?? r52 = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(r52, 10));
                Iterator it = r52.iterator();
                while (it.hasNext()) {
                    arrayList.add(((acce) this.b).c((acby) it.next()));
                }
                return actx.t(arrayList);
            case 4:
                boolean z = acirVar.g() instanceof abrn;
                Object obj3 = this.a;
                Object obj4 = this.b;
                if (z) {
                    return ((acgl) obj4).b(((ahtt) obj3).c);
                }
                if (acirVar.g() instanceof abra) {
                    abra abraVar2 = (abra) acirVar.g();
                    abraVar2.getClass();
                    if (abraVar2.a() == 29514) {
                        return ((acgl) obj4).b(((ahtt) obj3).c);
                    }
                    return acirVar;
                }
                return acirVar;
            case 5:
                ((ahxl) this.b).c.k((aibq) this.a, 3);
                ahxl.j(new ahka("FindAutocompletePredictionsOnePlatform"));
                return (aibr) acirVar.h();
            case 6:
                ((ahxl) this.b).c.k((aibq) this.a, 2);
                ahxl.j(new ahka("FindAutocompletePredictions"));
                return (aibr) acirVar.h();
            case 7:
                ((ahxl) this.b).c.l((aibl) this.a, 3);
                ahxl.j(new ahka("IsOpenGetPlace"));
                return (aibm) acirVar.h();
            case 8:
                ((ahxl) this.b).c.l((aibl) this.a, 2);
                ahxl.j(new ahka("IsOpenFetchPlace"));
                return (aibm) acirVar.h();
            case 9:
                Object obj5 = this.b;
                Object obj6 = this.a;
                synchronized (obj6) {
                    ((asmb) obj6).b.remove(obj5);
                }
                return acirVar;
            default:
                Object obj7 = this.a;
                Object obj8 = this.b;
                synchronized (obj8) {
                    ((asmb) obj8).b.remove(obj7);
                }
                return acirVar;
        }
    }

    public /* synthetic */ abpk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
