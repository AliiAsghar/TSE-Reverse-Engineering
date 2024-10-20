package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sfi implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sfi(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "_id:".concat(String.valueOf(((sfj) this.a).getString(0)));
            case 1:
                return "last_action_timestamp:".concat(String.valueOf(((sfb) this.a).getString(3)));
            case 2:
                return "conversation_id:".concat(String.valueOf(((sfj) this.a).getString(1)));
            case 3:
                return "banner_status:".concat(String.valueOf(((sfj) this.a).getString(2)));
            case 4:
                return "_id:".concat(String.valueOf(((sft) this.a).getString(0)));
            case 5:
                return "table_name:".concat(String.valueOf(((sft) this.a).getString(1)));
            case 6:
                return "backup_id:".concat(String.valueOf(((sft) this.a).getString(2)));
            case 7:
                return "bugle_id:".concat(String.valueOf(((sft) this.a).getString(3)));
            case 8:
                return "status:".concat(String.valueOf(((sft) this.a).getString(4)));
            case 9:
                return "_id:".concat(String.valueOf(((sgc) this.a).getString(0)));
            case 10:
                return "conversation_id:".concat(String.valueOf(((sgc) this.a).getString(1)));
            case 11:
                return "chatbot_directory_conversation_state:".concat(String.valueOf(((sgc) this.a).getString(2)));
            case 12:
                return "conversation_stop_state:".concat(String.valueOf(((sgc) this.a).getString(3)));
            case 13:
                return "conversation_toolstone_state:".concat(String.valueOf(((sgc) this.a).getString(4)));
            case 14:
                return "conversation_toolstone_timestamp_ms:".concat(String.valueOf(((sgc) this.a).getString(5)));
            case 15:
                return "_id:".concat(String.valueOf(((sgl) this.a).getString(0)));
            case 16:
                return "dependent_id:".concat(String.valueOf(((sgl) this.a).getString(1)));
            case 17:
                return "dependency_id:".concat(String.valueOf(((sgl) this.a).getString(2)));
            case 18:
                return "inserted_at_timestamp:".concat(String.valueOf(((sgl) this.a).getString(3)));
            case 19:
                return "_id:".concat(String.valueOf(((sgs) this.a).getString(0)));
            default:
                return "message_id:".concat(String.valueOf(((sgs) this.a).getString(1)));
        }
    }
}
