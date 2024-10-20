package defpackage;

import android.content.ContentValues;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvw extends aglz {
    public String b;
    public qvn c;
    public String d;
    public int[] e;
    public String[] f;
    private String h;
    private long[] i;
    public qwe a = null;
    private boolean g = false;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MyIdentitySubscriptionQuery [my_identities.my_identities_token: %s,\n  my_identities.my_identities_provisioning_id: %s,\n  my_identities.my_identities_is_verified: %s,\n  my_identities.my_identities_address_type: %s,\n  my_identities.my_identities_phone_number: %s,\n  my_identities.my_identities_display_name: %s,\n  subscriptions.subscriptions_sub_id: %s,\n  subscriptions.subscriptions_sim_serial_number: %s,\n  subscriptions.subscriptions_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.g), String.valueOf(this.c), String.valueOf(this.h), String.valueOf(this.d), ax(this.e), aA(this.f), ay(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (lbzVar.db(0)) {
            this.a = riw.m(lbzVar.getString(lbzVar.cI(0, qwa.a)));
            fE(0);
        }
        boolean z = true;
        if (lbzVar.db(1)) {
            this.b = lbzVar.getString(lbzVar.cI(1, qwa.a));
            fE(1);
        }
        if (lbzVar.db(2)) {
            if (lbzVar.getInt(lbzVar.cI(2, qwa.a)) != 1) {
                z = false;
            }
            this.g = z;
            fE(2);
        }
        if (lbzVar.db(3)) {
            qvn[] values = qvn.values();
            int i = lbzVar.getInt(lbzVar.cI(3, qwa.a));
            if (i < values.length) {
                this.c = values[i];
                fE(3);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(4)) {
            this.h = lbzVar.getString(lbzVar.cI(4, qwa.a));
            fE(4);
        }
        if (lbzVar.db(5)) {
            this.d = lbzVar.getString(lbzVar.cI(5, qwa.a));
            fE(5);
        }
        if (lbzVar.db(6)) {
            this.e = agnc.w(lbz.dl(lbzVar.getString(8)), lbz.dk(lbzVar.getString(lbzVar.cI(6, qwa.a))));
            fE(6);
        }
        if (lbzVar.db(7)) {
            this.f = (String[]) agnc.z(lbz.dl(lbzVar.getString(8)), lbz.dm(lbzVar.getString(lbzVar.cI(7, qwa.a))), new String[0]);
            fE(7);
        }
        if (lbzVar.db(8)) {
            this.i = agnc.y(lbz.dl(lbzVar.getString(8)), lbz.dl(lbzVar.getString(lbzVar.cI(8, qwa.a))));
            fE(8);
        }
    }

    public final String d() {
        ao(4, "phone_number");
        return this.h;
    }

    public final int[] e() {
        ao(6, "sub_id");
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qvw)) {
            return false;
        }
        qvw qvwVar = (qvw) obj;
        if (super.aC(qvwVar.cJ) && Objects.equals(this.a, qvwVar.a) && Objects.equals(this.b, qvwVar.b) && this.g == qvwVar.g && this.c == qvwVar.c && Objects.equals(this.h, qvwVar.h) && Objects.equals(this.d, qvwVar.d) && Arrays.equals(this.e, qvwVar.e) && Arrays.equals(this.f, qvwVar.f) && Arrays.equals(this.i, qvwVar.i)) {
            return true;
        }
        return false;
    }

    public final String[] f() {
        ao(7, "sim_serial_number");
        return this.f;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        qwe qweVar = this.a;
        String str = this.b;
        Boolean valueOf = Boolean.valueOf(this.g);
        qvn qvnVar = this.c;
        if (qvnVar == null) {
            ordinal = 0;
        } else {
            ordinal = qvnVar.ordinal();
        }
        return Objects.hash(adayVar, qweVar, str, valueOf, Integer.valueOf(ordinal), this.h, this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.i)), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MyIdentitySubscriptionQuery -- REDACTED");
        }
        return a();
    }
}
