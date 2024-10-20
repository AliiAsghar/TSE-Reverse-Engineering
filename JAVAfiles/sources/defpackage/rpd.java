package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpd implements aglx {
    public static final rpd a = new rpd();
    public static final Map b = aqjn.m(new armo(d("_id"), e("_id")), new armo(d("my_identity_token_foreign_key"), e("my_identity_token_foreign_key")), new armo(d("normalized_destination"), e("normalized_destination")), new armo(d("send_destination"), e("send_destination")), new armo(d("display_destination"), e("display_destination")), new armo(d("first_name"), e("first_name")), new armo(d("full_name"), e("full_name")), new armo(d("blocked"), e("blocked")), new armo(d("participant_type"), e("participant_type")), new armo(d("is_spam"), e("is_spam")), new armo(d("is_spam_source"), e("is_spam_source")), new armo(d("country_code"), e("country_code")), new armo(d("color_palette_index"), e("color_palette_index")), new armo(d("color_type"), e("color_type")), new armo(d("extended_color"), e("extended_color")), new armo(d("cms_id"), e("cms_id")), new armo(d("cms_life_cycle"), e("cms_life_cycle")));

    private rpd() {
    }

    public static final taz c() {
        taz e = ParticipantsTable.e();
        e.q();
        tas[] tasVarArr = (tas[]) b.values().toArray(new tas[0]);
        e.c((tas[]) Arrays.copyOf(tasVarArr, tasVarArr.length));
        return e;
    }

    private static final rou d(String str) {
        String str2;
        agmh[] l = vht.l();
        for (int i = 0; i < 18; i++) {
            agmh agmhVar = l[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rou) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final tas e(String str) {
        String str2;
        agmh[] e = ubh.e();
        for (int i = 0; i < 45; i++) {
            agmh agmhVar = e[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (tas) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rox roxVar = new rox();
        roxVar.e();
        roxVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("participants_backup", "backup");
        agofVar.d = 5;
        rou[] rouVarArr = (rou[]) b.keySet().toArray(new rou[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rouVarArr, rouVarArr.length));
        agofVar.c = c().b();
        agofVar.a().a();
    }
}
