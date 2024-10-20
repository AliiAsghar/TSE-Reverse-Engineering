package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwa {
    public static final String[] a = {"my_identities.token", "my_identities.provisioning_id", "my_identities.is_verified", "my_identities.address_type", "my_identities.phone_number", "my_identities.display_name", "group_concat(quote(subscriptions.sub_id), '|')", "group_concat(quote(subscriptions.sim_serial_number), '|')", "group_concat(quote(subscriptions.rowid), '|') AS subscriptions__ROWID"};

    static {
        qya.e();
        new alok().b();
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.i(true);
        a2.f(true);
        a2.c(true);
        a2.a = "my_identities.token";
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "my_identities.provisioning_id";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.i(true);
        a4.a = "my_identities.is_verified";
        a4.c = new wsy();
        a4.a();
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "my_identities.address_type";
        a5.c = new wsy();
        a5.a();
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "my_identities.phone_number";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "my_identities.display_name";
        a7.c = new wsy();
        a7.a();
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.j(true);
        a8.f(true);
        a8.c(true);
        a8.a = "subscriptions.sub_id";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 4;
        a9.j(true);
        a9.f(true);
        a9.c(true);
        a9.a = "subscriptions.sim_serial_number";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 8;
        a10.a = "subscriptions__ROWID";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "subscriptions.telephony_phone_number";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.c(true);
        a12.a = "subscriptions.my_identity_token";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 4;
        a13.c(true);
        a13.d(true);
        a13.b = new qqe(16);
        a13.a = "subscriptions.my_identity_token_with_foreign_key";
        a13.c = new wsy();
        a13.a();
    }

    public static final qvy a(String str) {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("my_identities.token");
            if (valueOf.intValue() >= 59990) {
                alobVar.h("my_identities.provisioning_id");
            }
            if (valueOf.intValue() >= 60320) {
                alobVar.h("my_identities.is_verified");
            }
            if (valueOf.intValue() >= 59980) {
                alobVar.h("my_identities.address_type");
            }
            alobVar.h("my_identities.phone_number");
            if (valueOf.intValue() >= 60120) {
                alobVar.h("my_identities.display_name");
            }
            alobVar.h("group_concat(quote(subscriptions.sub_id), '|')");
            alobVar.h("group_concat(quote(subscriptions.sim_serial_number), '|')");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        qvy qvyVar = new qvy(strArr);
        qvyVar.w(str);
        return qvyVar;
    }
}
