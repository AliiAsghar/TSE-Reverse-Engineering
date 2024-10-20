package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class szh implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ szh(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "rejection_reason:".concat(String.valueOf(((szi) this.a).getString(5)));
            case 1:
                return "reply_mode:".concat(String.valueOf(((szi) this.a).getString(4)));
            case 2:
                return "action_source:".concat(String.valueOf(((szi) this.a).getString(6)));
            case 3:
                return "num_of_items:".concat(String.valueOf(((szi) this.a).getString(7)));
            case 4:
                return "_id:".concat(String.valueOf(((szp) this.a).getString(0)));
            case 5:
                return "target_message_id:".concat(String.valueOf(((szp) this.a).getString(1)));
            case 6:
                return "generated_timestamp:".concat(String.valueOf(((szp) this.a).getString(2)));
            case 7:
                return "suggestion:".concat(String.valueOf(((szp) this.a).getString(3)));
            case 8:
                return "smart_suggestion_type:".concat(String.valueOf(((szp) this.a).getString(4)));
            case 9:
                return "suggestion_status:".concat(String.valueOf(((szp) this.a).getString(5)));
            case 10:
                return "consumption_state:".concat(String.valueOf(((szp) this.a).getString(6)));
            case 11:
                return "conversation_id:".concat(String.valueOf(((szx) this.a).getString(0)));
            case 12:
                return "_id:".concat(String.valueOf(((taj) this.a).getString(0)));
            case 13:
                return "contact_id:".concat(String.valueOf(((taj) this.a).getString(19)));
            case 14:
                return "operation_datetime:".concat(String.valueOf(((taj) this.a).getString(1)));
            case 15:
                return "lookup_key:".concat(String.valueOf(((taj) this.a).getString(20)));
            case 16:
                return "color_palette_index:".concat(String.valueOf(((taj) this.a).getString(21)));
            case 17:
                return "color_type:".concat(String.valueOf(((taj) this.a).getString(22)));
            case 18:
                return "extended_color:".concat(String.valueOf(((taj) this.a).getString(23)));
            case 19:
                return "blocked:".concat(String.valueOf(((taj) this.a).getString(24)));
            default:
                return "subscription_name:".concat(String.valueOf(((taj) this.a).getString(25)));
        }
    }
}
