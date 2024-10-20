package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum advq {
    UNKNOWN("unknown"),
    FILE("file"),
    GENERIC(""),
    IMSI("imsi"),
    IP_ADDRESS("ip_address", new adof(14)),
    LOCATION("loc_country"),
    MESSAGE_CONTENT("message_content"),
    MSRP_MESSAGE("msrp_message"),
    PHONE_NUMBER("phone_number", new adof(15)),
    SIM_GID("sim_gid"),
    SIM_ID("sim_id", new adof(16)),
    SIM_OPERATOR("sim_operator"),
    SIP_MESSAGE("sip_message"),
    URI(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, new adof(17)),
    URI_SIP("uri_sip"),
    URI_TEL("uri_tel", new adof(18)),
    USER_ID("user_id"),
    USER_ID_BOT("user_id_bot"),
    SIM_ICCID("sim_iccid"),
    SUBSCRIPTION_ID("subscription_id");

    private final String v;
    private final Function w;

    advq(String str) {
        this(str, new adof(20));
    }

    public static Optional a(Object obj, int i) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() <= i) {
            return Optional.of(valueOf);
        }
        return Optional.of(valueOf.substring(valueOf.length() - i));
    }

    public final String b(Collection collection) {
        return (String) Collection.EL.stream(collection).map(new admk(this, 14)).collect(Collectors.joining(","));
    }

    public final String c(Object obj) {
        String str;
        String str2 = advr.a;
        boolean booleanValue = ((Boolean) acpy.g.a()).booleanValue();
        String valueOf = String.valueOf(obj);
        if (!booleanValue && obj != null) {
            valueOf = "chars:" + valueOf.length();
            String str3 = (String) Collection.EL.stream(((alor) d$$ExternalSyntheticApiModelOutline0.m(this.w, obj)).entrySet()).filter(new adru(5)).map(new adof(19)).collect(Collectors.joining(","));
            if (!str3.isEmpty()) {
                valueOf = a.co(str3, valueOf, ",");
            }
        }
        if (true != booleanValue) {
            str = "redacted";
        } else {
            str = "raw";
        }
        return String.format("%s-pii:%s[%s]", str, this.v, valueOf);
    }

    advq(String str, Function function) {
        this.v = str;
        this.w = function;
    }
}
