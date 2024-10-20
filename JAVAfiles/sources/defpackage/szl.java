package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szl extends aglo {
    public static final String[] a = {"p2p_conversation_suggestion_event.id", "p2p_conversation_suggestion_event.message_id", "p2p_conversation_suggestion_event.timestamp", "p2p_conversation_suggestion_event.event_type", "p2p_conversation_suggestion_event.reply_mode", "p2p_conversation_suggestion_event.rejection_reason", "p2p_conversation_suggestion_event.action_source", "p2p_conversation_suggestion_event.num_of_items", "p2p_conversation_suggestion_event.click_index", "p2p_conversation_suggestion_event.impression_id", "p2p_conversation_suggestion_event.suggestion_types", "p2p_conversation_suggestion_event.model_output_label"};
    public static final int[] b;
    public static final int[] c;
    public static final rtb d;

    static {
        alok alokVar = new alok();
        alokVar.h("p2p_conversation_suggestion_event.message_id", 51030);
        alokVar.h("p2p_conversation_suggestion_event.model_output_label", 42030);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_p2p_conversation_suggestion_event_message_id");
        alokVar2.b();
        d = new rtb(null, null);
        b = new int[]{37000, 42030, 51030, 58940};
        c = new int[]{57010};
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (i >= 51030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("event_type INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reply_mode INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rejection_reason INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("action_source INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("num_of_items INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("click_index INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("impression_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion_types TEXT");
        if (i >= 42030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("model_output_label TEXT");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar, int i) {
        agnwVar.z(a(i, "p2p_conversation_suggestion_event"));
        for (String str : c(i)) {
            agnwVar.z(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58940) {
            arrayList.add("DROP INDEX IF EXISTS index_p2p_conversation_suggestion_event_message_id");
            arrayList.add("CREATE INDEX index_p2p_conversation_suggestion_event_message_id ON p2p_conversation_suggestion_event(message_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
