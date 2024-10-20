package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sqi implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sqi(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "_id:".concat(String.valueOf(((sqj) this.a).getString(0)));
            case 1:
                return "data:".concat(String.valueOf(((spy) this.a).getString(3)));
            case 2:
                return "flagged_message_id:".concat(String.valueOf(((sqj) this.a).getString(1)));
            case 3:
                return "flagging_reason:".concat(String.valueOf(((sqj) this.a).getString(2)));
            case 4:
                return "flagged_message_timestamp:".concat(String.valueOf(((sqj) this.a).getString(3)));
            case 5:
                return "flagged_message_notified:".concat(String.valueOf(((sqj) this.a).getString(4)));
            case 6:
                return "conversation_id:".concat(String.valueOf(((sqs) this.a).getString(0)));
            case 7:
                return "my_identity_token:".concat(String.valueOf(((sqs) this.a).getString(1)));
            case 8:
                return "gemini_conversation_id:".concat(String.valueOf(((sqs) this.a).getString(2)));
            case 9:
                return "conversation_id:".concat(String.valueOf(((sqy) this.a).getString(0)));
            case 10:
                return "desired_gemini_state:".concat(String.valueOf(((sqy) this.a).getString(1)));
            case 11:
                return "_id:".concat(String.valueOf(((srg) this.a).getString(0)));
            case 12:
                return "trigger_name:".concat(String.valueOf(((srg) this.a).getString(9)));
            case 13:
                return "enqueued_timestamp:".concat(String.valueOf(((srg) this.a).getString(10)));
            case 14:
                return "worker_type:".concat(String.valueOf(((srg) this.a).getString(1)));
            case 15:
                return "item_table_type:".concat(String.valueOf(((srg) this.a).getString(2)));
            case 16:
                return "item_id:".concat(String.valueOf(((srg) this.a).getString(3)));
            case 17:
                return "account_id:".concat(String.valueOf(((srg) this.a).getString(4)));
            case 18:
                return "in_flight:".concat(String.valueOf(((srg) this.a).getString(5)));
            case 19:
                return "retry_count:".concat(String.valueOf(((srg) this.a).getString(6)));
            default:
                return "flags:".concat(String.valueOf(((srg) this.a).getString(7)));
        }
    }
}
