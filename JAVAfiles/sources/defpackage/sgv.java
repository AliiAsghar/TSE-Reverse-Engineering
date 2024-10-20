package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgv extends aglo {
    public static final String[] a = {"cms_blobs_pending_delete._id", "cms_blobs_pending_delete.message_id", "cms_blobs_pending_delete.blob_id"};
    public static final int[] b;
    public static final uqg c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("message_id", "index_cms_blobs_pending_delete_message_id");
        alokVar.b();
        c = new uqg((byte[]) null, (char[]) null, (byte[]) null);
        b = new int[]{44030};
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
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_id TEXT");
        sb.insert(0, "CREATE TABLE cms_blobs_pending_delete (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_blobs_pending_delete_message_id");
        arrayList.add("CREATE INDEX index_cms_blobs_pending_delete_message_id ON cms_blobs_pending_delete(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
