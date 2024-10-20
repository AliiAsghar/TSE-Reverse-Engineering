package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svq extends aglo {
    public static final String[] a = {"message_reactions._id", "message_reactions.message_id", "message_reactions.reactions_data", "message_reactions.reacted_message_id", "message_reactions.reaction", "message_reactions.applied_reaction", "message_reactions.animation_effect"};
    public static final alor b;
    public static final int[] c;
    public static final qxr d;

    static {
        alok alokVar = new alok();
        alokVar.h("message_reactions.reacted_message_id", 46020);
        alokVar.h("message_reactions.reaction", 48000);
        alokVar.h("message_reactions.applied_reaction", 59060);
        alokVar.h("message_reactions.animation_effect", 59520);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("reacted_message_id", "index_message_reactions_reacted_message_id");
        alokVar2.h("animation_effect", "index_message_reactions_animation_effect");
        alokVar2.b();
        d = new qxr((byte[]) null, (byte[]) null);
        c = new int[]{42000, 46020, 48000, 59060, 59520};
    }

    public static final svo a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("message_reactions._id");
            alobVar.h("message_reactions.message_id");
            alobVar.h("message_reactions.reactions_data");
            if (valueOf.intValue() >= 46020) {
                alobVar.h("message_reactions.reacted_message_id");
            }
            if (valueOf.intValue() >= 48000) {
                alobVar.h("message_reactions.reaction");
            }
            if (valueOf.intValue() >= 59060) {
                alobVar.h("message_reactions.applied_reaction");
            }
            if (valueOf.intValue() >= 59520) {
                alobVar.h("message_reactions.animation_effect");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new svo(strArr);
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reactions_data BLOB");
        if (i >= 46020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reacted_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        }
        if (i >= 48000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reaction INTEGER");
        }
        if (i >= 59060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("applied_reaction BLOB");
        }
        if (i >= 59520) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("animation_effect BLOB");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void c(agnw agnwVar, int i) {
        agnwVar.z(b(i, "message_reactions"));
        for (String str : d(i)) {
            agnwVar.z(str);
        }
    }

    public static String[] d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 46020) {
            arrayList.add("DROP INDEX IF EXISTS index_message_reactions_reacted_message_id");
            arrayList.add("CREATE INDEX index_message_reactions_reacted_message_id ON message_reactions(reacted_message_id);");
        }
        if (i >= 59520) {
            arrayList.add("DROP INDEX IF EXISTS index_message_reactions_animation_effect");
            arrayList.add("CREATE INDEX index_message_reactions_animation_effect ON message_reactions(animation_effect) WHERE animation_effect NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
