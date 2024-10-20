package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abty extends abts {
    public final IBinder g;
    final /* synthetic */ BaseGmsClient h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abty(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.h = baseGmsClient;
        this.g = iBinder;
    }

    @Override // defpackage.abts
    protected final void a(ConnectionResult connectionResult) {
        ahjj ahjjVar = this.h.s;
        if (ahjjVar != null) {
            ahjjVar.o(connectionResult);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [absf, java.lang.Object] */
    @Override // defpackage.abts
    protected final boolean c() {
        try {
            IBinder iBinder = this.g;
            abhg.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.h.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface b = this.h.b(this.g);
            if (b == null || (!this.h.E(2, 4, b) && !this.h.E(3, 4, b))) {
                return false;
            }
            BaseGmsClient baseGmsClient = this.h;
            baseGmsClient.m = null;
            ahjj ahjjVar = baseGmsClient.t;
            if (ahjjVar != null) {
                ahjjVar.a.onConnected(null);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
