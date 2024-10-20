package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class smz implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ smz(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "preview_content_type:".concat(String.valueOf(((sna) this.a).getString(9)));
            case 1:
                return "preview_uri:".concat(String.valueOf(((sna) this.a).getString(8)));
            case 2:
                return "archive_status:".concat(String.valueOf(((sna) this.a).getString(16)));
            case 3:
                return "sort_timestamp:".concat(String.valueOf(((sna) this.a).getString(17)));
            case 4:
                return "last_read_timestamp:".concat(String.valueOf(((sna) this.a).getString(18)));
            case 5:
                return "conversation_id:".concat(String.valueOf(((snm) this.a).getString(0)));
            case 6:
                return "rcs_group_id:".concat(String.valueOf(((snm) this.a).getString(1)));
            case 7:
                return "_id:".concat(String.valueOf(((sns) this.a).getString(0)));
            case 8:
                return "last_update_version:".concat(String.valueOf(((sns) this.a).getString(1)));
            case 9:
                return "_id:".concat(String.valueOf(((soc) this.a).getString(0)));
            case 10:
                return "phone_number:".concat(String.valueOf(((soc) this.a).getString(1)));
            case 11:
                return "data_size:".concat(String.valueOf(((soc) this.a).getString(2)));
            case 12:
                return "_id:".concat(String.valueOf(((sol) this.a).getString(0)));
            case 13:
                return "destination_registration_id:".concat(String.valueOf(((sol) this.a).getString(19)));
            case 14:
                return "desktop_id:".concat(String.valueOf(((sol) this.a).getString(1)));
            case 15:
                return "gaia_email:".concat(String.valueOf(((sol) this.a).getString(20)));
            case 16:
                return "creation_time:".concat(String.valueOf(((sol) this.a).getString(21)));
            case 17:
                return "last_connection_time:".concat(String.valueOf(((sol) this.a).getString(2)));
            case 18:
                return "last_wakeup_time:".concat(String.valueOf(((sol) this.a).getString(3)));
            case 19:
                return "wakeup_attempts_count:".concat(String.valueOf(((sol) this.a).getString(4)));
            default:
                return "fingerprint:".concat(String.valueOf(((sol) this.a).getString(5)));
        }
    }
}
