package defpackage;

import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipq {
    private static final alwo a = alwo.o("UrlChecker");
    private static final Pattern b = Pattern.compile("(\\.|%2e){2,}|%u", 2);
    private final alog c;

    public aipq() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        Pattern pattern = aipp.a;
        Uri.Builder encodedFragment = uri.buildUpon().encodedFragment(null);
        if (uri.isHierarchical()) {
            encodedFragment.clearQuery();
        }
        String uri2 = encodedFragment.build().toString();
        if (b.matcher(uri2).find()) {
            ((alwl) a.m().h("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 78, "UrlChecker.java")).t("'..' and '%%u' are not allowed in '%s'", aipp.a(uri));
            return false;
        }
        if ((albo.ah(uri.getHost()) || !"https".equalsIgnoreCase(uri.getScheme())) && !URLUtil.isAssetUrl(uri2) && !URLUtil.isAboutUrl(uri2) && !uri2.startsWith("file:///android_res/")) {
            ((alwl) a.m().h("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 88, "UrlChecker.java")).t("Url '%s' is not allowed (empty host/non-https or non resource/asset/about url)", aipp.a(uri));
            return false;
        }
        alog alogVar = this.c;
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            aipo aipoVar = (aipo) alogVar.get(i);
            if (aipoVar != null && aipoVar.a.matcher(uri2).matches()) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public aipq(List list) {
        alob alobVar = new alob();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!albo.ah(str)) {
                algw a2 = aipo.a(str);
                if (a2.f()) {
                    alobVar.h(a2.b());
                }
            }
        }
        this.c = alobVar.g();
    }
}
