package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.format.DateUtils;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimIconView;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jat {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public jat() {
        agmi a = agmk.a();
        a.k(2);
        a.j(true);
        a.f(true);
        a.c(true);
        a.b("conversations._id");
        a.h(new wsy());
        this.g = new ldb(a.a());
        agmi a2 = agmk.a();
        a2.k(4);
        a2.b("conversations.name");
        a2.h(new wsy());
        a2.a();
        agmi a3 = agmk.a();
        a3.k(4);
        a3.b("conversations.snippet_text");
        a3.h(new wsy());
        a3.a();
        agmi a4 = agmk.a();
        a4.k(4);
        a4.b("conversations.subject_text");
        a4.h(new wsy());
        a4.a();
        agmi a5 = agmk.a();
        a5.k(4);
        a5.b("conversations.preview_uri");
        a5.h(new wsy());
        a5.a();
        agmi a6 = agmk.a();
        a6.k(4);
        a6.b("conversations.preview_content_type");
        a6.h(new wsy());
        a6.a();
        agmi a7 = agmk.a();
        a7.k(1);
        a7.b("conversations.show_draft");
        a7.h(new wsy());
        a7.a();
        agmi a8 = agmk.a();
        a8.k(4);
        a8.b("conversations.draft_snippet_text");
        a8.h(new wsy());
        a8.a();
        agmi a9 = agmk.a();
        a9.k(4);
        a9.b("conversations.draft_subject_text");
        a9.h(new wsy());
        a9.a();
        agmi a10 = agmk.a();
        a10.k(4);
        a10.b("conversations.draft_preview_uri");
        a10.h(new wsy());
        a10.a();
        agmi a11 = agmk.a();
        a11.k(4);
        a11.b("conversations.draft_preview_content_type");
        a11.h(new wsy());
        a11.a();
        agmi a12 = agmk.a();
        a12.k(1);
        a12.c(true);
        a12.b("conversations.archive_status");
        a12.h(new wsy());
        a12.a();
        agmi a13 = agmk.a();
        a13.k(1);
        a13.c(true);
        a13.b("conversations.sort_timestamp");
        a13.h(new wsy());
        this.b = new ldb(a13.a());
        agmi a14 = agmk.a();
        a14.k(4);
        a14.b("conversations.icon");
        a14.h(new wsy());
        a14.a();
        agmi a15 = agmk.a();
        a15.k(4);
        a15.b("conversations.participant_lookup_key");
        a15.h(new wsy());
        a15.a();
        agmi a16 = agmk.a();
        a16.k(4);
        a16.c(true);
        a16.b("conversations.participant_normalized_destination");
        a16.h(new wsy());
        a16.a();
        agmi a17 = agmk.a();
        a17.k(1);
        a17.b("conversations.participant_count");
        a17.h(new wsy());
        a17.a();
        agmi a18 = agmk.a();
        a18.k(1);
        a18.b("conversations.notification_enabled");
        a18.h(new wsy());
        a18.a();
        agmi a19 = agmk.a();
        a19.k(1);
        a19.b("conversations.include_email_addr");
        a19.h(new wsy());
        a19.a();
        agmi a20 = agmk.a();
        a20.k(1);
        a20.b("conversations.source_type");
        a20.h(new wsy());
        a20.a();
        agmi a21 = agmk.a();
        a21.k(1);
        a21.c(true);
        a21.b("conversations.rcs_session_id");
        a21.h(new wsy());
        a21.a();
        agmi a22 = agmk.a();
        a22.k(1);
        a22.b("conversations.join_state");
        a22.h(new wsy());
        a22.a();
        agmi a23 = agmk.a();
        a23.k(1);
        a23.b("conversations.conv_type");
        a23.h(new wsy());
        a23.a();
        agmi a24 = agmk.a();
        a24.k(1);
        a24.b("conversations.IS_ENTERPRISE");
        a24.h(new wsy());
        a24.a();
        agmi a25 = agmk.a();
        a25.k(1);
        a25.b("conversations.has_ea2p_bot_recipient");
        a25.h(new wsy());
        a25.a();
        agmi a26 = agmk.a();
        a26.k(4);
        a26.b("conversations.participant_display_destination");
        a26.h(new wsy());
        a26.a();
        agmi a27 = agmk.a();
        a27.k(1);
        a27.b("conversations.rcs_session_allows_revocation");
        a27.h(new wsy());
        a27.a();
        agmi a28 = agmk.a();
        a28.k(1);
        a28.b("conversations.marked_as_unread");
        a28.h(new wsy());
        a28.a();
        agmi a29 = agmk.a();
        a29.k(2);
        a29.b("conversations.mms_group_upgrade_status");
        a29.h(new wsy());
        a29.a();
        agmi a30 = agmk.a();
        a30.k(1);
        a30.c(true);
        a30.b("conversations.sms_thread_id");
        a30.h(new wsy());
        a30.a();
        agmi a31 = agmk.a();
        a31.k(2);
        a31.b("conversations.name_is_automatic");
        a31.h(new wsy());
        a31.a();
        agmi a32 = agmk.a();
        a32.k(4);
        a32.b("conversations.subtitle");
        a32.h(new wsy());
        a32.a();
        agmi a33 = agmk.a();
        a33.k(1);
        a33.b("conversations.latest_message_id");
        a33.h(new wsy());
        this.a = new ldb(a33.a());
        agmi a34 = agmk.a();
        a34.k(1);
        a34.b("conversations.etouffee_default");
        a34.h(new wsy());
        a34.a();
        agmi a35 = agmk.a();
        a35.k(1);
        a35.b("conversations.last_read_timestamp");
        a35.h(new wsy());
        a35.a();
        agmi a36 = agmk.a();
        a36.k(1);
        a36.b("conversations.participant_contact_id");
        a36.h(new wsy());
        a36.a();
        agmi a37 = agmk.a();
        a37.k(1);
        a37.b("conversations.normalized_participant_contact_id");
        a37.h(new wsy());
        a37.a();
        agmi a38 = agmk.a();
        a38.k(4);
        a38.b("conversations.normalized_participant_lookup_key");
        a38.h(new wsy());
        a38.a();
        agmi a39 = agmk.a();
        a39.k(4);
        a39.j(true);
        a39.c(true);
        a39.b("conversations.participant_comparable_destination");
        a39.e(true);
        a39.h(new wsy());
        a39.a();
        agmi a40 = agmk.a();
        a40.k(4);
        a40.b("conversations.current_self_id");
        a40.h(new wsy());
        a40.a();
        agmi a41 = agmk.a();
        a41.k(4);
        a41.b("conversations.current_my_identity");
        a41.h(new wsy());
        a41.a();
        agmi a42 = agmk.a();
        a42.k(4);
        a42.c(true);
        a42.d(true);
        a42.g(new lct(11));
        a42.b("conversations.current_my_identity_foreign_key");
        a42.h(new wsy());
        a42.a();
        agmi a43 = agmk.a();
        a43.k(4);
        a43.c(true);
        a43.d(true);
        a43.g(new lct(12));
        a43.b("conversations.destination_token");
        a43.h(new wsy());
        a43.a();
        agmi a44 = agmk.a();
        a44.k(4);
        a44.b("conversations.notification_sound_uri");
        a44.h(new wsy());
        a44.a();
        agmi a45 = agmk.a();
        a45.k(1);
        a45.b("conversations.notification_vibration");
        a45.h(new wsy());
        a45.a();
        agmi a46 = agmk.a();
        a46.k(4);
        a46.b("conversations.sms_service_center");
        a46.h(new wsy());
        a46.a();
        agmi a47 = agmk.a();
        a47.k(4);
        a47.b("conversations.participant_id_list");
        a47.h(new wsy());
        a47.a();
        agmi a48 = agmk.a();
        a48.k(4);
        a48.j(true);
        a48.c(true);
        a48.b("conversations.normalized_participant_id_list");
        a48.e(true);
        a48.h(new wsy());
        a48.a();
        agmi a49 = agmk.a();
        a49.k(1);
        a49.b("conversations.send_mode");
        a49.h(new wsy());
        a49.a();
        agmi a50 = agmk.a();
        a50.k(1);
        a50.b("conversations.last_interactive_event_timestamp");
        a50.h(new wsy());
        a50.a();
        agmi a51 = agmk.a();
        a51.k(4);
        a51.b("conversations.normalized_participant_display_destination");
        a51.h(new wsy());
        a51.a();
        agmi a52 = agmk.a();
        a52.k(1);
        a52.b("conversations.spam_warning_dismiss_status");
        a52.h(new wsy());
        a52.a();
        agmi a53 = agmk.a();
        a53.k(1);
        a53.b("conversations.open_count");
        a53.h(new wsy());
        a53.a();
        agmi a54 = agmk.a();
        a54.k(1);
        a54.b("conversations.last_logged_scooby_metadata_timestamp");
        a54.h(new wsy());
        a54.a();
        agmi a55 = agmk.a();
        a55.k(1);
        a55.c(true);
        a55.b("conversations.delete_timestamp");
        a55.h(new wsy());
        a55.a();
        agmi a56 = agmk.a();
        a56.k(4);
        a56.j(true);
        a56.c(true);
        a56.b("conversations.cms_id");
        a56.e(true);
        a56.h(new wsy());
        a56.a();
        agmi a57 = agmk.a();
        a57.k(4);
        a57.c(true);
        a57.b("conversations.rcs_group_id");
        a57.h(new wsy());
        a57.a();
        agmi a58 = agmk.a();
        a58.k(4);
        a58.b("conversations.rcs_conference_uri");
        a58.h(new wsy());
        a58.a();
        agmi a59 = agmk.a();
        a59.k(5);
        a59.b("conversations.tachygram_group_routing_info_token");
        a59.h(new wsy());
        a59.a();
        agmi a60 = agmk.a();
        a60.k(1);
        a60.b("conversations.cms_most_recent_read_message_timestamp_ms");
        a60.h(new wsy());
        a60.a();
        agmi a61 = agmk.a();
        a61.k(2);
        a61.b("conversations.rcs_subject_change_timestamp_ms");
        a61.h(new wsy());
        a61.a();
        agmi a62 = agmk.a();
        a62.k(2);
        a62.b("conversations.rcs_group_capabilities");
        a62.h(new wsy());
        a62.a();
        agmi a63 = agmk.a();
        a63.k(1);
        a63.b("conversations.awaiting_reverse_sync");
        a63.h(new wsy());
        a63.a();
        agmi a64 = agmk.a();
        a64.k(2);
        a64.c(true);
        a64.d(true);
        a64.g(new lct(13));
        a64.b("conversations.duplicate_of");
        a64.h(new wsy());
        a64.a();
        agmi a65 = agmk.a();
        a65.k(2);
        a65.c(true);
        a65.d(true);
        a65.g(new lct(14));
        a65.b("conversations.new_duplicate_of");
        a65.h(new wsy());
        a65.a();
        agmi a66 = agmk.a();
        a66.k(1);
        a66.b("conversations.error_state");
        a66.h(new wsy());
        a66.a();
        agmi a67 = agmk.a();
        a67.k(1);
        a67.b("conversations.cms_life_cycle");
        a67.h(new wsy());
        a67.a();
        agmi a68 = agmk.a();
        a68.k(4);
        a68.b("conversations.rcs_group_self_msisdn");
        a68.h(new wsy());
        a68.a();
        agmi a69 = agmk.a();
        a69.k(2);
        a69.b("conversations.recipient_offline_timestamp_ms");
        a69.h(new wsy());
        a69.a();
        agmi a70 = agmk.a();
        a70.k(2);
        a70.b("conversations.rcs_group_last_sync_timestamp");
        a70.h(new wsy());
        a70.a();
        agmi a71 = agmk.a();
        a71.k(1);
        a71.b("conversations.has_been_e2ee");
        a71.h(new wsy());
        a71.a();
        agmi a72 = agmk.a();
        a72.k(5);
        a72.b("conversations.custom_theme");
        a72.h(new wsy());
        a72.a();
        agmi a73 = agmk.a();
        a73.k(2);
        a73.b("conversations.mms_group_upgrade_retries");
        a73.h(new wsy());
        a73.a();
        agmi a74 = agmk.a();
        a74.k(2);
        a74.b("conversations.encryption_protocol");
        a74.h(new wsy());
        a74.a();
        agmi a75 = agmk.a();
        a75.k(4);
        a75.b("conversations.encryption_id");
        a75.h(new wsy());
        a75.a();
        agmi a76 = agmk.a();
        a76.k(4);
        a76.j(true);
        a76.c(true);
        a76.b("conversations.cms_correlation_id");
        a76.e(true);
        a76.h(new wsy());
        a76.a();
        agmi a77 = agmk.a();
        a77.k(2);
        a77.j(true);
        a77.f(true);
        a77.c(true);
        a77.b("messages._id");
        a77.h(new wsy());
        this.c = new ldb(a77.a());
        agmi a78 = agmk.a();
        a78.k(1);
        a78.c(true);
        a78.b("messages.sent_timestamp");
        a78.h(new wsy());
        a78.a();
        agmi a79 = agmk.a();
        a79.k(1);
        a79.c(true);
        a79.b("messages.received_timestamp");
        a79.h(new wsy());
        this.f = new ldb(a79.a());
        agmi a80 = agmk.a();
        a80.k(1);
        a80.b("messages.message_protocol");
        a80.h(new wsy());
        a80.a();
        agmi a81 = agmk.a();
        a81.k(1);
        a81.c(true);
        a81.b("messages.message_status");
        a81.h(new wsy());
        a81.a();
        agmi a82 = agmk.a();
        a82.k(1);
        a82.c(true);
        a82.b("messages.read");
        a82.h(new wsy());
        a82.a();
        agmi a83 = agmk.a();
        a83.k(1);
        a83.b("messages.sms_priority");
        a83.h(new wsy());
        a83.a();
        agmi a84 = agmk.a();
        a84.k(1);
        a84.b("messages.raw_status");
        a84.h(new wsy());
        a84.a();
        agmi a85 = agmk.a();
        a85.k(1);
        a85.b("messages.sms_error_code");
        a85.h(new wsy());
        a85.a();
        agmi a86 = agmk.a();
        a86.k(4);
        a86.b("messages.sms_error_desc_map_name");
        a86.h(new wsy());
        a86.a();
        agmi a87 = agmk.a();
        a87.k(1);
        a87.c(true);
        a87.d(true);
        a87.b("messages.conversation_id");
        a87.h(new wsy());
        a87.a();
        agmi a88 = agmk.a();
        a88.k(1);
        a88.c(true);
        a88.d(true);
        a88.b("messages.sender_id");
        a88.h(new wsy());
        a88.a();
        agmi a89 = agmk.a();
        a89.k(4);
        a89.b("messages.sender_send_destination");
        a89.h(new wsy());
        a89.a();
        agmi a90 = agmk.a();
        a90.k(4);
        a90.b("messages.msisdn_receiving_rcs_message");
        a90.h(new wsy());
        a90.a();
        agmi a91 = agmk.a();
        a91.k(4);
        a91.b("messages.receiving_network_country");
        a91.h(new wsy());
        a91.a();
        agmi a92 = agmk.a();
        a92.k(1);
        a92.b("messages.queue_insert_timestamp");
        a92.h(new wsy());
        a92.a();
        agmi a93 = agmk.a();
        a93.k(1);
        a93.b("messages.message_report_status");
        a93.h(new wsy());
        a93.a();
        agmi a94 = agmk.a();
        a94.k(1);
        a94.c(true);
        a94.b("messages.seen");
        a94.e(true);
        a94.h(new wsy());
        a94.a();
        agmi a95 = agmk.a();
        a95.k(4);
        a95.c(true);
        a95.b("messages.sms_message_uri");
        a95.h(new wsy());
        a95.a();
        agmi a96 = agmk.a();
        a96.k(1);
        a96.b("messages.sms_message_size");
        a96.h(new wsy());
        a96.a();
        agmi a97 = agmk.a();
        a97.k(4);
        a97.b("messages.mms_subject");
        a97.h(new wsy());
        a97.a();
        agmi a98 = agmk.a();
        a98.k(4);
        a98.b("messages.mms_transaction_id");
        a98.h(new wsy());
        a98.a();
        agmi a99 = agmk.a();
        a99.k(4);
        a99.b("messages.mms_content_location");
        a99.h(new wsy());
        a99.a();
        agmi a100 = agmk.a();
        a100.k(1);
        a100.b("messages.mms_expiry");
        a100.h(new wsy());
        a100.a();
        agmi a101 = agmk.a();
        a101.k(1);
        a101.c(true);
        a101.b("messages.rcs_expiry");
        a101.h(new wsy());
        a101.a();
        agmi a102 = agmk.a();
        a102.k(4);
        a102.b("messages.mms_retrieve_text");
        a102.h(new wsy());
        a102.a();
        agmi a103 = agmk.a();
        a103.k(1);
        a103.c(true);
        a103.d(true);
        a103.b("messages.self_id");
        a103.h(new wsy());
        a103.a();
        agmi a104 = agmk.a();
        a104.k(4);
        a104.c(true);
        a104.b("messages.my_identity");
        a104.h(new wsy());
        a104.a();
        agmi a105 = agmk.a();
        a105.k(4);
        a105.c(true);
        a105.d(true);
        a105.g(new lct(18));
        a105.b("messages.my_identity_foreign_key");
        a105.h(new wsy());
        a105.a();
        agmi a106 = agmk.a();
        a106.k(1);
        a106.b("messages.retry_start_timestamp");
        a106.h(new wsy());
        a106.a();
        agmi a107 = agmk.a();
        a107.k(4);
        a107.c(true);
        a107.b("messages.cloud_sync_id");
        a107.h(new wsy());
        a107.a();
        agmi a108 = agmk.a();
        a108.k(7);
        a108.c(true);
        a108.b("messages.rcs_message_id");
        a108.e(true);
        a108.h(new wsy());
        a108.a();
        agmi a109 = agmk.a();
        a109.k(4);
        a109.c(true);
        a109.b("messages.rcs_message_id_with_text_type");
        a109.e(true);
        a109.h(new wsy());
        a109.a();
        agmi a110 = agmk.a();
        a110.k(1);
        a110.b("messages.etouffee_status");
        a110.h(new wsy());
        a110.a();
        agmi a111 = agmk.a();
        a111.k(1);
        a111.b("messages.verification_status");
        a111.h(new wsy());
        a111.a();
        agmi a112 = agmk.a();
        a112.k(1);
        a112.b("messages.rcs_ui_status");
        a112.h(new wsy());
        a112.a();
        agmi a113 = agmk.a();
        a113.k(1);
        a113.c(true);
        a113.b("messages.is_hidden");
        a113.h(new wsy());
        a113.a();
        agmi a114 = agmk.a();
        a114.k(7);
        a114.b("messages.rcs_remote_instance");
        a114.h(new wsy());
        a114.a();
        agmi a115 = agmk.a();
        a115.k(1);
        a115.b("messages.rcs_file_transfer_session_id");
        a115.h(new wsy());
        a115.a();
        agmi a116 = agmk.a();
        a116.k(4);
        a116.b("messages.correlation_id");
        a116.h(new wsy());
        a116.a();
        agmi a117 = agmk.a();
        a117.k(4);
        a117.j(true);
        a117.c(true);
        a117.b("messages.cms_id");
        a117.e(true);
        a117.h(new wsy());
        a117.a();
        agmi a118 = agmk.a();
        a118.k(2);
        a118.b("messages.cms_last_mod_seq");
        a118.h(new wsy());
        a118.a();
        agmi a119 = agmk.a();
        a119.k(4);
        a119.c(true);
        a119.b("messages.web_id");
        a119.h(new wsy());
        a119.a();
        agmi a120 = agmk.a();
        a120.k(1);
        a120.b("messages.usage_stats_logging_id");
        a120.h(new wsy());
        a120.a();
        agmi a121 = agmk.a();
        a121.k(1);
        a121.b("messages.send_counter");
        a121.h(new wsy());
        a121.a();
        agmi a122 = agmk.a();
        a122.k(4);
        a122.c(true);
        a122.b("messages.original_rcs_message_id");
        a122.h(new wsy());
        a122.a();
        agmi a123 = agmk.a();
        a123.k(4);
        a123.b("messages.custom_delivery_receipt_mime_type");
        a123.h(new wsy());
        a123.a();
        agmi a124 = agmk.a();
        a124.k(5);
        a124.b("messages.custom_delivery_receipt_content");
        a124.h(new wsy());
        a124.a();
        agmi a125 = agmk.a();
        a125.k(1);
        a125.b("messages.report_attempt_acounter");
        a125.h(new wsy());
        a125.a();
        agmi a126 = agmk.a();
        a126.k(5);
        a126.b("messages.custom_headers");
        a126.h(new wsy());
        a126.a();
        agmi a127 = agmk.a();
        a127.k(4);
        a127.j(true);
        a127.c(true);
        a127.b("messages.cms_correlation_id");
        a127.e(true);
        a127.h(new wsy());
        a127.a();
        agmi a128 = agmk.a();
        a128.k(1);
        a128.c(true);
        a128.d(true);
        a128.g(new lct(15));
        a128.b("messages.group_private_participant");
        a128.h(new wsy());
        a128.a();
        agmi a129 = agmk.a();
        a129.k(1);
        a129.c(true);
        a129.d(true);
        a129.g(new lct(16));
        a129.b("messages.original_message_id");
        a129.h(new wsy());
        a129.a();
        agmi a130 = agmk.a();
        a130.k(1);
        a130.b("messages.awaiting_reverse_sync");
        a130.h(new wsy());
        a130.a();
        agmi a131 = agmk.a();
        a131.k(4);
        a131.b("messages.old_sms_message_uri");
        a131.h(new wsy());
        a131.a();
        agmi a132 = agmk.a();
        a132.k(4);
        a132.j(true);
        a132.c(true);
        a132.b("messages.draft_id");
        a132.e(true);
        a132.h(new wsy());
        a132.a();
        agmi a133 = agmk.a();
        a133.k(1);
        a133.b("messages.result_code");
        a133.h(new wsy());
        a133.a();
        agmi a134 = agmk.a();
        a134.k(1);
        a134.b("messages.cms_life_cycle");
        a134.h(new wsy());
        a134.a();
        agmi a135 = agmk.a();
        a135.k(1);
        a135.b("messages.fallback_reason");
        a135.h(new wsy());
        a135.a();
        agmi a136 = agmk.a();
        a136.k(1);
        a136.b("messages.auto_retry_counter");
        a136.h(new wsy());
        a136.a();
        agmi a137 = agmk.a();
        a137.k(2);
        a137.b("messages.can_revoke_before_delivered_with_rcs");
        a137.h(new wsy());
        a137.a();
        agmi a138 = agmk.a();
        a138.k(5);
        a138.b("messages.trace_id");
        a138.h(new wsy());
        a138.a();
        agmi a139 = agmk.a();
        a139.k(1);
        a139.b("messages.outgoing_delivery_report_status");
        a139.h(new wsy());
        a139.a();
        agmi a140 = agmk.a();
        a140.k(1);
        a140.b("messages.outgoing_read_report_status");
        a140.h(new wsy());
        a140.a();
        agmi a141 = agmk.a();
        a141.k(1);
        a141.b("messages.xms_transport");
        a141.h(new wsy());
        a141.a();
        agmi a142 = agmk.a();
        a142.k(1);
        a142.b("messages.message_original_protocol");
        a142.h(new wsy());
        a142.a();
        agmi a143 = agmk.a();
        a143.k(4);
        a143.j(true);
        a143.c(true);
        a143.b("messages.satellite_datagram_id");
        a143.e(true);
        a143.h(new wsy());
        a143.a();
        agmi a144 = agmk.a();
        a144.k(1);
        a144.b("messages.encryption_protocol");
        a144.h(new wsy());
        a144.a();
        agmi a145 = agmk.a();
        a145.k(4);
        a145.j(true);
        a145.c(true);
        a145.b("messages.message_persistence_id");
        a145.e(true);
        a145.h(new wsy());
        a145.a();
        agmi a146 = agmk.a();
        a146.k(1);
        a146.c(true);
        a146.b("participants.sub_id");
        a146.e(true);
        a146.h(new wsy());
        a146.a();
        agmi a147 = agmk.a();
        a147.k(4);
        a147.b("participants.display_destination");
        a147.h(new wsy());
        a147.a();
        agmi a148 = agmk.a();
        a148.k(4);
        a148.b("participants.full_name");
        a148.h(new wsy());
        a148.a();
        agmi a149 = agmk.a();
        a149.k(4);
        a149.b("participants.first_name");
        a149.h(new wsy());
        a149.a();
        agmi a150 = agmk.a();
        a150.k(2);
        a150.j(true);
        a150.f(true);
        a150.c(true);
        a150.b("participants._id");
        a150.h(new wsy());
        this.d = new ldb(a150.a());
        agmi a151 = agmk.a();
        a151.k(4);
        a151.c(true);
        a151.b("participants.my_identity_token");
        a151.h(new wsy());
        a151.a();
        agmi a152 = agmk.a();
        a152.k(4);
        a152.c(true);
        a152.d(true);
        a152.g(new lct(17));
        a152.b("participants.my_identity_token_foreign_key");
        a152.h(new wsy());
        a152.a();
        agmi a153 = agmk.a();
        a153.k(1);
        a153.b("participants.sim_slot_id");
        a153.h(new wsy());
        a153.a();
        agmi a154 = agmk.a();
        a154.k(4);
        a154.c(true);
        a154.b("participants.normalized_destination");
        a154.e(true);
        a154.h(new wsy());
        a154.a();
        agmi a155 = agmk.a();
        a155.k(4);
        a155.b("participants.send_destination");
        a155.h(new wsy());
        a155.a();
        agmi a156 = agmk.a();
        a156.k(4);
        a156.j(true);
        a156.c(true);
        a156.b("participants.comparable_destination");
        a156.e(true);
        a156.h(new wsy());
        a156.a();
        agmi a157 = agmk.a();
        a157.k(4);
        a157.b("participants.country_code");
        a157.h(new wsy());
        a157.a();
        agmi a158 = agmk.a();
        a158.k(2);
        a158.j(true);
        a158.c(true);
        a158.b("participants.recipient_id");
        a158.e(true);
        a158.h(new wsy());
        a158.a();
        agmi a159 = agmk.a();
        a159.k(4);
        a159.b("participants.recipient_canonical_address");
        a159.h(new wsy());
        a159.a();
        agmi a160 = agmk.a();
        a160.k(4);
        a160.b("participants.profile_photo_uri");
        a160.h(new wsy());
        a160.a();
        agmi a161 = agmk.a();
        a161.k(4);
        a161.b("participants.contact_photo_uri");
        a161.h(new wsy());
        a161.a();
        agmi a162 = agmk.a();
        a162.k(1);
        a162.b("participants.contact_id");
        a162.h(new wsy());
        a162.a();
        agmi a163 = agmk.a();
        a163.k(4);
        a163.b("participants.lookup_key");
        a163.h(new wsy());
        a163.a();
        agmi a164 = agmk.a();
        a164.k(1);
        a164.b("participants.color_palette_index");
        a164.h(new wsy());
        a164.a();
        agmi a165 = agmk.a();
        a165.k(1);
        a165.b("participants.color_type");
        a165.h(new wsy());
        a165.a();
        agmi a166 = agmk.a();
        a166.k(1);
        a166.b("participants.extended_color");
        a166.h(new wsy());
        a166.a();
        agmi a167 = agmk.a();
        a167.k(1);
        a167.b("participants.blocked");
        a167.h(new wsy());
        a167.a();
        agmi a168 = agmk.a();
        a168.k(4);
        a168.b("participants.subscription_name");
        a168.h(new wsy());
        a168.a();
        agmi a169 = agmk.a();
        a169.k(1);
        a169.b("participants.subscription_color");
        a169.h(new wsy());
        a169.a();
        agmi a170 = agmk.a();
        a170.k(4);
        a170.b("participants.contact_destination");
        a170.h(new wsy());
        a170.a();
        agmi a171 = agmk.a();
        a171.k(1);
        a171.b("participants.participant_type");
        a171.h(new wsy());
        a171.a();
        agmi a172 = agmk.a();
        a172.k(1);
        a172.b("participants.video_reachability");
        a172.h(new wsy());
        a172.a();
        agmi a173 = agmk.a();
        a173.k(4);
        a173.b("participants.alias");
        a173.h(new wsy());
        a173.a();
        agmi a174 = agmk.a();
        a174.k(1);
        a174.b("participants.is_spam");
        a174.h(new wsy());
        a174.a();
        agmi a175 = agmk.a();
        a175.k(1);
        a175.b("participants.is_rcs_available");
        a175.h(new wsy());
        a175.a();
        agmi a176 = agmk.a();
        a176.k(1);
        a176.b("participants.is_spam_source");
        a176.h(new wsy());
        a176.a();
        agmi a177 = agmk.a();
        a177.k(4);
        a177.j(true);
        a177.c(true);
        a177.b("participants.cms_id");
        a177.e(true);
        a177.h(new wsy());
        a177.a();
        agmi a178 = agmk.a();
        a178.k(1);
        a178.b("participants.latest_verification_status");
        a178.h(new wsy());
        a178.a();
        agmi a179 = agmk.a();
        a179.k(4);
        a179.b("participants.profile_photo_blob_id");
        a179.h(new wsy());
        a179.a();
        agmi a180 = agmk.a();
        a180.k(5);
        a180.b("participants.profile_photo_encryption_key");
        a180.h(new wsy());
        a180.a();
        agmi a181 = agmk.a();
        a181.k(1);
        a181.b("participants.directory_id");
        a181.h(new wsy());
        a181.a();
        agmi a182 = agmk.a();
        a182.k(1);
        a182.b("participants.is_check_constraint_enabled_via_phenotype");
        a182.h(new wsy());
        a182.a();
        agmi a183 = agmk.a();
        a183.k(1);
        a183.b("participants.is_valid_phone_number_data");
        a183.h(new wsy());
        a183.a();
        agmi a184 = agmk.a();
        a184.k(2);
        a184.c(true);
        a184.d(true);
        a184.g(new lct(3));
        a184.b("participants.duplicate_of");
        a184.h(new wsy());
        a184.a();
        agmi a185 = agmk.a();
        a185.k(1);
        a185.b("participants.cms_life_cycle");
        a185.h(new wsy());
        a185.a();
        agmi a186 = agmk.a();
        a186.k(1);
        a186.b("participants.norm_ui_status");
        a186.h(new wsy());
        a186.a();
        agmi a187 = agmk.a();
        a187.k(4);
        a187.b("participants.last_modified_by_key");
        a187.h(new wsy());
        a187.a();
        agmi a188 = agmk.a();
        a188.k(1);
        a188.b("participants.name_source");
        a188.h(new wsy());
        a188.a();
        agmi a189 = agmk.a();
        a189.k(1);
        a189.b("participants.photo_source");
        a189.h(new wsy());
        a189.a();
        agmi a190 = agmk.a();
        a190.k(1);
        a190.b("participants.profile_photo_user_preference");
        a190.h(new wsy());
        a190.a();
        agmi a191 = agmk.a();
        a191.k(5);
        a191.b("participants.contact_metadata");
        a191.h(new wsy());
        a191.a();
        agmi a192 = agmk.a();
        a192.k(1);
        a192.c(true);
        a192.d(true);
        a192.b("conversation_participants.participant_id");
        a192.e(true);
        a192.h(new wsy());
        a192.a();
        agmi a193 = agmk.a();
        a193.k(2);
        a193.j(true);
        a193.f(true);
        a193.c(true);
        a193.b("conversation_participants._id");
        a193.h(new wsy());
        a193.a();
        agmi a194 = agmk.a();
        a194.k(1);
        a194.c(true);
        a194.d(true);
        a194.b("conversation_participants.conversation_id");
        a194.e(true);
        a194.h(new wsy());
        a194.a();
        agmi a195 = agmk.a();
        a195.k(1);
        a195.c(true);
        a195.b("conversation_participants.is_normalized");
        a195.e(true);
        a195.h(new wsy());
        a195.a();
        agmi a196 = agmk.a();
        a196.k(1);
        a196.b("conversation_participants.rcs_group_join_status");
        a196.h(new wsy());
        a196.a();
        agmi a197 = agmk.a();
        a197.k(4);
        a197.b("conversation_participants.last_modified_by_key");
        a197.h(new wsy());
        a197.a();
        agmi a198 = agmk.a();
        a198.k(4);
        a198.b("one_on_one_participant.full_name");
        a198.h(new wsy());
        a198.a();
        agmi a199 = agmk.a();
        a199.k(4);
        a199.b("one_on_one_participant.first_name");
        a199.h(new wsy());
        a199.a();
        agmi a200 = agmk.a();
        a200.k(2);
        a200.j(true);
        a200.f(true);
        a200.c(true);
        a200.b("one_on_one_participant._id");
        a200.h(new wsy());
        a200.a();
        agmi a201 = agmk.a();
        a201.k(4);
        a201.c(true);
        a201.b("one_on_one_participant.my_identity_token");
        a201.h(new wsy());
        a201.a();
        agmi a202 = agmk.a();
        a202.k(4);
        a202.c(true);
        a202.d(true);
        a202.g(new lct(4));
        a202.b("one_on_one_participant.my_identity_token_foreign_key");
        a202.h(new wsy());
        a202.a();
        agmi a203 = agmk.a();
        a203.k(1);
        a203.c(true);
        a203.b("one_on_one_participant.sub_id");
        a203.e(true);
        a203.h(new wsy());
        a203.a();
        agmi a204 = agmk.a();
        a204.k(1);
        a204.b("one_on_one_participant.sim_slot_id");
        a204.h(new wsy());
        a204.a();
        agmi a205 = agmk.a();
        a205.k(4);
        a205.c(true);
        a205.b("one_on_one_participant.normalized_destination");
        a205.e(true);
        a205.h(new wsy());
        a205.a();
        agmi a206 = agmk.a();
        a206.k(4);
        a206.b("one_on_one_participant.send_destination");
        a206.h(new wsy());
        a206.a();
        agmi a207 = agmk.a();
        a207.k(4);
        a207.b("one_on_one_participant.display_destination");
        a207.h(new wsy());
        a207.a();
        agmi a208 = agmk.a();
        a208.k(4);
        a208.j(true);
        a208.c(true);
        a208.b("one_on_one_participant.comparable_destination");
        a208.e(true);
        a208.h(new wsy());
        a208.a();
        agmi a209 = agmk.a();
        a209.k(4);
        a209.b("one_on_one_participant.country_code");
        a209.h(new wsy());
        a209.a();
        agmi a210 = agmk.a();
        a210.k(2);
        a210.j(true);
        a210.c(true);
        a210.b("one_on_one_participant.recipient_id");
        a210.e(true);
        a210.h(new wsy());
        a210.a();
        agmi a211 = agmk.a();
        a211.k(4);
        a211.b("one_on_one_participant.recipient_canonical_address");
        a211.h(new wsy());
        a211.a();
        agmi a212 = agmk.a();
        a212.k(4);
        a212.b("one_on_one_participant.profile_photo_uri");
        a212.h(new wsy());
        a212.a();
        agmi a213 = agmk.a();
        a213.k(4);
        a213.b("one_on_one_participant.contact_photo_uri");
        a213.h(new wsy());
        a213.a();
        agmi a214 = agmk.a();
        a214.k(1);
        a214.b("one_on_one_participant.contact_id");
        a214.h(new wsy());
        a214.a();
        agmi a215 = agmk.a();
        a215.k(4);
        a215.b("one_on_one_participant.lookup_key");
        a215.h(new wsy());
        a215.a();
        agmi a216 = agmk.a();
        a216.k(1);
        a216.b("one_on_one_participant.color_palette_index");
        a216.h(new wsy());
        a216.a();
        agmi a217 = agmk.a();
        a217.k(1);
        a217.b("one_on_one_participant.color_type");
        a217.h(new wsy());
        a217.a();
        agmi a218 = agmk.a();
        a218.k(1);
        a218.b("one_on_one_participant.extended_color");
        a218.h(new wsy());
        a218.a();
        agmi a219 = agmk.a();
        a219.k(1);
        a219.b("one_on_one_participant.blocked");
        a219.h(new wsy());
        a219.a();
        agmi a220 = agmk.a();
        a220.k(4);
        a220.b("one_on_one_participant.subscription_name");
        a220.h(new wsy());
        a220.a();
        agmi a221 = agmk.a();
        a221.k(1);
        a221.b("one_on_one_participant.subscription_color");
        a221.h(new wsy());
        a221.a();
        agmi a222 = agmk.a();
        a222.k(4);
        a222.b("one_on_one_participant.contact_destination");
        a222.h(new wsy());
        a222.a();
        agmi a223 = agmk.a();
        a223.k(1);
        a223.b("one_on_one_participant.participant_type");
        a223.h(new wsy());
        a223.a();
        agmi a224 = agmk.a();
        a224.k(1);
        a224.b("one_on_one_participant.video_reachability");
        a224.h(new wsy());
        a224.a();
        agmi a225 = agmk.a();
        a225.k(4);
        a225.b("one_on_one_participant.alias");
        a225.h(new wsy());
        a225.a();
        agmi a226 = agmk.a();
        a226.k(1);
        a226.b("one_on_one_participant.is_spam");
        a226.h(new wsy());
        a226.a();
        agmi a227 = agmk.a();
        a227.k(1);
        a227.b("one_on_one_participant.is_rcs_available");
        a227.h(new wsy());
        a227.a();
        agmi a228 = agmk.a();
        a228.k(1);
        a228.b("one_on_one_participant.is_spam_source");
        a228.h(new wsy());
        a228.a();
        agmi a229 = agmk.a();
        a229.k(4);
        a229.j(true);
        a229.c(true);
        a229.b("one_on_one_participant.cms_id");
        a229.e(true);
        a229.h(new wsy());
        a229.a();
        agmi a230 = agmk.a();
        a230.k(1);
        a230.b("one_on_one_participant.latest_verification_status");
        a230.h(new wsy());
        a230.a();
        agmi a231 = agmk.a();
        a231.k(4);
        a231.b("one_on_one_participant.profile_photo_blob_id");
        a231.h(new wsy());
        a231.a();
        agmi a232 = agmk.a();
        a232.k(5);
        a232.b("one_on_one_participant.profile_photo_encryption_key");
        a232.h(new wsy());
        a232.a();
        agmi a233 = agmk.a();
        a233.k(1);
        a233.b("one_on_one_participant.directory_id");
        a233.h(new wsy());
        a233.a();
        agmi a234 = agmk.a();
        a234.k(1);
        a234.b("one_on_one_participant.is_check_constraint_enabled_via_phenotype");
        a234.h(new wsy());
        a234.a();
        agmi a235 = agmk.a();
        a235.k(1);
        a235.b("one_on_one_participant.is_valid_phone_number_data");
        a235.h(new wsy());
        a235.a();
        agmi a236 = agmk.a();
        a236.k(2);
        a236.c(true);
        a236.d(true);
        a236.g(new lct(5));
        a236.b("one_on_one_participant.duplicate_of");
        a236.h(new wsy());
        a236.a();
        agmi a237 = agmk.a();
        a237.k(1);
        a237.b("one_on_one_participant.cms_life_cycle");
        a237.h(new wsy());
        a237.a();
        agmi a238 = agmk.a();
        a238.k(1);
        a238.b("one_on_one_participant.norm_ui_status");
        a238.h(new wsy());
        a238.a();
        agmi a239 = agmk.a();
        a239.k(4);
        a239.b("one_on_one_participant.last_modified_by_key");
        a239.h(new wsy());
        a239.a();
        agmi a240 = agmk.a();
        a240.k(1);
        a240.b("one_on_one_participant.name_source");
        a240.h(new wsy());
        a240.a();
        agmi a241 = agmk.a();
        a241.k(1);
        a241.b("one_on_one_participant.photo_source");
        a241.h(new wsy());
        a241.a();
        agmi a242 = agmk.a();
        a242.k(1);
        a242.b("one_on_one_participant.profile_photo_user_preference");
        a242.h(new wsy());
        a242.a();
        agmi a243 = agmk.a();
        a243.k(5);
        a243.b("one_on_one_participant.contact_metadata");
        a243.h(new wsy());
        a243.a();
        agmi a244 = agmk.a();
        a244.k(4);
        a244.b("profiles_table.display_name");
        a244.h(new wsy());
        a244.a();
        agmi a245 = agmk.a();
        a245.k(2);
        a245.j(true);
        a245.f(true);
        a245.c(true);
        a245.b("profiles_table._id");
        a245.h(new wsy());
        a245.a();
        agmi a246 = agmk.a();
        a246.k(2);
        a246.c(true);
        a246.d(true);
        a246.g(new lct(6));
        a246.b("profiles_table.participant_id");
        a246.h(new wsy());
        a246.a();
        agmi a247 = agmk.a();
        a247.k(4);
        a247.b("profiles_table.person_id");
        a247.h(new wsy());
        a247.a();
        agmi a248 = agmk.a();
        a248.k(4);
        a248.b("profiles_table.profile_access_token");
        a248.h(new wsy());
        a248.a();
        agmi a249 = agmk.a();
        a249.k(2);
        a249.b("profiles_table.sending_self_profile_interaction_state");
        a249.h(new wsy());
        a249.a();
        agmi a250 = agmk.a();
        a250.k(5);
        a250.b("profiles_table.self_profile_sharing_metadata");
        a250.h(new wsy());
        a250.a();
        agmi a251 = agmk.a();
        a251.k(4);
        a251.b("profiles_table.first_name");
        a251.h(new wsy());
        a251.a();
        agmi a252 = agmk.a();
        a252.k(4);
        a252.b("profiles_table.last_name");
        a252.h(new wsy());
        a252.a();
        agmi a253 = agmk.a();
        a253.k(4);
        a253.b("profiles_table.photo_uri");
        a253.h(new wsy());
        a253.a();
        agmi a254 = agmk.a();
        a254.k(4);
        a254.b("profiles_table.sender_last_updated_time");
        a254.h(new wsy());
        a254.a();
        agmi a255 = agmk.a();
        a255.k(4);
        a255.b("profiles_table.sender_last_updated_time_from_rcs");
        a255.h(new wsy());
        a255.a();
        agmi a256 = agmk.a();
        a256.k(4);
        a256.c(true);
        a256.b("profiles_table.contact_lookup_key");
        a256.h(new wsy());
        a256.a();
        agmi a257 = agmk.a();
        a257.k(4);
        a257.c(true);
        a257.b("profiles_table.phone_number");
        a257.h(new wsy());
        a257.a();
        agmi a258 = agmk.a();
        a258.k(1);
        a258.b("profiles_table.is_self_profile_shareable");
        a258.h(new wsy());
        a258.a();
        agmi a259 = agmk.a();
        a259.k(2);
        a259.b("profiles_table.has_shared_access_token_with_user");
        a259.h(new wsy());
        a259.a();
        agmi a260 = agmk.a();
        a260.k(1);
        a260.b("profiles_table.name_timestamp");
        a260.h(new wsy());
        a260.a();
        agmi a261 = agmk.a();
        a261.k(1);
        a261.b("profiles_table.photo_timestamp");
        a261.h(new wsy());
        a261.a();
        agmi a262 = agmk.a();
        a262.k(1);
        a262.b("profiles_table.belongs_to_self_gaia");
        a262.h(new wsy());
        a262.a();
        agmi a263 = agmk.a();
        a263.k(1);
        a263.b("profiles_table.gaia_update_timestamp");
        a263.h(new wsy());
        a263.a();
        agmi a264 = agmk.a();
        a264.k(4);
        a264.c(true);
        a264.b("parts.content_type");
        a264.h(new wsy());
        a264.a();
        agmi a265 = agmk.a();
        a265.k(2);
        a265.j(true);
        a265.f(true);
        a265.c(true);
        a265.b("parts._id");
        a265.h(new wsy());
        a265.a();
        agmi a266 = agmk.a();
        a266.k(1);
        a266.c(true);
        a266.d(true);
        a266.b("parts.message_id");
        a266.h(new wsy());
        a266.a();
        agmi a267 = agmk.a();
        a267.k(4);
        a267.b("parts.text");
        a267.h(new wsy());
        a267.a();
        agmi a268 = agmk.a();
        a268.k(4);
        a268.b("parts.uri");
        a268.h(new wsy());
        a268.a();
        agmi a269 = agmk.a();
        a269.k(4);
        a269.b("parts.original_uri");
        a269.h(new wsy());
        a269.a();
        agmi a270 = agmk.a();
        a270.k(4);
        a270.b("parts.storage_uri");
        a270.h(new wsy());
        a270.a();
        agmi a271 = agmk.a();
        a271.k(1);
        a271.b("parts.width");
        a271.h(new wsy());
        a271.a();
        agmi a272 = agmk.a();
        a272.k(1);
        a272.b("parts.height");
        a272.h(new wsy());
        a272.a();
        agmi a273 = agmk.a();
        a273.k(1);
        a273.b("parts.timestamp");
        a273.h(new wsy());
        a273.a();
        agmi a274 = agmk.a();
        a274.k(4);
        a274.c(true);
        a274.b("parts.output_uri");
        a274.h(new wsy());
        a274.a();
        agmi a275 = agmk.a();
        a275.k(1);
        a275.b("parts.target_size");
        a275.h(new wsy());
        a275.a();
        agmi a276 = agmk.a();
        a276.k(1);
        a276.b("parts.processing_status");
        a276.h(new wsy());
        a276.a();
        agmi a277 = agmk.a();
        a277.k(1);
        a277.b("parts.cms_attachment_processing_status");
        a277.h(new wsy());
        a277.a();
        agmi a278 = agmk.a();
        a278.k(1);
        a278.c(true);
        a278.d(true);
        a278.b("parts.conversation_id");
        a278.h(new wsy());
        a278.a();
        agmi a279 = agmk.a();
        a279.k(1);
        a279.b("parts.sticker_set_id");
        a279.h(new wsy());
        a279.a();
        agmi a280 = agmk.a();
        a280.k(1);
        a280.b("parts.sticker_id");
        a280.h(new wsy());
        a280.a();
        agmi a281 = agmk.a();
        a281.k(1);
        a281.b("parts.media_modified_timestamp");
        a281.h(new wsy());
        a281.a();
        agmi a282 = agmk.a();
        a282.k(3);
        a282.b("parts.longitude");
        a282.h(new wsy());
        a282.a();
        agmi a283 = agmk.a();
        a283.k(3);
        a283.b("parts.latitude");
        a283.h(new wsy());
        a283.a();
        agmi a284 = agmk.a();
        a284.k(4);
        a284.b("parts.preview_content_uri");
        a284.h(new wsy());
        a284.a();
        agmi a285 = agmk.a();
        a285.k(4);
        a285.c(true);
        a285.b("parts.preview_content_type");
        a285.h(new wsy());
        a285.a();
        agmi a286 = agmk.a();
        a286.k(4);
        a286.b("parts.fallback_uri");
        a286.h(new wsy());
        a286.a();
        agmi a287 = agmk.a();
        a287.k(1);
        a287.b("parts.source");
        a287.h(new wsy());
        a287.a();
        agmi a288 = agmk.a();
        a288.k(1);
        a288.b("parts.bundle_index");
        a288.h(new wsy());
        a288.a();
        agmi a289 = agmk.a();
        a289.k(4);
        a289.b("parts.blob_id");
        a289.h(new wsy());
        a289.a();
        agmi a290 = agmk.a();
        a290.k(4);
        a290.b("parts.blob_gaia_email");
        a290.h(new wsy());
        a290.a();
        agmi a291 = agmk.a();
        a291.k(4);
        a291.b("parts.cms_full_size_blob_id");
        a291.h(new wsy());
        a291.a();
        agmi a292 = agmk.a();
        a292.k(5);
        a292.b("parts.cms_media_encryption_key");
        a292.h(new wsy());
        a292.a();
        agmi a293 = agmk.a();
        a293.k(5);
        a293.b("parts.cms_compressed_media_encryption_key");
        a293.h(new wsy());
        a293.a();
        agmi a294 = agmk.a();
        a294.k(1);
        a294.b("parts.blob_upload_permanent_failure");
        a294.h(new wsy());
        a294.a();
        agmi a295 = agmk.a();
        a295.k(1);
        a295.b("parts.blob_upload_timestamp");
        a295.h(new wsy());
        a295.a();
        agmi a296 = agmk.a();
        a296.k(4);
        a296.b("parts.expressive_sticker_name");
        a296.h(new wsy());
        a296.a();
        agmi a297 = agmk.a();
        a297.k(4);
        a297.b("parts.file_name");
        a297.h(new wsy());
        a297.a();
        agmi a298 = agmk.a();
        a298.k(1);
        a298.b("parts.duration");
        a298.h(new wsy());
        a298.a();
        agmi a299 = agmk.a();
        a299.k(4);
        a299.b("parts.compressed_blob_id");
        a299.h(new wsy());
        a299.a();
        agmi a300 = agmk.a();
        a300.k(4);
        a300.b("parts.cms_compressed_blob_id");
        a300.h(new wsy());
        a300.a();
        agmi a301 = agmk.a();
        a301.k(1);
        a301.b("parts.compressed_blob_upload_permanent_failure");
        a301.h(new wsy());
        a301.a();
        agmi a302 = agmk.a();
        a302.k(1);
        a302.b("parts.compressed_blob_upload_timestamp");
        a302.h(new wsy());
        a302.a();
        agmi a303 = agmk.a();
        a303.k(5);
        a303.b("parts.media_encryption_key");
        a303.h(new wsy());
        a303.a();
        agmi a304 = agmk.a();
        a304.k(5);
        a304.b("parts.compressed_media_encryption_key");
        a304.h(new wsy());
        a304.a();
        agmi a305 = agmk.a();
        a305.k(5);
        a305.b("parts.attachment_upload_response");
        a305.h(new wsy());
        a305.a();
        agmi a306 = agmk.a();
        a306.k(1);
        a306.b("parts.missing_entry_in_telephony");
        a306.h(new wsy());
        a306.a();
        agmi a307 = agmk.a();
        a307.k(1);
        a307.b("parts.awaiting_reverse_sync");
        a307.h(new wsy());
        a307.a();
        agmi a308 = agmk.a();
        a308.k(1);
        a308.b("parts.file_size_bytes");
        a308.h(new wsy());
        a308.a();
        agmi a309 = agmk.a();
        a309.k(4);
        a309.c(true);
        a309.b("parts.local_cache_path");
        a309.h(new wsy());
        a309.a();
        agmi a310 = agmk.a();
        a310.k(1);
        a310.b("parts.media_send_type");
        a310.h(new wsy());
        a310.a();
        agmi a311 = agmk.a();
        a311.k(5);
        a311.b("parts.voice_metadata");
        a311.h(new wsy());
        a311.a();
        agmi a312 = agmk.a();
        a312.k(1);
        a312.b("parts.validation_status");
        a312.h(new wsy());
        a312.a();
        agmi a313 = agmk.a();
        a313.k(4);
        a313.b("parts.processing_id");
        a313.h(new wsy());
        a313.a();
        agmi a314 = agmk.a();
        a314.k(1);
        a314.b("parts.rich_card_media_download_failure_reason");
        a314.h(new wsy());
        a314.a();
        agmi a315 = agmk.a();
        a315.k(1);
        a315.b("parts.image_display_state");
        a315.h(new wsy());
        a315.a();
        agmi a316 = agmk.a();
        a316.k(2);
        a316.c(true);
        a316.b("reminders.trigger_time");
        a316.h(new wsy());
        a316.a();
        agmi a317 = agmk.a();
        a317.k(2);
        a317.j(true);
        a317.f(true);
        a317.c(true);
        a317.b("reminders._id");
        a317.h(new wsy());
        a317.a();
        agmi a318 = agmk.a();
        a318.k(2);
        a318.j(true);
        a318.c(true);
        a318.d(true);
        a318.g(new lct(7));
        a318.b("reminders.message_id");
        a318.h(new wsy());
        a318.a();
        agmi a319 = agmk.a();
        a319.k(2);
        a319.c(true);
        a319.d(true);
        a319.g(new lct(8));
        a319.b("reminders.conversation_id");
        a319.h(new wsy());
        a319.a();
        agmi a320 = agmk.a();
        a320.k(2);
        a320.b("reminders.status");
        a320.h(new wsy());
        a320.a();
        agmi a321 = agmk.a();
        a321.k(2);
        a321.b("conversation_pin.pin_status");
        a321.h(new wsy());
        this.e = new ldb(a321.a());
        agmi a322 = agmk.a();
        a322.k(2);
        a322.j(true);
        a322.f(true);
        a322.c(true);
        a322.b("conversation_pin._id");
        a322.h(new wsy());
        a322.a();
        agmi a323 = agmk.a();
        a323.k(2);
        a323.j(true);
        a323.c(true);
        a323.d(true);
        a323.g(new lct(9));
        a323.b("conversation_pin.conversation_id");
        a323.e(true);
        a323.h(new wsy());
        a323.a();
        agmi a324 = agmk.a();
        a324.k(4);
        a324.b("lighter_conversations_table.lighter_conversation_id_json");
        a324.h(new wsy());
        a324.a();
        agmi a325 = agmk.a();
        a325.k(2);
        a325.c(true);
        a325.b("lighter_conversations_table.read");
        a325.h(new wsy());
        a325.a();
        agmi a326 = agmk.a();
        a326.k(2);
        a326.b("lighter_conversations_table.is_last_message_outgoing");
        a326.h(new wsy());
        a326.a();
        agmi a327 = agmk.a();
        a327.k(2);
        a327.b("lighter_conversations_table.conversation_status");
        a327.h(new wsy());
        a327.a();
        agmi a328 = agmk.a();
        a328.k(1);
        a328.b("lighter_conversations_table.last_action_timestamp");
        a328.h(new wsy());
        a328.a();
        agmi a329 = agmk.a();
        a329.k(2);
        a329.j(true);
        a329.f(true);
        a329.c(true);
        a329.b("lighter_conversations_table._id");
        a329.h(new wsy());
        a329.a();
        agmi a330 = agmk.a();
        a330.k(2);
        a330.c(true);
        a330.d(true);
        a330.g(new lct(10));
        a330.b("lighter_conversations_table.conversation_id");
        a330.h(new wsy());
        a330.a();
        agmi a331 = agmk.a();
        a331.k(4);
        a331.j(true);
        a331.c(true);
        a331.b("lighter_conversations_table.business_id");
        a331.e(true);
        a331.h(new wsy());
        a331.a();
        agmi a332 = agmk.a();
        a332.k(1);
        a332.b("lighter_conversations_table.sync_timestamp_ms");
        a332.h(new wsy());
        a332.a();
    }

    public static /* synthetic */ void k(jat jatVar, String str, String str2, arqg arqgVar, arqg arqgVar2, int i) {
        if ((i & 4) != 0) {
            arqgVar = jlc.e;
        }
        arqg arqgVar3 = arqgVar;
        if ((i & 8) != 0) {
            arqgVar2 = jlc.f;
        }
        arqg arqgVar4 = arqgVar2;
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        lgb.p((lre) jatVar.e, new jpb(arqgVar3, str, str3, jatVar, arqgVar4, 1));
    }

    public static /* synthetic */ String l(jat jatVar, int i) {
        return jatVar.e(i, new Object[0]);
    }

    public static final void r(File file, ParcelFileDescriptor parcelFileDescriptor) {
        amcp.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), new FileOutputStream(file));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    public final RbmConversation A(BugleConversation bugleConversation) {
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.a.b();
        anenVar2.getClass();
        kor korVar = (kor) this.b.b();
        korVar.getClass();
        ifs ifsVar = (ifs) this.e.b();
        ifsVar.getClass();
        lfl lflVar = (lfl) this.f.b();
        lflVar.getClass();
        bugleConversation.getClass();
        return new RbmConversation(anenVar, anenVar2, korVar, ifsVar, lflVar, this.g, this.c, bugleConversation);
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, via] */
    public final void B(mdx mdxVar, int i) {
        arxm arxmVar = (arxm) ((ConcurrentHashMap) this.e).remove(Integer.valueOf(mdxVar.a));
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        if (((ConcurrentHashMap) this.g).remove(Integer.valueOf(mdxVar.a)) == null) {
            return;
        }
        if (i == 2) {
            alvw g = ((aluw) this.b).g();
            g.X(alwp.a, "Bugle");
            ((alvg) g.h("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl", "stopDetector", 75, "LatencyDetectionAgentImpl.kt")).q("LatencyDetectionAgent has detected a slowness latency, push notification.");
            ?? r5 = this.d;
            Object obj = this.a;
            amme ammeVar = amme.SLOW_PERFORMANCE;
            String string = ((Context) obj).getString(R.string.report_issue_slow_performance);
            string.getClass();
            r5.Q(ammeVar, string);
            return;
        }
        alvw g2 = ((aluw) this.b).g();
        g2.X(alwp.a, "Bugle");
        ((alvg) g2.h("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl", "stopDetector", 86, "LatencyDetectionAgentImpl.kt")).q("LatencyDetectionAgent has not detected a slowness latency or got cancelled.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x013f, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.alog r18, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.a(alog, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [arxm] */
    /* JADX WARN: Type inference failed for: r2v1, types: [arwe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jmu
            if (r0 == 0) goto L13
            r0 = r8
            jmu r0 = (defpackage.jmu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jmu r0 = new jmu
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r8 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.aqil.P(r8)
            r8 = 0
            java.lang.Object r2 = r7.c     // Catch: java.lang.Throwable -> L59
            ikq r4 = new ikq     // Catch: java.lang.Throwable -> L59
            r5 = 18
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Throwable -> L59
            r5 = 3
            arwl r8 = defpackage.arrn.I(r2, r8, r8, r4, r5)     // Catch: java.lang.Throwable -> L59
            r0.a = r8     // Catch: java.lang.Throwable -> L59
            r0.c = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r8.n(r0)     // Catch: java.lang.Throwable -> L59
            if (r0 != r1) goto L50
            return r1
        L50:
            r6 = r0
            r0 = r8
            r8 = r6
        L53:
            if (r0 == 0) goto L58
            defpackage.arsd.am(r0)
        L58:
            return r8
        L59:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L5d:
            if (r0 == 0) goto L62
            defpackage.arsd.am(r0)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [arxm] */
    /* JADX WARN: Type inference failed for: r2v1, types: [arwe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jmv
            if (r0 == 0) goto L13
            r0 = r8
            jmv r0 = (defpackage.jmv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jmv r0 = new jmv
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r8 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.aqil.P(r8)
            r8 = 0
            java.lang.Object r2 = r7.c     // Catch: java.lang.Throwable -> L59
            ikq r4 = new ikq     // Catch: java.lang.Throwable -> L59
            r5 = 19
            r4.<init>(r8, r7, r5, r8)     // Catch: java.lang.Throwable -> L59
            r5 = 3
            arwl r8 = defpackage.arrn.I(r2, r8, r8, r4, r5)     // Catch: java.lang.Throwable -> L59
            r0.a = r8     // Catch: java.lang.Throwable -> L59
            r0.c = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r8.n(r0)     // Catch: java.lang.Throwable -> L59
            if (r0 != r1) goto L50
            return r1
        L50:
            r6 = r0
            r0 = r8
            r8 = r6
        L53:
            if (r0 == 0) goto L58
            defpackage.arsd.am(r0)
        L58:
            return r8
        L59:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L5d:
            if (r0 == 0) goto L62
            defpackage.arsd.am(r0)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [arxm] */
    /* JADX WARN: Type inference failed for: r8v0, types: [arwe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.jmx
            if (r0 == 0) goto L13
            r0 = r12
            jmx r0 = (defpackage.jmx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jmx r0 = new jmx
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            if (r2 == 0) goto L78
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r12)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L2d:
            r12 = move-exception
            goto L72
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            java.lang.Object r2 = r0.a
            jat r2 = (defpackage.jat) r2
            defpackage.aqil.P(r12)
            miu r12 = (defpackage.miu) r12
            mit r12 = r12.b()
            mit r6 = defpackage.mit.GROUP
            r7 = 0
            java.lang.Object r8 = r2.c     // Catch: java.lang.Throwable -> L70
            jmw r9 = new jmw     // Catch: java.lang.Throwable -> L70
            if (r12 != r6) goto L4e
            goto L4f
        L4e:
            r5 = r3
        L4f:
            r9.<init>(r7, r2, r5, r3)     // Catch: java.lang.Throwable -> L70
            r12 = 3
            arwl r12 = defpackage.arrn.I(r8, r7, r7, r9, r12)     // Catch: java.lang.Throwable -> L70
            r0.a = r12     // Catch: java.lang.Throwable -> L6b
            r0.c = r4     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r12.n(r0)     // Catch: java.lang.Throwable -> L6b
            if (r0 == r1) goto L6a
            r10 = r0
            r0 = r12
            r12 = r10
        L64:
            if (r0 == 0) goto L69
            defpackage.arsd.am(r0)
        L69:
            return r12
        L6a:
            return r1
        L6b:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L72
        L70:
            r12 = move-exception
            r0 = r7
        L72:
            if (r0 == 0) goto L77
            defpackage.arsd.am(r0)
        L77:
            throw r12
        L78:
            defpackage.aqil.P(r12)
            java.lang.Object r12 = r11.f
            j$.util.Optional r12 = (j$.util.Optional) r12
            r12.isPresent()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.d(arpe):java.lang.Object");
    }

    public final String e(int i, Object... objArr) {
        String string = ((Context) this.a).getString(i, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    public final void f() {
        k(this, l(this, R.string.media_attachments_not_supported_notice_text), null, null, null, 14);
    }

    public final void g() {
        k(this, l(this, R.string.add_multiple_attachments_too_large_notice_text), null, null, null, 14);
    }

    public final void h() {
        k(this, l(this, R.string.sending_disabled_notice_text), null, null, null, 14);
    }

    public final void i() {
        k(this, l(this, R.string.sending_failed_notice_text), null, null, null, 14);
    }

    public final void j(jmt jmtVar) {
        k(this, e(R.string.video_duration_too_long_dialog_text, DateUtils.formatElapsedTime(jmtVar.f.getSeconds())), null, new jmy(this, 1), new jmy(this, 0), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.util.UUID r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.lum
            if (r0 == 0) goto L13
            r0 = r7
            lum r0 = (defpackage.lum) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            lum r0 = new lum
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.UUID r6 = r0.c
            jat r0 = r0.e
            defpackage.aqil.P(r7)
            goto L54
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r5.f
            java.lang.Object r7 = r7.b()
            luz r7 = (defpackage.luz) r7
            r0.e = r5
            r0.c = r6
            r0.b = r3
            arpi r7 = r7.a
            leb r2 = new leb
            r3 = 0
            r4 = 7
            r2.<init>(r6, r3, r4)
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 == r1) goto La2
            r0 = r5
        L54:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r2 = r1
        L5c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r7.next()
            lwq r3 = (defpackage.lwq) r3
            java.io.File r4 = new java.io.File
            java.lang.String r3 = r3.e
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L5c
            boolean r3 = r4.delete()
            if (r3 == 0) goto L7e
            int r1 = r1 + 1
            goto L5c
        L7e:
            int r2 = r2 + 1
            goto L5c
        L81:
            java.lang.Object r7 = r0.g
            aluw r7 = (defpackage.aluw) r7
            alvw r7 = r7.g()
            alwl r7 = (defpackage.alwl) r7
            java.lang.String r3 = "%s restore attachments for session id %s successfully deleted"
            r7.w(r3, r1, r6)
            java.lang.Object r7 = r0.g
            aluw r7 = (defpackage.aluw) r7
            alvw r7 = r7.g()
            alwl r7 = (defpackage.alwl) r7
            java.lang.String r0 = "%s restore attachments for session id %s not successfully deleted"
            r7.w(r0, r2, r6)
            arnb r6 = defpackage.arnb.a
            return r6
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.m(java.util.UUID, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.util.UUID r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lun
            if (r0 == 0) goto L13
            r0 = r6
            lun r0 = (defpackage.lun) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            lun r0 = new lun
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.UUID r5 = r0.c
            jat r0 = r0.e
            defpackage.aqil.P(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.f
            java.lang.Object r6 = r6.b()
            luz r6 = (defpackage.luz) r6
            r0.e = r4
            r0.c = r5
            r0.b = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 == r1) goto L81
            r0 = r4
        L4b:
            lwq r6 = (defpackage.lwq) r6
            r1 = 0
            if (r6 == 0) goto L59
            java.lang.String r6 = r6.e
            if (r6 == 0) goto L59
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
        L59:
            if (r1 != 0) goto L6b
            java.lang.Object r6 = r0.g
            aluw r6 = (defpackage.aluw) r6
            alvw r6 = r6.i()
            alwl r6 = (defpackage.alwl) r6
            java.lang.String r0 = "No backup DB found for %s for deletion"
            r6.t(r0, r5)
            goto L7e
        L6b:
            boolean r6 = r1.delete()
            java.lang.Object r0 = r0.g
            aluw r0 = (defpackage.aluw) r0
            alvw r0 = r0.g()
            alwl r0 = (defpackage.alwl) r0
            java.lang.String r1 = "Backup database deletion for session id %s successful: %s"
            r0.E(r1, r5, r6)
        L7e:
            arnb r5 = defpackage.arnb.a
            return r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.n(java.util.UUID, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b6 -> B:12:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c9 -> B:12:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.o(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0033, B:15:0x00d0, B:17:0x00d6, B:19:0x00ed, B:20:0x00f4, B:26:0x00f2, B:34:0x0049, B:36:0x00c7, B:38:0x005a, B:39:0x0083, B:41:0x0092, B:44:0x00b0), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0033, B:15:0x00d0, B:17:0x00d6, B:19:0x00ed, B:20:0x00f4, B:26:0x00f2, B:34:0x0049, B:36:0x00c7, B:38:0x005a, B:39:0x0083, B:41:0x0092, B:44:0x00b0), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0033, B:15:0x00d0, B:17:0x00d6, B:19:0x00ed, B:20:0x00f4, B:26:0x00f2, B:34:0x0049, B:36:0x00c7, B:38:0x005a, B:39:0x0083, B:41:0x0092, B:44:0x00b0), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.util.UUID r9, defpackage.lus r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jat.p(java.util.UUID, lus, arpe):java.lang.Object");
    }

    public final void q(int i, String str, lus lusVar) {
        lusVar.getClass();
        sfw sfwVar = new sfw(sfz.a);
        sfwVar.d(new qqv(i, 1));
        sfr sfrVar = (sfr) ((sft) sfwVar.b().n()).cP();
        sfrVar.ao(4, "status");
        long j = sfrVar.e;
        if (j != 1) {
            if (j != 0) {
                if (j == -1) {
                    if (!lusVar.a()) {
                        alwl alwlVar = (alwl) ((aluw) this.g).i();
                        alwlVar.X(ydl.s, String.valueOf(i));
                        alwlVar.q("Invalid backup id map status STATUS_DUPLICATE");
                        return;
                    }
                    if (sfrVar.h() == -1) {
                        alwl alwlVar2 = (alwl) ((aluw) this.g).g();
                        alwlVar2.X(ydl.s, String.valueOf(i));
                        alwlVar2.V(10, TimeUnit.SECONDS);
                        alwlVar2.q("STATUS_DUPLICATE with no mapped part id, deleting attachment file");
                        try {
                            File file = new File(str);
                            if (true != file.exists()) {
                                file = null;
                            }
                            if (file != null) {
                                file.delete();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            alwl alwlVar3 = (alwl) ((alwl) ((aluw) this.g).i()).g(e);
                            alwlVar3.X(ydl.s, String.valueOf(i));
                            alwlVar3.t("Unable to delete duplicate attachment file [%s]", str);
                            return;
                        }
                    }
                    alwl alwlVar4 = (alwl) ((aluw) this.g).g();
                    alwlVar4.X(ydl.s, String.valueOf(i));
                    alwlVar4.V(10, TimeUnit.SECONDS);
                    alwlVar4.s("STATUS_DUPLICATE with mapped part id [%s]", sfrVar.h());
                }
                tbt tbtVar = new tbt();
                tbtVar.v(new ldg(sfrVar, 20));
                tbtVar.s(Uri.parse("file://".concat(str)));
                tbtVar.l(str);
                tbtVar.n(true);
                if (tbtVar.a().e() == 0) {
                    alwl alwlVar5 = (alwl) ((aluw) this.g).i();
                    alwlVar5.X(ydl.s, String.valueOf(i));
                    alwlVar5.q("Unable to find part id to update");
                    return;
                }
                return;
            }
            alwl alwlVar6 = (alwl) ((aluw) this.g).i();
            alwlVar6.X(ydl.s, String.valueOf(i));
            alwlVar6.q("Invalid backup id map status STATUS_ID_INITIALIZED");
            throw new IllegalStateException("Invalid backup id map status");
        }
        alwl alwlVar7 = (alwl) ((aluw) this.g).i();
        alwlVar7.X(ydl.s, String.valueOf(i));
        alwlVar7.q("Invalid backup id map status STATUS_ID_ASSIGNED");
        throw new IllegalStateException("Invalid backup id map status");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [alhr, java.lang.Object] */
    public final String s(Context context, long j, int i) {
        ((StringBuilder) this.b.get()).setLength(0);
        return DateUtils.formatDateRange(context, (Formatter) this.d.get(), j, j, i).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [msk, java.lang.Object] */
    public final String t(String str) {
        return this.g.p(str).F().toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final List u(String str) {
        arus arusVar = (arus) this.f.a();
        if (str.length() >= 0) {
            return arrn.g(arrn.i(new artw(new afzu(arusVar, str, 12), arur.a, 0), new kbt(this, 4)));
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jzk] */
    public final jzk v(jzz jzzVar) {
        jzk jzkVar;
        akrh e = aktp.e("MessageUiAdapterImpl#createUiData");
        try {
            Object obj = this.a;
            jpi jpiVar = new jpi(this, jzzVar, 10, null);
            MessageId b = jzzVar.q.a.b();
            ((jzr) obj).e.add(b);
            jzp jzpVar = (jzp) ((jzr) obj).d.get(b);
            if (jzpVar != null && jzpVar.a.equals(jzzVar)) {
                ((alvg) jzr.a.d().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 68, "MessageUiDataCache.kt")).t("Cache hit. id = %s", b.a());
                ((jzr) obj).b.b.incrementAndGet();
                jzkVar = jzpVar.b;
            } else {
                ((jzr) obj).b.c.incrementAndGet();
                if (jzpVar == null) {
                    ((alvg) jzr.a.f().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 74, "MessageUiDataCache.kt")).t("Cache miss. id = %s", b.a());
                } else {
                    ((alvg) jzr.a.f().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 76, "MessageUiDataCache.kt")).t("Cache hit, but different arguments. id = %s", b.a());
                }
                arpi arpiVar = ((jzr) obj).c;
                arwe e2 = arwi.e(arpiVar.plus(new aryj(arwi.v(arpiVar))));
                ((alvg) jzr.a.f().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 84, "MessageUiDataCache.kt")).t("Creating message scope. id = %s", b.a());
                ?? a = jpiVar.a(e2);
                ((jzr) obj).d.put(b, new jzp(jzzVar, a, e2));
                jzkVar = a;
            }
            armd.i(e, null);
            return jzkVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [armf, java.lang.Object] */
    public final qkg w(arwe arweVar, jzz jzzVar) {
        aelg aelgVar;
        aerb aerbVar;
        Object afaiVar;
        miz mizVar = jzzVar.q.a;
        mym e = mizVar.e();
        if (e instanceof mxx) {
            Object obj = this.d;
            kfd kfdVar = new kfd(mizVar.b(), (mxx) e, jzzVar.q);
            alog alogVar = kfdVar.c.a;
            if (((alsx) alogVar).c > 1) {
                String a = kfdVar.a.a();
                a.getClass();
                alogVar.getClass();
                ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
                alur it = alogVar.iterator();
                while (it.hasNext()) {
                    mxw mxwVar = (mxw) it.next();
                    mxwVar.getClass();
                    arrayList.add(((kff) obj).b(mxwVar));
                }
                afaiVar = new afah(a, arrayList);
            } else {
                String a2 = kfdVar.a.a();
                a2.getClass();
                alogVar.getClass();
                Object ag = aqjn.ag(alogVar);
                ag.getClass();
                afaiVar = new afai(a2, ((kff) obj).b((mxw) ag));
            }
            return new qjp(new kdt(kfdVar, afaiVar, obj, 2));
        }
        if (e instanceof mxy) {
            return new qjp(new kfq(new kfh(mizVar.b(), (mxy) e), this.b, 1));
        }
        if (e instanceof mxs) {
            Object obj2 = this.g;
            key keyVar = new key(jzzVar.q, jzzVar.a, jzzVar.b, jzzVar.c, jzzVar.d);
            miz mizVar2 = keyVar.e.a;
            mxs mxsVar = (mxs) mizVar2.e();
            lfl lflVar = (lfl) obj2;
            Object obj3 = lflVar.d;
            int ce = lga.ce(mizVar2);
            String d = ((nei) obj3).d(mizVar2);
            if (d == null) {
                d = "";
            }
            String str = d;
            alog alogVar2 = mxsVar.a;
            alogVar2.getClass();
            ArrayList arrayList2 = new ArrayList(aqjn.J(alogVar2, 10));
            alur it2 = alogVar2.iterator();
            while (it2.hasNext()) {
                mxf mxfVar = (mxf) it2.next();
                Object obj4 = lflVar.b;
                mxfVar.getClass();
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(((kcc) obj4).a(arweVar, new kbv(mizVar2, mxfVar, keyVar.c.a, keyVar.d, keyVar.a, keyVar.b, ce, str)));
                arrayList2 = arrayList3;
            }
            int i = 0;
            qkg[] qkgVarArr = (qkg[]) arrayList2.toArray(new qkg[0]);
            String str2 = mxsVar.b;
            if (str2 != null && str2.length() > 0) {
                qkgVarArr = (qkg[]) aqil.f(qkgVarArr, ((kcc) lflVar.b).a(arweVar, new kbv(mizVar2, new kcm(mxsVar, 2), keyVar.c.a, keyVar.d, keyVar.a, keyVar.b, ce, str)));
            }
            qkg[] qkgVarArr2 = (qkg[]) Arrays.copyOf(qkgVarArr, qkgVarArr.length);
            for (qkg qkgVar : qkgVarArr2) {
                if (qkgVar != null && !(qkgVar instanceof qjp)) {
                    qkg[] qkgVarArr3 = (qkg[]) aqil.o(qkgVarArr2).toArray(new qkg[0]);
                    kfb kfbVar = new kfb((asai[]) Arrays.copyOf(qkgVarArr3, qkgVarArr3.length), qkgVarArr2, mizVar2, lflVar, keyVar, ce);
                    int length = qkgVarArr2.length;
                    ArrayList arrayList4 = new ArrayList(length);
                    int i2 = 0;
                    while (true) {
                        Object obj5 = null;
                        if (i2 >= length) {
                            break;
                        }
                        qkg qkgVar2 = qkgVarArr2[i2];
                        if (qkgVar2 != null) {
                            obj5 = qkgVar2.b();
                        }
                        arrayList4.add(obj5);
                        i2++;
                    }
                    aetv[] aetvVarArr = (aetv[]) arrayList4.toArray(new aetv[0]);
                    MessageId b = mizVar2.b();
                    List o = aqil.o(aetvVarArr);
                    ArrayList arrayList5 = new ArrayList(aqjn.J(o, 10));
                    Iterator it3 = o.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i3 = i + 1;
                        if (i < 0) {
                            aqjn.G();
                        }
                        aetv aetvVar = (aetv) next;
                        String a3 = b.a();
                        a3.getClass();
                        if (i == o.size() - 1) {
                            aelgVar = kbq.a((kbq) lflVar.a, mizVar2);
                        } else {
                            aelgVar = null;
                        }
                        if (mizVar2.n()) {
                            aerbVar = aerb.bD;
                        } else {
                            aerbVar = aerb.bE;
                        }
                        kam kamVar = keyVar.e;
                        List y = aqjn.y(aerbVar);
                        aeuh bp = lga.bp(kamVar, i, o.size());
                        Object b2 = lflVar.c.b();
                        b2.getClass();
                        arrayList5.add(new jzx(new aeul(a3, y, ce, bp, aelgVar, new aeuk(((Boolean) b2).booleanValue(), 15), 402636748), aetvVar, mizVar2));
                        o = o;
                        it3 = it3;
                        i = i3;
                    }
                    return new qki(kfbVar, new kex(arrayList5, b, lga.bI(mizVar2)), 1);
                }
            }
            return new qjp(new kez(qkgVarArr2, mizVar2, lflVar, keyVar, ce));
        }
        if (e instanceof mxl) {
            return new qjp(new ker((jat) this.e, new keq(mizVar.b(), ((mxl) e).a)));
        }
        if (e instanceof ket) {
            return new qjp(new kdz(new kev(mizVar.b()), 6));
        }
        return ((kag) this.c).a(arweVar, jzzVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ OnDeviceDatabaseUpgradeHandler x(agnw agnwVar, agna agnaVar, int i, int i2) {
        CustomUpgradeSteps customUpgradeSteps = (CustomUpgradeSteps) this.e.b();
        customUpgradeSteps.getClass();
        Map map = (Map) this.d.b();
        map.getClass();
        qxr qxrVar = (qxr) this.f.b();
        qxrVar.getClass();
        xjo xjoVar = (xjo) this.b.b();
        xjoVar.getClass();
        agnwVar.getClass();
        agnaVar.getClass();
        ?? r9 = this.c;
        return new OnDeviceDatabaseUpgradeHandler(customUpgradeSteps, this.a, map, this.g, qxrVar, xjoVar, r9, agnwVar, agnaVar, i, i2);
    }

    public final akul y(final ConversationIdType conversationIdType, final String str, final boolean z) {
        return ((trn) this.d).b(new Function() { // from class: qcz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo416andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v12, types: [akul] */
            /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v18 */
            /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v9, types: [vcd] */
            /* JADX WARN: Type inference failed for: r2v12, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v19, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v22, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v7, types: [armf, java.lang.Object] */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional empty;
                ver a;
                String str2;
                ?? r1;
                trm trmVar = (trm) obj;
                aqfn aqfnVar = trmVar.a;
                tro troVar = trmVar.e;
                String str3 = trmVar.b;
                aozy createBuilder = anhb.a.createBuilder();
                String a2 = conversationIdType.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anhb anhbVar = (anhb) createBuilder.b;
                a2.getClass();
                anhbVar.c = a2;
                aozy createBuilder2 = angp.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((angp) createBuilder2.b).b = a.an(3);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                String str4 = str;
                angp angpVar = (angp) createBuilder2.b;
                str4.getClass();
                angpVar.c = str4;
                angp angpVar2 = (angp) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                anhb anhbVar2 = (anhb) apagVar;
                angpVar2.getClass();
                anhbVar2.d = angpVar2;
                anhbVar2.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((anhb) createBuilder.b).e = z;
                anhb anhbVar3 = (anhb) createBuilder.s();
                aozy createBuilder3 = anhc.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                anhc anhcVar = (anhc) createBuilder3.b;
                anhbVar3.getClass();
                apax apaxVar = anhcVar.b;
                if (!apaxVar.c()) {
                    anhcVar.b = apag.mutableCopy(apaxVar);
                }
                jat jatVar = jat.this;
                anhcVar.b.add(anhbVar3);
                anhc anhcVar2 = (anhc) createBuilder3.s();
                if (((lpg) jatVar.c.b()).z()) {
                    veq P = ((wpp) jatVar.b).P(troVar);
                    P.b = str3;
                    aozy createBuilder4 = angd.a.createBuilder();
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    angd angdVar = (angd) createBuilder4.b;
                    anhcVar2.getClass();
                    angdVar.c = anhcVar2;
                    angdVar.b = 4;
                    P.b(createBuilder4.s());
                    P.c();
                    P.e = aqdq.EPHEMERAL;
                    a = P.a();
                } else {
                    Object obj2 = jatVar.b;
                    if (((lpg) jatVar.c.b()).z()) {
                        empty = troVar.c;
                    } else {
                        empty = Optional.empty();
                    }
                    veq O = ((wpp) obj2).O(aqfnVar, empty);
                    O.b = str3;
                    aozy createBuilder5 = angd.a.createBuilder();
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    angd angdVar2 = (angd) createBuilder5.b;
                    anhcVar2.getClass();
                    angdVar2.c = anhcVar2;
                    angdVar2.b = 4;
                    O.b(createBuilder5.s());
                    O.c();
                    O.e = aqdq.EPHEMERAL;
                    a = O.a();
                }
                trh trhVar = (trh) jatVar.f.b();
                if (((lpg) jatVar.c.b()).z()) {
                    str2 = troVar.b;
                } else {
                    str2 = aqfnVar.c;
                }
                trhVar.d(str3, str2, albo.aE(18), 4, a.b);
                if (((lpg) jatVar.c.b()).z()) {
                    r1 = (vcd) jatVar.a.b();
                } else {
                    r1 = jatVar.e;
                }
                return r1.a(a).h(new mmq(jatVar, aqfnVar, 14), jatVar.g).e(aqwb.class, new qda(0), andi.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new qda(1), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final Optional z(int i) {
        return ((adji) this.f.b()).e(i).map(new nfc(this, 10));
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, Context context) {
        this.d = context;
        this.b = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.a = armfVar4;
        this.c = armfVar5;
        this.e = armfVar6;
    }

    public jat(trn trnVar, armf armfVar, vcc vccVar, armf armfVar2, wpp wppVar, anen anenVar, armf armfVar3) {
        this.d = trnVar;
        this.f = armfVar;
        this.e = vccVar;
        this.a = armfVar2;
        this.b = wppVar;
        this.g = anenVar;
        this.c = armfVar3;
    }

    public jat(Context context, xnv xnvVar, armf armfVar, armf armfVar2) {
        context.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.b = xnvVar;
        this.f = armfVar;
        this.c = armfVar2;
        this.g = alwo.o("BugleBackup");
        this.e = "attachment_restore";
        this.d = new asgm();
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.g = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
        armfVar6.getClass();
        this.b = armfVar6;
        armfVar7.getClass();
        this.f = armfVar7;
    }

    public jat(byte[] bArr, short[] sArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.a = "my_identities.token";
        a.c = new wsy();
        qve qveVar = new qve(a.a());
        this.c = qveVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "my_identities.provisioning_id";
        a2.c = new wsy();
        qve qveVar2 = new qve(a2.a());
        this.f = qveVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.i(true);
        a3.a = "my_identities.is_verified";
        a3.c = new wsy();
        qve qveVar3 = new qve(a3.a());
        this.e = qveVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "my_identities.address_type";
        a4.c = new wsy();
        qve qveVar4 = new qve(a4.a());
        this.b = qveVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "my_identities.phone_number";
        a5.c = new wsy();
        qve qveVar5 = new qve(a5.a());
        this.d = qveVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "my_identities.display_name";
        a6.c = new wsy();
        qve qveVar6 = new qve(a6.a());
        this.g = qveVar6;
        this.a = new qve[]{qveVar, qveVar2, qveVar3, qveVar4, qveVar5, qveVar6};
    }

    public jat(arwe arweVar, Context context, via viaVar) {
        arweVar.getClass();
        context.getClass();
        viaVar.getClass();
        this.c = arweVar;
        this.a = context;
        this.d = viaVar;
        this.b = alvi.m("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl");
        this.g = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new AtomicInteger(1);
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.c = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.g = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.b = armfVar7;
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        this.g = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.a = armfVar6;
        this.b = armfVar7;
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
    }

    public jat(int[] iArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_participants_backup._id";
        a.c = new wsy();
        rkk rkkVar = new rkk(a.a());
        this.c = rkkVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.c(true);
        a2.d(true);
        a2.b = new qxs(16);
        a2.a = "conversation_participants_backup.conversation_id";
        a2.e(true);
        a2.c = new wsy();
        rkk rkkVar2 = new rkk(a2.a());
        this.d = rkkVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.c(true);
        a3.d(true);
        a3.b = new qxs(17);
        a3.a = "conversation_participants_backup.participant_id";
        a3.e(true);
        a3.c = new wsy();
        rkk rkkVar3 = new rkk(a3.a());
        this.e = rkkVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "conversation_participants_backup.is_normalized";
        a4.c = new wsy();
        rkk rkkVar4 = new rkk(a4.a());
        this.g = rkkVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "conversation_participants_backup.rcs_group_join_status";
        a5.c = new wsy();
        rkk rkkVar5 = new rkk(a5.a());
        this.f = rkkVar5;
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.c(true);
        a6.a = "conversation_participants_backup.is_c2p_only";
        a6.c = new wsy();
        rkk rkkVar6 = new rkk(a6.a());
        this.b = rkkVar6;
        this.a = new rkk[]{rkkVar, rkkVar2, rkkVar3, rkkVar4, rkkVar5, rkkVar6};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public jat(iji ijiVar, Context context, aksr aksrVar, ahmn ahmnVar, List list, arqr arqrVar) {
        this.e = ijiVar;
        this.d = context;
        this.c = aksrVar;
        this.a = ahmnVar;
        this.f = list;
        this.b = arqrVar;
        xwr xwrVar = (xwr) ijiVar.a.b();
        xwrVar.getClass();
        msk mskVar = (msk) ijiVar.b.b();
        mskVar.getClass();
        this.g = new jam(xwrVar, mskVar, (Context) ijiVar.c.b(), list);
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.g = armfVar5;
        this.b = armfVar6;
        armfVar7.getClass();
        this.f = armfVar7;
    }

    public jat(xwr xwrVar, aohs aohsVar, SimPickerItemView simPickerItemView, msk mskVar) {
        this.a = xwrVar;
        this.b = aohsVar;
        this.c = simPickerItemView;
        this.g = mskVar;
        this.e = (TextView) simPickerItemView.findViewById(R.id.name);
        this.d = (TextView) simPickerItemView.findViewById(R.id.details);
        this.f = (SimIconView) simPickerItemView.findViewById(R.id.sim_icon);
    }

    public jat(Context context, arwe arweVar, wfh wfhVar, armf armfVar, armf armfVar2, lre lreVar, oem oemVar) {
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        lreVar.getClass();
        this.d = context;
        this.b = arweVar;
        this.c = wfhVar;
        this.a = armfVar;
        this.g = armfVar2;
        this.e = lreVar;
        this.f = oemVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [arwe, java.lang.Object] */
    public jat(arwe arweVar, jlf jlfVar, jwe jweVar, jtt jttVar, jky jkyVar, khl khlVar, ascg ascgVar, ConversationId conversationId, iji ijiVar, wpp wppVar, Optional optional, obj objVar, ovn ovnVar, orj orjVar, ovq ovqVar, armf armfVar, armf armfVar2) {
        ascv a;
        Object qjrVar;
        arweVar.getClass();
        jlfVar.getClass();
        jweVar.getClass();
        jttVar.getClass();
        jkyVar.getClass();
        khlVar.getClass();
        ascgVar.getClass();
        conversationId.getClass();
        ijiVar.getClass();
        orjVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.f = arweVar;
        this.e = armfVar;
        this.b = armfVar2;
        ifm ifmVar = new ifm(new ifm(ascgVar, 9), 10);
        int i = ascp.a;
        ascv T = arrn.T(ifmVar, arweVar, asco.b, false);
        this.c = T;
        afqa afqaVar = (afqa) arsd.k(optional);
        this.a = afqaVar;
        if (yig.c() && afqaVar != null) {
            a = arrn.T(new jdn(new asaa(new eig(this, (arpe) null, 16)), arrn.T(new lhh(((eij) wppVar.b).e, 9), wppVar.a, asco.b, false), new jwo((arpe) null, 1, (byte[]) null), 17, null), arweVar, asco.b, false);
        } else {
            a = ascy.a(false);
        }
        ascv ascvVar = a;
        this.d = ascvVar;
        ascp ascpVar = asco.b;
        ascv ascvVar2 = jlfVar.c;
        ascv a2 = jweVar.a();
        ascv c = jttVar.c();
        ascv ascvVar3 = jkyVar.g;
        jgf jgfVar = new jgf(objVar, ovnVar, ovqVar, this, khlVar, ijiVar);
        ascvVar2.getClass();
        a2.getClass();
        c.getClass();
        ascvVar3.getClass();
        ascvVar.getClass();
        ascv[] ascvVarArr = {ascvVar2, a2, c, ascvVar3, T, ascvVar};
        int i2 = 0;
        while (true) {
            if (i2 < 6) {
                ascv ascvVar4 = ascvVarArr[i2];
                if (ascvVar4 == null || (ascvVar4 instanceof qjr)) {
                    i2++;
                } else {
                    ascv[] ascvVarArr2 = (ascv[]) aqil.o(ascvVarArr).toArray(new ascv[0]);
                    jdn jdnVar = new jdn((asai[]) Arrays.copyOf(ascvVarArr2, ascvVarArr2.length), ascvVarArr, (Object) jgfVar, 11);
                    ArrayList arrayList = new ArrayList(6);
                    for (int i3 = 0; i3 < 6; i3++) {
                        ascv ascvVar5 = ascvVarArr[i3];
                        arrayList.add(ascvVar5 != null ? ascvVar5.c() : null);
                    }
                    Object[] array = arrayList.toArray(new Object[0]);
                    qjrVar = arrn.T(jdnVar, arweVar, ascpVar, jgfVar.a(array[0], array[1], array[2], array[3], array[4], array[5]));
                }
            } else {
                qjrVar = new qjr(new qjz(ascvVarArr, jgfVar, 5));
                break;
            }
        }
        this.g = qjrVar;
    }

    public jat(byte[] bArr, char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_reactions_backup._id";
        a.c = new wsy();
        rlz rlzVar = new rlz(a.a());
        this.c = rlzVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.b = new rlm(4);
        a2.a = "message_reactions_backup.message_id";
        a2.c = new wsy();
        rlz rlzVar2 = new rlz(a2.a());
        this.b = rlzVar2;
        agmi a3 = agmk.a();
        a3.d = 5;
        a3.a = "message_reactions_backup.reactions_data";
        a3.c = new wsy();
        rlz rlzVar3 = new rlz(a3.a());
        this.f = rlzVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.c(true);
        a4.d(true);
        a4.b = new rlm(5);
        a4.a = "message_reactions_backup.reacted_message_id";
        a4.c = new wsy();
        rlz rlzVar4 = new rlz(a4.a());
        this.g = rlzVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "message_reactions_backup.reaction";
        a5.c = new wsy();
        rlz rlzVar5 = new rlz(a5.a());
        this.e = rlzVar5;
        agmi a6 = agmk.a();
        a6.d = 5;
        a6.a = "message_reactions_backup.applied_reaction";
        a6.c = new wsy();
        rlz rlzVar6 = new rlz(a6.a());
        this.d = rlzVar6;
        this.a = new rlz[]{rlzVar, rlzVar2, rlzVar3, rlzVar4, rlzVar5, rlzVar6};
    }

    public jat(Context context, arwe arweVar, arwe arweVar2, armf armfVar, armf armfVar2, pkd pkdVar, lre lreVar, Optional optional) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        lreVar.getClass();
        this.a = context;
        this.c = arweVar;
        this.g = arweVar2;
        this.d = armfVar;
        this.b = pkdVar;
        this.e = lreVar;
        this.f = optional;
    }

    public jat(kag kagVar, kff kffVar, kjp kjpVar, lfl lflVar, Optional optional, jzr jzrVar, jat jatVar, arwe arweVar) {
        jzrVar.getClass();
        jatVar.getClass();
        arweVar.getClass();
        this.c = kagVar;
        this.d = kffVar;
        this.b = kjpVar;
        this.g = lflVar;
        this.f = optional;
        this.a = jzrVar;
        this.e = jatVar;
    }

    public jat(Context context, String str, String str2, khs khsVar, lkd lkdVar, msk mskVar) {
        context.getClass();
        lkdVar.getClass();
        mskVar.getClass();
        this.a = context;
        this.d = str;
        this.b = str2;
        this.c = khsVar;
        this.e = lkdVar;
        this.g = mskVar;
        this.f = armd.a(kek.c);
    }

    public jat(Context context) {
        this.g = albo.D(new ezq(7));
        albo.D(new ezq(8));
        this.f = albo.D(new ezq(9));
        this.e = albo.D(new ezq(10));
        albo.D(new ezq(11));
        this.c = albo.D(new ezq(12));
        albo.D(new ezq(13));
        this.b = albo.D(new ezq(14));
        this.d = albo.D(new ezp(this, 15));
        this.a = context;
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.f = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.c = armfVar6;
        armfVar7.getClass();
        this.e = armfVar7;
        armfVar8.getClass();
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.g = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
    }

    public jat(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, short[] sArr) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.b = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
    }

    public jat(short[] sArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "business_conversations_metadata._id";
        a.c = new wsy();
        sgb sgbVar = new sgb(a.a());
        this.a = sgbVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.c(true);
        a2.d(true);
        a2.b = new seo(17);
        a2.a = "business_conversations_metadata.conversation_id";
        a2.e(true);
        a2.c = new wsy();
        sgb sgbVar2 = new sgb(a2.a());
        this.g = sgbVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "business_conversations_metadata.chatbot_directory_conversation_state";
        a3.c = new wsy();
        sgb sgbVar3 = new sgb(a3.a());
        this.b = sgbVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "business_conversations_metadata.conversation_stop_state";
        a4.c = new wsy();
        sgb sgbVar4 = new sgb(a4.a());
        this.e = sgbVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "business_conversations_metadata.conversation_toolstone_state";
        a5.c = new wsy();
        sgb sgbVar5 = new sgb(a5.a());
        this.f = sgbVar5;
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "business_conversations_metadata.conversation_toolstone_timestamp_ms";
        a6.c = new wsy();
        sgb sgbVar6 = new sgb(a6.a());
        this.c = sgbVar6;
        this.d = new sgb[]{sgbVar, sgbVar2, sgbVar3, sgbVar4, sgbVar5, sgbVar6};
    }

    public jat(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.k(1);
        a.c(true);
        a.d(true);
        a.b("conversation_image_parts_view.conversation_id_messages");
        a.h(new wsy());
        a.a();
        agmi a2 = agmk.a();
        a2.k(1);
        a2.c(true);
        a2.b("conversation_image_parts_view.received_timestamp_messages");
        a2.h(new wsy());
        this.b = new sjx(a2.a());
        agmi a3 = agmk.a();
        a3.k(1);
        a3.c(true);
        a3.b("conversation_image_parts_view.status_messages");
        a3.h(new wsy());
        this.d = new sjx(a3.a());
        agmi a4 = agmk.a();
        a4.k(2);
        a4.j(true);
        a4.f(true);
        a4.c(true);
        a4.b("conversation_image_parts_view._id_messages");
        a4.h(new wsy());
        a4.a();
        agmi a5 = agmk.a();
        a5.k(1);
        a5.c(true);
        a5.d(true);
        a5.b("conversation_image_parts_view.sender_participant_id_messages");
        a5.h(new wsy());
        a5.a();
        agmi a6 = agmk.a();
        a6.k(4);
        a6.b("conversation_image_parts_view.sender_send_destination_messages");
        a6.h(new wsy());
        a6.a();
        agmi a7 = agmk.a();
        a7.k(4);
        a7.b("conversation_image_parts_view.msisdn_receiving_rcs_message_messages");
        a7.h(new wsy());
        a7.a();
        agmi a8 = agmk.a();
        a8.k(4);
        a8.b("conversation_image_parts_view.receiving_network_country_messages");
        a8.h(new wsy());
        a8.a();
        agmi a9 = agmk.a();
        a9.k(1);
        a9.c(true);
        a9.b("conversation_image_parts_view.sent_timestamp_messages");
        a9.h(new wsy());
        a9.a();
        agmi a10 = agmk.a();
        a10.k(1);
        a10.b("conversation_image_parts_view.queue_insert_timestamp_messages");
        a10.h(new wsy());
        a10.a();
        agmi a11 = agmk.a();
        a11.k(1);
        a11.b("conversation_image_parts_view.protocol_messages");
        a11.h(new wsy());
        a11.a();
        agmi a12 = agmk.a();
        a12.k(1);
        a12.b("conversation_image_parts_view.message_report_status_messages");
        a12.h(new wsy());
        a12.a();
        agmi a13 = agmk.a();
        a13.k(1);
        a13.c(true);
        a13.b("conversation_image_parts_view.notified_messages");
        a13.e(true);
        a13.h(new wsy());
        a13.a();
        agmi a14 = agmk.a();
        a14.k(1);
        a14.c(true);
        a14.b("conversation_image_parts_view.read_messages");
        a14.h(new wsy());
        a14.a();
        agmi a15 = agmk.a();
        a15.k(4);
        a15.c(true);
        a15.b("conversation_image_parts_view.sms_message_uri_messages");
        a15.h(new wsy());
        a15.a();
        agmi a16 = agmk.a();
        a16.k(1);
        a16.b("conversation_image_parts_view.sms_priority_messages");
        a16.h(new wsy());
        a16.a();
        agmi a17 = agmk.a();
        a17.k(1);
        a17.b("conversation_image_parts_view.sms_message_size_messages");
        a17.h(new wsy());
        a17.a();
        agmi a18 = agmk.a();
        a18.k(4);
        a18.b("conversation_image_parts_view.mms_subject_messages");
        a18.h(new wsy());
        a18.a();
        agmi a19 = agmk.a();
        a19.k(4);
        a19.b("conversation_image_parts_view.mms_transaction_id_messages");
        a19.h(new wsy());
        a19.a();
        agmi a20 = agmk.a();
        a20.k(4);
        a20.b("conversation_image_parts_view.mms_content_location_messages");
        a20.h(new wsy());
        a20.a();
        agmi a21 = agmk.a();
        a21.k(1);
        a21.b("conversation_image_parts_view.mms_expiry_messages");
        a21.h(new wsy());
        a21.a();
        agmi a22 = agmk.a();
        a22.k(1);
        a22.c(true);
        a22.b("conversation_image_parts_view.rcs_expiry_messages");
        a22.h(new wsy());
        a22.a();
        agmi a23 = agmk.a();
        a23.k(4);
        a23.b("conversation_image_parts_view.mms_retrieve_text_messages");
        a23.h(new wsy());
        a23.a();
        agmi a24 = agmk.a();
        a24.k(1);
        a24.b("conversation_image_parts_view.raw_telephony_status_messages");
        a24.h(new wsy());
        a24.a();
        agmi a25 = agmk.a();
        a25.k(1);
        a25.c(true);
        a25.d(true);
        a25.b("conversation_image_parts_view.self_id_messages");
        a25.h(new wsy());
        a25.a();
        agmi a26 = agmk.a();
        a26.k(4);
        a26.c(true);
        a26.b("conversation_image_parts_view.my_identity_messages");
        a26.h(new wsy());
        a26.a();
        agmi a27 = agmk.a();
        a27.k(4);
        a27.c(true);
        a27.d(true);
        a27.g(new shg(20));
        a27.b("conversation_image_parts_view.my_identity_messages");
        a27.h(new wsy());
        a27.a();
        agmi a28 = agmk.a();
        a28.k(1);
        a28.b("conversation_image_parts_view.retry_start_timestamp_messages");
        a28.h(new wsy());
        a28.a();
        agmi a29 = agmk.a();
        a29.k(4);
        a29.c(true);
        a29.b("conversation_image_parts_view.cloud_sync_id_messages");
        a29.h(new wsy());
        a29.a();
        agmi a30 = agmk.a();
        a30.k(7);
        a30.c(true);
        a30.b("conversation_image_parts_view.rcs_message_id_messages");
        a30.e(true);
        a30.h(new wsy());
        a30.a();
        agmi a31 = agmk.a();
        a31.k(4);
        a31.c(true);
        a31.b("conversation_image_parts_view.rcs_message_id_messages");
        a31.e(true);
        a31.h(new wsy());
        a31.a();
        agmi a32 = agmk.a();
        a32.k(1);
        a32.b("conversation_image_parts_view.rcs_encryption_status_messages");
        a32.h(new wsy());
        a32.a();
        agmi a33 = agmk.a();
        a33.k(1);
        a33.b("conversation_image_parts_view.verification_status_messages");
        a33.h(new wsy());
        a33.a();
        agmi a34 = agmk.a();
        a34.k(1);
        a34.b("conversation_image_parts_view.rcs_ui_status_messages");
        a34.h(new wsy());
        a34.a();
        agmi a35 = agmk.a();
        a35.k(1);
        a35.c(true);
        a35.b("conversation_image_parts_view.is_hidden_messages");
        a35.h(new wsy());
        a35.a();
        agmi a36 = agmk.a();
        a36.k(7);
        a36.b("conversation_image_parts_view.rcs_remote_instance_messages");
        a36.h(new wsy());
        a36.a();
        agmi a37 = agmk.a();
        a37.k(1);
        a37.b("conversation_image_parts_view.rcs_file_transfer_session_id_messages");
        a37.h(new wsy());
        a37.a();
        agmi a38 = agmk.a();
        a38.k(1);
        a38.b("conversation_image_parts_view.sms_error_code_messages");
        a38.h(new wsy());
        a38.a();
        agmi a39 = agmk.a();
        a39.k(4);
        a39.b("conversation_image_parts_view.sms_error_desc_map_name_messages");
        a39.h(new wsy());
        a39.a();
        agmi a40 = agmk.a();
        a40.k(4);
        a40.b("conversation_image_parts_view.correlation_id_messages");
        a40.h(new wsy());
        a40.a();
        agmi a41 = agmk.a();
        a41.k(4);
        a41.j(true);
        a41.c(true);
        a41.b("conversation_image_parts_view.cms_id_messages");
        a41.e(true);
        a41.h(new wsy());
        a41.a();
        agmi a42 = agmk.a();
        a42.k(2);
        a42.b("conversation_image_parts_view.cms_last_mod_seq_messages");
        a42.h(new wsy());
        a42.a();
        agmi a43 = agmk.a();
        a43.k(4);
        a43.c(true);
        a43.b("conversation_image_parts_view.web_id_messages");
        a43.h(new wsy());
        a43.a();
        agmi a44 = agmk.a();
        a44.k(1);
        a44.b("conversation_image_parts_view.usage_stats_logging_id_messages");
        a44.h(new wsy());
        a44.a();
        agmi a45 = agmk.a();
        a45.k(1);
        a45.b("conversation_image_parts_view.send_counter_messages");
        a45.h(new wsy());
        a45.a();
        agmi a46 = agmk.a();
        a46.k(4);
        a46.c(true);
        a46.b("conversation_image_parts_view.original_rcs_message_id_messages");
        a46.h(new wsy());
        a46.a();
        agmi a47 = agmk.a();
        a47.k(4);
        a47.b("conversation_image_parts_view.custom_delivery_receipt_mime_type_messages");
        a47.h(new wsy());
        a47.a();
        agmi a48 = agmk.a();
        a48.k(5);
        a48.b("conversation_image_parts_view.custom_delivery_receipt_content_messages");
        a48.h(new wsy());
        a48.a();
        agmi a49 = agmk.a();
        a49.k(1);
        a49.b("conversation_image_parts_view.report_attempt_counter_messages");
        a49.h(new wsy());
        a49.a();
        agmi a50 = agmk.a();
        a50.k(5);
        a50.b("conversation_image_parts_view.custom_headers_messages");
        a50.h(new wsy());
        a50.a();
        agmi a51 = agmk.a();
        a51.k(4);
        a51.j(true);
        a51.c(true);
        a51.b("conversation_image_parts_view.cms_correlation_id_messages");
        a51.e(true);
        a51.h(new wsy());
        a51.a();
        agmi a52 = agmk.a();
        a52.k(1);
        a52.c(true);
        a52.d(true);
        a52.g(new shg(16));
        a52.b("conversation_image_parts_view.group_private_participant_messages");
        a52.h(new wsy());
        a52.a();
        agmi a53 = agmk.a();
        a53.k(1);
        a53.c(true);
        a53.d(true);
        a53.g(new shg(17));
        a53.b("conversation_image_parts_view.original_message_id_messages");
        a53.h(new wsy());
        a53.a();
        agmi a54 = agmk.a();
        a54.k(1);
        a54.b("conversation_image_parts_view.awaiting_reverse_sync_messages");
        a54.h(new wsy());
        a54.a();
        agmi a55 = agmk.a();
        a55.k(4);
        a55.b("conversation_image_parts_view.old_sms_message_uri_messages");
        a55.h(new wsy());
        a55.a();
        agmi a56 = agmk.a();
        a56.k(4);
        a56.j(true);
        a56.c(true);
        a56.b("conversation_image_parts_view.draft_id_messages");
        a56.e(true);
        a56.h(new wsy());
        a56.a();
        agmi a57 = agmk.a();
        a57.k(1);
        a57.b("conversation_image_parts_view.result_code_messages");
        a57.h(new wsy());
        a57.a();
        agmi a58 = agmk.a();
        a58.k(1);
        a58.b("conversation_image_parts_view.cms_life_cycle_messages");
        a58.h(new wsy());
        a58.a();
        agmi a59 = agmk.a();
        a59.k(1);
        a59.b("conversation_image_parts_view.fallback_reason_messages");
        a59.h(new wsy());
        a59.a();
        agmi a60 = agmk.a();
        a60.k(1);
        a60.b("conversation_image_parts_view.auto_retry_counter_messages");
        a60.h(new wsy());
        a60.a();
        agmi a61 = agmk.a();
        a61.k(2);
        a61.b("conversation_image_parts_view.can_revoke_before_delivered_with_rcs_messages");
        a61.h(new wsy());
        a61.a();
        agmi a62 = agmk.a();
        a62.k(5);
        a62.b("conversation_image_parts_view.trace_id_messages");
        a62.h(new wsy());
        a62.a();
        agmi a63 = agmk.a();
        a63.k(1);
        a63.b("conversation_image_parts_view.outgoing_delivery_report_status_messages");
        a63.h(new wsy());
        a63.a();
        agmi a64 = agmk.a();
        a64.k(1);
        a64.b("conversation_image_parts_view.outgoing_read_report_status_messages");
        a64.h(new wsy());
        a64.a();
        agmi a65 = agmk.a();
        a65.k(1);
        a65.b("conversation_image_parts_view.xms_transport_messages");
        a65.h(new wsy());
        a65.a();
        agmi a66 = agmk.a();
        a66.k(1);
        a66.b("conversation_image_parts_view.original_protocol_messages");
        a66.h(new wsy());
        a66.a();
        agmi a67 = agmk.a();
        a67.k(4);
        a67.j(true);
        a67.c(true);
        a67.b("conversation_image_parts_view.satellite_datagram_id_messages");
        a67.e(true);
        a67.h(new wsy());
        a67.a();
        agmi a68 = agmk.a();
        a68.k(1);
        a68.b("conversation_image_parts_view.encryption_protocol_messages");
        a68.h(new wsy());
        a68.a();
        agmi a69 = agmk.a();
        a69.k(4);
        a69.j(true);
        a69.c(true);
        a69.b("conversation_image_parts_view.message_persistence_id_messages");
        a69.e(true);
        a69.h(new wsy());
        a69.a();
        agmi a70 = agmk.a();
        a70.k(4);
        a70.b("conversation_image_parts_view.uri_parts");
        a70.h(new wsy());
        this.a = new sjx(a70.a());
        agmi a71 = agmk.a();
        a71.k(4);
        a71.c(true);
        a71.b("conversation_image_parts_view.content_type_parts");
        a71.h(new wsy());
        this.f = new sjx(a71.a());
        agmi a72 = agmk.a();
        a72.k(4);
        a72.b("conversation_image_parts_view.original_uri_parts");
        a72.h(new wsy());
        this.c = new sjx(a72.a());
        agmi a73 = agmk.a();
        a73.k(2);
        a73.j(true);
        a73.f(true);
        a73.c(true);
        a73.b("conversation_image_parts_view._id_parts");
        a73.h(new wsy());
        a73.a();
        agmi a74 = agmk.a();
        a74.k(1);
        a74.c(true);
        a74.d(true);
        a74.b("conversation_image_parts_view.message_id_parts");
        a74.h(new wsy());
        a74.a();
        agmi a75 = agmk.a();
        a75.k(4);
        a75.b("conversation_image_parts_view.text_parts");
        a75.h(new wsy());
        a75.a();
        agmi a76 = agmk.a();
        a76.k(4);
        a76.b("conversation_image_parts_view.storage_uri_parts");
        a76.h(new wsy());
        a76.a();
        agmi a77 = agmk.a();
        a77.k(1);
        a77.b("conversation_image_parts_view.width_parts");
        a77.h(new wsy());
        a77.a();
        agmi a78 = agmk.a();
        a78.k(1);
        a78.b("conversation_image_parts_view.height_parts");
        a78.h(new wsy());
        a78.a();
        agmi a79 = agmk.a();
        a79.k(1);
        a79.b("conversation_image_parts_view.timestamp_parts");
        a79.h(new wsy());
        a79.a();
        agmi a80 = agmk.a();
        a80.k(4);
        a80.c(true);
        a80.b("conversation_image_parts_view.processing_output_uri_parts");
        a80.h(new wsy());
        a80.a();
        agmi a81 = agmk.a();
        a81.k(1);
        a81.b("conversation_image_parts_view.target_size_parts");
        a81.h(new wsy());
        a81.a();
        agmi a82 = agmk.a();
        a82.k(1);
        a82.b("conversation_image_parts_view.processing_status_parts");
        a82.h(new wsy());
        a82.a();
        agmi a83 = agmk.a();
        a83.k(1);
        a83.b("conversation_image_parts_view.cms_attachment_processing_status_parts");
        a83.h(new wsy());
        a83.a();
        agmi a84 = agmk.a();
        a84.k(1);
        a84.c(true);
        a84.d(true);
        a84.b("conversation_image_parts_view.conversation_id_parts");
        a84.h(new wsy());
        a84.a();
        agmi a85 = agmk.a();
        a85.k(1);
        a85.b("conversation_image_parts_view.sticker_set_id_parts");
        a85.h(new wsy());
        a85.a();
        agmi a86 = agmk.a();
        a86.k(1);
        a86.b("conversation_image_parts_view.sticker_id_parts");
        a86.h(new wsy());
        a86.a();
        agmi a87 = agmk.a();
        a87.k(1);
        a87.b("conversation_image_parts_view.media_modified_timestamp_parts");
        a87.h(new wsy());
        a87.a();
        agmi a88 = agmk.a();
        a88.k(3);
        a88.b("conversation_image_parts_view.longitude_parts");
        a88.h(new wsy());
        a88.a();
        agmi a89 = agmk.a();
        a89.k(3);
        a89.b("conversation_image_parts_view.latitude_parts");
        a89.h(new wsy());
        a89.a();
        agmi a90 = agmk.a();
        a90.k(4);
        a90.b("conversation_image_parts_view.preview_content_uri_parts");
        a90.h(new wsy());
        a90.a();
        agmi a91 = agmk.a();
        a91.k(4);
        a91.c(true);
        a91.b("conversation_image_parts_view.preview_content_type_parts");
        a91.h(new wsy());
        a91.a();
        agmi a92 = agmk.a();
        a92.k(4);
        a92.b("conversation_image_parts_view.fallback_uri_parts");
        a92.h(new wsy());
        a92.a();
        agmi a93 = agmk.a();
        a93.k(1);
        a93.b("conversation_image_parts_view.source_parts");
        a93.h(new wsy());
        a93.a();
        agmi a94 = agmk.a();
        a94.k(1);
        a94.b("conversation_image_parts_view.bundle_index_parts");
        a94.h(new wsy());
        a94.a();
        agmi a95 = agmk.a();
        a95.k(4);
        a95.b("conversation_image_parts_view.blob_id_parts");
        a95.h(new wsy());
        a95.a();
        agmi a96 = agmk.a();
        a96.k(4);
        a96.b("conversation_image_parts_view.blob_gaia_email_parts");
        a96.h(new wsy());
        a96.a();
        agmi a97 = agmk.a();
        a97.k(4);
        a97.b("conversation_image_parts_view.cms_full_size_blob_id_parts");
        a97.h(new wsy());
        a97.a();
        agmi a98 = agmk.a();
        a98.k(5);
        a98.b("conversation_image_parts_view.cms_media_encryption_key_parts");
        a98.h(new wsy());
        a98.a();
        agmi a99 = agmk.a();
        a99.k(5);
        a99.b("conversation_image_parts_view.cms_compressed_media_encryption_key_parts");
        a99.h(new wsy());
        a99.a();
        agmi a100 = agmk.a();
        a100.k(1);
        a100.b("conversation_image_parts_view.blob_upload_permanent_failure_parts");
        a100.h(new wsy());
        a100.a();
        agmi a101 = agmk.a();
        a101.k(1);
        a101.b("conversation_image_parts_view.blob_upload_timestamp_parts");
        a101.h(new wsy());
        a101.a();
        agmi a102 = agmk.a();
        a102.k(4);
        a102.b("conversation_image_parts_view.expressive_sticker_name_parts");
        a102.h(new wsy());
        a102.a();
        agmi a103 = agmk.a();
        a103.k(4);
        a103.b("conversation_image_parts_view.file_name_parts");
        a103.h(new wsy());
        a103.a();
        agmi a104 = agmk.a();
        a104.k(1);
        a104.b("conversation_image_parts_view.duration_parts");
        a104.h(new wsy());
        a104.a();
        agmi a105 = agmk.a();
        a105.k(4);
        a105.b("conversation_image_parts_view.compressed_blob_id_parts");
        a105.h(new wsy());
        a105.a();
        agmi a106 = agmk.a();
        a106.k(4);
        a106.b("conversation_image_parts_view.cms_compressed_blob_id_parts");
        a106.h(new wsy());
        a106.a();
        agmi a107 = agmk.a();
        a107.k(1);
        a107.b("conversation_image_parts_view.compressed_blob_upload_permanent_failure_parts");
        a107.h(new wsy());
        a107.a();
        agmi a108 = agmk.a();
        a108.k(1);
        a108.b("conversation_image_parts_view.compressed_blob_upload_timestamp_parts");
        a108.h(new wsy());
        a108.a();
        agmi a109 = agmk.a();
        a109.k(5);
        a109.b("conversation_image_parts_view.media_encryption_key_parts");
        a109.h(new wsy());
        a109.a();
        agmi a110 = agmk.a();
        a110.k(5);
        a110.b("conversation_image_parts_view.compressed_media_encryption_key_parts");
        a110.h(new wsy());
        a110.a();
        agmi a111 = agmk.a();
        a111.k(5);
        a111.b("conversation_image_parts_view.attachment_upload_response_parts");
        a111.h(new wsy());
        a111.a();
        agmi a112 = agmk.a();
        a112.k(1);
        a112.b("conversation_image_parts_view.missing_entry_in_telephony_parts");
        a112.h(new wsy());
        a112.a();
        agmi a113 = agmk.a();
        a113.k(1);
        a113.b("conversation_image_parts_view.awaiting_reverse_sync_parts");
        a113.h(new wsy());
        a113.a();
        agmi a114 = agmk.a();
        a114.k(1);
        a114.b("conversation_image_parts_view.file_size_bytes_parts");
        a114.h(new wsy());
        a114.a();
        agmi a115 = agmk.a();
        a115.k(4);
        a115.c(true);
        a115.b("conversation_image_parts_view.local_cache_path_parts");
        a115.h(new wsy());
        a115.a();
        agmi a116 = agmk.a();
        a116.k(1);
        a116.b("conversation_image_parts_view.media_send_type_parts");
        a116.h(new wsy());
        a116.a();
        agmi a117 = agmk.a();
        a117.k(5);
        a117.b("conversation_image_parts_view.voice_metadata_parts");
        a117.h(new wsy());
        a117.a();
        agmi a118 = agmk.a();
        a118.k(1);
        a118.b("conversation_image_parts_view.validation_status_parts");
        a118.h(new wsy());
        a118.a();
        agmi a119 = agmk.a();
        a119.k(4);
        a119.b("conversation_image_parts_view.processing_id_parts");
        a119.h(new wsy());
        a119.a();
        agmi a120 = agmk.a();
        a120.k(1);
        a120.b("conversation_image_parts_view.rich_card_media_download_failure_reason_parts");
        a120.h(new wsy());
        a120.a();
        agmi a121 = agmk.a();
        a121.k(1);
        a121.b("conversation_image_parts_view.image_display_state_parts");
        a121.h(new wsy());
        a121.a();
        agmi a122 = agmk.a();
        a122.k(4);
        a122.b("conversation_image_parts_view.display_destination_participants");
        a122.h(new wsy());
        this.g = new sjx(a122.a());
        agmi a123 = agmk.a();
        a123.k(4);
        a123.b("conversation_image_parts_view.full_name_participants");
        a123.h(new wsy());
        this.e = new sjx(a123.a());
        agmi a124 = agmk.a();
        a124.k(2);
        a124.j(true);
        a124.f(true);
        a124.c(true);
        a124.b("conversation_image_parts_view._id_participants");
        a124.h(new wsy());
        a124.a();
        agmi a125 = agmk.a();
        a125.k(4);
        a125.c(true);
        a125.b("conversation_image_parts_view.my_identity_token_participants");
        a125.h(new wsy());
        a125.a();
        agmi a126 = agmk.a();
        a126.k(4);
        a126.c(true);
        a126.d(true);
        a126.g(new shg(18));
        a126.b("conversation_image_parts_view.my_identity_token_foreign_key_participants");
        a126.h(new wsy());
        a126.a();
        agmi a127 = agmk.a();
        a127.k(1);
        a127.c(true);
        a127.b("conversation_image_parts_view.sub_id_participants");
        a127.e(true);
        a127.h(new wsy());
        a127.a();
        agmi a128 = agmk.a();
        a128.k(1);
        a128.b("conversation_image_parts_view.sim_slot_id_participants");
        a128.h(new wsy());
        a128.a();
        agmi a129 = agmk.a();
        a129.k(4);
        a129.c(true);
        a129.b("conversation_image_parts_view.normalized_destination_participants");
        a129.e(true);
        a129.h(new wsy());
        a129.a();
        agmi a130 = agmk.a();
        a130.k(4);
        a130.b("conversation_image_parts_view.send_destination_participants");
        a130.h(new wsy());
        a130.a();
        agmi a131 = agmk.a();
        a131.k(4);
        a131.j(true);
        a131.c(true);
        a131.b("conversation_image_parts_view.comparable_destination_participants");
        a131.e(true);
        a131.h(new wsy());
        a131.a();
        agmi a132 = agmk.a();
        a132.k(4);
        a132.b("conversation_image_parts_view.country_code_participants");
        a132.h(new wsy());
        a132.a();
        agmi a133 = agmk.a();
        a133.k(2);
        a133.j(true);
        a133.c(true);
        a133.b("conversation_image_parts_view.recipient_id_participants");
        a133.e(true);
        a133.h(new wsy());
        a133.a();
        agmi a134 = agmk.a();
        a134.k(4);
        a134.b("conversation_image_parts_view.recipient_canonical_address_participants");
        a134.h(new wsy());
        a134.a();
        agmi a135 = agmk.a();
        a135.k(4);
        a135.b("conversation_image_parts_view.first_name_participants");
        a135.h(new wsy());
        a135.a();
        agmi a136 = agmk.a();
        a136.k(4);
        a136.b("conversation_image_parts_view.profile_photo_uri_participants");
        a136.h(new wsy());
        a136.a();
        agmi a137 = agmk.a();
        a137.k(4);
        a137.b("conversation_image_parts_view.contact_photo_uri_participants");
        a137.h(new wsy());
        a137.a();
        agmi a138 = agmk.a();
        a138.k(1);
        a138.b("conversation_image_parts_view.contact_id_participants");
        a138.h(new wsy());
        a138.a();
        agmi a139 = agmk.a();
        a139.k(4);
        a139.b("conversation_image_parts_view.lookup_key_participants");
        a139.h(new wsy());
        a139.a();
        agmi a140 = agmk.a();
        a140.k(1);
        a140.b("conversation_image_parts_view.color_palette_index_participants");
        a140.h(new wsy());
        a140.a();
        agmi a141 = agmk.a();
        a141.k(1);
        a141.b("conversation_image_parts_view.color_type_participants");
        a141.h(new wsy());
        a141.a();
        agmi a142 = agmk.a();
        a142.k(1);
        a142.b("conversation_image_parts_view.extended_color_participants");
        a142.h(new wsy());
        a142.a();
        agmi a143 = agmk.a();
        a143.k(1);
        a143.b("conversation_image_parts_view.blocked_participants");
        a143.h(new wsy());
        a143.a();
        agmi a144 = agmk.a();
        a144.k(4);
        a144.b("conversation_image_parts_view.subscription_name_participants");
        a144.h(new wsy());
        a144.a();
        agmi a145 = agmk.a();
        a145.k(1);
        a145.b("conversation_image_parts_view.subscription_color_participants");
        a145.h(new wsy());
        a145.a();
        agmi a146 = agmk.a();
        a146.k(4);
        a146.b("conversation_image_parts_view.contact_destination_participants");
        a146.h(new wsy());
        a146.a();
        agmi a147 = agmk.a();
        a147.k(1);
        a147.b("conversation_image_parts_view.participant_type_participants");
        a147.h(new wsy());
        a147.a();
        agmi a148 = agmk.a();
        a148.k(1);
        a148.b("conversation_image_parts_view.video_reachability_participants");
        a148.h(new wsy());
        a148.a();
        agmi a149 = agmk.a();
        a149.k(4);
        a149.b("conversation_image_parts_view.alias_participants");
        a149.h(new wsy());
        a149.a();
        agmi a150 = agmk.a();
        a150.k(1);
        a150.b("conversation_image_parts_view.is_spam_participants");
        a150.h(new wsy());
        a150.a();
        agmi a151 = agmk.a();
        a151.k(1);
        a151.b("conversation_image_parts_view.is_rcs_available_participants");
        a151.h(new wsy());
        a151.a();
        agmi a152 = agmk.a();
        a152.k(1);
        a152.b("conversation_image_parts_view.is_spam_source_participants");
        a152.h(new wsy());
        a152.a();
        agmi a153 = agmk.a();
        a153.k(4);
        a153.j(true);
        a153.c(true);
        a153.b("conversation_image_parts_view.cms_id_participants");
        a153.e(true);
        a153.h(new wsy());
        a153.a();
        agmi a154 = agmk.a();
        a154.k(1);
        a154.b("conversation_image_parts_view.latest_verification_status_participants");
        a154.h(new wsy());
        a154.a();
        agmi a155 = agmk.a();
        a155.k(4);
        a155.b("conversation_image_parts_view.profile_photo_blob_id_participants");
        a155.h(new wsy());
        a155.a();
        agmi a156 = agmk.a();
        a156.k(5);
        a156.b("conversation_image_parts_view.profile_photo_encryption_key_participants");
        a156.h(new wsy());
        a156.a();
        agmi a157 = agmk.a();
        a157.k(1);
        a157.b("conversation_image_parts_view.directory_id_participants");
        a157.h(new wsy());
        a157.a();
        agmi a158 = agmk.a();
        a158.k(1);
        a158.b("conversation_image_parts_view.is_check_constraint_enabled_via_phenotype_participants");
        a158.h(new wsy());
        a158.a();
        agmi a159 = agmk.a();
        a159.k(1);
        a159.b("conversation_image_parts_view.is_valid_phone_number_data_participants");
        a159.h(new wsy());
        a159.a();
        agmi a160 = agmk.a();
        a160.k(2);
        a160.c(true);
        a160.d(true);
        a160.g(new shg(19));
        a160.b("conversation_image_parts_view.duplicate_of_participants");
        a160.h(new wsy());
        a160.a();
        agmi a161 = agmk.a();
        a161.k(1);
        a161.b("conversation_image_parts_view.cms_life_cycle_participants");
        a161.h(new wsy());
        a161.a();
        agmi a162 = agmk.a();
        a162.k(1);
        a162.b("conversation_image_parts_view.norm_ui_status_participants");
        a162.h(new wsy());
        a162.a();
        agmi a163 = agmk.a();
        a163.k(4);
        a163.b("conversation_image_parts_view.last_modified_by_key_participants");
        a163.h(new wsy());
        a163.a();
        agmi a164 = agmk.a();
        a164.k(1);
        a164.b("conversation_image_parts_view.name_source_participants");
        a164.h(new wsy());
        a164.a();
        agmi a165 = agmk.a();
        a165.k(1);
        a165.b("conversation_image_parts_view.photo_source_participants");
        a165.h(new wsy());
        a165.a();
        agmi a166 = agmk.a();
        a166.k(1);
        a166.b("conversation_image_parts_view.profile_photo_user_preference_participants");
        a166.h(new wsy());
        a166.a();
        agmi a167 = agmk.a();
        a167.k(5);
        a167.b("conversation_image_parts_view.contact_metadata_participants");
        a167.h(new wsy());
        a167.a();
    }

    public jat(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_participants._id";
        a.c = new wsy();
        skw skwVar = new skw(a.a());
        this.c = skwVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.c(true);
        a2.d(true);
        a2.a = "conversation_participants.conversation_id";
        a2.e(true);
        a2.c = new wsy();
        skw skwVar2 = new skw(a2.a());
        this.d = skwVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.c(true);
        a3.d(true);
        a3.a = "conversation_participants.participant_id";
        a3.e(true);
        a3.c = new wsy();
        skw skwVar3 = new skw(a3.a());
        this.e = skwVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.c(true);
        a4.a = "conversation_participants.is_normalized";
        a4.e(true);
        a4.c = new wsy();
        skw skwVar4 = new skw(a4.a());
        this.b = skwVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "conversation_participants.rcs_group_join_status";
        a5.c = new wsy();
        skw skwVar5 = new skw(a5.a());
        this.f = skwVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "conversation_participants.last_modified_by_key";
        a6.c = new wsy();
        skw skwVar6 = new skw(a6.a());
        this.g = skwVar6;
        this.a = new skw[]{skwVar, skwVar2, skwVar3, skwVar4, skwVar5, skwVar6};
    }

    public jat(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_status._id";
        a.c = new wsy();
        sxf sxfVar = new sxf(a.a());
        this.c = sxfVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "message_status.message_id";
        a2.c = new wsy();
        sxf sxfVar2 = new sxf(a2.a());
        this.g = sxfVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "message_status.timestamp";
        a3.c = new wsy();
        sxf sxfVar3 = new sxf(a3.a());
        this.f = sxfVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "message_status.status";
        a4.c = new wsy();
        sxf sxfVar4 = new sxf(a4.a());
        this.e = sxfVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "message_status.custom_status";
        a5.c = new wsy();
        sxf sxfVar5 = new sxf(a5.a());
        this.d = sxfVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "message_status.data";
        a6.c = new wsy();
        sxf sxfVar6 = new sxf(a6.a());
        this.b = sxfVar6;
        this.a = new sxf[]{sxfVar, sxfVar2, sxfVar3, sxfVar4, sxfVar5, sxfVar6};
    }

    public jat(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "modified_by._id";
        a.c = new wsy();
        sye syeVar = new sye(a.a());
        this.c = syeVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.i(true);
        a2.c(true);
        a2.a = "modified_by.am_version_code";
        a2.e(true);
        a2.c = new wsy();
        sye syeVar2 = new sye(a2.a());
        this.d = syeVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.i(true);
        a3.a = "modified_by.stack_trace_hash";
        a3.e(true);
        a3.c = new wsy();
        sye syeVar3 = new sye(a3.a());
        this.e = syeVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.i(true);
        a4.a = "modified_by.source";
        a4.c = new wsy();
        sye syeVar4 = new sye(a4.a());
        this.b = syeVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "modified_by.tiktok_trace";
        a5.c = new wsy();
        sye syeVar5 = new sye(a5.a());
        this.f = syeVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "modified_by.stack_trace";
        a6.c = new wsy();
        sye syeVar6 = new sye(a6.a());
        this.g = syeVar6;
        this.a = new sye[]{syeVar, syeVar2, syeVar3, syeVar4, syeVar5, syeVar6};
    }
}
