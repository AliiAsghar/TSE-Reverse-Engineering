package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqm {
    public final Context a;
    public boolean b;
    public Object c;
    public Object d;

    public aiqm(Activity activity) {
        this.b = false;
        this.a = activity;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List a() {
        b();
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void b() {
        if (this.d != null) {
            return;
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("exp_sticker_prefs", 0);
        this.d = sharedPreferences;
        String string = sharedPreferences.getString("favorites", "");
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(string);
        this.c = alzz.an(simpleStringSplitter);
        this.b = this.d.getBoolean("show_favorites_prompt", false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void c() {
        b();
        this.d.edit().putString("favorites", TextUtils.join(",", (Iterable) this.c)).apply();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void d(boolean z) {
        b();
        if (this.b != z) {
            this.b = z;
            this.d.edit().putBoolean("show_favorites_prompt", this.b).apply();
        }
    }

    public aiqm(Context context) {
        this.a = context;
    }
}
