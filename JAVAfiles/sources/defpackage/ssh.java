package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssh extends aglo {
    public static final String[] a = {"link_preview_participants_table._id", "link_preview_participants_table.participant_id", "link_preview_participants_table.manual_link_preview_count"};
    public static final alor b;
    public static final int[] c;
    public static final uqg d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        new alok().b();
        d = new uqg((byte[]) null, (short[]) null);
        c = new int[]{26010};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("manual_link_preview_count INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE link_preview_participants_table (");
        sb.append(", FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE CASCADE);");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
