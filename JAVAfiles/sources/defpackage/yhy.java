package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhy {
    public static final int a;

    static {
        int i;
        if (true != yhx.e) {
            i = 0;
        } else {
            i = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        a = i;
    }

    public static int a(int i) {
        return i | VCardConfig.FLAG_APPEND_TYPE_PARAM;
    }
}
