package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qug extends aglo {
    public static final String[] a = {"groups.token", "groups.group_type", "groups.rcs_conference_uri", "groups.name", "groups.rcs_icon_url", "groups.rcs_group_state", "groups.tachygram_group_routing_token", "groups.rcs_group_capabilities", "groups.rcs_group_last_sync_timestamp"};
    public static final int[] b;
    public static final int[] c;
    public static final uqu d;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("group_type", "index_groups_group_type");
        alokVar.b();
        d = new uqu((byte[]) null, (char[]) null);
        b = new int[]{60430};
        c = new int[]{60460};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY REFERENCES destinations(token) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_icon_url TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_state INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachygram_group_routing_token BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_last_sync_timestamp INTEGER DEFAULT(0)");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_groups_group_type");
        arrayList.add("CREATE INDEX index_groups_group_type ON groups(group_type);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void c(agnw agnwVar) {
        agnwVar.z(a("groups"));
        for (String str : b()) {
            agnwVar.z(str);
        }
    }
}
