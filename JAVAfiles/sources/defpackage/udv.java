package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udv implements uco {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/SqliteExceptionPlugin");
    static final alhr a = uuh.v(110154778);

    @Override // defpackage.uco
    public final int e(Exception exc, int i, ude udeVar) {
        String message;
        int i2;
        if (((Boolean) ((utz) a.get()).e()).booleanValue() && (exc instanceof SQLiteException) && !(exc instanceof SQLiteConstraintException) && (message = exc.getMessage()) != null && !message.equals("Test Exception")) {
            if (exc instanceof SQLiteBlobTooBigException) {
                agnw agnwVar = udeVar.d;
                agoz agozVar = udeVar.j;
                if (agnwVar == null) {
                    Log.e("d26r", "in computeAndPrintIndividualProjectionsLengths database is null");
                } else if (agozVar == null) {
                    Log.e("d26r", "in computeAndPrintIndividualProjectionsLengths sourceQuery is null");
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    agpe agpeVar = new agpe(agozVar.e);
                    agpeVar.h(true);
                    agpf b2 = agpeVar.b();
                    String z = agozVar.z(new agpo(agozVar.n, b2, false), false, arrayList);
                    DesugarArrays.stream(agozVar.N(new agpo(agozVar.n, b2))).forEachOrdered(new adoj(arrayList2, 18));
                    String format = String.format(Locale.US, "/*EXEMPT-FROM-QUERY-PLAN-CHECK*/ SELECT %s FROM (%s)", (String) Collection.EL.stream(arrayList2).map(new aegk(6)).map(new agnz(1)).collect(Collectors.joining(",")), z);
                    if (format == null) {
                        Log.e("d26r", "in computeAndPrintIndividualProjectionsLengths sql is null");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        agpe a2 = agpf.a();
                        a2.h(true);
                        Cursor h = agnwVar.h(format, strArr, a2.b());
                        while (h.moveToNext()) {
                            try {
                                int i3 = 0;
                                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                    if (h.isNull(i4)) {
                                        i2 = 1;
                                    } else {
                                        i2 = h.getInt(i4);
                                    }
                                    i3 += i2;
                                    sb.append((String) arrayList2.get(i4));
                                    sb.append(" = ");
                                    sb.append(i2);
                                    sb.append("\n");
                                }
                                Log.e("d26r", "row " + h.getPosition() + "; size (approx) = " + i3 + "; column sizes { " + sb.toString() + "}");
                            } catch (Throwable th) {
                                if (h != null) {
                                    try {
                                        h.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                        if (h != null) {
                            h.close();
                        }
                    }
                }
            } else {
                udeVar.a();
                String str = udeVar.a().a;
                if (!message.contains("no such column: participants.comparable_destination")) {
                    alvw h2 = b.h();
                    h2.X(alwp.a, "BugleDatabase");
                    ((alvg) ((alvg) h2).h("com/google/android/apps/messaging/shared/datamodel/layer/SqliteExceptionPlugin", "handleException", 99, "SqliteExceptionPlugin.java")).J("got SQLiteException (%s) for sql: %s; exception message is %s", exc.getClass().getName(), str, message);
                }
            }
        }
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((Boolean) ((utz) a.get()).e()).booleanValue();
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
