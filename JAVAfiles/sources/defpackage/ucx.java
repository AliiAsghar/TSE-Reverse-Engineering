package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ucx implements uco {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin");
    private static final Map b = new HashMap();
    private static final alpt c = alpt.o((Collection) Stream.CC.of("Bugle.D26R.Query.SuperSortQueryPaged.Duration").collect(Collectors.toCollection(new tyr(5))));

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        String str;
        String str2;
        String str3;
        agni agniVar = udeVar.a;
        if (agniVar != null && !agniVar.b()) {
            String agniVar2 = agniVar.toString();
            if (!agniVar2.startsWith("DatabasePlugin#") && (str = udeVar.a().a) != null) {
                alhr alhrVar = udeVar.c;
                if (alhrVar != null) {
                    str2 = (String) alhrVar.get();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str3 = str2.replaceAll("LIMIT [0-9]+", "LIMIT 100").replaceAll("OFFSET [0-9]+", "OFFSET 0").replaceAll("conversation_participants.conversation_id = '[0-9]+'", "conversation_participants.conversation_id = '1'").replaceAll("participants\\._id IN \\(.*\\)", "participants._id IN ('1', '2', '3')").replaceAll("remote_user_id_to_registration_id\\.remote_user_id IN \\(.*\\)", "participants._id IN ('1', '2', '3')").replaceAll("work_queue.\\_id NOT IN \\(.*\\)", "work_queue._id NOT IN ()").replaceAll("messages\\.received_timestamp <= [0-9]+", "messages.received_timestamp <= 0");
                } else {
                    str3 = str;
                }
                if (str3 != null && !c.contains(agniVar2)) {
                    Map map = b;
                    ucw ucwVar = (ucw) map.get(agniVar2);
                    if (ucwVar != null && !ucwVar.b.equals(str3) && !agniVar2.startsWith("+")) {
                        alvi alviVar = a;
                        alvw g = alviVar.g();
                        g.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 151, "LoggingCheckerPlugin.java")).t("tag used for more than one sql: %s", agniVar2);
                        alvw g2 = alviVar.g();
                        g2.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 152, "LoggingCheckerPlugin.java")).q("++++++++++++++++++++++++++++++++");
                        alvw g3 = alviVar.g();
                        g3.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 153, "LoggingCheckerPlugin.java")).t("original sql  : %s", ucwVar.a);
                        alvw g4 = alviVar.g();
                        g4.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 154, "LoggingCheckerPlugin.java")).t("subsequent sql: %s", str);
                        alvw g5 = alviVar.g();
                        g5.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g5).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 155, "LoggingCheckerPlugin.java")).q("original usage here");
                        alog alogVar = ucwVar.c;
                        for (int i = 0; i < ((alsx) alogVar).c; i++) {
                            StackTraceElement stackTraceElement = (StackTraceElement) alogVar.get(i);
                            alvw g6 = a.g();
                            g6.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                            ((alvg) ((alvg) g6).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 157, "LoggingCheckerPlugin.java")).t(">>> %s", stackTraceElement);
                        }
                        alvi alviVar2 = a;
                        alvw g7 = alviVar2.g();
                        g7.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g7).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 159, "LoggingCheckerPlugin.java")).q("++++++++++++++++++++++++++++++++");
                        alvw g8 = alviVar2.g();
                        g8.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g8).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 160, "LoggingCheckerPlugin.java")).q("subsequent usage here");
                        for (StackTraceElement stackTraceElement2 : Thread.currentThread().getStackTrace()) {
                            alvw g9 = a.g();
                            g9.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                            ((alvg) ((alvg) g9).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 162, "LoggingCheckerPlugin.java")).t(">>> %s", stackTraceElement2);
                        }
                        alvw g10 = a.g();
                        g10.X(alwp.a, "LOGGING_CHECKER_PLUGIN");
                        ((alvg) ((alvg) g10).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingCheckerPlugin", "open", 164, "LoggingCheckerPlugin.java")).q("++++++++++++++++++++++++++++++++");
                        throw new IllegalStateException("tag used more than once: ".concat(agniVar2));
                    }
                    if (ucwVar == null) {
                        map.put(agniVar2, new ucw(str, str3, alog.p(Thread.currentThread().getStackTrace())));
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return false;
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
