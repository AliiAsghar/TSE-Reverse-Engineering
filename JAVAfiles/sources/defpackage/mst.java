package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mst implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ mst(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_incoming_ftd_processor_v2", "bugle"));
            case 1:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_sent_message_processor", "bugle"));
            case 2:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_forward_sync_batch_executor", "bugle"));
            case 3:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_is_emergency_phone_number", "bugle"));
            case 4:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_send_message_action", "bugle"));
            case 5:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_participant_list_item_data", "bugle"));
            case 6:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_update_message_verification_status_work_helper", "bugle"));
            case 7:
                return Boolean.valueOf(anfi.a("bugle.use_legacy_normalized_destination_in_participant_creation", "bugle"));
            case 8:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_contact_manipulation", "bugle"));
            case 9:
                return Boolean.valueOf(anfi.a("bugle.use_mi_in_insert_rcs_message_in_telephony_action", "bugle"));
            case 10:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_as_canonical_for_self", "bugle"));
            case 11:
                return Boolean.valueOf(anfi.a("bugle.enable_chat_endpoint_and_messaging_identity_in_shared_net", "bugle"));
            case 12:
                return Boolean.valueOf(anfi.a("bugle.replace_is_valid_e164_number_by_mi", "bugle"));
            case 13:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_sim_messages_data", "bugle"));
            case 14:
                return Boolean.valueOf(anfi.a("bugle.replace_normalized_destination_with_mi_in_convo_msg_data", "bugle"));
            case 15:
                return false;
            case 16:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_phone_number_preference", "bugle"));
            case 17:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_as_canonical_by_sim_country", "bugle"));
            case 18:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_v_card_request", "bugle"));
            case 19:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_conversation_helper", "bugle"));
            default:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_tachygram", "bugle"));
        }
    }
}
