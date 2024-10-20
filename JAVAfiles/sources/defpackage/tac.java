package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tac extends aglo {
    public static final String[] a = {"parent_disallowed_conversations.conversation_id"};
    public static final alor b;
    public static final int[] c;
    public static final uie d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        new alok().b();
        d = new uie((byte[]) null);
        c = new int[]{59780};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        sb.insert(0, "CREATE TABLE parent_disallowed_conversations (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
