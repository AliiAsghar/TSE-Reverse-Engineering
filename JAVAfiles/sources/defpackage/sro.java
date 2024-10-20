package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sro extends aglo {
    public static final int[] a = {59590};
    public static final int[] b = {59690};

    public static void a(agnw agnwVar, int i) {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("conversation_id INT NOT NULL");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("participant_id INT NOT NULL");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("rcs_group_join_status INT DEFAULT(0) NOT NULL");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("last_modified_by_key TEXT");
        sb2.insert(0, "CREATE TABLE group_conversation_participants (");
        sb2.append(", UNIQUE(conversation_id,participant_id) ON CONFLICT FAIL FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE CASCADE PRIMARY KEY (conversation_id,participant_id));");
        if (i >= 59690) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        if (sb != null) {
            agnwVar.z(sb);
            ArrayList arrayList = new ArrayList();
            arrayList.add("DROP INDEX IF EXISTS index_group_conversation_participants_conversation_id");
            arrayList.add("CREATE INDEX index_group_conversation_participants_conversation_id ON group_conversation_participants(conversation_id);");
            arrayList.add("DROP INDEX IF EXISTS index_group_conversation_participants_participant_id");
            arrayList.add("CREATE INDEX index_group_conversation_participants_participant_id ON group_conversation_participants(participant_id);");
            for (String str : (String[]) arrayList.toArray(new String[0])) {
                agnwVar.z(str);
            }
        }
    }
}
