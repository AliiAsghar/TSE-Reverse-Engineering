package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaze implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaze(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        alog alogVar;
        alpt u;
        boolean z;
        ahcc ahccVar = null;
        boolean z2 = false;
        r4 = false;
        r4 = false;
        boolean z3 = false;
        z2 = false;
        switch (this.b) {
            case 0:
                aazf aazfVar = (aazf) this.a;
                if (!((mka) aazfVar.c.b()).d(aazfVar.d)) {
                    xzb.j("Bugle", "Does not need RCS Promo. Can request REQUEST_IGNORE_BATTERY_OPTIMIZATIONS.");
                } else if (((vqu) aazfVar.b.b()).E()) {
                    xzb.j("Bugle", "Needs RCS Promo, has Terms and Conditions.");
                    z2 = true;
                } else {
                    xzb.j("Bugle", "Does not need RCS Promo");
                }
                return Boolean.valueOf(z2);
            case 1:
                aayo aayoVar = (aayo) this.a;
                if (!((mka) aayoVar.d.b()).d(aayoVar.f)) {
                    xzb.j("Bugle", "Does not need RCS Promo. Can request REQUEST_IGNORE_BATTERY_OPTIMIZATIONS.");
                } else if (actx.f()) {
                    xzb.k("Bugle", "Does not need RCS Promo. ShowGoogleTos %s", Boolean.valueOf(actx.f()));
                } else {
                    ykw ykwVar = (ykw) aayoVar.e.b();
                    vqu vquVar = (vqu) aayoVar.b.b();
                    if (ykwVar.q("should_show_rcs_promo", false) && !aayoVar.e()) {
                        xzb.j("Bugle", "Needs RCS Promo (PEv2) based on Bugle Prefs.");
                    } else if (vquVar.E()) {
                        xzb.j("Bugle", "Needs RCS Promo (PEv2), has Terms and Conditions.");
                    } else {
                        xzb.j("Bugle", "Does not need RCS Promo (PEv2)");
                    }
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 2:
                xze xzeVar = abcu.a;
                snf e = sni.e();
                e.w("createShortcut");
                e.f(new aand(12));
                e.h(new aaky(this.a, 16));
                smr smrVar = (smr) ((sna) e.b().n()).cO();
                if (smrVar == null) {
                    return null;
                }
                return smrVar.O();
            case 3:
                ((zfj) ((abel) this.a).a.b()).e(new uta(null, "sync_data_to_wearable_app_dedupe", null, null, null, null));
                return null;
            case 4:
                acpt acptVar = (acpt) this.a;
                if (acptVar.N(true)) {
                    acptVar.M();
                }
                return null;
            case 5:
                adcz adczVar = (adcz) this.a;
                advr.q("Timeout while waiting for group management response for message: %s", adczVar.c);
                ajur ajurVar = new ajur(null);
                ajurVar.q(adczVar.b.b());
                ajurVar.r(MessagingResult.g);
                GroupOperationResult p = ajurVar.p();
                adczVar.s(p);
                return p;
            case 6:
                ((adms) this.a).C();
                return null;
            case 7:
                adms admsVar = (adms) this.a;
                Set j = admsVar.e.j();
                admsVar.n.v(2, j, admsVar.z(j));
                return null;
            case 8:
                return ((aehm) this.a).b();
            case 9:
                return ((aehm) ((aehv) this.a).c.b()).b();
            case 10:
                aday adayVar = (aday) this.a;
                HashMap aj = alzz.aj(adayVar.b.size());
                for (Map.Entry entry : adayVar.b.entrySet()) {
                    aj.put(((agle) entry.getKey()).a, ((aglh) entry.getValue()).a());
                }
                return aj.values();
            case 11:
                return ((spa) this.a).h(5);
            case 12:
                alok alokVar = new alok();
                Object obj = this.a;
                aguk agukVar = (aguk) obj;
                for (String str : (Set) agukVar.d.a().e("emoji_variant_prefs", Set.class, altg.a, null)) {
                    List c = agur.d.c(str);
                    if (c.size() == 2) {
                        alokVar.h((String) c.get(0), (String) c.get(1));
                    } else {
                        ((alvg) ((alvg) agur.a.i()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "retrieveBackup", 138, "EmojiVariantPreferencesBackupHelper.java")).t("Malformed entry in serialized emoji variant preferences: %s", str);
                    }
                }
                alor b = alokVar.b();
                if (!b.isEmpty()) {
                    alvi alviVar = agzo.a;
                    agzn.a.b(aguu.a, 1);
                }
                HashMap hashMap = new HashMap(b);
                Object hashMap2 = new HashMap();
                synchronized (agukVar.e) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(((aguk) obj).a());
                        try {
                            hashMap2 = DesugarCollections.unmodifiableMap(((agut) apag.parseFrom(agut.a, fileInputStream, aozs.a())).b);
                            hashMap.putAll(hashMap2);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        ((alvg) ((alvg) ((alvg) aguk.a.h()).g(e2)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider", "loadFromStickyPreferences", 'f', "DefaultStickyPreferencesProtoProvider.java")).q("Failed to load sticky preferences from file");
                    }
                }
                aozy createBuilder = agut.a.createBuilder();
                createBuilder.ap(hashMap);
                agut agutVar = (agut) createBuilder.s();
                if (((Boolean) agur.c.b()).booleanValue() && !alzz.am(b, hashMap2)) {
                    agukVar.b(agutVar);
                }
                return agutVar;
            case 13:
                Object obj2 = this.a;
                alvi alviVar2 = agum.a;
                Context context = (Context) obj2;
                Resources resources = context.getResources();
                alok alokVar2 = new alok();
                List<Integer> b2 = agul.b(context, agul.a());
                anna e3 = anna.e(',');
                for (Integer num : b2) {
                    int intValue = num.intValue();
                    alob alobVar = new alob();
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(resources.openRawResource(intValue), StandardCharsets.UTF_8);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        List c2 = e3.c(readLine);
                                        if (c2.size() == 1) {
                                            alobVar.h(new agun((String) c2.get(0), alsx.a));
                                        } else if (c2.size() >= 2) {
                                            alobVar.h(new agun((String) c2.get(0), alog.n(c2.subList(1, c2.size()))));
                                        }
                                    } else {
                                        bufferedReader.close();
                                        inputStreamReader.close();
                                        alokVar2.h(num, alobVar.g());
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (IOException e4) {
                        ((alvg) ((alvg) ((alvg) agum.a.h()).g(e4)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "getDefaultEmojiVariantList", (char) 216, "EmojiSetSupplier.java")).q("Reading emoji list failed.");
                        return altc.a;
                    }
                }
                return alokVar2.b();
            case 14:
                alvi alviVar3 = aguq.a;
                alob alobVar2 = new alob();
                boolean b3 = agxg.b(agxg.instance.h);
                Object obj3 = this.a;
                if (b3) {
                    alogVar = aguq.c;
                } else {
                    alogVar = aguq.d;
                }
                for (int i = 0; i < ((alsx) alogVar).c; i++) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(((Context) obj3).getResources().openRawResource(((Integer) alogVar.get(i)).intValue()), StandardCharsets.UTF_8));
                        while (true) {
                            try {
                                String readLine2 = bufferedReader2.readLine();
                                if (readLine2 != null) {
                                    List c3 = anna.e(',').c(readLine2);
                                    if (c3.size() > 1) {
                                        alobVar2.h(alog.n(c3));
                                    }
                                } else {
                                    bufferedReader2.close();
                                }
                            } catch (Throwable th7) {
                                try {
                                    bufferedReader2.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        }
                    } catch (IOException e5) {
                        ((alvg) ((alvg) aguq.a.h()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider", "loadVariantsMapsFromDisk", 295, "EmojiVariantDataProvider.java")).q("Failed to load emoji variation data.");
                        throw e5;
                    }
                }
                return alobVar2.g();
            case 15:
                agux aguxVar = (agux) this.a;
                aguw aguwVar = (aguw) agkx.i(aguxVar.h, aguw.a);
                aguxVar.d.putAll(DesugarCollections.unmodifiableMap(aguwVar.d));
                agve agveVar = aguwVar.c;
                if (agveVar == null) {
                    agveVar = agve.a;
                }
                aguxVar.c.set(agveVar);
                return null;
            case 16:
                ((alvg) ((alvg) agvg.a.f()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "initStickyVariantsPreferences", 97, "StickyVariantsPreferences.java")).q("Successfully load sticky preferences from disk");
                final agvg agvgVar = (agvg) this.a;
                agvgVar.d.putAll(DesugarCollections.unmodifiableMap(((agut) agkx.i(agvgVar.h, agut.a)).b));
                aguq aguqVar = agvgVar.c;
                if (!agkx.j(aguqVar.k)) {
                    u = altg.a;
                } else {
                    u = ((aloi) aguqVar.i.get()).u();
                }
                Map map = agvgVar.d;
                alpt o = alpt.o(u);
                if (!o.containsAll(map.keySet())) {
                    alpt o2 = alpt.o(alzz.G(agvgVar.d.keySet(), o));
                    ((alvg) ((alvg) agvg.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 162, "StickyVariantsPreferences.java")).r("Attempting to migrate %d sticky preferences to new base variant", o2.size());
                    aluq listIterator = o2.listIterator();
                    while (listIterator.hasNext()) {
                        String str2 = (String) listIterator.next();
                        final String str3 = (String) agvgVar.d.get(str2);
                        if (str3 == null) {
                            ((alvg) ((alvg) agvg.a.h()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 168, "StickyVariantsPreferences.java")).t("%s not found in base variant --> sticky variant map", str2);
                        } else {
                            algw aJ = alzz.aJ(o, new algy() { // from class: agvf
                                @Override // defpackage.algy
                                public final boolean a(Object obj4) {
                                    return agvg.this.c.c((String) obj4).contains(str3);
                                }
                            });
                            if (!aJ.f()) {
                                ((alvg) ((alvg) agvg.a.i()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 177, "StickyVariantsPreferences.java")).D("%s missing in variant map, discarding sticky preference for old base variant %s", str3, str2);
                            } else {
                                ((alvg) ((alvg) agvg.a.d()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 181, "StickyVariantsPreferences.java")).D("Migrated sticky preference for %s to new base variant %s", str2, aJ);
                                agvgVar.d.put((String) aJ.b(), str3);
                            }
                            agvgVar.d.remove(str2);
                        }
                    }
                    ((aguk) agvgVar.f).b(agvgVar.a());
                }
                return null;
            case 17:
                return Boolean.valueOf(((ahae) this.a).commit());
            case 18:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ahcc ahccVar2 = (ahcc) albo.bQ((ListenableFuture) it.next());
                    if (ahccVar2 != null) {
                        if (ahccVar == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        albo.U(z, "More than one auth provider provided result.");
                        ahccVar = ahccVar2;
                    }
                }
                if (ahccVar != null) {
                    return ahccVar;
                }
                throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
            case 19:
                ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterMaxDelay", 114, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after max task delay");
                ((ahjz) this.a).i();
                return null;
            default:
                ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 120, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after onResume");
                ((ahjz) this.a).i();
                return null;
        }
    }
}
