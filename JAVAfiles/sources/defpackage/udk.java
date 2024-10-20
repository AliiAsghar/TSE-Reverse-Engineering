package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udk implements uco {
    private final Set e;
    private alob f = new alob();
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin");
    public static final utz a = uuh.n(uuh.b, "QueryPlanCheckerPlugin_enabled", true);
    static final alog b = alog.z("DELETE FROM conversations", "DELETE FROM events", "DELETE FROM generic_worker_queue", "DELETE FROM participants", "DELETE FROM p2p_conversation_suggestion_event", "DELETE FROM remote_user_id_to_registration_id WHERE 1", "DELETE FROM user_references WHERE ((SELECT EXISTS (SELECT messages._id FROM messages WHERE ((messages._id = user_references.message_id) AND ((messages.message_status = ", "UPDATE messages SET raw_status=10001,message_status=8 WHERE ((messages.message_status = ?) AND (messages._id IN (SELECT parts.message_id FROM parts WHERE (parts.processing_status NOT IN (0,3)))))", "UPDATE generic_worker_queue SET retry_count=4 WHERE ((generic_worker_queue.worker_type IN (32,64,128)) AND (generic_worker_queue");
    static final alog c = alog.w(Pattern.compile("INSERT INTO participants .*", 32), Pattern.compile(".*\\(participants\\.color_type \\<\\> 0\\).*"), Pattern.compile(".*\\(participants\\._id IN \\(SELECT.*"), Pattern.compile(".*\\(participants\\.sub_id = -2\\)"), Pattern.compile("UPDATE participants SET .* WHERE .*"), Pattern.compile(".*PHONE_NUMBERS_EQUAL.*"));

    public udk(Set set) {
        this.e = set;
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    public final void f(ude udeVar, Throwable th) {
        ucn a2 = udeVar.a();
        String str = a2.a;
        String[] strArr = (String[]) Collection.EL.stream(a2.b).toArray(new mlo(7));
        if (str != null && !str.startsWith("EXPLAIN ")) {
            if (strArr == null) {
                strArr = new String[0];
            }
            try {
                agnj c2 = agnc.c(((uci) udeVar.d).k(), str, strArr, this.e);
                if (c2.b && !str.startsWith("/*EXEMPT-FROM-QUERY-PLAN-CHECK*/") && Collection.EL.stream(c).noneMatch(new qxp(str, 19)) && Collection.EL.stream(b).noneMatch(new qxp(str, 20))) {
                    String str2 = "query plan with warnings for " + String.valueOf(udeVar.a) + "\n" + str + "\nsdk " + Build.VERSION.SDK_INT + "\nsqlite version " + agnc.i(((uci) udeVar.d).k()) + "\n" + c2.a + "\n" + ((String) DesugarArrays.stream(th.getStackTrace()).map(new tvq(20)).collect(Collectors.joining("\n")));
                    alvw i = d.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin", "checkQueryPlan", 229, "QueryPlanCheckerPlugin.java")).t("%s", str2);
                    throw new IllegalStateException(str2);
                }
            } catch (SQLiteException e) {
                alvw f = d.f();
                f.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) f).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin", "checkQueryPlan", 241, "QueryPlanCheckerPlugin.java")).t("got SQLiteException evaluating query plan: %s", str);
            }
        }
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        if (((Boolean) a.e()).booleanValue() && !udeVar.e) {
            int ordinal = udeVar.b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 8) {
                    if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                        return null;
                    }
                } else {
                    alog g = this.f.g();
                    this.f = new alob();
                    return new ucz(g, 2);
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            rvz rvzVar = new rvz((Object) this, (Object) udeVar, (Object) illegalStateException, 12, (char[]) null);
            if (((uci) udeVar.d).k().inTransaction()) {
                this.f.h(new rvz((Object) this, (Object) udeVar, (Object) illegalStateException, 13, (char[]) null));
                return null;
            }
            rvzVar.run();
            return null;
        }
        return null;
    }

    @Override // defpackage.uco
    public final void m(SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) a.e()).booleanValue()) {
            return;
        }
        akrh e = aktp.e("QueryPlanCheckerPlugin#initialize");
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT count(*) FROM sqlite_master WHERE name = 'sqlite_stat1'", null);
            try {
                if (rawQuery.moveToFirst() && rawQuery.getInt(0) == 0) {
                    sQLiteDatabase.execSQL("ANALYZE");
                    sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1");
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master", null);
                while (rawQuery.moveToNext()) {
                    try {
                        String string = rawQuery.getString(0);
                        if (string.hashCode() == 100346066 && string.equals("index")) {
                            String string2 = rawQuery.getString(2);
                            if (!string2.startsWith("sqlite")) {
                                String string3 = rawQuery.getString(1);
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("tbl", string2);
                                contentValues.put("idx", string3);
                                contentValues.put("stat", (Integer) 10000);
                                sQLiteDatabase.insertOrThrow("sqlite_stat1", null, contentValues);
                            }
                        }
                    } finally {
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS foo_for_testing");
                sQLiteDatabase.execSQL("CREATE TABLE foo_for_testing (foo, bar)");
                sQLiteDatabase.execSQL("ANALYZE foo_for_testing");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS foo_for_testing");
                e.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ucm.a();
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
