package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tii implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tii(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "backup_database_metadata:".concat(String.valueOf(((tij) this.a).getString(6)));
            case 1:
                return "finish_time:".concat(String.valueOf(((tij) this.a).getString(5)));
            case 2:
                return "initial_messages_version:".concat(String.valueOf(((tij) this.a).getString(7)));
            case 3:
                return "status_timestamp:".concat(String.valueOf(((tij) this.a).getString(8)));
            case 4:
                return "last_attachment_request_timestamp:".concat(String.valueOf(((tij) this.a).getString(9)));
            case 5:
                return "_id:".concat(String.valueOf(((tis) this.a).getString(0)));
            case 6:
                return "workflow_execution_id:".concat(String.valueOf(((tis) this.a).getString(1)));
            case 7:
                return "backup_file:".concat(String.valueOf(((tis) this.a).getString(2)));
            case 8:
                return "file_type:".concat(String.valueOf(((tis) this.a).getString(3)));
            case 9:
                return "status:".concat(String.valueOf(((tis) this.a).getString(4)));
            case 10:
                return "key:".concat(String.valueOf(((tjd) this.a).getString(0)));
            case 11:
                return "backup_id:".concat(String.valueOf(((tjd) this.a).getString(1)));
            case 12:
                return "bugle_id:".concat(String.valueOf(((tjd) this.a).getString(2)));
            case 13:
                return "which_database:".concat(String.valueOf(((tjm) this.a).getString(0)));
            case 14:
                return "participant_id:".concat(String.valueOf(((tjm) this.a).getString(1)));
            case 15:
                return "destination_suffix:".concat(String.valueOf(((tjm) this.a).getString(2)));
            case 16:
                return "which_database:".concat(String.valueOf(((tju) this.a).getString(0)));
            case 17:
                return "message_id:".concat(String.valueOf(((tju) this.a).getString(1)));
            case 18:
                return "timestamp_in_seconds:".concat(String.valueOf(((tju) this.a).getString(2)));
            case 19:
                return "timestamp_mod_1000:".concat(String.valueOf(((tju) this.a).getString(3)));
            default:
                return "message_id:".concat(String.valueOf(((tkc) this.a).getString(0)));
        }
    }
}
