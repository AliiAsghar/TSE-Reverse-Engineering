package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kso implements ksm {
    public static final xze a = xze.g("Bugle", "HelpAndFeedbackIntentsImpl");
    public final Context b;
    public final yfu c;
    public final uvq d;
    public final orq e;
    private final agxw f;

    public kso(Context context, yfu yfuVar, uvq uvqVar, agxw agxwVar, orq orqVar) {
        this.b = context;
        this.c = yfuVar;
        this.f = agxwVar;
        this.d = uvqVar;
        this.e = orqVar;
    }

    public static Intent k(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static Bitmap l(Context context) {
        Activity g = abbu.g(context);
        if (g == null) {
            return null;
        }
        return abrc.k(g);
    }

    private final FeedbackOptions m(Context context, String str, String str2) {
        Bitmap l = l(context);
        abym n = n(context, str2);
        n.d(this.d, false);
        if (l != null) {
            n.a = l;
        }
        if (str != null) {
            n.d = str;
        } else {
            String str3 = (String) utw.m.e();
            if (!TextUtils.isEmpty(str3)) {
                n.d = str3;
            }
        }
        a.o("Sending feedback...");
        return n.a();
    }

    private static final abym n(Context context, String str) {
        abym abymVar = new abym(context);
        aqws aqwsVar = new aqws((char[]) null);
        aqwsVar.d();
        abymVar.f = aqwsVar.c();
        if (str != null) {
            abymVar.c = str;
        }
        return abymVar;
    }

    private static final void o(Activity activity, String str, String str2) {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 3;
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.s = themeSettings;
        InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
        inProductHelp.c = "https://support.google.com/messages?p=".concat(String.valueOf(str2));
        new acak(activity).c(inProductHelp);
    }

    @Override // defpackage.ksm
    public final acir a(ksl kslVar) {
        List list = (List) Collection.EL.stream(kslVar.a).map(new koa(4)).filter(new ilu(6)).collect(Collectors.toCollection(new ijk(14)));
        HashMap hashMap = new HashMap();
        hashMap.put("share_with_partner_consent", kslVar.b.a());
        list.add(aktp.ag(hashMap));
        list.add(aktp.ag(kslVar.d));
        alok alokVar = new alok();
        alokVar.l((Map) Collection.EL.stream(kslVar.a).collect(alls.a(new koa(5), new koa(6))));
        alokVar.h("CONSENT", kslVar.b);
        alokVar.h("EXTRA", new uvs(kslVar.d));
        this.d.c(alokVar.b());
        abym n = n(this.b, null);
        n.d(this.d, false);
        kslVar.e.ifPresent(new ksn(this, n, 0));
        Bitmap bitmap = kslVar.c;
        if (bitmap != null) {
            n.a = bitmap;
        }
        a.o("Sending feedback...");
        return lga.aK(this.b, n.a());
    }

    @Override // defpackage.ksm
    public final acir b(Context context, String str, String str2) {
        return lga.aK(context, m(context, str, str2));
    }

    @Override // defpackage.ksm
    public final akul c(Context context, String str, ajwt ajwtVar) {
        return d(context, str, ajwtVar, null);
    }

    @Override // defpackage.ksm
    public final akul d(Context context, String str, ajwt ajwtVar, uvn uvnVar) {
        return akul.g(this.f.m(ajwtVar)).i(new mmc((Object) this, (Object) context, (Object) str, (Object) uvnVar, 1, (byte[]) null), andi.a);
    }

    @Override // defpackage.ksm
    public final void e(Context context, String str) {
        if (ActivityManager.isUserAMonkey()) {
            return;
        }
        context.getClass();
        yfu yfuVar = this.c;
        Uri parse = Uri.parse("https://support.google.com/nexus/topic/6089061/?hl=%locale%");
        Intent k = k(yfuVar.a());
        Intent k2 = k(this.c.b());
        Intent intent = new Intent(context, (Class<?>) LicenseMenuActivity.class);
        Resources resources = context.getResources();
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 3;
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.q = parse;
        googleHelp.b(0, resources.getString(R.string.menu_privacy_policy), k);
        googleHelp.b(1, resources.getString(R.string.menu_terms_of_service), k2);
        googleHelp.b(2, resources.getString(R.string.menu_license), intent);
        googleHelp.s = themeSettings;
        abym abymVar = new abym(context);
        aqws aqwsVar = new aqws((char[]) null);
        aqwsVar.d();
        abymVar.f = aqwsVar.c();
        Bitmap l = l(context);
        if (l != null) {
            abymVar.a = l;
        }
        abymVar.d(this.d, true);
        googleHelp.c(abymVar.a(), context.getCacheDir());
        Intent a2 = googleHelp.a();
        Activity g = abbu.g(context);
        if (g == null) {
            a.q("Supplied context was not an Activity, cannot launch help");
        } else {
            lga.aJ(g, a2);
        }
    }

    @Override // defpackage.ksm
    public final void f(Context context, String str) {
        Activity g = abbu.g(context);
        if (g == null) {
            ((alvg) a.j().h("com/google/android/apps/messaging/helpandfeedback/HelpAndFeedbackIntentsImpl", "launchRcsFiMultiSyncLearnMoreActivity", 125, "HelpAndFeedbackIntentsImpl.java")).t("pLink is clicked without an Activity. Context = %s", context);
        } else {
            o(g, str, str);
        }
    }

    @Override // defpackage.ksm
    public final void g(Activity activity, String str) {
        String str2 = (String) yig.w.e();
        if (ActivityManager.isUserAMonkey()) {
            return;
        }
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 3;
        FeedbackOptions m = m(activity, null, null);
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.q = Uri.parse(str2);
        googleHelp.s = themeSettings;
        googleHelp.c(m, activity.getCacheDir());
        lga.aJ(activity, googleHelp.a());
    }

    @Override // defpackage.ksm
    public final void h(Context context) {
        Bitmap k;
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 3;
        abym abymVar = new abym(context);
        abymVar.e = themeSettings;
        abymVar.d(this.d, false);
        Activity g = abbu.g(context);
        if (g == null) {
            k = null;
        } else {
            k = abrc.k(g);
        }
        if (k != null) {
            abymVar.a = k;
        }
        lga.aK(context, abymVar.a());
    }

    @Override // defpackage.ksm
    public final void i(Activity activity) {
        o(activity, "rcs_chat", "rcs_chats_faq");
    }

    @Override // defpackage.ksm
    public final acir j(Context context) {
        Bitmap l = l(context);
        abym abymVar = new abym(context);
        alok alokVar = new alok();
        alokVar.h("gemini_feedback", "true");
        alor b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("gemini_feedback", new uvs(b));
        this.d.c(alokVar2.b());
        abymVar.d(this.d, true);
        if (l != null) {
            abymVar.a = l;
        }
        abymVar.d = "com.google.android.apps.messaging.GENAI_FEATURES";
        abymVar.g = "magic_compose";
        a.o("Sending feedback...");
        return lga.aK(context, abymVar.a());
    }
}
