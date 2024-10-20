package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qty extends aglo {
    public static final String[] a = {"group_members.group_token", "group_members.destination_token"};
    public static final int[] b;
    public static final kkc c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("group_token", "index_group_members_group_token");
        alokVar.b();
        c = new kkc();
        b = new int[]{60430};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_token TEXT REFERENCES groups(token) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_token TEXT REFERENCES destinations(token) ON DELETE CASCADE ON UPDATE CASCADE");
        sb.insert(0, "CREATE TABLE group_members (");
        sb.append(", PRIMARY KEY (group_token,destination_token));");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_group_members_group_token");
        arrayList.add("CREATE INDEX index_group_members_group_token ON group_members(group_token);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
