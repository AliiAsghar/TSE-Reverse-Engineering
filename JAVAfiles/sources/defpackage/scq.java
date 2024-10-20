package defpackage;

import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class scq {
    public static final String a = e("%CONVERSATION_ID%");
    public static final String b = e("%ORDER_DIRECTION%");
    public static final String c = e("%EXCLUDE_DRAFTS%");
    public static final String d = e("%ROOT_MESSAGE_ID%");
    public static final String e = e("%ID_COMPARATOR%");
    public static final String f = e("%TIMESTAMP_COMPARATOR%");
    public static final String g = e("%TIMESTAMP_VALUE_VAL%");
    public static final String h = e("%TIMESTAMP_COLUMN_VAL%");

    static {
        e("%PARTICIPANT_ID%");
    }

    public static sda a(ConversationIdType conversationIdType, int i) {
        sda sdaVar = new sda(sdc.a);
        sdaVar.w("getLatestMessageIds");
        sdaVar.o(h, "messages.received_timestamp");
        sdaVar.o(b, "DESC");
        sdaVar.o(e, "<");
        sdaVar.o(a, conversationIdType.toString());
        sdaVar.o(c, "messages.message_status <> 3");
        sdaVar.u(i);
        return sdaVar;
    }

    public static sda b(ConversationIdType conversationIdType, MessageIdType messageIdType, long j, int i) {
        sda sdaVar = new sda(sdc.a);
        sdaVar.w("getMessageIdsBeforeIdChunk");
        sdaVar.o(h, "messages.received_timestamp");
        sdaVar.o(d, messageIdType.a());
        sdaVar.o(b, "DESC");
        sdaVar.o(f, "<");
        sdaVar.o(a, conversationIdType.toString());
        sdaVar.o(c, "messages.message_status <> 3");
        sdaVar.o(g, String.valueOf(j));
        sdaVar.c(new sal(13));
        sdaVar.u(i);
        return sdaVar;
    }

    public static agpj c(String str) {
        sxp sxpVar = MessagesTable.c.i;
        sxo sxoVar = MessagesTable.c;
        return new agpk("$V $R $R OR ($V = $R AND $V $R $R)", new Object[]{sxpVar, "%TIMESTAMP_COMPARATOR%", "%TIMESTAMP_VALUE_VAL%", sxoVar.i, "%TIMESTAMP_VALUE_VAL%", sxoVar.a, str, "%ROOT_MESSAGE_ID%"});
    }

    public static scu d(boolean z, ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        String str;
        String str2;
        Object apply;
        scu scuVar = new scu(scw.a);
        scuVar.w("+MessageIdsQueries#queryMessageIds");
        scuVar.o(h, "messages.received_timestamp");
        String str3 = b;
        if (true != z) {
            str = "DESC";
        } else {
            str = "ASC";
        }
        scuVar.o(str3, str);
        String str4 = e;
        String str5 = "<";
        if (true != z) {
            str2 = "<";
        } else {
            str2 = ">=";
        }
        scuVar.o(str4, str2);
        scuVar.o(a, conversationIdType.toString());
        scuVar.o(c, "messages.message_status <> 3");
        scuVar.o(d, DatabaseUtils.sqlEscapeString(String.valueOf(messageIdType.a)));
        String str6 = f;
        if (true == z) {
            str5 = ">";
        }
        scuVar.o(str6, str5);
        apply = new sal(12).apply(new scv());
        scuVar.k(new agpw((scv) apply));
        scuVar.u(i);
        return scuVar;
    }

    private static String e(String str) {
        return str.substring(1, str.length() - 1);
    }
}
