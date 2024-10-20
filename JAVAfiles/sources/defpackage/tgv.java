package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tgv implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tgv(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "is_updated_at_hash_valid:".concat(String.valueOf(((tgw) this.a).getString(8)));
            case 1:
                return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(((tgw) this.a).getString(7)));
            case 2:
                return "tachyon_registration_id:".concat(String.valueOf(((thf) this.a).getString(0)));
            case 3:
                return "etouffee:".concat(String.valueOf(((thf) this.a).getString(1)));
            case 4:
                return "better_etouffee:".concat(String.valueOf(((thf) this.a).getString(2)));
            case 5:
                return "messages_feature_hash:".concat(String.valueOf(((thf) this.a).getString(3)));
            case 6:
                return "last_modified_timestamp:".concat(String.valueOf(((thf) this.a).getString(4)));
            case 7:
                return "identity_key:".concat(String.valueOf(((thf) this.a).getString(5)));
            case 8:
                return "updated_at_hash:".concat(String.valueOf(((thf) this.a).getString(6)));
            case 9:
                return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(((thf) this.a).getString(7)));
            case 10:
                return "is_updated_at_hash_valid:".concat(String.valueOf(((thf) this.a).getString(8)));
            case 11:
                return "remote_user_id:".concat(String.valueOf(((tho) this.a).getString(0)));
            case 12:
                return "last_modified_timestamp:".concat(String.valueOf(((tho) this.a).getString(1)));
            case 13:
                return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(((tho) this.a).getString(2)));
            case 14:
                return "remote_user_id:".concat(String.valueOf(((thx) this.a).getString(0)));
            case 15:
                return "tachyon_registration_id:".concat(String.valueOf(((thx) this.a).getString(1)));
            case 16:
                return "_id:".concat(String.valueOf(((tij) this.a).getString(0)));
            case 17:
                return "session_id:".concat(String.valueOf(((tij) this.a).getString(1)));
            case 18:
                return "feature:".concat(String.valueOf(((tij) this.a).getString(2)));
            case 19:
                return "status:".concat(String.valueOf(((tij) this.a).getString(3)));
            default:
                return "start_time:".concat(String.valueOf(((tij) this.a).getString(4)));
        }
    }
}
