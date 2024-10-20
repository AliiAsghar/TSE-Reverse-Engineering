package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpb extends aglo {
    public static final String[] a = {"participants_backup._id", "participants_backup.my_identity_token_foreign_key", "participants_backup.normalized_destination", "participants_backup.send_destination", "participants_backup.display_destination", "participants_backup.first_name", "participants_backup.full_name", "participants_backup.is_self", "participants_backup.blocked", "participants_backup.participant_type", "participants_backup.is_spam", "participants_backup.is_spam_source", "participants_backup.country_code", "participants_backup.color_palette_index", "participants_backup.color_type", "participants_backup.extended_color", "participants_backup.cms_id", "participants_backup.cms_life_cycle"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final tby e;

    static {
        alok alokVar = new alok();
        alokVar.h("participants_backup.my_identity_token_foreign_key", 110);
        alokVar.h("participants_backup.normalized_destination", 0);
        alokVar.h("participants_backup.send_destination", 0);
        alokVar.h("participants_backup.display_destination", 0);
        alokVar.h("participants_backup.first_name", 0);
        alokVar.h("participants_backup.full_name", 0);
        alokVar.h("participants_backup.is_self", 0);
        alokVar.h("participants_backup.blocked", 0);
        alokVar.h("participants_backup.participant_type", 0);
        alokVar.h("participants_backup.is_spam", 0);
        alokVar.h("participants_backup.is_spam_source", 0);
        alokVar.h("participants_backup.country_code", 0);
        alokVar.h("participants_backup.color_palette_index", 0);
        alokVar.h("participants_backup.color_type", 0);
        alokVar.h("participants_backup.extended_color", 0);
        alokVar.h("participants_backup.cms_id", 0);
        alokVar.h("participants_backup.cms_life_cycle", 0);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("my_identity_token_foreign_key", "index_participants_backup_my_identity_token_foreign_key");
        alokVar2.h("normalized_destination", "index_participants_backup_normalized_destination");
        alokVar2.h("cms_id", "index_participants_backup_cms_id");
        alokVar2.b();
        e = new tby((char[]) null);
        c = new int[]{0};
        d = new int[]{110};
    }

    public static final roz a() {
        String[] strArr;
        Integer b2 = b();
        if (b2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("participants_backup._id");
            if (b2.intValue() >= 110) {
                alobVar.h("participants_backup.my_identity_token_foreign_key");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.normalized_destination");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.send_destination");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.display_destination");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.first_name");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.full_name");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.is_self");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.blocked");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.participant_type");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.is_spam");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.is_spam_source");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.country_code");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.color_palette_index");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.color_type");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.extended_color");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.cms_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("participants_backup.cms_life_cycle");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new roz(strArr);
    }

    public static Integer b() {
        agcp W;
        W = agnc.d("backup").W();
        return Integer.valueOf(W.c());
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token_foreign_key TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("full_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_self INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blocked INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam_source INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("country_code TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_palette_index INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extended_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_participants_backup_normalized_destination");
        arrayList.add("CREATE INDEX index_participants_backup_normalized_destination ON participants_backup(normalized_destination);");
        arrayList.add("DROP INDEX IF EXISTS index_participants_backup_cms_id");
        arrayList.add("CREATE INDEX index_participants_backup_cms_id ON participants_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_participants_backup_my_identity_token_foreign_key");
        arrayList.add("CREATE INDEX index_participants_backup_my_identity_token_foreign_key ON participants_backup(my_identity_token_foreign_key);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
