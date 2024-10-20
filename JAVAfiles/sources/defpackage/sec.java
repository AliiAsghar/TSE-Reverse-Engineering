package defpackage;

import android.content.ContentValues;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sec extends aglz {
    private String a;
    private String b;
    private String c;
    private byte[] h;
    private boolean d = false;
    private boolean e = false;
    private rvd f = new rvd(0);
    private Instant g = uzz.l(0);
    private long i = 0;
    private Instant j = uzz.l(0);
    private boolean k = false;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "RemoteInstancesView [remote_user_id_to_registration_id.remote_user_id_to_registration_id_remote_user_id: %s,\n  remote_user_id_to_registration_id.remote_user_id_to_registration_id_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_etouffee: %s,\n  remote_registrations_table.remote_registrations_table_better_etouffee: %s,\n  remote_registrations_table.remote_registrations_table_messages_feature_hash: %s,\n  remote_registrations_table.remote_registrations_table_last_modified_timestamp: %s,\n  remote_registrations_table.remote_registrations_table_identity_key: %s,\n  remote_registrations_table.remote_registrations_table_updated_at_hash: %s,\n  remote_registrations_table.remote_registrations_table_guaranteed_fresh_as_of_timestamp: %s,\n  remote_registrations_table.remote_registrations_table_is_updated_at_hash_valid: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, "BLOB".concat(String.valueOf(str)), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        boolean z;
        boolean z2;
        sea seaVar = (sea) agmqVar;
        aq();
        this.cJ = seaVar.dx();
        boolean z3 = false;
        if (seaVar.db(0)) {
            this.a = seaVar.getString(seaVar.cI(0, seg.a));
            fE(0);
        }
        if (seaVar.db(1)) {
            this.b = seaVar.getString(seaVar.cI(1, seg.a));
            fE(1);
        }
        if (seaVar.db(2)) {
            this.c = seaVar.getString(seaVar.cI(2, seg.a));
            fE(2);
        }
        if (seaVar.db(3)) {
            if (seaVar.getInt(seaVar.cI(3, seg.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.d = z2;
            fE(3);
        }
        if (seaVar.db(4)) {
            if (seaVar.getInt(seaVar.cI(4, seg.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            fE(4);
        }
        if (seaVar.db(5)) {
            this.f = new rvd(seaVar.getLong(seaVar.cI(5, seg.a)));
            fE(5);
        }
        if (seaVar.db(6)) {
            this.g = uzz.l(seaVar.getLong(seaVar.cI(6, seg.a)));
            fE(6);
        }
        if (seaVar.db(7)) {
            this.h = seaVar.getBlob(seaVar.cI(7, seg.a));
            fE(7);
        }
        if (seaVar.db(8)) {
            this.i = seaVar.getLong(seaVar.cI(8, seg.a));
            fE(8);
        }
        if (seaVar.db(9)) {
            this.j = uzz.l(seaVar.getLong(seaVar.cI(9, seg.a)));
            fE(9);
        }
        if (seaVar.db(10)) {
            if (seaVar.getInt(seaVar.cI(10, seg.a)) == 1) {
                z3 = true;
            }
            this.k = z3;
            fE(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sec)) {
            return false;
        }
        sec secVar = (sec) obj;
        if (super.aC(secVar.cJ) && Objects.equals(this.a, secVar.a) && Objects.equals(this.b, secVar.b) && Objects.equals(this.c, secVar.c) && this.d == secVar.d && this.e == secVar.e && Objects.equals(this.f, secVar.f) && Objects.equals(this.g, secVar.g) && Arrays.equals(this.h, secVar.h) && this.i == secVar.i && Objects.equals(this.j, secVar.j) && this.k == secVar.k) {
            return true;
        }
        return false;
    }

    public final long f() {
        ao(8, "updated_at_hash");
        return this.i;
    }

    public final String g() {
        ao(0, "remote_user_id");
        return this.a;
    }

    public final String h() {
        ao(2, "tachyon_registration_id");
        return this.c;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), Long.valueOf(this.i), this.j, Boolean.valueOf(this.k), null);
    }

    public final String i() {
        ao(1, "tachyon_registration_id");
        return this.b;
    }

    public final boolean j() {
        ao(3, "etouffee");
        return this.d;
    }

    public final boolean k() {
        ao(4, "better_etouffee");
        return this.e;
    }

    public final boolean l() {
        ao(10, "is_updated_at_hash_valid");
        return this.k;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RemoteInstancesView -- REDACTED");
        }
        return a();
    }
}
