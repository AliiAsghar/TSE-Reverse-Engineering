package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stt extends aglo {
    public static final String[] a = {"message_captions.message_id", "message_captions.caption"};
    public static final int[] b;
    public static final nej c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("message_id", "index_message_captions_message_id");
        alokVar.b();
        c = new nej((byte[]) null, (byte[]) null);
        b = new int[]{59880};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("caption TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE message_captions (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_captions_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_captions_message_id ON message_captions(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
