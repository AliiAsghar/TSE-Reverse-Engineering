package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtw implements ServiceConnection {
    final /* synthetic */ BaseGmsClient a;
    private final int b;

    public abtw(BaseGmsClient baseGmsClient, int i) {
        this.a = baseGmsClient;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder == null) {
            BaseGmsClient baseGmsClient = this.a;
            synchronized (baseGmsClient.e) {
                i = baseGmsClient.j;
            }
            if (i == 3) {
                baseGmsClient.n = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = baseGmsClient.d;
            handler.sendMessage(handler.obtainMessage(i2, baseGmsClient.p.get(), 16));
            return;
        }
        synchronized (this.a.f) {
            this.a.g = IGmsServiceBroker.Stub.asInterface(iBinder);
        }
        this.a.B(0, null, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.f) {
            this.a.g = null;
        }
        BaseGmsClient baseGmsClient = this.a;
        int i = this.b;
        Handler handler = baseGmsClient.d;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
