package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abur extends Exception {
    public final ConnectionResult a;

    public abur(ConnectionResult connectionResult) {
        d.t(connectionResult.a(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = connectionResult;
    }
}
