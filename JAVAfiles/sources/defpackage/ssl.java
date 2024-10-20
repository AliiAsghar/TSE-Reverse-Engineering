package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ssl implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ ssl(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "link_domain:".concat(String.valueOf(((ssm) this.a).getString(7)));
            case 1:
                return "link_image_url:".concat(String.valueOf(((ssm) this.a).getString(6)));
            case 2:
                return "link_canonical_url:".concat(String.valueOf(((ssm) this.a).getString(8)));
            case 3:
                return "account_id:".concat(String.valueOf(((ssy) this.a).getString(0)));
            case 4:
                return "_id:".concat(String.valueOf(((stf) this.a).getString(0)));
            case 5:
                return "conversation_id:".concat(String.valueOf(((stf) this.a).getString(1)));
            case 6:
                return "message_id:".concat(String.valueOf(((stf) this.a).getString(2)));
            case 7:
                return "annotation_type:".concat(String.valueOf(((stf) this.a).getString(3)));
            case 8:
                return "annotation_details:".concat(String.valueOf(((stf) this.a).getString(4)));
            case 9:
                return "message_id:".concat(String.valueOf(((sto) this.a).getString(0)));
            case 10:
                return "caption:".concat(String.valueOf(((sto) this.a).getString(1)));
            case 11:
                return "_id:".concat(String.valueOf(((stw) this.a).getString(0)));
            case 12:
                return "message_id:".concat(String.valueOf(((stw) this.a).getString(1)));
            case 13:
                return "classification_type:".concat(String.valueOf(((stw) this.a).getString(2)));
            case 14:
                return "classification_details:".concat(String.valueOf(((stw) this.a).getString(3)));
            case 15:
                return "_id:".concat(String.valueOf(((sue) this.a).getString(0)));
            case 16:
                return "message_send_receive_attempt_id:".concat(String.valueOf(((sue) this.a).getString(1)));
            case 17:
                return "message_destination_type:".concat(String.valueOf(((sue) this.a).getString(2)));
            case 18:
                return "message_destination_raw:".concat(String.valueOf(((sue) this.a).getString(3)));
            case 19:
                return "message_id:".concat(String.valueOf(((sun) this.a).getString(0)));
            default:
                return "latest_message_id:".concat(String.valueOf(((sun) this.a).getString(1)));
        }
    }
}
