package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hio implements ServiceConnection {
    final /* synthetic */ hin a;
    private final ndk b;

    public hio(hin hinVar, ndk ndkVar) {
        this.a = hinVar;
        this.b = ndkVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gvf.Q("Install Referrer service connected.");
        hin hinVar = this.a;
        hinVar.d = IGetInstallReferrerService.Stub.asInterface(iBinder);
        hinVar.a = 2;
        this.b.j(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gvf.R("Install Referrer service disconnected.");
        hin hinVar = this.a;
        hinVar.d = null;
        hinVar.a = 0;
    }
}
