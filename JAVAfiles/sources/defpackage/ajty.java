package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.search.verification.api.ISearchActionVerificationService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajty implements ServiceConnection {
    public ISearchActionVerificationService a;
    final /* synthetic */ ajtz b;

    public ajty(ajtz ajtzVar) {
        this.b = ajtzVar;
    }

    public final boolean a() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.b.b) {
            alvw d = ajtz.a.d();
            d.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) d).h("com/google/android/search/verification/client/SearchActionVerificationClientService$SearchActionVerificationServiceConnection", "onServiceConnected", 124, "SearchActionVerificationClientService.java")).q("onServiceConnected");
        }
        this.a = ISearchActionVerificationService.Stub.asInterface(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
        if (this.b.b) {
            alvw d = ajtz.a.d();
            d.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) d).h("com/google/android/search/verification/client/SearchActionVerificationClientService$SearchActionVerificationServiceConnection", "onServiceDisconnected", 134, "SearchActionVerificationClientService.java")).q("onServiceDisconnected");
        }
    }
}
