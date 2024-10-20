package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtr implements ahss {
    public static final Map a = new tm();
    public final Object b;
    public volatile Map c;
    public final List d;
    private final SharedPreferences e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f;

    public ahtr(SharedPreferences sharedPreferences) {
        ahaj ahajVar = new ahaj(this, 2);
        this.f = ahajVar;
        this.b = new Object();
        this.d = new ArrayList();
        this.e = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(ahajVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        synchronized (ahtr.class) {
            for (ahtr ahtrVar : a.values()) {
                ahtrVar.e.unregisterOnSharedPreferenceChangeListener(ahtrVar.f);
            }
            a.clear();
        }
    }

    @Override // defpackage.ahss
    public final Object a(String str) {
        Map<String, ?> map = this.c;
        if (map == null) {
            synchronized (this.b) {
                map = this.c;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.e.getAll();
                        this.c = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
