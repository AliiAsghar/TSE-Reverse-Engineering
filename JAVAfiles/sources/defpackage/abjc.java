package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjc extends abhb {
    public static Context b;
    public static ContentResolver d;
    public final Object c;

    public abjc(String str) {
        super(null);
        this.c = str;
    }

    public static void i(SharedPreferences.Editor editor) {
        editor.apply();
    }

    public static void j(Context context) {
        d = context.getContentResolver();
    }

    public final SharedPreferences h() {
        return b.getSharedPreferences((String) this.c, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjc() {
        super(null);
        altg altgVar = altg.a;
        this.c = new aaoc(Uri.parse("content://com.google.android.rcs.service.preferences"), altgVar);
    }
}
