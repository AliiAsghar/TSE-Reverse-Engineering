package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxp {
    private static final alwo a = alwo.o("BugleGroupManagement");
    private final yst b;

    public vxp(yst ystVar) {
        this.b = ystVar;
    }

    public final String a(String str, String str2, String str3) {
        if (str3 != null) {
            try {
                str3 = URLEncoder.encode(str3, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(String.format("Unsupported encoding. Group name: %s", str3), e);
            }
        } else {
            str3 = "";
        }
        String str4 = str3 + "\u001f" + str + "\u001f" + str2 + "@rcs.google.com";
        alvw m = a.m();
        m.X(ydl.E, str3);
        m.X(ydl.D, str);
        m.X(ydl.I, str2);
        ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameBuilder", "buildTelephonyRecipientName", 68, "RcsGroupTelephonyRecipientNameBuilder.java")).t("Created group backup contact name %s", yyb.bh(str4));
        return this.b.d(str4);
    }
}
