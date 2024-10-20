package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tlm implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tlm(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "type:".concat(String.valueOf(((tln) this.a).getString(0)));
            case 1:
                return "last_modified_timestamp:".concat(String.valueOf(((tld) this.a).getString(4)));
            case 2:
                return "name:".concat(String.valueOf(((tln) this.a).getString(1)));
            case 3:
                return "tbl_name:".concat(String.valueOf(((tln) this.a).getString(2)));
            case 4:
                return "rootpage:".concat(String.valueOf(((tln) this.a).getString(3)));
            case 5:
                return "sql:".concat(String.valueOf(((tln) this.a).getString(4)));
            case 6:
                return "tbl:".concat(String.valueOf(((tlv) this.a).getString(0)));
            case 7:
                return "idx:".concat(String.valueOf(((tlv) this.a).getString(1)));
            case 8:
                return "stat:".concat(String.valueOf(((tlv) this.a).getString(2)));
            case 9:
                return "sticker_set_id:".concat(String.valueOf(((tme) this.a).getString(0)));
            case 10:
                return "locale:".concat(String.valueOf(((tme) this.a).getString(1)));
            case 11:
                return "display_name:".concat(String.valueOf(((tme) this.a).getString(2)));
            case 12:
                return "_id:".concat(String.valueOf(((tml) this.a).getString(0)));
            case 13:
                return "sticker_set_id:".concat(String.valueOf(((tml) this.a).getString(1)));
            case 14:
                return "local_version:".concat(String.valueOf(((tml) this.a).getString(2)));
            case 15:
                return "download_state:".concat(String.valueOf(((tml) this.a).getString(3)));
            case 16:
                return "icon_uri:".concat(String.valueOf(((tml) this.a).getString(4)));
            case 17:
                return "display_name:".concat(String.valueOf(((tml) this.a).getString(5)));
            case 18:
                return "preview_image_uri:".concat(String.valueOf(((tml) this.a).getString(6)));
            case 19:
                return "requested_timestamp:".concat(String.valueOf(((tml) this.a).getString(7)));
            default:
                return "display_order:".concat(String.valueOf(((tml) this.a).getString(8)));
        }
    }
}
