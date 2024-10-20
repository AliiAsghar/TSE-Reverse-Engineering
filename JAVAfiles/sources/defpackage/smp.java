package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smp extends aglo {
    public static final String[] a = {"conversation_to_participants.conversation_id", "conversation_to_participants.participant_id", "conversation_to_participants.rcs_group_join_status", "conversation_to_participants.last_modified_by_key"};
    public static final alor b;
    public static final int[] c;
    public static final ifq d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("conversation_id", "index_conversation_to_participants_conversation_id");
        alokVar.h("participant_id", "index_conversation_to_participants_participant_id");
        alokVar.b();
        d = new ifq((byte[]) null, (byte[]) null, (byte[]) null);
        c = new int[]{59630};
    }

    public static void a(smh... smhVarArr) {
        agnw d2;
        d2 = agnc.d("$primary");
        agnc.x(d2, 0, false, new meb(19), smhVarArr);
    }

    public static void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0) NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_by_key TEXT");
        sb.insert(0, "CREATE TABLE conversation_to_participants (");
        sb.append(", UNIQUE(conversation_id,participant_id) ON CONFLICT FAIL FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE CASCADE PRIMARY KEY (conversation_id,participant_id));");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_to_participants_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_to_participants_conversation_id ON conversation_to_participants(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_to_participants_participant_id");
        arrayList.add("CREATE INDEX index_conversation_to_participants_participant_id ON conversation_to_participants(participant_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }

    public static tcs c() {
        int i = ske.a;
        return new tcs((byte[]) null, (byte[]) null);
    }
}
