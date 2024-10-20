package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sur extends aglo {
    public static final String[] a = {"message_edits.message_id", "message_edits.latest_message_id", "message_edits.original_rcs_message_id", "message_edits.edited_at_timestamp_ms", "message_edits.received_at_timestamp_ms"};
    public static final alor b;
    public static final int[] c;
    public static final usk d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("message_id", "index_message_edits_message_id");
        alokVar.h("latest_message_id", "index_message_edits_latest_message_id");
        alokVar.h("original_rcs_message_id", "index_message_edits_original_rcs_message_id");
        alokVar.b();
        d = new usk((byte[]) null, (char[]) null);
        c = new int[]{59860};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("edited_at_timestamp_ms INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_at_timestamp_ms INTEGER");
        sb.insert(0, "CREATE TABLE message_edits (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_edits_message_id ON message_edits(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_latest_message_id");
        arrayList.add("CREATE INDEX index_message_edits_latest_message_id ON message_edits(latest_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_original_rcs_message_id");
        arrayList.add("CREATE INDEX index_message_edits_original_rcs_message_id ON message_edits(original_rcs_message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
