package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sww extends aglo {
    public static final String[] a = {"message_spam._id", "message_spam.message_id", "message_spam.conversation_id", "message_spam.source", "message_spam.score", "message_spam.outcome", "message_spam.ares_initiated_by", "message_spam.classification_timestamp", "message_spam.trigger", "message_spam.action_type", "message_spam.action_contributors", "message_spam.error_code", "message_spam.reclassification_index"};
    public static final int[] b;
    public static final vid c;

    static {
        alok alokVar = new alok();
        alokVar.h("message_spam.conversation_id", 59460);
        alokVar.h("message_spam.score", 45040);
        alokVar.h("message_spam.outcome", 58030);
        alokVar.h("message_spam.ares_initiated_by", 58100);
        alokVar.h("message_spam.classification_timestamp", 59190);
        alokVar.h("message_spam.trigger", 59460);
        alokVar.h("message_spam.action_type", 59460);
        alokVar.h("message_spam.action_contributors", 59460);
        alokVar.h("message_spam.error_code", 59460);
        alokVar.h("message_spam.reclassification_index", 59460);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_message_spam_message_id");
        alokVar2.h("conversation_id", "index_message_spam_conversation_id");
        alokVar2.h("classification_timestamp", "index_message_spam_classification_timestamp");
        alokVar2.b();
        c = new vid();
        b = new int[]{30000, 45040, 58030, 58100, 58350, 59190, 59200, 59460};
    }

    public static final swt a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("message_spam._id");
            alobVar.h("message_spam.message_id");
            if (valueOf.intValue() >= 59460) {
                alobVar.h("message_spam.conversation_id");
            }
            alobVar.h("message_spam.source");
            if (valueOf.intValue() >= 45040) {
                alobVar.h("message_spam.score");
            }
            if (valueOf.intValue() >= 58030) {
                alobVar.h("message_spam.outcome");
            }
            if (valueOf.intValue() >= 58100) {
                alobVar.h("message_spam.ares_initiated_by");
            }
            if (valueOf.intValue() >= 59190) {
                alobVar.h("message_spam.classification_timestamp");
            }
            if (valueOf.intValue() >= 59460) {
                alobVar.h("message_spam.trigger");
            }
            if (valueOf.intValue() >= 59460) {
                alobVar.h("message_spam.action_type");
            }
            if (valueOf.intValue() >= 59460) {
                alobVar.h("message_spam.action_contributors");
            }
            if (valueOf.intValue() >= 59460) {
                alobVar.h("message_spam.error_code");
            }
            if (valueOf.intValue() >= 59460) {
                alobVar.h("message_spam.reclassification_index");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new swt(strArr);
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
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INT DEFAULT(0)");
        if (i >= 45040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("score REAL DEFAULT(0.0)");
        }
        if (i >= 58030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("outcome INT DEFAULT(1)");
        }
        if (i >= 58100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("ares_initiated_by TEXT DEFAULT('')");
        }
        if (i >= 59190) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("trigger INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("action_type INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("action_contributors INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("error_code INT DEFAULT(0)");
        }
        if (i >= 59460) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reclassification_index INT DEFAULT(0)");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void c(agnw agnwVar, int i) {
        agnwVar.z(b(i, "message_spam"));
        for (String str : d(i)) {
            agnwVar.z(str);
        }
    }

    public static String[] d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58350) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_message_id");
            arrayList.add("CREATE INDEX index_message_spam_message_id ON message_spam(message_id);");
        }
        if (i >= 59200) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_classification_timestamp");
            arrayList.add("CREATE INDEX index_message_spam_classification_timestamp ON message_spam(classification_timestamp);");
        }
        if (i >= 59460) {
            arrayList.add("DROP INDEX IF EXISTS index_message_spam_conversation_id");
            arrayList.add("CREATE INDEX index_message_spam_conversation_id ON message_spam(conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
