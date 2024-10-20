package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class srt implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ srt(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "_id:".concat(String.valueOf(((sru) this.a).getString(0)));
            case 1:
                return "next_execute_timestamp:".concat(String.valueOf(((srg) this.a).getString(8)));
            case 2:
                return "conversation_id:".concat(String.valueOf(((sru) this.a).getString(1)));
            case 3:
                return "business_id:".concat(String.valueOf(((sru) this.a).getString(2)));
            case 4:
                return "lighter_conversation_id_json:".concat(String.valueOf(((sru) this.a).getString(3)));
            case 5:
                return "read:".concat(String.valueOf(((sru) this.a).getString(4)));
            case 6:
                return "is_last_message_outgoing:".concat(String.valueOf(((sru) this.a).getString(5)));
            case 7:
                return "conversation_status:".concat(String.valueOf(((sru) this.a).getString(6)));
            case 8:
                return "last_action_timestamp:".concat(String.valueOf(((sru) this.a).getString(7)));
            case 9:
                return "sync_timestamp_ms:".concat(String.valueOf(((sru) this.a).getString(8)));
            case 10:
                return "_id:".concat(String.valueOf(((ssc) this.a).getString(0)));
            case 11:
                return "participant_id:".concat(String.valueOf(((ssc) this.a).getString(1)));
            case 12:
                return "manual_link_preview_count:".concat(String.valueOf(((ssc) this.a).getString(2)));
            case 13:
                return "_id:".concat(String.valueOf(((ssm) this.a).getString(0)));
            case 14:
                return "link_preview_prevented:".concat(String.valueOf(((ssm) this.a).getString(9)));
            case 15:
                return "link_preview_failed:".concat(String.valueOf(((ssm) this.a).getString(10)));
            case 16:
                return "message_id:".concat(String.valueOf(((ssm) this.a).getString(1)));
            case 17:
                return "trigger_url:".concat(String.valueOf(((ssm) this.a).getString(2)));
            case 18:
                return "expiration_time_millis:".concat(String.valueOf(((ssm) this.a).getString(3)));
            case 19:
                return "link_title:".concat(String.valueOf(((ssm) this.a).getString(4)));
            default:
                return "link_description:".concat(String.valueOf(((ssm) this.a).getString(5)));
        }
    }
}
