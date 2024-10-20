package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syt extends agmh {
    public syt(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = syx.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("smarts_personalization_features.feature_id");
            if (valueOf.intValue() >= 54060) {
                alobVar.h("smarts_personalization_features.feature");
            }
            alobVar.h("smarts_personalization_features.start_date");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new syw(strArr).b();
    }
}
