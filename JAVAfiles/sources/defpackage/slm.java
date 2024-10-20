package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class slm extends aglo {
    public static final String[] a = {"conversation_pin._id", "conversation_pin.conversation_id", "conversation_pin.pin_status"};
    public static final alor b;
    public static final int[] c;
    public static final uqg d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("conversation_id", "index_conversation_pin_conversation_id");
        alokVar.b();
        d = new uqg((short[]) null, (byte[]) null);
        c = new int[]{58250};
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("pin_status INTEGER");
        sb.insert(0, "CREATE TABLE conversation_pin (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_pin_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_conversation_pin_conversation_id ON conversation_pin(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
