package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aski implements asjy {
    private static final String[] a = {"_id", "class"};
    private final askb b = new askb(1);

    private static final ContentValues c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // defpackage.asjy
    public final List a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // defpackage.asjy
    public final void b(Context context, ComponentName componentName, int i) {
        Cursor cursor;
        if (!arsd.aq(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            try {
                cursor = contentResolver.query(parse, a, "package=?", new String[]{componentName.getPackageName()}, null);
                if (cursor != null) {
                    try {
                        String className = componentName.getClassName();
                        boolean z = false;
                        while (cursor.moveToNext()) {
                            contentResolver.update(parse, c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                            z |= className.equals(cursor.getString(cursor.getColumnIndex("class")));
                        }
                        if (!z) {
                            contentResolver.insert(parse, c(componentName, i, true));
                        }
                    } catch (Throwable th) {
                        th = th;
                        arsd.ap(cursor);
                        throw th;
                    }
                }
                arsd.ap(cursor);
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } else {
            this.b.b(context, componentName, i);
        }
    }
}
