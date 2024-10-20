package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqix implements aojy {
    public final alog i;
    public final alpt j;
    private final alor m;
    public static final ahka a = new ahka("google.internal.communications.instantmessaging.v1.MessagesMultiDevice.");
    private static final ahka k = new ahka("google.internal.communications.instantmessaging.v1.MessagesMultiDevice/");
    public static final aojx b = new aqiw(1, (byte[]) null);
    public static final aojx c = new aqiw(0);
    public static final aojx d = new aqiw(2, (char[]) null);
    public static final aojx e = new aqiw(3, (short[]) null);
    public static final aojx f = new aqiw(4, (int[]) null);
    public static final aojx g = new aqiw(5, (boolean[]) null);
    public static final aqix h = new aqix();
    private static final ahka l = new ahka("instantmessaging-pa.googleapis.com");

    private aqix() {
        alob alobVar = new alob();
        alobVar.h("autopush-asan-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("autopush-asan-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("autopush-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("autopush-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("autopush-rcs-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("autopush-rcs-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-autopush-asan-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-autopush-asan-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-autopush-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-autopush-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-autopush-rcs-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-autopush-rcs-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-pa.mtls.googleapis.com");
        alobVar.h("instantmessaging-preprod-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-preprod-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-preprod-rcs-ap-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-preprod-rcs-ap-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-preprod-rcs-eu-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-preprod-rcs-eu-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-preprod-rcs-us-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-preprod-rcs-us-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-hawk-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-hawk-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-heron-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-heron-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-rcs-ap-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-rcs-ap-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-rcs-eu-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-rcs-eu-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-rcs-us-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-rcs-us-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-sparrow-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-prod-sparrow-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-rcs-ap-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-rcs-ap-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-rcs-eu-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-rcs-eu-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-rcs-us-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-rcs-us-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-users-rcs-ap-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-users-rcs-ap-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-users-rcs-eu-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-users-rcs-eu-pa.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-users-rcs-us-pa.mtls.sandbox.googleapis.com");
        alobVar.h("instantmessaging-staging-users-rcs-us-pa.sandbox.googleapis.com");
        alobVar.h("preprod-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("preprod-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("preprod-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("preprod-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("preprod-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("preprod-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("preprod-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("preprod-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("prod-hawk-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("prod-hawk-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("prod-heron-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("prod-heron-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("prod-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("prod-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("prod-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("prod-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("prod-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("prod-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("prod-sparrow-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("prod-sparrow-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("staging-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("staging-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("staging-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("staging-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("staging-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("staging-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("staging-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("staging-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("staging-users-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("staging-users-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("staging-users-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("staging-users-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("staging-users-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        alobVar.h("staging-users-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-autopush-asan-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-autopush-asan-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-autopush-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-autopush-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-autopush-rcs-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-autopush-rcs-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-rcs-ap-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-rcs-eu-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-rcs-us-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-preprod-rcs-us-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-hawk-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-hawk-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-heron-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-heron-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-rcs-ap-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-rcs-eu-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-rcs-us-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-rcs-us-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-sparrow-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-prod-sparrow-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-rcs-ap-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-rcs-eu-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-rcs-us-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-rcs-us-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-users-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-users-rcs-ap-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-users-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-users-rcs-eu-grpc.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-users-rcs-us-grpc.mtls.sandbox.googleapis.com");
        alobVar.h("tachyon-playground-staging-users-rcs-us-grpc.sandbox.googleapis.com");
        alobVar.h("zero-instantmessaging-pa.googleapis.com");
        alobVar.h("zero-instantmessaging-pa.mtls.googleapis.com");
        alobVar.h("instantmessaging-pa.googleapis.com");
        this.i = alobVar.g();
        this.j = new alpr().g();
        aojx aojxVar = b;
        aojx aojxVar2 = c;
        aojx aojxVar3 = d;
        aojx aojxVar4 = e;
        aojx aojxVar5 = f;
        aojx aojxVar6 = g;
        alpt.v(aojxVar, aojxVar2, aojxVar3, aojxVar4, aojxVar5, aojxVar6, new aojx[0]);
        alok alokVar = new alok();
        alokVar.h("SendFiMessage", aojxVar);
        alokVar.h("GetFiUserStanding", aojxVar2);
        alokVar.h("GetMultiDeviceStatus", aojxVar3);
        alokVar.h("MdmListContactPeople", aojxVar4);
        alokVar.h("MdmListPeopleByKnownId", aojxVar5);
        alokVar.h("MdmListStarredPeople", aojxVar6);
        this.m = alokVar.b();
        new alok().b();
    }

    @Override // defpackage.aojy
    public final ahka a() {
        return l;
    }

    @Override // defpackage.aojy
    public final aojx b(String str) {
        String str2 = k.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (this.m.containsKey(substring)) {
                return (aojx) this.m.get(substring);
            }
            return null;
        }
        return null;
    }
}
