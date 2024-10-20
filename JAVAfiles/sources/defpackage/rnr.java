package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rnr implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ rnr(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "longitude:".concat(String.valueOf(((rns) this.a).getString(7)));
            case 1:
                return "height:".concat(String.valueOf(((rns) this.a).getString(6)));
            case 2:
                return "latitude:".concat(String.valueOf(((rns) this.a).getString(8)));
            case 3:
                return "cms_full_size_blob_id:".concat(String.valueOf(((rns) this.a).getString(9)));
            case 4:
                return "cms_media_encryption_key:".concat(String.valueOf(((rns) this.a).getString(10)));
            case 5:
                return "cms_compressed_media_encryption_key:".concat(String.valueOf(((rns) this.a).getString(11)));
            case 6:
                return "cms_compressed_blob_id:".concat(String.valueOf(((rns) this.a).getString(12)));
            case 7:
                return "file_name:".concat(String.valueOf(((rns) this.a).getString(13)));
            case 8:
                return "message_id:".concat(String.valueOf(((rns) this.a).getString(1)));
            case 9:
                return "content_type:".concat(String.valueOf(((rns) this.a).getString(2)));
            case 10:
                return "source:".concat(String.valueOf(((rns) this.a).getString(3)));
            case 11:
                return "text:".concat(String.valueOf(((rns) this.a).getString(4)));
            case 12:
                return "width:".concat(String.valueOf(((rns) this.a).getString(5)));
            case 13:
                return "created_timestamp:".concat(String.valueOf(((rob) this.a).getString(0)));
            case 14:
                return "schema_version:".concat(String.valueOf(((rob) this.a).getString(1)));
            case 15:
                return "backup_id:".concat(String.valueOf(((rob) this.a).getString(2)));
            case 16:
                return "token:".concat(String.valueOf(((rol) this.a).getString(0)));
            case 17:
                return "address_type:".concat(String.valueOf(((rol) this.a).getString(1)));
            case 18:
                return "phone_number:".concat(String.valueOf(((rol) this.a).getString(2)));
            case 19:
                return "display_name:".concat(String.valueOf(((rol) this.a).getString(3)));
            default:
                return "_id:".concat(String.valueOf(((row) this.a).getString(0)));
        }
    }
}
