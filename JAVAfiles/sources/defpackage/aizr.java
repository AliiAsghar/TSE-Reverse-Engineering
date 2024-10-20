package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizr {
    public static final long a = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        String f = f();
        if (f.contains(".")) {
            f = f.substring(f.lastIndexOf(".") + 1);
        }
        return Integer.parseInt(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle b(aprm aprmVar) {
        aprl aprlVar = aprmVar.c;
        if (aprlVar == null) {
            aprlVar = aprl.a;
        }
        apax apaxVar = aprlVar.b;
        int size = apaxVar.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            aprk aprkVar = (aprk) apaxVar.get(i);
            bundle.putString(aprkVar.b, aprkVar.c);
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.apqn c(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizr.c(android.content.Context):apqn");
    }

    public static String d(PackageInfo packageInfo) {
        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
                if (digest == null) {
                    return null;
                }
                int length = digest.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (byte b : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                Log.e("SurveyUtils", "Can't find SHA1.", e);
            }
        }
        return null;
    }

    public static String e(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && Patterns.WEB_URL.matcher(albo.ap(str)).matches()) {
            if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
                Uri parse = Uri.parse(str);
                try {
                    ahnz ahnzVar = aizp.c;
                    if (!aizp.b(aqrd.a.get().a(aizp.b))) {
                        if (parse.getQuery() == null) {
                            str2 = "";
                        } else {
                            str2 = URLEncoder.encode(parse.getQuery(), "utf-8");
                        }
                        return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str2).toString();
                    }
                    return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery(), null).toString();
                } catch (UnsupportedEncodingException | URISyntaxException e) {
                    Log.e("SurveyUtils", e.getMessage());
                }
            }
            Log.e("SurveyUtils", "Follow up URL is not http or https.");
            return "";
        }
        Log.e("SurveyUtils", "Follow up URL was empty or invalid.");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f() {
        ahnz ahnzVar = aizp.c;
        String a2 = aqpk.a.get().a(aizp.b);
        if (a2.equals("1")) {
            ahnz ahnzVar2 = aizp.c;
            return aqpk.a.get().b(aizp.b);
        }
        return a2;
    }

    public static void g(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void h(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static boolean i(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean j(apri apriVar) {
        aprj aprjVar = apriVar.f;
        if (aprjVar == null) {
            aprjVar = aprj.a;
        }
        return aprjVar.b;
    }

    public static boolean k(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 15) == 6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean l(apri apriVar) {
        apry apryVar;
        if (apriVar.g.size() <= 1) {
            apro aproVar = (apro) apriVar.g.get(0);
            int i = aproVar.i;
            int T = a.T(i);
            if (T != 0 && T == 3) {
                if (aproVar.c == 4) {
                    apryVar = (apry) aproVar.d;
                } else {
                    apryVar = apry.a;
                }
                apqh apqhVar = apryVar.c;
                if (apqhVar == null) {
                    apqhVar = apqh.a;
                }
                Iterator<E> it = apqhVar.b.iterator();
                while (it.hasNext()) {
                    int Z = a.Z(((apqg) it.next()).c);
                    if (Z != 0 && Z == 4) {
                        return true;
                    }
                }
                return false;
            }
            int T2 = a.T(i);
            if (T2 != 0 && T2 == 5) {
                return false;
            }
        }
        return true;
    }
}
