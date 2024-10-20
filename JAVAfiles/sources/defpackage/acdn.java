package defpackage;

import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdn implements abtf, acdy {
    public absy a;
    public boolean b = true;
    final /* synthetic */ acdo c;

    public acdn(acdo acdoVar, absy absyVar) {
        this.c = acdoVar;
        this.a = absyVar;
    }

    @Override // defpackage.abtf
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        absw abswVar;
        boolean z;
        acec acecVar = (acec) obj;
        synchronized (this) {
            abswVar = this.a.b;
            z = this.b;
            this.a.a();
        }
        if (abswVar == null) {
            ((acit) obj2).b(false);
            return;
        }
        synchronized (acecVar.a) {
            aceb acebVar = (aceb) acecVar.a.remove(abswVar);
            if (acebVar == null) {
                ((acit) obj2).b(Boolean.FALSE);
                return;
            }
            acebVar.a.b().a();
            if (z) {
                if (acecVar.L(acdc.j)) {
                    ((IGoogleLocationManagerService) acecVar.w()).unregisterLocationClient(LocationReceiver.b(null, acebVar, "ILocationListener@" + System.identityHashCode(acebVar)), new acdu(Boolean.TRUE, (acit) obj2));
                } else {
                    ((IGoogleLocationManagerService) acecVar.w()).updateLocationRequest(new LocationRequestUpdateData(2, null, acebVar, null, null, new acdw(Boolean.TRUE, (acit) obj2), null));
                }
            } else {
                ((acit) obj2).b(Boolean.TRUE);
            }
        }
    }

    @Override // defpackage.acdy
    public final synchronized absy b() {
        return this.a;
    }

    @Override // defpackage.acdy
    public final synchronized void c(absy absyVar) {
        absy absyVar2 = this.a;
        if (absyVar2 != absyVar) {
            absyVar2.a();
            this.a = absyVar;
        }
    }
}
