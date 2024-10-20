package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajq {
    public final Object a;

    public aajq(cg cgVar) {
        this.a = cgVar;
    }

    public static /* synthetic */ aahr c(aajq aajqVar, String str, String str2, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        return aajqVar.e(str, str2, num, true);
    }

    private final aahr e(String str, String str2, Integer num, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        yyb.bv((Context) this.a, spannableStringBuilder, str2, null);
        return new aahr(spannableStringBuilder, str2, num, z);
    }

    private static void f() {
        xzb.g("Bugle", "GalleryCameraIntentLauncher: Cannot capture media, no registered activity");
    }

    public final aahr a() {
        String string = ((Context) this.a).getString(R.string.satellite_messaging_toolstone_link);
        string.getClass();
        String string2 = ((Context) this.a).getString(R.string.satellite_messaging_toolstone_text, string);
        string2.getClass();
        return e(string2, string, Integer.valueOf(R.drawable.gs_android_satellite_vd_theme_24), false);
    }

    public final aahr b() {
        String string = ((Context) this.a).getString(R.string.suggestion_shortcut_search_title);
        string.getClass();
        String string2 = ((Context) this.a).getString(R.string.suggestion_shortcut_star_toolstone, string);
        string2.getClass();
        return c(this, string2, string, null, 12);
    }

    public final void d(Intent intent) {
        Object obj = this.a;
        if (obj != null && ((cg) obj).fe() != null) {
            try {
                ((cg) obj).startActivityForResult(intent, 130);
                return;
            } catch (ActivityNotFoundException unused) {
                f();
                return;
            }
        }
        f();
    }

    public aajq(DebugMobileConfigurationActivity debugMobileConfigurationActivity) {
        this.a = debugMobileConfigurationActivity;
    }

    public aajq(Context context) {
        context.getClass();
        this.a = context;
    }

    public aajq(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
