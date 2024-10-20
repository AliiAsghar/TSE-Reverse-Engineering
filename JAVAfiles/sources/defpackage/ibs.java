package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibs {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver");
    private final Context b;
    private final uff c;
    private final znj d;

    public ibs(Context context, znj znjVar, uff uffVar) {
        this.b = context;
        this.d = znjVar;
        this.c = uffVar;
    }

    public static Uri a(String str) {
        String str2;
        int i = Build.VERSION.SDK_INT;
        boolean m = gh.m(str);
        if (i >= 29) {
            str2 = "external_primary";
        } else {
            str2 = "external";
        }
        if (m) {
            return MediaStore.Images.Media.getContentUri(str2);
        }
        if (gh.z(str)) {
            return MediaStore.Video.Media.getContentUri(str2);
        }
        if (gh.e(str)) {
            return MediaStore.Audio.Media.getContentUri(str2);
        }
        return MediaStore.Files.getContentUri(str2);
    }

    private final String d(String str) {
        if (gh.m(str)) {
            return new File(Environment.DIRECTORY_PICTURES, this.b.getResources().getString(R.string.app_name)).getPath();
        }
        if (gh.z(str)) {
            return new File(Environment.DIRECTORY_MOVIES, this.b.getResources().getString(R.string.app_name)).getPath();
        }
        if (gh.e(str)) {
            return new File(Environment.DIRECTORY_MUSIC, this.b.getResources().getString(R.string.app_name)).getPath();
        }
        return Environment.DIRECTORY_DOWNLOADS;
    }

    private static boolean e(String str) {
        if (str != null && str.endsWith("/*")) {
            return true;
        }
        return false;
    }

    public final Uri b(String str) {
        Object obj;
        Uri a2 = a(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", this.d.t(str));
        contentValues.put("mime_type", str);
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", d(str));
        }
        try {
            return this.b.getContentResolver().insert(a2, contentValues);
        } catch (IllegalArgumentException e) {
            alvw h = a.h();
            h.X(alwp.a, "BugleStorage");
            alvg alvgVar = (alvg) ((alvg) h).h("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver", "getSaveUri", 149, "ScopedStorageAttachmentSaver.java");
            Object obj2 = contentValues.get("_display_name");
            Object obj3 = contentValues.get("mime_type");
            if (Build.VERSION.SDK_INT >= 29) {
                obj = contentValues.get("relative_path");
            } else {
                obj = "Pre Q, no relative path";
            }
            alvgVar.L("Error when inserting display name: %s of type: %s with relative path: %s into: %s Exception: %s", obj2, obj3, obj, a2, e.getMessage());
            return null;
        }
    }

    public final void c(List list) {
        String h;
        Object obj;
        String str;
        Uri uri;
        ContentResolver contentResolver = this.b.getContentResolver();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            grn grnVar = (grn) it.next();
            Object obj2 = grnVar.d;
            String str2 = (String) obj2;
            if (TextUtils.isEmpty(gh.c(str2)) || e(str2)) {
                String type = contentResolver.getType((Uri) grnVar.a);
                if (TextUtils.isEmpty(type) || e(type)) {
                    Uri uri2 = (Uri) grnVar.a;
                    if (this.c.k(uri2) && (h = this.c.h(uri2)) != null) {
                        if (e(str2)) {
                            obj2 = str2.substring(0, str2.length() - 1);
                        }
                        if (((String) obj2).endsWith("/")) {
                            String concat = String.valueOf(obj2).concat(h);
                            if (!TextUtils.isEmpty(gh.c(concat))) {
                                obj2 = concat;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(type) && !e(type)) {
                    obj2 = type;
                }
            }
            String str3 = (String) obj2;
            Uri a2 = a(str3);
            ContentValues contentValues = new ContentValues();
            Object obj3 = grnVar.b;
            if (obj3 == null && (obj3 = ydh.d((Uri) grnVar.c)) == null) {
                obj3 = this.d.t(str3);
            }
            contentValues.put("_display_name", (String) obj3);
            contentValues.put("mime_type", str3);
            Iterator it2 = it;
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("relative_path", d(str3));
                contentValues.put("is_pending", (Integer) 1);
            }
            try {
                uri = contentResolver.insert(a2, contentValues);
                str = "is_pending";
            } catch (Exception e) {
                alvw h2 = a.h();
                h2.X(alwp.a, "BugleStorage");
                alvg alvgVar = (alvg) ((alvg) h2).h("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver", "saveMediaAttachments", 76, "ScopedStorageAttachmentSaver.java");
                Object obj4 = contentValues.get("_display_name");
                Object obj5 = contentValues.get("mime_type");
                if (Build.VERSION.SDK_INT >= 29) {
                    obj = contentValues.get("relative_path");
                } else {
                    obj = "Pre Q, no relative path";
                }
                str = "is_pending";
                alvgVar.L("Error when inserting display name: %s of type: %s with relative path: %s into: %s Exception: %s", obj4, obj5, obj, a2, e.getMessage());
                uri = null;
            }
            if (uri != null) {
                grnVar.e = uri;
                ydk.q(this.b, (Uri) grnVar.a, uri);
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.clear();
                    contentValues.put(str, (Integer) 0);
                    try {
                        this.b.getContentResolver().update(uri, contentValues, null, null);
                    } catch (SQLiteConstraintException | IllegalStateException e2) {
                        alvw h3 = a.h();
                        h3.X(alwp.a, "BugleStorage");
                        ((alvg) ((alvg) h3).h("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver", "saveMediaAttachments", 98, "ScopedStorageAttachmentSaver.java")).D("Error when trying to set pending state of: %s Exception: %s", a2, e2.getMessage());
                    }
                }
            }
            it = it2;
        }
    }
}
