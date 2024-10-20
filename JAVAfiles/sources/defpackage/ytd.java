package defpackage;

import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ytd {
    public static final Pattern a = Pattern.compile("^\\+?[0-9\\s\\(\\)\\-x]+$");

    public static String a(int i) {
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(61)));
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str;
    }

    public static String c(Resources resources, List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    return resources.getString(R.string.listify_many, list.get(0), Integer.valueOf(list.size() - 1));
                }
                return resources.getString(R.string.listify_two, list.get(0), list.get(1));
            }
            return resources.getString(R.string.listify_one, list.get(0));
        }
        return "";
    }

    public static List d(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",", -1)) {
                arrayList.add(str2.trim());
            }
            arrayList.removeAll(alog.r(""));
        }
        return arrayList;
    }

    public static void e(StringBuilder sb, String str, String str2) {
        f(sb, null, str, str2);
    }

    public static void f(StringBuilder sb, String str, String str2, String str3) {
        if (sb.length() > 0) {
            sb.append(str3);
        }
        if (!albo.ah(str)) {
            sb.append(str);
        }
        sb.append(str2);
    }

    public static boolean g(String str, String str2) {
        if (!albo.ah(str) && !albo.ah(str2)) {
            return str.toLowerCase(Locale.US).equals(str2.toLowerCase(Locale.US));
        }
        return false;
    }

    public static boolean h(String str) {
        if (!albo.ah(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean i(String str, Pattern pattern) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (pattern != null && pattern.matcher(str).find()) {
            return true;
        }
        return PhoneNumberUtils.isGlobalPhoneNumber(str);
    }

    public static String j(String str) {
        return URLEncoder.encode(str, "UTF-8");
    }
}
