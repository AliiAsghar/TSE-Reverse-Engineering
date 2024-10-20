package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class seg {
    public static final String[] a = {"remote_user_id_to_registration_id.remote_user_id", "remote_user_id_to_registration_id.tachyon_registration_id", "remote_registrations_table.tachyon_registration_id", "remote_registrations_table.etouffee", "remote_registrations_table.better_etouffee", "remote_registrations_table.messages_feature_hash", "remote_registrations_table.last_modified_timestamp", "remote_registrations_table.identity_key", "remote_registrations_table.updated_at_hash", "remote_registrations_table.guaranteed_fresh_as_of_timestamp", "remote_registrations_table.is_updated_at_hash_valid"};

    static {
        alok alokVar = new alok();
        alokVar.h("remote_registrations_table.better_etouffee", 46000);
        alokVar.h("remote_registrations_table.messages_feature_hash", 58800);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("tachyon_registration_id", "index_null_tachyon_registration_id");
        alokVar2.b();
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.i(true);
        a2.f(true);
        a2.c(true);
        a2.a = "remote_user_id_to_registration_id.remote_user_id";
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.j(true);
        a3.f(true);
        a3.c(true);
        a3.d(true);
        a3.b = new sdl(5);
        a3.a = "remote_user_id_to_registration_id.tachyon_registration_id";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.j(true);
        a4.f(true);
        a4.c(true);
        a4.a = "remote_registrations_table.tachyon_registration_id";
        a4.c = new wsy();
        a4.a();
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "remote_registrations_table.etouffee";
        a5.c = new wsy();
        a5.a();
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.a = "remote_registrations_table.better_etouffee";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 2;
        a7.a = "remote_registrations_table.messages_feature_hash";
        a7.c = new wsy();
        a7.a();
        agmi a8 = agmk.a();
        a8.d = 2;
        a8.a = "remote_registrations_table.last_modified_timestamp";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 5;
        a9.a = "remote_registrations_table.identity_key";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 2;
        a10.a = "remote_registrations_table.updated_at_hash";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 2;
        a11.a = "remote_registrations_table.guaranteed_fresh_as_of_timestamp";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 2;
        a12.a = "remote_registrations_table.is_updated_at_hash_valid";
        a12.c = new wsy();
        a12.a();
    }

    public static final see a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("remote_user_id_to_registration_id.remote_user_id");
            alobVar.h("remote_user_id_to_registration_id.tachyon_registration_id");
            alobVar.h("remote_registrations_table.tachyon_registration_id");
            alobVar.h("remote_registrations_table.etouffee");
            if (valueOf.intValue() >= 46000) {
                alobVar.h("remote_registrations_table.better_etouffee");
            }
            if (valueOf.intValue() >= 58800) {
                alobVar.h("remote_registrations_table.messages_feature_hash");
            }
            alobVar.h("remote_registrations_table.last_modified_timestamp");
            alobVar.h("remote_registrations_table.identity_key");
            alobVar.h("remote_registrations_table.updated_at_hash");
            alobVar.h("remote_registrations_table.guaranteed_fresh_as_of_timestamp");
            alobVar.h("remote_registrations_table.is_updated_at_hash_valid");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new see(strArr);
    }
}
