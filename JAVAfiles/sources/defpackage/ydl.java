package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydl {
    public static final alvz B;
    public static final alvz C;
    public static final alvz D;
    public static final alvz E;
    public static final alvz F;
    public static final alvz G;
    public static final alvz H;
    public static final alvz I;
    public static final alvz J;
    public static final alvz K;
    public static final alvz L;
    public static final alvz M;
    public static final alvz N;
    public static final alvz O;
    public static final alvz P;
    public static final alvz Q;
    public static final alvz R;
    public static final alvz S;
    public static final alvz T;

    @Deprecated
    public static final alvz a = new alvz("message_id", String.class, false, false);
    public static final alvz b = new alvz("message_id", MessageIdType.class, false, false);
    public static final alvz c = new alvz("message_id", MessageId.class, false, false);
    public static final alvz d = new alvz("rcs_session_id", Long.class, false, false);
    public static final alvz e = new alvz("rcs_message_id", String.class, false, false);
    public static final alvz f = new alvz("rcs_message_id", rve.class, false, false);
    public static final alvz g = new alvz("traceId", atok.class, false, false);
    public static final alvz h = new alvz("draft_id", UUID.class, false, false);
    public static final alvz i = new alvz("webId", String.class, false, false);
    public static final alvz j = new alvz("cmsId", String.class, false, false);
    public static final alvz k = new alvz("cmsCorrelationId", String.class, false, false);
    public static final alvz l = new alvz("cloudSyncId", String.class, false, false);
    public static final alvz m = new alvz("participant_id", String.class, false, false);
    public static final alvz n = new alvz("remote_user_id", CharSequence.class, false, false);

    @Deprecated
    public static final alvz o = new alvz("conversation_id", String.class, false, false);
    public static final alvz p = new alvz("conversation_id", ConversationIdType.class, false, false);
    public static final alvz q = new alvz("conversation_id", ConversationId.class, false, false);
    public static final alvz r = new alvz("thread_id_type", xhv.class, false, false);
    public static final alvz s = new alvz("part_id", String.class, false, false);
    public static final alvz t = new alvz("sub_id", Integer.class, false, false);
    public static final alvz u = new alvz("icc_id", String.class, false, false);
    public static final alvz v = new alvz("my_identity_token", qwe.class, false, false);
    public static final alvz w = new alvz("content_type", String.class, false, false);
    public static final alvz x = new alvz("message_protocol", String.class, false, false);
    public static final alvz y = new alvz("file_transfer_content_uri", String.class, false, false);
    public static final alvz z = new alvz("duration", Duration.class, false, false);
    public static final alvz A = new alvz("originalMessageId", MessageIdType.class, false, false);

    static {
        new ydt("display_name", String.class);
        B = new ydt("messaging_identity", msh.class);
        C = new alvz("destination", String.class, false, false);
        D = new ydt("msisdn", String.class);
        E = new ydt("conversation_name", String.class);
        F = new alvz("conversation_join_state", String.class, false, false);
        G = new alvz("rcs_session_id", Long.class, false, false);
        H = new alvz("rcsFtSessionId", Long.class, false, false);
        I = new ydu("rcs_group_id", String.class);
        J = new alvz("rcs_conference_uri", CharSequence.class, false, false);
        K = new alvz("thread_id", Long.class, false, false);
        L = new alvz("sub_displayName", String.class, false, false);
        new alvz("app_version", String.class, false, false);
        M = new alvz("class_name", String.class, false, false);
        N = new alvz("rcs_availability", String.class, false, false);
        new alvz("chat_session_service_result", String.class, false, false);
        O = new alvz("log_prefix", String.class, false, false);
        P = new alvz("pcscf_host", String.class, false, false);
        new alvz("content_type", Integer.class, false, false);
        new alvz("annotation_id", String.class, false, false);
        new alvz("tile_id", Integer.class, false, false);
        Q = new ydr();
        R = new yds(Uri.class, new ybe(8));
        S = new alvz("datagram_id", ruz.class, false, false);
        T = new ydt("rcs_provisioning_id", adiv.class);
        new alvz("destination_token", qss.class, false, false);
    }
}
