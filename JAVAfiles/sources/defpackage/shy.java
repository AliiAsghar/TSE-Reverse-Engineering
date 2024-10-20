package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shy extends aglo {
    public static final String[] a = {"cms_media_notifications._id", "cms_media_notifications.message_cms_id", "cms_media_notifications.blob_id", "cms_media_notifications.blob_type"};
    public static final int[] b;
    public static final gqg c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("message_cms_id", "index_cms_media_notifications_message_cms_id");
        alokVar.b();
        c = new gqg((byte[]) null);
        b = new int[]{45010};
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
        sb.append("message_cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_type INT");
        sb.insert(0, "CREATE TABLE cms_media_notifications (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_media_notifications_message_cms_id");
        arrayList.add("CREATE INDEX index_cms_media_notifications_message_cms_id ON cms_media_notifications(message_cms_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
