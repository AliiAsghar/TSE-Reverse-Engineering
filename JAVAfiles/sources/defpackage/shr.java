package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shr extends aglo {
    public static final String[] a = {"cms_deleted_messages_buffer._id", "cms_deleted_messages_buffer.message_id", "cms_deleted_messages_buffer.conversation_id", "cms_deleted_messages_buffer.message_deletion_reason", "cms_deleted_messages_buffer.deletion_timestamp"};
    public static final int[] b;
    public static final usk c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("message_id", "index_cms_deleted_messages_buffer_message_id");
        alokVar.b();
        c = new usk((byte[]) null, (char[]) null, (byte[]) null);
        b = new int[]{59670};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_deletion_reason INT DEFAULT(0) NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("deletion_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE cms_deleted_messages_buffer (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_deleted_messages_buffer_message_id");
        arrayList.add("CREATE INDEX index_cms_deleted_messages_buffer_message_id ON cms_deleted_messages_buffer(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
