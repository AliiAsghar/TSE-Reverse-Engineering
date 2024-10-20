package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjh {
    public static final alvz a = new alvz("failed_messages_count", Integer.class, false, false);
    public static final alvz b = new alvz("failed_messages_to_notify", Integer.class, false, false);
    public static final alvz c;
    public static final alvz d;
    public static final alvz e;
    public static final alvz f;
    public static final alvz g;
    public static final alvz h;
    public static final alvz i;
    public static final alvz j;
    public static final alvz k;
    public static final alvz l;
    public static final alvz m;
    public static final alvz n;
    public static final alvz o;
    public static final alvz p;
    public static final alvz q;
    public static final alvz r;
    public static final alvz s;
    public static final alvz t;
    public static final alvz u;
    public static final alvz v;

    static {
        new alvz("conversations", Integer.class, false, false);
        new alvz("messages", Integer.class, false, false);
        new alvz("max_messages_in_conversation", Integer.class, false, false);
        new alvz(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, CharSequence.class, false, false);
        new alvz("content", CharSequence.class, false, false);
        new alvz("previous_date", String.class, false, false);
        new alvz("receive_date", String.class, false, false);
        c = new alvz("notification_importance", Integer.class, false, false);
        d = new alvz("notification_tag", String.class, false, false);
        new alvz("attachment_type", String.class, false, false);
        e = new alvz("suggestion_id", String.class, false, false);
        f = new alvz("for_incoming_messages", Boolean.class, false, false);
        g = new alvz("for_failures", Boolean.class, false, false);
        h = new alvz("is_silent", Boolean.class, false, false);
        i = new alvz("is_quick_reply", Boolean.class, false, false);
        j = new alvz("is_smart_reply_update", Boolean.class, false, false);
        k = new alvz("notification_channel_id", String.class, false, false);
        l = new alvz("name_changed", Boolean.class, false, false);
        m = new alvz("group_changed", Boolean.class, false, false);
        n = new alvz("notification_type", vlm.class, false, false);
        o = new alvz("notification_callback_type", vko.class, false, false);
        p = new alvz("notification_action_type", vkf.class, false, false);
        q = new alvz("notification_style_type", vlh.class, false, false);
        r = new alvz("earliest_conversation_timestamp", Long.class, false, false);
        new alvz("notification_channel", String.class, false, false);
        s = new alvz("notification_actions", String.class, false, false);
        t = new alvz("notification_shortcut", String.class, false, false);
        u = new alvz("is_only_alert_once", Boolean.class, false, false);
        new alvz("last_created_notification_timestamp", Long.class, false, false);
        v = new alvz("shortcut_exists", Boolean.class, false, false);
    }
}
