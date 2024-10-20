package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class siq implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ siq(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "attempt_number:".concat(String.valueOf(((sir) this.a).getString(7)));
            case 1:
                return "status:".concat(String.valueOf(((sir) this.a).getString(6)));
            case 2:
                return "key_index:".concat(String.valueOf(((siz) this.a).getString(0)));
            case 3:
                return "encryption_key:".concat(String.valueOf(((siz) this.a).getString(1)));
            case 4:
                return "key_type:".concat(String.valueOf(((siz) this.a).getString(2)));
            case 5:
                return "cms_correlation_id:".concat(String.valueOf(((siz) this.a).getString(3)));
            case 6:
                return "cms_id:".concat(String.valueOf(((siz) this.a).getString(4)));
            case 7:
                return "cp2_id:".concat(String.valueOf(((sjh) this.a).getString(0)));
            case 8:
                return "lookup_key:".concat(String.valueOf(((sjh) this.a).getString(2)));
            case 9:
                return "phone_number:".concat(String.valueOf(((sjh) this.a).getString(3)));
            case 10:
                return "display_name:".concat(String.valueOf(((sjh) this.a).getString(4)));
            case 11:
                return "given_name:".concat(String.valueOf(((sjh) this.a).getString(5)));
            case 12:
                return "family_name:".concat(String.valueOf(((sjh) this.a).getString(6)));
            case 13:
                return "photo:".concat(String.valueOf(((sjh) this.a).getString(7)));
            case 14:
                return "thumbnail:".concat(String.valueOf(((sjh) this.a).getString(8)));
            case 15:
                return "birthday:".concat(String.valueOf(((sjh) this.a).getString(9)));
            case 16:
                return "anniversary:".concat(String.valueOf(((sjh) this.a).getString(10)));
            case 17:
                return "last_updated_timestamp:".concat(String.valueOf(((sjh) this.a).getString(11)));
            case 18:
                return "sort_key:".concat(String.valueOf(((sjh) this.a).getString(12)));
            case 19:
                return "phonebook_label:".concat(String.valueOf(((sjh) this.a).getString(13)));
            default:
                return "phonebook_bucket:".concat(String.valueOf(((sjh) this.a).getString(14)));
        }
    }
}
