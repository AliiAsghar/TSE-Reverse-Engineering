package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sep extends aglz {
    public tox a;
    private String b;
    private String c;
    private long d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Uri i;
    private String j;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsSenderQueriesQuery [verified_sms_senders.verified_sms_senders_sender_id: %s,\n  verified_sms_senders.verified_sms_senders_brand_id: %s,\n  verified_sms_brands.verified_sms_brands__id: %s,\n  verified_sms_brands.verified_sms_brands_brand_id: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_url: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  verified_sms_brands.verified_sms_brands_version_token: %s\n]\n", String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        agnw d;
        Uri parse;
        sea seaVar = (sea) agmqVar;
        aq();
        this.cJ = seaVar.dx();
        if (seaVar.db(0)) {
            this.b = seaVar.getString(seaVar.cI(0, set.a));
            fE(0);
        }
        if (seaVar.db(1)) {
            this.c = seaVar.getString(seaVar.cI(1, set.a));
            fE(1);
        }
        if (seaVar.db(2)) {
            this.d = seaVar.getLong(seaVar.cI(2, set.a));
            fE(2);
        }
        if (seaVar.db(3)) {
            this.e = seaVar.getString(seaVar.cI(3, set.a));
            fE(3);
        }
        if (seaVar.db(4)) {
            this.f = seaVar.getString(seaVar.cI(4, set.a));
            fE(4);
        }
        if (seaVar.db(5)) {
            this.g = seaVar.getString(seaVar.cI(5, set.a));
            fE(5);
        }
        if (seaVar.db(6)) {
            this.h = seaVar.getString(seaVar.cI(6, set.a));
            fE(6);
        }
        if (seaVar.db(7)) {
            String string = seaVar.getString(seaVar.cI(7, set.a));
            if (string == null) {
                parse = null;
            } else {
                parse = Uri.parse(string);
            }
            this.i = parse;
            fE(7);
        }
        if (seaVar.db(8)) {
            this.j = seaVar.getString(seaVar.cI(8, set.a));
            fE(8);
        }
        d = agnc.d("$primary");
        Integer.valueOf(d.W().c()).getClass();
        tpk a = tps.a();
        ao(0, "sender_id");
        a.c(this.b);
        ao(1, "brand_id");
        a.b(this.c);
        a.a();
        toy a2 = tpi.a();
        ao(2, "_id");
        a2.d(this.d);
        ao(3, "brand_id");
        a2.b(this.e);
        ao(4, "name");
        a2.g(this.f);
        ao(5, "description");
        a2.c(this.g);
        ao(6, "logo_url");
        a2.f(this.h);
        ao(7, "logo_uri");
        a2.e(this.i);
        ao(8, "version_token");
        a2.h(this.j);
        this.a = a2.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sep)) {
            return false;
        }
        sep sepVar = (sep) obj;
        if (super.aC(sepVar.cJ) && Objects.equals(this.b, sepVar.b) && Objects.equals(this.c, sepVar.c) && this.d == sepVar.d && Objects.equals(this.e, sepVar.e) && Objects.equals(this.f, sepVar.f) && Objects.equals(this.g, sepVar.g) && Objects.equals(this.h, sepVar.h) && Objects.equals(this.i, sepVar.i) && Objects.equals(this.j, sepVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, this.j, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "VerifiedSmsSenderQueriesQuery -- REDACTED");
        }
        return a();
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
    }
}
