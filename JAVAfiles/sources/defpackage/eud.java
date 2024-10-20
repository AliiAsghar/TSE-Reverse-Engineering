package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eud extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final adfg a;

    public eud(adfg adfgVar) {
        this.a = adfgVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z = false;
        } else {
            z = true;
        }
        adfg adfgVar = this.a;
        if (true == z) {
            i = 10;
        }
        adfgVar.k(i);
    }
}
