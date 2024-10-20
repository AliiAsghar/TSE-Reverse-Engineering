package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sgz implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sgz(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "_id:".concat(String.valueOf(((sha) this.a).getString(0)));
            case 1:
                return "blob_id:".concat(String.valueOf(((sgs) this.a).getString(2)));
            case 2:
                return "backup_dependency_table_type:".concat(String.valueOf(((sha) this.a).getString(9)));
            case 3:
                return "backup_dependency_bugle_id:".concat(String.valueOf(((sha) this.a).getString(10)));
            case 4:
                return "cms_id:".concat(String.valueOf(((sha) this.a).getString(1)));
            case 5:
                return "cms_data_type:".concat(String.valueOf(((sha) this.a).getString(2)));
            case 6:
                return "abandoned_action:".concat(String.valueOf(((sha) this.a).getString(3)));
            case 7:
                return "failure_reason:".concat(String.valueOf(((sha) this.a).getString(4)));
            case 8:
                return "bugle_table_type:".concat(String.valueOf(((sha) this.a).getString(5)));
            case 9:
                return "bugle_id:".concat(String.valueOf(((sha) this.a).getString(6)));
            case 10:
                return "cms_backup_parameters:".concat(String.valueOf(((sha) this.a).getString(7)));
            case 11:
                return "backup_flags:".concat(String.valueOf(((sha) this.a).getString(8)));
            case 12:
                return "_id:".concat(String.valueOf(((shk) this.a).getString(0)));
            case 13:
                return "message_id:".concat(String.valueOf(((shk) this.a).getString(1)));
            case 14:
                return "conversation_id:".concat(String.valueOf(((shk) this.a).getString(2)));
            case 15:
                return "message_deletion_reason:".concat(String.valueOf(((shk) this.a).getString(3)));
            case 16:
                return "deletion_timestamp:".concat(String.valueOf(((shk) this.a).getString(4)));
            case 17:
                return "_id:".concat(String.valueOf(((shv) this.a).getString(0)));
            case 18:
                return "message_cms_id:".concat(String.valueOf(((shv) this.a).getString(1)));
            case 19:
                return "blob_id:".concat(String.valueOf(((shv) this.a).getString(2)));
            default:
                return "blob_type:".concat(String.valueOf(((shv) this.a).getString(3)));
        }
    }
}
