package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqv extends aglo {
    public static final String[] a = {"gemini_conversation_id_mappings.conversation_id", "gemini_conversation_id_mappings.my_identity_token", "gemini_conversation_id_mappings.gemini_conversation_id"};
    public static final int[] b;
    public static final int[] c;
    public static final uqg d;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("gemini_conversation_id", "index_gemini_conversation_id_mappings_gemini_conversation_id");
        alokVar.b();
        d = new uqg((char[]) null, (char[]) null);
        b = new int[]{60010, 60090};
        c = new int[]{60140};
    }

    public static void a(agnw agnwVar, int i) {
        agnwVar.z(c("gemini_conversation_id_mappings"));
        for (String str : b(i)) {
            agnwVar.z(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 60090) {
            arrayList.add("DROP INDEX IF EXISTS index_gemini_conversation_id_mappings_gemini_conversation_id");
            arrayList.add("CREATE UNIQUE INDEX index_gemini_conversation_id_mappings_gemini_conversation_id ON gemini_conversation_id_mappings(gemini_conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token TEXT NOT NULL REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("gemini_conversation_id TEXT NOT NULL");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (conversation_id,my_identity_token));");
        return sb.toString();
    }
}
