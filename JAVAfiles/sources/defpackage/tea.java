package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tea implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tea(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "hero_image_local_uri:".concat(String.valueOf(((teb) this.a).getString(7)));
            case 1:
                return "hero_image_remote_url:".concat(String.valueOf(((teb) this.a).getString(6)));
            case 2:
                return "verifier_id:".concat(String.valueOf(((tek) this.a).getString(0)));
            case 3:
                return "verifier_name:".concat(String.valueOf(((tek) this.a).getString(1)));
            case 4:
                return "verifier_logo_image_remote_url:".concat(String.valueOf(((tek) this.a).getString(2)));
            case 5:
                return "verifier_logo_image_local_uri:".concat(String.valueOf(((tek) this.a).getString(3)));
            case 6:
                return "_id:".concat(String.valueOf(((tev) this.a).getString(0)));
            case 7:
                return "message_id:".concat(String.valueOf(((tev) this.a).getString(1)));
            case 8:
                return "participant_id:".concat(String.valueOf(((tev) this.a).getString(2)));
            case 9:
                return "receive_time:".concat(String.valueOf(((tev) this.a).getString(3)));
            case 10:
                return "read_time:".concat(String.valueOf(((tev) this.a).getString(4)));
            case 11:
                return "ftd_time:".concat(String.valueOf(((tev) this.a).getString(5)));
            case 12:
                return "rcs_message_id:".concat(String.valueOf(((tfd) this.a).getString(0)));
            case 13:
                return "self_msisdn:".concat(String.valueOf(((tfd) this.a).getString(1)));
            case 14:
                return "name:".concat(String.valueOf(((tfk) this.a).getString(0)));
            case 15:
                return "content_uri:".concat(String.valueOf(((tfk) this.a).getString(1)));
            case 16:
                return "content_type:".concat(String.valueOf(((tfk) this.a).getString(2)));
            case 17:
                return "width:".concat(String.valueOf(((tfk) this.a).getString(3)));
            case 18:
                return "height:".concat(String.valueOf(((tfk) this.a).getString(4)));
            case 19:
                return "last_used_timestamp:".concat(String.valueOf(((tfk) this.a).getString(5)));
            default:
                return "original_image_url:".concat(String.valueOf(((tfv) this.a).getString(0)));
        }
    }
}
