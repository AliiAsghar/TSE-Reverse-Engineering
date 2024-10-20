package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tfu implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tfu(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "domain:".concat(String.valueOf(((tfv) this.a).getString(2)));
            case 1:
                return "content_uri:".concat(String.valueOf(((tfv) this.a).getString(1)));
            case 2:
                return "image_search_url:".concat(String.valueOf(((tfv) this.a).getString(3)));
            case 3:
                return "width:".concat(String.valueOf(((tfv) this.a).getString(4)));
            case 4:
                return "height:".concat(String.valueOf(((tfv) this.a).getString(5)));
            case 5:
                return "last_used_timestamp:".concat(String.valueOf(((tfv) this.a).getString(6)));
            case 6:
                return "_id:".concat(String.valueOf(((tgf) this.a).getString(0)));
            case 7:
                return "sticker_id:".concat(String.valueOf(((tgf) this.a).getString(1)));
            case 8:
                return "last_used_timestamp:".concat(String.valueOf(((tgf) this.a).getString(2)));
            case 9:
                return "_id:".concat(String.valueOf(((tgl) this.a).getString(0)));
            case 10:
                return "message_id:".concat(String.valueOf(((tgl) this.a).getString(1)));
            case 11:
                return "conversation_id:".concat(String.valueOf(((tgl) this.a).getString(2)));
            case 12:
                return "trigger_time:".concat(String.valueOf(((tgl) this.a).getString(3)));
            case 13:
                return "status:".concat(String.valueOf(((tgl) this.a).getString(4)));
            case 14:
                return "_id:".concat(String.valueOf(((tgw) this.a).getString(0)));
            case 15:
                return "remote_instance_id:".concat(String.valueOf(((tgw) this.a).getString(1)));
            case 16:
                return "etouffee:".concat(String.valueOf(((tgw) this.a).getString(2)));
            case 17:
                return "tachyon_id:".concat(String.valueOf(((tgw) this.a).getString(3)));
            case 18:
                return "last_modified_timestamp:".concat(String.valueOf(((tgw) this.a).getString(4)));
            case 19:
                return "identity_key:".concat(String.valueOf(((tgw) this.a).getString(5)));
            default:
                return "updated_at_hash:".concat(String.valueOf(((tgw) this.a).getString(6)));
        }
    }
}
