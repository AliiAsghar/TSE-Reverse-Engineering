package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdy extends aglz {
    public String a;
    public MessageIdType b = rvc.a;
    public long[] c;
    public long[] d;
    public long[] e;
    public Optional[] f;
    public long[] g;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ReadReportsConcatView [read_reports.read_reports__id: %s,\n  read_reports.read_reports_message_id: %s,\n  read_reports.read_reports_participant_id: %s,\n  read_reports.read_reports_receive_time: %s,\n  read_reports.read_reports_read_time: %s,\n  read_reports.read_reports_ftd_time: %s,\n  read_reports.read_reports_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), ay(this.c), ay(this.d), ay(this.e), az(this.f), ay(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sea seaVar = (sea) agmqVar;
        aq();
        this.cJ = seaVar.dx();
        if (seaVar.db(0)) {
            this.a = seaVar.getString(seaVar.cI(0, seb.a));
            fE(0);
        }
        if (seaVar.db(1)) {
            this.b = new MessageIdType(seaVar.getLong(seaVar.cI(1, seb.a)));
            fE(1);
        }
        if (seaVar.db(2)) {
            this.c = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(2, seb.a))));
            fE(2);
        }
        if (seaVar.db(3)) {
            this.d = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(3, seb.a))));
            fE(3);
        }
        if (seaVar.db(4)) {
            this.e = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(4, seb.a))));
            fE(4);
        }
        if (seaVar.db(5)) {
            long[] dl = sea.dl(seaVar.getString(seaVar.cI(5, seb.a)));
            int length = dl.length;
            Optional[] optionalArr = new Optional[length];
            for (int i = 0; i < length; i++) {
                optionalArr[i] = uxi.g(dl[i]);
            }
            this.f = (Optional[]) agnc.z(null, optionalArr, new Optional[0]);
            fE(5);
        }
        if (seaVar.db(6)) {
            this.g = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(6, seb.a))));
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sdy)) {
            return false;
        }
        sdy sdyVar = (sdy) obj;
        if (super.aC(sdyVar.cJ) && Objects.equals(this.a, sdyVar.a) && Objects.equals(this.b, sdyVar.b) && Arrays.equals(this.c, sdyVar.c) && Arrays.equals(this.d, sdyVar.d) && Arrays.equals(this.e, sdyVar.e) && Arrays.equals(this.f, sdyVar.f) && Arrays.equals(this.g, sdyVar.g)) {
            return true;
        }
        return false;
    }

    public final long[] f() {
        ao(2, "participant_id");
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
        return Objects.hash(adayVar, this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ReadReportsConcatView -- REDACTED");
        }
        return a();
    }
}
