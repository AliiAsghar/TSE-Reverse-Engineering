package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class toa extends aglz {
    public MessageIdType a = rvc.a;
    public long[] b;
    public long[] c;
    public long[] d;
    public String[] e;
    public String[] f;
    public String[] g;
    public String[] h;
    public String[] i;
    public int[] j;
    public int[] k;
    public int[] l;
    public long[] m;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "UserRefConcatView [user_references.user_references_message_id: %s,\n  user_references.user_references_user_ref_id: %s,\n  user_references.user_references_user_ref_datetime: %s,\n  user_references.user_references_rowid: %s,\n  null.user_ref_display_name: %s,\n  null.user_ref_profile_photo_uri: %s,\n  null.user_ref_full_name: %s,\n  null.user_ref_lookup_key: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), ay(this.b), ay(this.c), ay(this.d), "REDACTED", "REDACTED", "REDACTED", "REDACTED", aA(this.i), ax(this.j), ax(this.k), ax(this.l), ay(this.m));
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
            this.a = new MessageIdType(seaVar.getLong(seaVar.cI(0, toc.a)));
            fE(0);
        }
        if (seaVar.db(1)) {
            this.b = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(1, toc.a))));
            fE(1);
        }
        if (seaVar.db(2)) {
            this.c = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(2, toc.a))));
            fE(2);
        }
        if (seaVar.db(3)) {
            this.d = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(3, toc.a))));
            fE(3);
        }
        if (seaVar.db(4)) {
            this.e = (String[]) agnc.z(null, sea.dm(seaVar.getString(seaVar.cI(4, toc.a))), new String[0]);
            fE(4);
        }
        if (seaVar.db(5)) {
            this.f = (String[]) agnc.z(null, sea.dm(seaVar.getString(seaVar.cI(5, toc.a))), new String[0]);
            fE(5);
        }
        if (seaVar.db(6)) {
            this.g = (String[]) agnc.z(null, sea.dm(seaVar.getString(seaVar.cI(6, toc.a))), new String[0]);
            fE(6);
        }
        if (seaVar.db(7)) {
            this.h = (String[]) agnc.z(null, sea.dm(seaVar.getString(seaVar.cI(7, toc.a))), new String[0]);
            fE(7);
        }
        if (seaVar.db(8)) {
            String[] dm = sea.dm(seaVar.getString(seaVar.cI(8, toc.a)));
            for (int i = 0; i < dm.length; i++) {
                dm[i] = aabr.bb(dm[i]);
            }
            this.i = (String[]) agnc.z(null, dm, new String[0]);
            fE(8);
        }
        if (seaVar.db(9)) {
            this.j = agnc.w(null, sea.dk(seaVar.getString(seaVar.cI(9, toc.a))));
            fE(9);
        }
        if (seaVar.db(10)) {
            this.k = agnc.w(null, sea.dk(seaVar.getString(seaVar.cI(10, toc.a))));
            fE(10);
        }
        if (seaVar.db(11)) {
            this.l = agnc.w(null, sea.dk(seaVar.getString(seaVar.cI(11, toc.a))));
            fE(11);
        }
        if (seaVar.db(12)) {
            this.m = agnc.y(null, sea.dl(seaVar.getString(seaVar.cI(12, toc.a))));
            fE(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof toa)) {
            return false;
        }
        toa toaVar = (toa) obj;
        if (super.aC(toaVar.cJ) && Objects.equals(this.a, toaVar.a) && Arrays.equals(this.b, toaVar.b) && Arrays.equals(this.c, toaVar.c) && Arrays.equals(this.d, toaVar.d) && Arrays.equals(this.e, toaVar.e) && Arrays.equals(this.f, toaVar.f) && Arrays.equals(this.g, toaVar.g) && Arrays.equals(this.h, toaVar.h) && Arrays.equals(this.i, toaVar.i) && Arrays.equals(this.j, toaVar.j) && Arrays.equals(this.k, toaVar.k) && Arrays.equals(this.l, toaVar.l) && Arrays.equals(this.m, toaVar.m)) {
            return true;
        }
        return false;
    }

    public final long[] f() {
        ao(1, "user_ref_id");
        return this.b;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "UserRefConcatView -- REDACTED");
        }
        return a();
    }
}
