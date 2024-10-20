package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icm {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener");
    public final Context a;
    public final idk b;
    private final anen d;
    private final vl e = new vl();

    public icm(Context context, anen anenVar, idk idkVar) {
        this.a = context;
        this.d = anenVar;
        this.b = idkVar;
    }

    public final void a(String str, aegp aegpVar) {
        synchronized (icn.class) {
            if (this.e.containsKey(str)) {
                alvw i = c.i();
                i.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener", "registerListener", 54, "BugleOnSharedPreferenceChangeListener.java")).t("Preference change listener for \"%s\" has already been registered.", str);
            } else {
                icn icnVar = new icn(str, aegpVar, new BackupManager(this.a), this.d);
                this.e.put(str, icnVar);
                alvw g = c.g();
                g.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener", "registerListener", 68, "BugleOnSharedPreferenceChangeListener.java")).t("Registering preference change listener for \"%s\".", str);
                this.a.getSharedPreferences(str, 0).registerOnSharedPreferenceChangeListener(icnVar);
            }
        }
    }
}
