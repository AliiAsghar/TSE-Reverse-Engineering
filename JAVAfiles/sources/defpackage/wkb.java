package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wkb implements armf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wkb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v46, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.b) {
            case 0:
                return (akcq) this.a.b();
            case 1:
                return (akcq) this.a.b();
            case 2:
                return (akcq) this.a.b();
            case 3:
                ruu a = ruv.a();
                a.f(false);
                a.e(false);
                a.s(new xhv());
                a.j(aqjn.y(this.a));
                a.c = Optional.empty();
                a.g(0);
                return a.a();
            case 4:
                return (akcq) this.a.b();
            case 5:
                return (akcq) this.a.b();
            case 6:
                return ((znj) this.a).a;
            case 7:
                return ((znj) this.a).b;
            case 8:
                aiwl a2 = wus.a();
                a2.i(wuk.REVERSE_TELEPHONY_SYNC_STATE);
                a2.k(xgy.a);
                return ((znj) this.a).ab(a2.f());
            case 9:
                return (akoa) this.a.b();
            case 10:
                return this.a;
            case 11:
                int i = xii.g;
                Object obj = this.a;
                obj.getClass();
                return obj;
            case 12:
                return (akcq) this.a.b();
            case 13:
                return Long.valueOf(yyb.cE((xhv) ((xwa) this.a).b.b()));
            case 14:
                alvi alviVar = yon.a;
                return this.a.a();
            case 15:
                return (akoa) this.a.b();
            case 16:
                return this.a.gk();
            case 17:
                return this.a.al();
            case 18:
                return this.a.hI();
            case 19:
                boolean b = ((aben) ((abem) this.a).c.b()).b();
                alvw e = abem.a.e();
                e.X(alwp.a, "BugleWearable");
                alvg alvgVar = (alvg) e;
                alvgVar.X(ydl.M, "CachedWearableCompanionAppInstalledImpl");
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "isWearCompanionAppInstalled", 103, "CachedWearableCompanionAppInstalledImpl.java");
                Boolean valueOf = Boolean.valueOf(b);
                alvgVar2.t("Caching isWearCompanionAppInstalled with value=%s", valueOf);
                return valueOf;
            default:
                boolean a3 = ((aben) ((abem) this.a).c.b()).a();
                alvw e2 = abem.a.e();
                e2.X(alwp.a, "BugleWearable");
                alvg alvgVar3 = (alvg) e2;
                alvgVar3.X(ydl.M, "CachedWearableCompanionAppInstalledImpl");
                alvg alvgVar4 = (alvg) alvgVar3.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "companionHasMissingHapticsBugFix", 117, "CachedWearableCompanionAppInstalledImpl.java");
                Boolean valueOf2 = Boolean.valueOf(a3);
                alvgVar4.t("Caching companionHasMissingHapticsBugFix with value=%s", valueOf2);
                return valueOf2;
        }
    }
}
