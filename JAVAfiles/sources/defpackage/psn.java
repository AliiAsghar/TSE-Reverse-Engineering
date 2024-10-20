package defpackage;

import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psn {
    public static final utz a = uuh.i(uuh.b, "enable_bot_id_logging_with_block_reports", false);
    public static final utz b = uuh.i(uuh.b, "enable_draft_toolstone", false);
    public static final utz c = uuh.e(uuh.b, "rbm_toolstone_reappearance_strategy", 1);
    public static final utz d = uuh.e(uuh.b, "rbm_toolstone_reappearance_unresponded_time_passed_days", 10);
    public static final utz e = uuh.e(uuh.b, "rbm_toolstone_reappearance_unresponded_message_count", 10);
    public static final utz f = uuh.i(uuh.b, "rbm_toolstone_visible_by_default", false);
    public static final utz g = uuh.e(uuh.b, "rbm_toolstone_first_appearance_strategy", 1);
    public static final utz h = uuh.e(uuh.b, "rbm_toolstone_first_appearance_unresponded_time_passed_days", 10);
    public static final utz i = uuh.h(uuh.b, "rbm_toolstone_allowlisted_bot_ids", "google@rbm.goog");
    public static final utz j = uuh.e(uuh.b, "rbm_toolstone_first_appearance_unresponded_message_count", 10);
    public static final utz k = uuh.i(uuh.b, "enable_blocking_on_toolstone_calculation", false);
    public static final utz l = uuh.h(uuh.b, "rbm_toolstone_enabled_domains", "rbm.goog");
    public static final uuf m;

    static {
        ahtn ahtnVar = uuh.b;
        aozy createBuilder = aplg.a.createBuilder();
        createBuilder.getClass();
        DesugarCollections.unmodifiableList(((aplg) createBuilder.b).b).getClass();
        createBuilder.bz("OTP");
        apag s = createBuilder.s();
        s.getClass();
        m = uuh.u(ahtnVar, "hide_rbm_toolstone_categories", (aplg) s, new mdd(6));
        uuh.i(uuh.b, "catch_null_bot_id_and_raw_destination", false);
    }

    public static final List a() {
        apax apaxVar = ((aplg) m.e()).b;
        apaxVar.getClass();
        return apaxVar;
    }

    public static final List b() {
        Object e2 = i.e();
        e2.getClass();
        return e((String) e2);
    }

    public static final List c() {
        Object e2 = l.e();
        e2.getClass();
        return e((String) e2);
    }

    public static final long d(int i2) {
        Integer num;
        if (i2 == 3) {
            num = (Integer) h.e();
        } else {
            num = (Integer) d.e();
        }
        num.getClass();
        return Duration.ofDays(Math.max(0, Math.min(90, num.intValue()))).toMillis();
    }

    private static final List e(String str) {
        if (str.length() == 0) {
            return arnv.a;
        }
        List ab = arsd.ab(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(aqjn.J(ab, 10));
        Iterator it = ab.iterator();
        while (it.hasNext()) {
            arrayList.add(arsd.D((String) it.next()).toString());
        }
        return arrayList;
    }
}
