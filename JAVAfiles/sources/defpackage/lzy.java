package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzy {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations");
    private final xnv b;
    private final armf c;
    private final lzz d;
    private final armf e;
    private final armf f;
    private final lfl g;

    public lzy(xnv xnvVar, armf armfVar, lzz lzzVar, lfl lflVar, armf armfVar2, armf armfVar3) {
        this.b = xnvVar;
        this.c = armfVar;
        this.d = lzzVar;
        this.g = lflVar;
        this.e = armfVar2;
        this.f = armfVar3;
    }

    public final int a(long j) {
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = sni.a;
        return (int) ((agnw) this.c.b()).f(String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "messages", sni.c.f, MessagesTable.c.a), String.format("%s = ? AND %s > ?", sni.c.O, MessagesTable.c.i), new String[]{Integer.toString(2), Long.toString(epochMilli)});
    }

    public final int b(long j) {
        Cursor cursor;
        xyl.h();
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = sni.a;
        String format = String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "messages", sni.c.f, MessagesTable.c.a);
        smu smuVar = sni.c;
        smv smvVar = smuVar.O;
        sxp sxpVar = MessagesTable.c.i;
        smv smvVar2 = smuVar.y;
        try {
            cursor = ((agnw) this.c.b()).j().query(format, new String[]{sni.c.y.toString()}, String.format("%s = ? AND %s > ? and %s IS NOT NULL and %s != ''", smvVar, sxpVar, smvVar2, smvVar2), new String[]{Integer.toString(0), Long.toString(epochMilli)}, null, null, null);
            int i = 0;
            while (cursor.moveToNext()) {
                try {
                    if (msx.i(cursor.getString(0))) {
                        i++;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public final int c(long j) {
        long epochMilli = this.b.f().toEpochMilli() - j;
        alwo alwoVar = MessageData.a;
        int[] iArr = {1, 2, 11, 15, 14};
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(3));
        arrayList.add(Long.toString(-1L));
        arrayList.add(Long.toString(epochMilli));
        for (int i = 0; i < 5; i++) {
            arrayList.add(Integer.toString(iArr[i]));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MessagesTable.c.j);
        sb.append(" = ? AND ");
        sb.append(MessagesTable.c.I);
        sb.append(" != ? AND ");
        sb.append(MessagesTable.c.g);
        sb.append(" > ? AND (");
        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 > 0) {
                sb.append(" OR ");
            }
            sb.append(MessagesTable.c.k);
            sb.append(" = ?");
        }
        sb.append(")");
        return (int) ((agnw) this.c.b()).f("messages", sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final alor d(long j) {
        Cursor cursor;
        boolean z;
        HashMap hashMap = new HashMap();
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = sni.a;
        String format = String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "participants", sni.c.y, ParticipantsTable.c.f);
        smu smuVar = sni.c;
        try {
            cursor = ((agnw) this.c.b()).j().query(format, new String[]{sni.c.y.toString(), ParticipantsTable.c.v.toString()}, String.format("%s = 1 AND %s > ?", smuVar.R, smuVar.S), new String[]{Long.toString(epochMilli)}, null, null, null);
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(0);
                    if (string == null) {
                        ((alvg) ((alvg) a.i()).h("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations", "getRbmBotsFromInteractiveRbmConversations", 157, "AnalyticsDatabaseOperations.java")).q("null in PARTICIPANT_NORMALIZED_DESTINATION for RBM bot");
                    } else {
                        if (cursor.getInt(1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (hashMap.put(string, Boolean.valueOf(z)) != null) {
                            ((alvg) ((alvg) a.i()).h("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations", "getRbmBotsFromInteractiveRbmConversations", 163, "AnalyticsDatabaseOperations.java")).t("Duplicated conversation found with %s", yyb.bh(string));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return alor.j(hashMap);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x048d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0484  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.amfh e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r30) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzy.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):amfh");
    }
}
