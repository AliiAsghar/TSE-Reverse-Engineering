package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yka {
    public static final xze a = xze.g("Bugle", "SubscriptionNameHelper");
    public final Context b;
    public final yjf c;

    public yka(Context context, yjf yjfVar) {
        this.b = context;
        this.c = yjfVar;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length);
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                    sb.append(hexString);
                } else {
                    sb.append(hexString);
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            a.m("Error while encoding subscription id");
            return null;
        }
    }

    public static String b(TelephonyManager telephonyManager, int i) {
        TelephonyManager createForSubscriptionId;
        createForSubscriptionId = telephonyManager.createForSubscriptionId(i);
        String simOperatorName = createForSubscriptionId.getSimOperatorName();
        xze xzeVar = a;
        xyo d = xzeVar.d();
        d.H("Fell back to SIM operator name:");
        d.H(simOperatorName);
        d.q();
        if (c(simOperatorName)) {
            String networkOperatorName = createForSubscriptionId.getNetworkOperatorName();
            xyo d2 = xzeVar.d();
            d2.H("Fell back to network operator name:");
            d2.H(networkOperatorName);
            d2.q();
            return networkOperatorName;
        }
        return simOperatorName;
    }

    public static boolean c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && !charSequence.toString().matches("CARD(\\s*)[0-9]")) {
            return false;
        }
        return true;
    }
}
