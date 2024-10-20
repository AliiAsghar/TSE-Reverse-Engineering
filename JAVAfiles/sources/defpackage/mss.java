package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mss implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ mss(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_conversation_list_item_data", "bugle"));
            case 1:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_hidden_contacts", "bugle"));
            case 2:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_as_other_participant_phone_number", "bugle"));
            case 3:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_convo_msg_data", "bugle"));
            case 4:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_verified_sms_key_service", "bugle"));
            case 5:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_receive_cloud_sync_message_action", "bugle"));
            case 6:
                return Boolean.valueOf(anfi.a("bugle.enable_chat_endpoint_in_encrypted_file_receiver_sender_v2", "bugle"));
            case 7:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_video_calling_impl", "bugle"));
            case 8:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_bugle_recipient_entry", "bugle"));
            case 9:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_national_emergency_util", "bugle"));
            case 10:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_process_file_transfer_action", "bugle"));
            case 11:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_bugle_rcs_contacts_service_impl", "bugle"));
            case 12:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_sim_selection_settings_data", "bugle"));
            case 13:
                return Boolean.valueOf(anfi.a("bugle.enable_fix_of_normalized_destination_in_mi", "bugle"));
            case 14:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_wearable_bind_service", "bugle"));
            case 15:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_receive_sms_message_helper_v2", "bugle"));
            case 16:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_contact_util", "bugle"));
            case 17:
                return Boolean.valueOf(anfi.a("bugle.enable_chat_endpoint_and_messaging_identity_in_etouffee", "bugle"));
            case 18:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_sync_message_batch", "bugle"));
            case 19:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_as_self_number", "bugle"));
            default:
                return Boolean.valueOf(anfi.a("bugle.replace_self_normalized_numbers_with_self_messaging_identities", "bugle"));
        }
    }
}
