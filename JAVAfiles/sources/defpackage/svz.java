package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svz extends aglo {
    public static final String[] a = {"message_replies.message_id", "message_replies.replied_to_message_id", "message_replies.replied_to_message_id_null_reason", "message_replies.replied_to_rcs_message_id"};
    public static final alor b;
    public static final int[] c;
    public static final ifq d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("message_id", "index_message_replies_message_id");
        alokVar.h("replied_to_rcs_message_id", "index_message_replies_replied_to_rcs_message_id");
        alokVar.b();
        d = new ifq((byte[]) null, (byte[]) null);
        c = new int[]{58330, 58900};
    }

    public static void a(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_message_id INTEGER REFERENCES messages(_id) ON DELETE SET NULL ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_message_id_null_reason INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_rcs_message_id TEXT");
        sb.insert(0, "CREATE TABLE message_replies (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_replies_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_replies_message_id ON message_replies(message_id);");
        if (i >= 58900) {
            arrayList.add("DROP INDEX IF EXISTS index_message_replies_replied_to_rcs_message_id");
            arrayList.add("CREATE INDEX index_message_replies_replied_to_rcs_message_id ON message_replies(replied_to_rcs_message_id);");
        }
        if (i >= 58900) {
            arrayList.add("DROP INDEX IF EXISTS index_replied_to_message_id");
            arrayList.add("CREATE INDEX index_replied_to_message_id ON message_replies(replied_to_message_id, replied_to_message_id_null_reason);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
