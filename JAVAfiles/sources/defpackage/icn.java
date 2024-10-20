package defpackage;

import android.app.backup.BackupManager;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icn implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final BackupManager b;
    private final anen d;
    private final String e;
    private final aegp f;
    private static final alvi c = alvi.m("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListenerDelegate");
    static final utz a = uuh.q(160945957);

    public icn(String str, aegp aegpVar, BackupManager backupManager, anen anenVar) {
        this.d = anenVar;
        aegpVar.getClass();
        this.e = str;
        this.f = aegpVar;
        this.b = backupManager;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2;
        boolean b = this.f.b(str);
        alvw f = c.f();
        f.X(alwp.a, "BugleBackup");
        alvg alvgVar = (alvg) ((alvg) f).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListenerDelegate", "onSharedPreferenceChanged", 75, "BugleOnSharedPreferenceChangeListenerDelegate.java");
        if (true != b) {
            str2 = "Ignoring (key not backed up).";
        } else {
            str2 = "Scheduling a backup.";
        }
        alvgVar.J("Preference \"%s\" in \"%s\" was modified. %s", str, this.e, str2);
        if (b) {
            if (((Boolean) a.e()).booleanValue()) {
                qiu.h(aktp.ah(new gtq(this, 10), this.d));
            } else {
                this.b.dataChanged();
            }
        }
    }
}
