package defpackage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aegr extends BackupAgentHelper {
    private final void a() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    public static void i(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        Class<?> cls = null;
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                    if (obj != null) {
                        cls = obj.getClass();
                    }
                    Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is a set containing an object of type " + String.valueOf(cls) + ".");
                    return;
                }
            }
            editor.putStringSet(str, set);
            return;
        }
        if (obj != null) {
            cls = obj.getClass();
        }
        Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is the unrecognized type " + String.valueOf(cls) + ".");
    }

    public static boolean j(String str) {
        if (!str.contains(File.separator) && !str.contains("/") && !"persistent_backup_agent_helper".equals(str)) {
            return true;
        }
        return false;
    }

    protected abstract Map c();

    protected final SharedPreferences h(String str) {
        return getSharedPreferences(str, 0);
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Map c = c();
        SharedPreferences.Editor edit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        edit.clear();
        for (Map.Entry entry : ((alor) c).entrySet()) {
            String str = (String) entry.getKey();
            aegp aegpVar = (aegp) entry.getValue();
            if (j(str)) {
                for (Map.Entry<String, ?> entry2 : h(str).getAll().entrySet()) {
                    String key = entry2.getKey();
                    Object value = entry2.getValue();
                    if (aegpVar.b(key)) {
                        i(edit, a.co(key, str, "/"), value);
                    }
                }
            } else {
                throw new IllegalArgumentException(a.bW(str, "Unsupported shared preferences file name \"", "\""));
            }
        }
        edit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        a();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int indexOf = key.indexOf("/");
            if (indexOf >= 0 && indexOf < key.length() - 1) {
                String substring = key.substring(0, indexOf);
                String substring2 = key.substring(indexOf + 1);
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap.get(substring);
                if (editor == null) {
                    if (!j(substring)) {
                        Log.w("PersistentBackupAgentHe", a.bW(substring, "Skipping unsupported shared preferences file name \"", "\""));
                    } else {
                        editor = h(substring).edit();
                        hashMap.put(substring, editor);
                    }
                }
                i(editor, substring2, value);
            } else {
                Log.w("PersistentBackupAgentHe", a.bW(key, "Format of key \"", "\" not understood, so skipping its restore."));
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
        g(hashMap.keySet());
        a();
    }

    protected void g(Set set) {
    }
}
