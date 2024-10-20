package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class src extends aglo {
    public static final String[] a = {"gemini.conversation_id", "gemini.desired_gemini_state"};
    public static final int[] b;
    public static final nej c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("conversation_id", "index_gemini_conversation_id");
        alokVar.b();
        c = new nej((short[]) null);
        b = new int[]{60000};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("desired_gemini_state INT");
        sb.insert(0, "CREATE TABLE gemini (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_gemini_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_gemini_conversation_id ON gemini(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
