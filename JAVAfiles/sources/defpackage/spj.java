package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spj extends aglo {
    public static final String[] a = {"drafts.conversation_id", "drafts.text", "drafts.attachments", "drafts.subject", "drafts.is_urgent", "drafts.replied_to_message_id", "drafts.is_encrypted"};
    public static final int[] b;
    public static final qxr c;

    static {
        alok alokVar = new alok();
        alokVar.h("drafts.attachments", 59420);
        alokVar.h("drafts.subject", 59170);
        alokVar.h("drafts.is_urgent", 59170);
        alokVar.h("drafts.replied_to_message_id", 59540);
        alokVar.h("drafts.is_encrypted", 59720);
        alokVar.b();
        new alok().b();
        c = new qxr(null, null, null);
        b = new int[]{59150, 59170, 59420, 59540, 59720};
    }

    public static spb a() {
        int i = sms.a;
        return new spb();
    }

    public static final spg b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("drafts.conversation_id");
            alobVar.h("drafts.text");
            if (valueOf.intValue() >= 59420) {
                alobVar.h("drafts.attachments");
            }
            if (valueOf.intValue() >= 59170) {
                alobVar.h("drafts.subject");
            }
            if (valueOf.intValue() >= 59170) {
                alobVar.h("drafts.is_urgent");
            }
            if (valueOf.intValue() >= 59540) {
                alobVar.h("drafts.replied_to_message_id");
            }
            if (valueOf.intValue() >= 59720) {
                alobVar.h("drafts.is_encrypted");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new spg(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (i >= 59420) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("attachments BLOB");
        }
        if (i >= 59170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("subject TEXT");
        }
        if (i >= 59170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_urgent INT DEFAULT(0) NOT NULL");
        }
        if (i >= 59540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("replied_to_message_id TEXT");
        }
        if (i >= 59720) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_encrypted INT DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE drafts (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
