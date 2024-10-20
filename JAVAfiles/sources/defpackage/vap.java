package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Optional;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vap {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor");
    public final armf a;
    private final Context c;
    private final armf d;
    private final ppz e;

    public vap(Map map, armf armfVar, Context context, armf armfVar2, ppz ppzVar) {
        this.c = context;
        alor.j(map);
        this.a = armfVar;
        this.d = armfVar2;
        this.e = ppzVar;
    }

    private static aotx c(Context context, aoty aotyVar) {
        aozy createBuilder = aoub.a.createBuilder();
        String str = Build.DEVICE;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aoub aoubVar = (aoub) createBuilder.b;
        str.getClass();
        aoubVar.b = str;
        aoub aoubVar2 = (aoub) createBuilder.s();
        aozy createBuilder2 = aotv.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aotv) createBuilder2.b).b = "com.google.android.apps.messaging";
        long a = adww.a(context);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aotv) createBuilder2.b).c = a;
        aotv aotvVar = (aotv) createBuilder2.s();
        aozy createBuilder3 = aotx.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ((aotx) createBuilder3.b).d = aotyVar.a();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        aotx aotxVar = (aotx) createBuilder3.b;
        aoubVar2.getClass();
        aotxVar.e = aoubVar2;
        aotxVar.b |= 1;
        createBuilder3.aY(aotvVar);
        return (aotx) createBuilder3.s();
    }

    private static String d(String str) {
        try {
            return str.substring(0, 8);
        } catch (StringIndexOutOfBoundsException e) {
            alvw i = b.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "getImsiPrefix", (char) 291, "MobileConfigurationBugleAccessor.java")).q("MobileConfigurationBugleAccessor: failed to obtain imsiPrefix");
            return "";
        }
    }

    public final void a(alog alogVar) {
        if (((ansy) ((ppq) this.e).a.b()).e("bugle.wear_disable_mobile_configuration")) {
            b(alogVar);
        } else {
            b(alogVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(alog alogVar) {
        aluq aluqVar;
        altx altxVar;
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        String b2;
        Context context;
        wxb wxbVar;
        String str4;
        apag apagVar;
        vap vapVar = this;
        d.s(!alogVar.isEmpty());
        alok alokVar = new alok();
        alpt t = alpt.t(aoty.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS, aoty.CONFIGURATION_TYPE_MESSAGES_XMS_CARRIER_CONFIG_FLAGS, aoty.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS, aoty.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION);
        altx altxVar2 = new altx(aoty.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION);
        aluq listIterator = t.listIterator();
        while (true) {
            String str5 = "registerParametersInternal";
            if (!listIterator.hasNext()) {
                break;
            }
            aoty aotyVar = (aoty) listIterator.next();
            if (altxVar2.contains(aotyVar)) {
                alokVar.h(vaq.a(aotyVar.name(), aotyVar).b(), c(vapVar.c, aotyVar));
            } else {
                int size = alogVar.size();
                int i3 = 0;
                while (i3 < size) {
                    String str6 = (String) alogVar.get(i3);
                    try {
                        b2 = vaq.a(str6, aotyVar).b();
                        context = vapVar.c;
                        aluqVar = listIterator;
                    } catch (NoSuchElementException e) {
                        e = e;
                        aluqVar = listIterator;
                    }
                    try {
                        wxbVar = (wxb) ((wwn) vapVar.d.b()).j(new adiw(str6)).orElseThrow();
                        str4 = wxbVar.k;
                        altxVar = altxVar2;
                    } catch (NoSuchElementException e2) {
                        e = e2;
                        altxVar = altxVar2;
                        str = str5;
                        i = size;
                        i2 = i3;
                        str2 = str6;
                        alvw i4 = b.i();
                        i4.X(alwp.a, "Bugle");
                        str3 = str;
                        ((alvg) ((alvg) ((alvg) i4).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 136, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", yyb.bh(str2));
                        i3 = i2 + 1;
                        vapVar = this;
                        str5 = str3;
                        listIterator = aluqVar;
                        altxVar2 = altxVar;
                        size = i;
                    }
                    try {
                        String str7 = wxbVar.l;
                        i = size;
                        try {
                            String d = d(wxbVar.f);
                            String str8 = wxbVar.t;
                            boolean z = wxbVar.o;
                            int i5 = wxbVar.m;
                            i2 = i3;
                            try {
                                aozy createBuilder = aouo.a.createBuilder();
                                str2 = str6;
                                try {
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apagVar = createBuilder.b;
                                    str = str5;
                                } catch (NoSuchElementException e3) {
                                    e = e3;
                                    str = str5;
                                }
                                try {
                                    str8.getClass();
                                    ((aouo) apagVar).d = str8;
                                    if (!apagVar.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apag apagVar2 = createBuilder.b;
                                    str4.getClass();
                                    ((aouo) apagVar2).b = str4;
                                    if (!apagVar2.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apag apagVar3 = createBuilder.b;
                                    str7.getClass();
                                    ((aouo) apagVar3).c = str7;
                                    long j = i5;
                                    if (!apagVar3.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apag apagVar4 = createBuilder.b;
                                    ((aouo) apagVar4).f = j;
                                    if (!apagVar4.isMutable()) {
                                        createBuilder.u();
                                    }
                                    ((aouo) createBuilder.b).g = z;
                                    if (d.startsWith(String.valueOf(str4).concat(String.valueOf(str7)))) {
                                        if (!createBuilder.b.isMutable()) {
                                            createBuilder.u();
                                        }
                                        aouo aouoVar = (aouo) createBuilder.b;
                                        d.getClass();
                                        aouoVar.e = d;
                                    }
                                    aouo aouoVar2 = (aouo) createBuilder.s();
                                    aozy builder = c(context, aotyVar).toBuilder();
                                    if (!builder.b.isMutable()) {
                                        builder.u();
                                    }
                                    aotx aotxVar = (aotx) builder.b;
                                    aouoVar2.getClass();
                                    aotxVar.f = aouoVar2;
                                    aotxVar.b |= 2;
                                    alokVar.h(b2, (aotx) builder.s());
                                    str3 = str;
                                } catch (NoSuchElementException e4) {
                                    e = e4;
                                    alvw i42 = b.i();
                                    i42.X(alwp.a, "Bugle");
                                    str3 = str;
                                    ((alvg) ((alvg) ((alvg) i42).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 136, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", yyb.bh(str2));
                                    i3 = i2 + 1;
                                    vapVar = this;
                                    str5 = str3;
                                    listIterator = aluqVar;
                                    altxVar2 = altxVar;
                                    size = i;
                                }
                            } catch (NoSuchElementException e5) {
                                e = e5;
                                str = str5;
                                str2 = str6;
                                alvw i422 = b.i();
                                i422.X(alwp.a, "Bugle");
                                str3 = str;
                                ((alvg) ((alvg) ((alvg) i422).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 136, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", yyb.bh(str2));
                                i3 = i2 + 1;
                                vapVar = this;
                                str5 = str3;
                                listIterator = aluqVar;
                                altxVar2 = altxVar;
                                size = i;
                            }
                        } catch (NoSuchElementException e6) {
                            e = e6;
                            str = str5;
                            i2 = i3;
                            str2 = str6;
                            alvw i4222 = b.i();
                            i4222.X(alwp.a, "Bugle");
                            str3 = str;
                            ((alvg) ((alvg) ((alvg) i4222).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 136, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", yyb.bh(str2));
                            i3 = i2 + 1;
                            vapVar = this;
                            str5 = str3;
                            listIterator = aluqVar;
                            altxVar2 = altxVar;
                            size = i;
                        }
                    } catch (NoSuchElementException e7) {
                        e = e7;
                        str = str5;
                        i = size;
                        i2 = i3;
                        str2 = str6;
                        alvw i42222 = b.i();
                        i42222.X(alwp.a, "Bugle");
                        str3 = str;
                        ((alvg) ((alvg) ((alvg) i42222).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 136, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", yyb.bh(str2));
                        i3 = i2 + 1;
                        vapVar = this;
                        str5 = str3;
                        listIterator = aluqVar;
                        altxVar2 = altxVar;
                        size = i;
                    }
                    i3 = i2 + 1;
                    vapVar = this;
                    str5 = str3;
                    listIterator = aluqVar;
                    altxVar2 = altxVar;
                    size = i;
                }
                vapVar = this;
            }
        }
        if (((Optional) vapVar.a.b()).isEmpty()) {
            alvw i6 = b.i();
            i6.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i6).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 144, "MobileConfigurationBugleAccessor.java")).q("MobileConfigurationBugleAccessor: Could not access MobileConfigurationApi");
        } else {
            alor b3 = alokVar.b();
            alvw d2 = b.d();
            d2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 151, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: Registered configuration: %s", b3.keySet());
            ((aegz) ((Optional) vapVar.a.b()).get()).d(b3);
        }
    }
}
