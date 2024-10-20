package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum acpd {
    RECV_ONLY("recvonly"),
    SEND_ONLY("sendonly"),
    SEND_RECEIVE("sendrecv"),
    INACTIVE("inactive"),
    NONE("none");

    public final String f;

    acpd(String str) {
        this.f = str;
    }

    public static acpd a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            for (acpd acpdVar : values()) {
                if (acpdVar.f.equals(lowerCase)) {
                    return acpdVar;
                }
            }
        }
        return NONE;
    }
}
