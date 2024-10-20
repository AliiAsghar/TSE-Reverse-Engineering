package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtx implements abtv {
    final /* synthetic */ BaseGmsClient a;

    public abtx(BaseGmsClient baseGmsClient) {
        this.a = baseGmsClient;
    }

    @Override // defpackage.abtv
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            BaseGmsClient baseGmsClient = this.a;
            baseGmsClient.o(null, baseGmsClient.z());
        } else {
            ahjj ahjjVar = this.a.s;
            if (ahjjVar != null) {
                ahjjVar.o(connectionResult);
            }
        }
    }
}
