package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rma implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ rma(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "reactions_data:".concat(String.valueOf(((rmb) this.a).getString(2)));
            case 1:
                return "message_id:".concat(String.valueOf(((rmb) this.a).getString(1)));
            case 2:
                return "reacted_message_id:".concat(String.valueOf(((rmb) this.a).getString(3)));
            case 3:
                return "reaction:".concat(String.valueOf(((rmb) this.a).getString(4)));
            case 4:
                return "applied_reaction:".concat(String.valueOf(((rmb) this.a).getString(5)));
            case 5:
                return "message_id:".concat(String.valueOf(((rml) this.a).getString(0)));
            case 6:
                return "replied_to_message_id:".concat(String.valueOf(((rml) this.a).getString(1)));
            case 7:
                return "replied_to_message_id_null_reason:".concat(String.valueOf(((rml) this.a).getString(2)));
            case 8:
                return "replied_to_rcs_message_id:".concat(String.valueOf(((rml) this.a).getString(3)));
            case 9:
                return "_id:".concat(String.valueOf(((swz) this.a).getString(0)));
            case 10:
                return "message_id:".concat(String.valueOf(((swz) this.a).getString(1)));
            case 11:
                return "_id:".concat(String.valueOf(((rnh) this.a).getString(0)));
            case 12:
                return "sms_error_code:".concat(String.valueOf(((rnh) this.a).getString(19)));
            case 13:
                return "message_persistence_id:".concat(String.valueOf(((rnh) this.a).getString(1)));
            case 14:
                return "sms_error_desc_map_name:".concat(String.valueOf(((rnh) this.a).getString(20)));
            case 15:
                return "mms_transaction_id:".concat(String.valueOf(((rnh) this.a).getString(21)));
            case 16:
                return "mms_content_location:".concat(String.valueOf(((rnh) this.a).getString(22)));
            case 17:
                return "is_hidden:".concat(String.valueOf(((rnh) this.a).getString(23)));
            case 18:
                return "rcs_message_id:".concat(String.valueOf(((rnh) this.a).getString(24)));
            case 19:
                return "custom_headers:".concat(String.valueOf(((rnh) this.a).getString(25)));
            default:
                return "cms_id:".concat(String.valueOf(((rnh) this.a).getString(26)));
        }
    }
}
