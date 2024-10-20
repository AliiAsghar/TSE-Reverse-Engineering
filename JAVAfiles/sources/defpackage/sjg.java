package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sjg implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sjg(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "type_label:".concat(String.valueOf(((sjh) this.a).getString(16)));
            case 1:
                return "contact_type:".concat(String.valueOf(((sjh) this.a).getString(15)));
            case 2:
                return "display_destination:".concat(String.valueOf(((sjh) this.a).getString(17)));
            case 3:
                return "contact_id:".concat(String.valueOf(((sjh) this.a).getString(1)));
            case 4:
                return "_id:".concat(String.valueOf(((sjp) this.a).getString(0)));
            case 5:
                return "conversation_id:".concat(String.valueOf(((sjp) this.a).getString(1)));
            case 6:
                return "classification_type:".concat(String.valueOf(((sjp) this.a).getString(2)));
            case 7:
                return "classification_state:".concat(String.valueOf(((sjp) this.a).getString(3)));
            case 8:
                return "date:".concat(String.valueOf(((sjp) this.a).getString(4)));
            case 9:
                return "impression_count:".concat(String.valueOf(((sjp) this.a).getString(5)));
            case 10:
                return "generated_timestamp:".concat(String.valueOf(((sjp) this.a).getString(6)));
            case 11:
                return "_id:".concat(String.valueOf(((skh) this.a).getString(0)));
            case 12:
                return "read:".concat(String.valueOf(((skh) this.a).getString(8)));
            case 13:
                return "received_timestamp:".concat(String.valueOf(((skh) this.a).getString(9)));
            case 14:
                return "message_protocol:".concat(String.valueOf(((skh) this.a).getString(10)));
            case 15:
                return "raw_telephony_status:".concat(String.valueOf(((skh) this.a).getString(11)));
            case 16:
                return "conversation_id:".concat(String.valueOf(((skh) this.a).getString(1)));
            case 17:
                return "label:".concat(String.valueOf(((skh) this.a).getString(2)));
            case 18:
                return "message_id:".concat(String.valueOf(((skh) this.a).getString(3)));
            case 19:
                return "snippet_text:".concat(String.valueOf(((skh) this.a).getString(4)));
            default:
                return "preview_uri:".concat(String.valueOf(((skh) this.a).getString(5)));
        }
    }
}
