package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.Locale;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class rzx {
    public static String a(int i) {
        return g(i, 3, null);
    }

    public static String b(int i) {
        return g(i, 1, null);
    }

    public static String c(int i) {
        String str;
        if (i == 3) {
            str = String.format(Locale.US, "OLD.%s != NEW.%s OR OLD.%s != NEW.%s OR OLD.%s != NEW.%s OR OLD.%s != NEW.%s", "full_name", "full_name", "lookup_key", "lookup_key", "display_destination", "display_destination", "normalized_destination", "normalized_destination");
        } else if (i == 2) {
            str = String.format(Locale.US, "OLD.%s != NEW.%s", "name", "name");
        } else if (i == 4) {
            str = String.format(Locale.US, "OLD.%s != NEW.%s OR OLD.%s != NEW.%s OR OLD.%s != NEW.%s", "message_id", "message_id", "annotation_details", "annotation_details", "annotation_type", "annotation_type");
        } else {
            str = null;
        }
        return g(i, 2, str);
    }

    public static String d(int i) {
        switch (i) {
            case 1:
                return "messages";
            case 2:
                String[] strArr = sni.a;
                return "conversations";
            case 3:
                return "participants";
            case 4:
                String[] strArr2 = stl.a;
                return "messages_annotations";
            case 5:
                String[] strArr3 = PartsTable.a;
                return "parts";
            case 6:
                String[] strArr4 = sld.a;
                return "conversation_participants";
            case 7:
                String[] strArr5 = sjc.a;
                return "cms";
            case 8:
                String[] strArr6 = sww.a;
                return "message_spam";
            case 9:
                String[] strArr7 = sly.a;
                return "conversation_suggestions";
            default:
                return null;
        }
    }

    public static String e(int i, String str) {
        return "on_" + d(i) + "_" + str.toLowerCase(Locale.US);
    }

    public static String f(int i, String str) {
        String[] strArr = srm.a;
        return "INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (" + i + ",1," + str + ");";
    }

    private static String g(int i, int i2, String str) {
        int i3;
        rzy rzyVar = new rzy();
        rzyVar.b = i;
        rzyVar.i = i2;
        if (i == 4) {
            i3 = 1;
        } else {
            i3 = 3;
        }
        rzyVar.d = i3;
        rzyVar.b(str);
        return rzyVar.a();
    }
}
