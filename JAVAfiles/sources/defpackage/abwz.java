package defpackage;

import android.util.Log;
import com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abwz extends IGetMeetApiAvailabilityCallback.Stub {
    final /* synthetic */ acit a;

    public abwz(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback
    public final void onResult(byte[] bArr) {
        try {
            this.a.b(new abwv(true, true, ((anhj) apag.parseFrom(anhj.a, bArr, aozs.a())).b));
        } catch (apba | NullPointerException e) {
            Log.e("DuoStateFetcher", "Error getting Meet registered.", e);
            this.a.b(new abwv(true, true, false));
        }
    }
}
