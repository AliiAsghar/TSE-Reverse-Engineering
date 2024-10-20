package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxf implements aojy {
    public final alog h;
    public final alpt i;
    private final alor l;
    public static final ahka a = new ahka("google.maps.places.v1.Places.");
    private static final ahka j = new ahka("google.maps.places.v1.Places/");
    public static final aojx b = new aoxe(1, (byte[]) null);
    public static final aojx c = new aoxe(0);
    public static final aojx d = new aoxe(2, (char[]) null);
    public static final aojx e = new aoxe(3, (short[]) null);
    public static final aojx f = new aoxe(4, (int[]) null);
    public static final aoxf g = new aoxf();
    private static final ahka k = new ahka("places.googleapis.com");

    private aoxf() {
        alob alobVar = new alob();
        alobVar.h("autopush-places.mtls.sandbox.googleapis.com");
        alobVar.h("autopush-places.sandbox.googleapis.com");
        alobVar.h("localenterpriseloadtest-places.mtls.sandbox.googleapis.com");
        alobVar.h("localenterpriseloadtest-places.sandbox.googleapis.com");
        alobVar.h("places.mtls.googleapis.com");
        alobVar.h("prodenterpriseloadtest-places.googleapis.com");
        alobVar.h("prodenterpriseloadtest-places.mtls.googleapis.com");
        alobVar.h("prodlocal-places.mtls.sandbox.googleapis.com");
        alobVar.h("prodlocal-places.sandbox.googleapis.com");
        alobVar.h("staging-places.mtls.sandbox.googleapis.com");
        alobVar.h("staging-places.sandbox.googleapis.com");
        alobVar.h("places.googleapis.com");
        this.h = alobVar.g();
        this.i = new alpr().g();
        aojx aojxVar = b;
        aojx aojxVar2 = c;
        aojx aojxVar3 = d;
        aojx aojxVar4 = e;
        aojx aojxVar5 = f;
        alpt.u(aojxVar, aojxVar2, aojxVar3, aojxVar4, aojxVar5);
        alok alokVar = new alok();
        alokVar.h("SearchNearby", aojxVar);
        alokVar.h("SearchText", aojxVar2);
        alokVar.h("GetPhotoMedia", aojxVar3);
        alokVar.h("GetPlace", aojxVar4);
        alokVar.h("AutocompletePlaces", aojxVar5);
        this.l = alokVar.b();
        new alok().b();
    }

    @Override // defpackage.aojy
    public final ahka a() {
        return k;
    }

    @Override // defpackage.aojy
    public final aojx b(String str) {
        String str2 = j.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (this.l.containsKey(substring)) {
                return (aojx) this.l.get(substring);
            }
            return null;
        }
        return null;
    }
}
