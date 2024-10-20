package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tku extends agmh {
    /* JADX INFO: Access modifiers changed from: protected */
    public tku(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = tky.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("self_profiles._id");
            alobVar.h("self_profiles.my_identity_token");
            alobVar.h("self_profiles.limited_profile_display_name");
            alobVar.h("self_profiles.photo_uri");
            if (valueOf.intValue() >= 60400) {
                alobVar.h("self_profiles.is_self_profile_shareable");
            }
            alobVar.h("self_profiles.belongs_to_self_gaia");
            alobVar.h("self_profiles.update_timestamp");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tkx(strArr).b();
    }
}
