package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yes {
    public static final long a = TimeUnit.MINUTES.toMillis(20);
    public static volatile alor b;
    public static volatile Bundle c;
    private static volatile alor d;

    public static alor a() {
        if (d != null) {
            return d;
        }
        alok alokVar = new alok();
        alokVar.h("bugle_gservices_working", "bool");
        alokVar.h("bugle_logsaver", "bool");
        alokVar.h("bugle_max_resend_delay_in_millis", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        alokVar.h("bugle_mms_attachment_limit", "int");
        alokVar.h("bugle_rcs_attachment_limit", "int");
        alokVar.h("bugle_refresh_notification_backoff_duration_in_millis", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        alokVar.h("bugle_enable_analytics", "bool");
        alokVar.h("bugle_persistent_logsaver_rotation_set_size", "int");
        alokVar.h("bugle_persistent_logsaver_file_limit", "int");
        alokVar.h("bugle_min_phone_number_length_to_format", "int");
        alokVar.h("bugle_testing_simulation_session_id", "string");
        alokVar.h("device_country", "string");
        d = alokVar.b();
        return d;
    }

    public static String b(String str) {
        return (String) a().get(str);
    }

    public static boolean c(String str) {
        if (c != null && c.containsKey(str)) {
            return true;
        }
        return false;
    }
}
