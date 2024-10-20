package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akoe implements akoc {
    private final ConnectivityManager a;
    private final /* synthetic */ int b;

    public akoe(Context context, ConnectivityManager connectivityManager, int i, byte[] bArr) {
        this.b = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            albo.U(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.akoc
    public final boolean a() {
        if (this.b != 0) {
            NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.BLOCKED) {
                return true;
            }
            return false;
        }
        ConnectivityManager connectivityManager = this.a;
        boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        NetworkInfo activeNetworkInfo2 = connectivityManager.getActiveNetworkInfo();
        if (!isActiveNetworkMetered && activeNetworkInfo2 != null && activeNetworkInfo2.isConnected() && activeNetworkInfo2.getDetailedState() != NetworkInfo.DetailedState.BLOCKED) {
            return true;
        }
        return false;
    }

    public akoe(Context context, ConnectivityManager connectivityManager, int i) {
        this.b = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            albo.U(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }
}
