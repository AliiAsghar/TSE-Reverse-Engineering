package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skk extends aglo {
    public static final String[] a = {"conversation_labels._id", "conversation_labels.conversation_id", "conversation_labels.label", "conversation_labels.message_id", "conversation_labels.snippet_text", "conversation_labels.preview_uri", "conversation_labels.preview_content_type", "conversation_labels.message_status", "conversation_labels.read", "conversation_labels.received_timestamp", "conversation_labels.message_protocol", "conversation_labels.raw_telephony_status"};
    public static final int[] b;
    public static final rtb c;

    static {
        alok alokVar = new alok();
        alokVar.h("conversation_labels.label", 53020);
        alokVar.h("conversation_labels.snippet_text", 53010);
        alokVar.h("conversation_labels.preview_uri", 55040);
        alokVar.h("conversation_labels.preview_content_type", 55040);
        alokVar.h("conversation_labels.message_status", 57050);
        alokVar.h("conversation_labels.read", 57050);
        alokVar.h("conversation_labels.received_timestamp", 57050);
        alokVar.h("conversation_labels.message_protocol", 57050);
        alokVar.h("conversation_labels.raw_telephony_status", 57050);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_conversation_labels_message_id");
        alokVar2.b();
        c = new rtb(null, null, null);
        b = new int[]{51000, 53010, 53020, 55040, 57050, 58430, 58920};
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("snippet_text TEXT");
        }
        if (i >= 55040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("preview_uri TEXT");
        }
        if (i >= 55040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("preview_content_type TEXT");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_status INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("read INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("received_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_protocol INTEGER DEFAULT(0)");
        }
        if (i >= 57050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("raw_telephony_status INTEGER DEFAULT(0)");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar, int i) {
        agnwVar.z(a(i, "conversation_labels"));
        for (String str : c(i)) {
            agnwVar.z(str);
        }
    }

    public static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 53020) {
            arrayList.add("DROP INDEX IF EXISTS unique_idx_conversation_label");
            arrayList.add("CREATE UNIQUE INDEX unique_idx_conversation_label ON conversation_labels(conversation_id, label);");
        }
        if (i >= 58430) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_labels_label");
            arrayList.add("CREATE INDEX index_conversation_labels_label ON conversation_labels(label);");
        }
        if (i >= 58920) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_labels_message_id");
            arrayList.add("CREATE INDEX index_conversation_labels_message_id ON conversation_labels(message_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
