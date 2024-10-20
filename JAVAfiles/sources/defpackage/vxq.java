package defpackage;

import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxq {
    private static final alwo a = alwo.o("BugleGroupManagement");
    private final yst b;

    public vxq(yst ystVar) {
        this.b = ystVar;
    }

    private static boolean c(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            URLDecoder.decode(albo.ag(matcher.group(1)), StandardCharsets.UTF_8.name());
            return true;
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return false;
        }
    }

    public final vxm a(String str) {
        if (!b(str)) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 55, "RcsGroupTelephonyRecipientNameParser.java")).q("Attempting to parse a RcsGroupTelephonyData  out of a non RCS group Telephony recipient.");
            return null;
        }
        String ag = albo.ag(this.b.c(str));
        int length = ag.length();
        int i = length - 15;
        int i2 = length - 16;
        int lastIndexOf = ag.lastIndexOf(31, i2);
        int lastIndexOf2 = ag.lastIndexOf(31, lastIndexOf - 1);
        if (lastIndexOf == -1) {
            lastIndexOf = ag.lastIndexOf(45, i2);
            lastIndexOf2 = ag.lastIndexOf(45, lastIndexOf - 1);
        }
        try {
            String decode = URLDecoder.decode(ag.substring(0, lastIndexOf2), StandardCharsets.UTF_8.name());
            String substring = ag.substring(lastIndexOf2 + 1, lastIndexOf);
            String substring2 = ag.substring(lastIndexOf + 1, i);
            alvw m = a.m();
            m.X(ydl.I, substring2);
            m.X(ydl.E, decode);
            ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 89, "RcsGroupTelephonyRecipientNameParser.java")).t("Parsed out RcsGroupTelephonyData from Telephony recipient: %s", str);
            if (decode != null) {
                if (substring != null) {
                    if (substring2 != null) {
                        return new vxm(decode, substring, substring2);
                    }
                    throw new NullPointerException("Null rcsGroupId");
                }
                throw new NullPointerException("Null selfRcsMsisdn");
            }
            throw new NullPointerException("Null groupName");
        } catch (UnsupportedEncodingException e) {
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 'c', "RcsGroupTelephonyRecipientNameParser.java")).q("Failed to decode RCS group telephony recipient name.");
            return null;
        }
    }

    public final boolean b(String str) {
        String c = this.b.c(str);
        if (c == null) {
            return false;
        }
        if (!c(c, vxl.b) && !c(c, vxl.a)) {
            return false;
        }
        return true;
    }
}
