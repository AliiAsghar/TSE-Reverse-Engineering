package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvu {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore");
    public final adtn b;
    private final armf c;

    public wvu(adtn adtnVar, armf armfVar) {
        adtnVar.getClass();
        armfVar.getClass();
        this.b = adtnVar;
        this.c = armfVar;
    }

    private final String h(wxb wxbVar, wwm wwmVar) {
        String str;
        if (wxbVar != null && (str = wxbVar.c) != null) {
            return str;
        }
        return i(b(wwmVar));
    }

    private static final String i(wxb wxbVar) {
        String str;
        if (wxbVar != null && (str = wxbVar.c) != null) {
            return str;
        }
        ((alvg) a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimIdOrEmpty", 50, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: can't get simId for null SimSubscriptionInfo when setting PhoneDefaults.");
        return "";
    }

    public final wwz a() {
        aozy createBuilder = wwz.a.createBuilder();
        createBuilder.getClass();
        wcm.x(i(this.b.d()), createBuilder);
        wcm.A(i(this.b.e()), createBuilder);
        wcm.y(i(this.b.c()), createBuilder);
        wcm.z(i(this.b.d()), createBuilder);
        return wcm.w(createBuilder);
    }

    public final wxb b(wwm wwmVar) {
        wwmVar.getClass();
        int ordinal = wwmVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return this.b.c();
                }
                throw new armm();
            }
            return this.b.e();
        }
        return this.b.d();
    }

    public final wxb c(adiv adivVar) {
        adivVar.getClass();
        wxb f = this.b.f(adom.n(adivVar).a);
        if (f == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimSubscriptionInfoSync", 62, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No sim subscription info found for RCS provisioning id");
        }
        return f;
    }

    public final wxb d(int i) {
        wxb v = adtn.v(this.b.o(a.bV(i, "sim_subscription_info_sub_id_")));
        if (v == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimSubscriptionInfoSync-0jkzt_0", 76, "SharedPreferencesSimStateStore.kt")).r("SharedPreferencesSimStateStore: No sim subscription info found for subscription id: %s", i);
        }
        return v;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Iterable] */
    public final Set e() {
        ?? d = this.b.n.d();
        d.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            wxb f = this.b.f((String) it.next());
            if (f == null) {
                ((alvg) a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getActiveSimSubscriptionInfosSync", 102, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No sim subscription info found for active sim id");
            }
            if (f != null) {
                arrayList.add(f);
            }
        }
        return aqjn.aE(arrayList);
    }

    public final Object f(wwz wwzVar) {
        wwzVar.getClass();
        wxb f = this.b.f(wwzVar.c);
        wxb f2 = this.b.f(wwzVar.d);
        wxb f3 = this.b.f(wwzVar.e);
        if (((acws) this.c.b()).a()) {
            if (f != null) {
                this.b.r(f);
            }
            if (f2 != null) {
                this.b.s(f2);
            }
            if (f3 != null) {
                this.b.q(f3);
            }
            aozy createBuilder = wwz.a.createBuilder();
            createBuilder.getClass();
            wcm.x(h(f, wwm.a), createBuilder);
            wcm.A(h(f2, wwm.b), createBuilder);
            wcm.y(h(f3, wwm.c), createBuilder);
            wcm.z(h(f, wwm.a), createBuilder);
            return wcm.w(createBuilder);
        }
        adtn adtnVar = this.b;
        if (f == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "savePhoneDefaultsSync", 176, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No default sim subscription info found for default call sim");
        }
        adtnVar.r(f);
        adtn adtnVar2 = this.b;
        if (f2 == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "savePhoneDefaultsSync", 184, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No default sim subscription info found for default sms sim");
        }
        adtnVar2.s(f2);
        adtn adtnVar3 = this.b;
        if (f3 == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "savePhoneDefaultsSync", 192, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No default sim subscription info found for default data sim");
        }
        adtnVar3.q(f3);
        wwz wwzVar2 = wwz.a;
        wwzVar2.getClass();
        return wwzVar2;
    }

    public final Object g(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            wxb wxbVar = (wxb) it.next();
            adtn adtnVar = this.b;
            String w = adtn.w(wxbVar);
            adtnVar.t("sim_subscription_info_sim_id_".concat(String.valueOf(wxbVar.c)), w);
            adtnVar.t("sim_subscription_info_sub_id_" + wxbVar.d, w);
        }
        adtn adtnVar2 = this.b;
        ArrayList arrayList = new ArrayList(aqjn.J(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(((wxb) it2.next()).c);
        }
        adtnVar2.n.e(aqjn.aE(arrayList));
        return arnb.a;
    }
}
