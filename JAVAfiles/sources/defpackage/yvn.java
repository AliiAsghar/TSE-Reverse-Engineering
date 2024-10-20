package defpackage;

import android.content.Context;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvn {
    private static final xze a = xze.g("Bugle", "VideoCalling");
    private final Context b;
    private final armf c;

    public yvn(Context context, armf armfVar) {
        this.b = context;
        this.c = armfVar;
    }

    public final PhoneAccount a() {
        TelecomManager telecomManager = (TelecomManager) this.b.getSystemService(TelecomManager.class);
        if (telecomManager != null && ((yjf) this.c.b()).i()) {
            if (yhx.e && egl.e(this.b, "android.permission.READ_PHONE_NUMBERS") != 0) {
                a.q("getDefaultPhoneAccount returned null due to the API being 31+ and lacking the READ_PHONE_NUMBERS permission.");
                return null;
            }
            PhoneAccountHandle defaultOutgoingPhoneAccount = telecomManager.getDefaultOutgoingPhoneAccount("tel");
            if (defaultOutgoingPhoneAccount != null) {
                return telecomManager.getPhoneAccount(defaultOutgoingPhoneAccount);
            }
        }
        return null;
    }
}
