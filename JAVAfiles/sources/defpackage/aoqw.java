package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqw extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        String str;
        String str2;
        String str3 = null;
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aoroVar.j(), "_");
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        } else {
            str = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str3 = stringTokenizer.nextToken();
        }
        if (str2 == null && str3 == null) {
            return new Locale(str);
        }
        if (str3 == null) {
            return new Locale(str, str2);
        }
        return new Locale(str, str2, str3);
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        aorpVar.m(locale);
    }
}
