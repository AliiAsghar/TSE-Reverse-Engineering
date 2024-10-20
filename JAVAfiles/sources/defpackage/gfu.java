package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfu {
    public boolean a;
    public PreferenceScreen b;
    public gft c;
    public gfr d;
    public gfs e;
    private final Context f;
    private long g = 0;
    private SharedPreferences h;
    private SharedPreferences.Editor i;
    private String j;

    public gfu(Context context) {
        this.f = context;
        f(String.valueOf(context.getPackageName()).concat("_preferences"));
    }

    private final void g(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.a = z;
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.g;
            this.g = 1 + j;
        }
        return j;
    }

    public final SharedPreferences.Editor b() {
        if (this.a) {
            if (this.i == null) {
                this.i = c().edit();
            }
            return this.i;
        }
        return c().edit();
    }

    public final SharedPreferences c() {
        if (this.h == null) {
            this.h = this.f.getSharedPreferences(this.j, 0);
        }
        return this.h;
    }

    public final Preference d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.b;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final PreferenceScreen e(Context context, int i, PreferenceScreen preferenceScreen) {
        g(true);
        int i2 = gfq.a;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            Preference a = gfq.a(xml, preferenceScreen, context, objArr, this, strArr);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) a;
            preferenceScreen2.C(this);
            g(false);
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final void f(String str) {
        this.j = str;
        this.h = null;
    }
}
