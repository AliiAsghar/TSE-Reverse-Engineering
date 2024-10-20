package defpackage;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahww {
    public final String a;
    public final int b;
    public final ahwv c;
    public final boolean d;
    public final int e;

    public ahww(WifiInfo wifiInfo, ScanResult scanResult) {
        ahwv ahwvVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            ahwvVar = ahwv.OTHER;
        } else {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            if (!upperCase.equals("[ESS]") && !upperCase.equals("[IBSS]")) {
                if (upperCase.matches(".*WPA[0-9]*-PSK.*")) {
                    ahwvVar = ahwv.PSK;
                } else if (upperCase.matches(".*WPA[0-9]*-EAP.*")) {
                    ahwvVar = ahwv.EAP;
                } else {
                    ahwvVar = ahwv.OTHER;
                }
            } else {
                ahwvVar = ahwv.NONE;
            }
        }
        boolean z = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z = true;
        }
        this.a = str;
        this.b = i;
        this.c = ahwvVar;
        this.d = z;
        this.e = i2;
    }
}
