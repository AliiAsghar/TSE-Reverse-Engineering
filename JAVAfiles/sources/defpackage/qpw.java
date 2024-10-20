package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpw extends aglo {
    public static final String[] a = {"conversation_matcher_cache._id", "conversation_matcher_cache.matcher_version", "conversation_matcher_cache.destination_key", "conversation_matcher_cache.conversation_id"};
    public static final int[] b;
    public static final int[] c;
    public static final lgg d;

    static {
        new alok().b();
        new alok().b();
        d = new lgg();
        b = new int[]{58580, 59180};
        c = new int[]{58640};
    }

    public static void a(agnw agnwVar, int i) {
        agnwVar.z(c("conversation_matcher_cache"));
        for (String str : b(i)) {
            agnwVar.z(str);
        }
    }

    public static String[] b(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS cache_idx");
        arrayList.add("CREATE UNIQUE INDEX cache_idx ON conversation_matcher_cache(matcher_version, destination_key, conversation_id);");
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_matcher_cache_conversation_id");
            arrayList.add("CREATE INDEX index_conversation_matcher_cache_conversation_id ON conversation_matcher_cache(conversation_id) WHERE conversation_id NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("matcher_version INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }
}
