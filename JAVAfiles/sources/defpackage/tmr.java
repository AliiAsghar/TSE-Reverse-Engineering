package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tmr implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tmr(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "sticker_set_id:".concat(String.valueOf(((tms) this.a).getString(0)));
            case 1:
                return "author:".concat(String.valueOf(((tml) this.a).getString(9)));
            case 2:
                return "sticker_id:".concat(String.valueOf(((tms) this.a).getString(1)));
            case 3:
                return "locale:".concat(String.valueOf(((tms) this.a).getString(2)));
            case 4:
                return "display_name:".concat(String.valueOf(((tms) this.a).getString(3)));
            case 5:
                return "sticker_local_id:".concat(String.valueOf(((tms) this.a).getString(4)));
            case 6:
                return "_id:".concat(String.valueOf(((tmz) this.a).getString(0)));
            case 7:
                return "sticker_set_id:".concat(String.valueOf(((tmz) this.a).getString(1)));
            case 8:
                return "sticker_id:".concat(String.valueOf(((tmz) this.a).getString(2)));
            case 9:
                return "icon_uri_static:".concat(String.valueOf(((tmz) this.a).getString(3)));
            case 10:
                return "icon_uri_animated:".concat(String.valueOf(((tmz) this.a).getString(4)));
            case 11:
                return "display_name:".concat(String.valueOf(((tmz) this.a).getString(5)));
            case 12:
                return "display_order:".concat(String.valueOf(((tmz) this.a).getString(6)));
            case 13:
                return "_id:".concat(String.valueOf(((tng) this.a).getString(0)));
            case 14:
                return "name:".concat(String.valueOf(((tng) this.a).getString(1)));
            case 15:
                return "status:".concat(String.valueOf(((tng) this.a).getString(2)));
            case 16:
                return "_id:".concat(String.valueOf(((tnq) this.a).getString(0)));
            case 17:
                return "enabled:".concat(String.valueOf(((tnq) this.a).getString(1)));
            case 18:
                return "_id:".concat(String.valueOf(((toh) this.a).getString(0)));
            case 19:
                return "message_id:".concat(String.valueOf(((toh) this.a).getString(1)));
            default:
                return "user_ref_id:".concat(String.valueOf(((toh) this.a).getString(2)));
        }
    }
}
