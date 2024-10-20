package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqip implements aojy {
    public final alog o;
    public final alpt p;
    private final alor s;
    public static final ahka a = new ahka("google.internal.communications.instantmessaging.v1.Group.");
    private static final ahka q = new ahka("google.internal.communications.instantmessaging.v1.Group/");
    public static final aojx b = new aoxe(8, (char[][]) null);
    public static final aojx c = new aoxe(9, (short[][]) null);
    public static final aojx d = new aoxe(10, (int[][]) null);
    public static final aojx e = new aoxe(11, (boolean[][]) null);
    public static final aojx f = new aoxe(12, (float[][]) null);
    public static final aojx g = new aoxe(13, (byte[][][]) null);
    public static final aojx h = new aoxe(14, (char[][][]) null);
    public static final aojx i = new aoxe(15, (short[][][]) null);
    public static final aojx j = new aoxe(16, (int[][][]) null);
    public static final aojx k = new aoxe(5, (boolean[]) null);
    public static final aojx l = new aoxe(6, (float[]) null);
    public static final aojx m = new aoxe(7, (byte[][]) null);
    public static final aqip n = new aqip();
    private static final ahka r = new ahka("instantmessaging-pa.googleapis.com");

    private aqip() {
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
        this.o = alobVar.g();
        this.p = new alpr().g();
        aojx aojxVar = b;
        aojx aojxVar2 = c;
        aojx aojxVar3 = d;
        aojx aojxVar4 = e;
        aojx aojxVar5 = f;
        aojx aojxVar6 = g;
        aojx aojxVar7 = h;
        aojx aojxVar8 = i;
        aojx aojxVar9 = j;
        aojx aojxVar10 = k;
        aojx aojxVar11 = l;
        aojx aojxVar12 = m;
        alpt.v(aojxVar, aojxVar2, aojxVar3, aojxVar4, aojxVar5, aojxVar6, aojxVar7, aojxVar8, aojxVar9, aojxVar10, aojxVar11, aojxVar12);
        alok alokVar = new alok();
        alokVar.h("CreateGroup", aojxVar);
        alokVar.h("AddGroupUsers", aojxVar2);
        alokVar.h("KickGroupUsers", aojxVar3);
        alokVar.h("ChangeGroupProfile", aojxVar4);
        alokVar.h("ChangeGroupMemberRole", aojxVar5);
        alokVar.h("GetGroupIds", aojxVar6);
        alokVar.h("GetGroupInfos", aojxVar7);
        alokVar.h("GetGroupInfo", aojxVar8);
        alokVar.h("GetGroupInviteLinkDetails", aojxVar9);
        alokVar.h("JoinGroupViaLink", aojxVar10);
        alokVar.h("GetGroupCountryCode", aojxVar11);
        alokVar.h("DeleteGroup", aojxVar12);
        this.s = alokVar.b();
        new alok().b();
    }

    @Override // defpackage.aojy
    public final ahka a() {
        return r;
    }

    @Override // defpackage.aojy
    public final aojx b(String str) {
        String str2 = q.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (this.s.containsKey(substring)) {
                return (aojx) this.s.get(substring);
            }
            return null;
        }
        return null;
    }
}
