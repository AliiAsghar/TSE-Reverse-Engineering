package defpackage;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gh {
    public static final String[] a = {"image/jpeg", "image/jpg", "image/gif", "image/vnd.wap.wbmp", "image/webp", "image/png", "image/x-ms-bmp", "image/heif", "image/heic"};
    public static final String[] b = {"text/calendar", "text/x-vCalendar", "application/ics", "application/vcs", "application/hbs-vcs", "text/x-vcalendar"};
    public static final alor c = alor.l("application/txt", "text/plain");
    public static final alor d = alor.l("text/plain", "application/txt");
    public static final alog e = alog.v("text/plain", "text/html", "application/vnd.wap.xhtml+xml", RbmSuggestionResponse.CONTENT_TYPE, RbmSpecificMessage.CONTENT_TYPE);

    private gh() {
    }

    public static boolean A(String str) {
        if (str == null) {
            return false;
        }
        if (!"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str) && !"application/vnd.ms-excel".equals(str)) {
            return false;
        }
        return true;
    }

    public static String[] B(String str) {
        String[] strArr = (String[]) alzz.aV(anna.e('/').d().a(str), alzz.W(String.class, 0));
        if (strArr.length == 2) {
            return strArr;
        }
        throw new IllegalArgumentException(String.format("Invalid content-type %s", str));
    }

    public static String a(String str) {
        if (!v(str)) {
            return str;
        }
        if (true != k(str)) {
            return "text/plain";
        }
        return "text/html";
    }

    public static String b(String str) {
        if (!w(str)) {
            return str;
        }
        if (true != "text/html".equals(str)) {
            return "application/txt";
        }
        return "application/html";
    }

    public static String c(String str) {
        String d2 = d(str);
        if (d2 == null) {
            return null;
        }
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(d2);
    }

    public static String d(String str) {
        alor alorVar = c;
        if (alorVar.containsKey(str)) {
            return (String) alorVar.get(str);
        }
        return str;
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        if (!str.startsWith("audio/") && !str.equalsIgnoreCase("application/ogg")) {
            return false;
        }
        return true;
    }

    public static boolean f(String str) {
        if (str != null) {
            String[] strArr = b;
            for (int i = 0; i < 6; i++) {
                if (strArr[i].equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(String str) {
        if (str == null) {
            return false;
        }
        if (!str.equals("application/msword") && !str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
            return false;
        }
        return true;
    }

    public static boolean h(String str) {
        if (str == null) {
            return false;
        }
        if ((!p(str) || e(str) || m(str) || s(str) || z(str) || y(str)) && !u(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(String str) {
        return TextUtils.equals(str, "image/gif");
    }

    public static boolean j(String str) {
        if (!Objects.equals(str, "image/heif") && !Objects.equals(str, "image/heic")) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        if (str != null && str.equals("application/html")) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        if (!"text/calendar".equals(str) && !"application/ics".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean m(String str) {
        return n(str, true);
    }

    public static boolean n(String str, boolean z) {
        if (str != null && str.startsWith("image/")) {
            return true;
        }
        if (s(str) && z) {
            return true;
        }
        return false;
    }

    public static boolean o(String str) {
        if (!"image/jpeg".equals(str) && !"image/jpg".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean p(String str) {
        if (str != null && !e.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean q(String str) {
        if (str != null && str.equals("application/pdf")) {
            return true;
        }
        return false;
    }

    public static boolean r(String str) {
        if (str == null) {
            return false;
        }
        if (!"application/vnd.ms-powerpoint".equals(str) && !"application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean s(String str) {
        if (str != null && TextUtils.equals(str, "application/vnd.gsma.rcspushlocation+xml")) {
            return true;
        }
        return false;
    }

    public static boolean t(String str) {
        if (!m(str) && !z(str) && !e(str)) {
            return false;
        }
        return true;
    }

    public static boolean u(String str) {
        if (str == null) {
            return false;
        }
        if (q(str) || f(str) || v(str) || g(str) || r(str)) {
            return true;
        }
        if (!A(str)) {
            return false;
        }
        return true;
    }

    public static boolean v(String str) {
        if (str == null) {
            return false;
        }
        if (!x(str) && !k(str)) {
            return false;
        }
        return true;
    }

    public static boolean w(String str) {
        if (!"text/plain".equals(str) && !"text/html".equals(str) && !"application/vnd.wap.xhtml+xml".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean x(String str) {
        if (str != null && str.equals("application/txt")) {
            return true;
        }
        return false;
    }

    public static boolean y(String str) {
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase("text/x-vCard") || str.equalsIgnoreCase("text/vcard")) {
            return true;
        }
        if (!str.equalsIgnoreCase("text/x-vcard")) {
            return false;
        }
        return true;
    }

    public static boolean z(String str) {
        if (str != null && str.startsWith("video/")) {
            return true;
        }
        return false;
    }
}
