package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqp extends aglo {
    public static final String[] a = {"flagged_messages._id", "flagged_messages.flagged_message_id", "flagged_messages.flagging_reason", "flagged_messages.flagged_message_timestamp", "flagged_messages.flagged_message_notified"};
    public static final int[] b;
    public static final usk c;

    static {
        alok alokVar = new alok();
        alokVar.h("flagged_messages.flagged_message_timestamp", 39030);
        alokVar.h("flagged_messages.flagged_message_notified", 46030);
        alokVar.b();
        new alok().b();
        c = new usk((byte[]) null, (byte[]) null, (byte[]) null);
        b = new int[]{39010, 39030, 46030};
    }

    public static final sqm a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("flagged_messages._id");
            alobVar.h("flagged_messages.flagged_message_id");
            alobVar.h("flagged_messages.flagging_reason");
            if (valueOf.intValue() >= 39030) {
                alobVar.h("flagged_messages.flagged_message_timestamp");
            }
            if (valueOf.intValue() >= 46030) {
                alobVar.h("flagged_messages.flagged_message_notified");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sqm(strArr);
    }

    public static void b(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("flagged_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("flagging_reason INTEGER");
        if (i >= 39030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_timestamp INT");
        }
        if (i >= 46030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_notified INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE flagged_messages (");
        sb.append(", UNIQUE(flagged_message_id,flagging_reason) ON CONFLICT IGNORE);");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
