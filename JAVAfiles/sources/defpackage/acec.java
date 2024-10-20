package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acec extends abug {
    public final vl a;
    public final vl v;
    private final vl w;

    public acec(Context context, Looper looper, abua abuaVar, absf absfVar, abtc abtcVar) {
        super(context, looper, 23, abuaVar, absfVar, abtcVar);
        this.a = new vl();
        this.v = new vl();
        this.w = new vl();
        new vl();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void J() {
        System.currentTimeMillis();
        synchronized (this.a) {
            this.a.clear();
        }
        synchronized (this.v) {
            this.v.clear();
        }
        synchronized (this.w) {
            this.w.clear();
        }
    }

    public final void K(absw abswVar, boolean z, acit acitVar) {
        synchronized (this.v) {
            acea aceaVar = (acea) this.v.remove(abswVar);
            if (aceaVar == null) {
                acitVar.b(Boolean.FALSE);
                return;
            }
            ((acdt) aceaVar.a).a.a();
            if (z) {
                if (L(acdc.j)) {
                    ((IGoogleLocationManagerService) w()).unregisterLocationClient(LocationReceiver.a(null, aceaVar, "ILocationCallback@" + System.identityHashCode(aceaVar)), new acdu(Boolean.TRUE, acitVar));
                } else {
                    ((IGoogleLocationManagerService) w()).updateLocationRequest(new LocationRequestUpdateData(2, null, null, aceaVar, null, new acdw(Boolean.TRUE, acitVar), null));
                }
            } else {
                acitVar.b(Boolean.TRUE);
            }
        }
    }

    public final boolean L(Feature feature) {
        Feature feature2;
        Feature[] s = s();
        if (s != null) {
            int i = 0;
            while (true) {
                if (i < s.length) {
                    feature2 = s[i];
                    if (feature.a.equals(feature2.a)) {
                        break;
                    }
                    i++;
                } else {
                    feature2 = null;
                    break;
                }
            }
            if (feature2 != null && feature2.a() >= feature.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IGoogleLocationManagerService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return acdc.p;
    }
}
