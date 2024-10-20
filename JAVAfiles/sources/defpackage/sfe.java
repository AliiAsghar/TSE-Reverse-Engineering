package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfe extends aglo {
    public static final String[] a = {"a2p_conversation_subscriptions.participant_id", "a2p_conversation_subscriptions.conversation_toolstone_state", "a2p_conversation_subscriptions.conversation_subscription_state", "a2p_conversation_subscriptions.last_action_timestamp"};
    public static final int[] b;
    public static final gqg c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("participant_id", "index_a2p_conversation_subscriptions_participant_id");
        alokVar.b();
        c = new gqg((char[]) null);
        b = new int[]{60410};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER NOT NULL REFERENCES participants(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_toolstone_state INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_subscription_state INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_action_timestamp INTEGER");
        sb.insert(0, "CREATE TABLE a2p_conversation_subscriptions (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_a2p_conversation_subscriptions_participant_id");
        arrayList.add("CREATE UNIQUE INDEX index_a2p_conversation_subscriptions_participant_id ON a2p_conversation_subscriptions(participant_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
