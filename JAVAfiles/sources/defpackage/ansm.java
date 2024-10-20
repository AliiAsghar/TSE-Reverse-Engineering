package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansm {
    public static final Object a = new Object();
    public static final String b = "ansm";
    private final ahmn c;

    public ansm(ansl anslVar) {
        Context context = anslVar.a;
        String str = anslVar.b;
        String str2 = anslVar.c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.c = anslVar.e;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public final synchronized annb a() {
        return this.c.t();
    }
}
