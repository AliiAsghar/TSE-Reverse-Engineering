package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.material.tabs.TabLayout;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adef {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public adef(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    public static final String h(String str) {
        if (str.startsWith("//")) {
            return "https:".concat(String.valueOf(str));
        }
        return str;
    }

    public static final Instant i(apct apctVar) {
        return Instant.ofEpochSecond(apctVar.b, apctVar.c);
    }

    public static final String j(String str, String str2) {
        alpt alptVar = amcf.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if ("a".matches("[a-z0-9-]+")) {
            if (!amcf.a.contains("a")) {
                amcf.c(amch.a(str), "a", linkedHashMap);
                amcf.b(str2, "a", arrayList);
                return amcf.a("a", linkedHashMap, arrayList).a;
            }
            throw new IllegalArgumentException("Element \"a\" is not supported.");
        }
        throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(defpackage.abnq r19, defpackage.alhr r20, defpackage.algk r21) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adef.l(abnq, alhr, algk):void");
    }

    private final aiao m(aowm aowmVar) {
        aowk aowkVar;
        aibi aibiVar;
        aibn a = aiao.a();
        apax apaxVar = aowmVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = apaxVar.iterator();
        while (true) {
            aibi aibiVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            aowj aowjVar = (aowj) it.next();
            if ((1 & aowjVar.b) != 0) {
                aowi aowiVar = aowjVar.c;
                if (aowiVar == null) {
                    aowiVar = aowi.a;
                }
                aibiVar = w(aowiVar);
            } else {
                aibiVar = null;
            }
            if ((aowjVar.b & 2) != 0) {
                aowi aowiVar2 = aowjVar.d;
                if (aowiVar2 == null) {
                    aowiVar2 = aowi.a;
                }
                aibiVar2 = w(aowiVar2);
            }
            arrayList.add(new ahzo(aibiVar, aibiVar2));
        }
        a.h(arrayList);
        a.j(aowmVar.c);
        switch (aowmVar.d) {
            case 0:
                aowkVar = aowk.SECONDARY_HOURS_TYPE_UNSPECIFIED;
                break;
            case 1:
                aowkVar = aowk.DRIVE_THROUGH;
                break;
            case 2:
                aowkVar = aowk.HAPPY_HOUR;
                break;
            case 3:
                aowkVar = aowk.DELIVERY;
                break;
            case 4:
                aowkVar = aowk.TAKEOUT;
                break;
            case 5:
                aowkVar = aowk.KITCHEN;
                break;
            case 6:
                aowkVar = aowk.BREAKFAST;
                break;
            case 7:
                aowkVar = aowk.LUNCH;
                break;
            case 8:
                aowkVar = aowk.DINNER;
                break;
            case 9:
                aowkVar = aowk.BRUNCH;
                break;
            case 10:
                aowkVar = aowk.PICKUP;
                break;
            case 11:
                aowkVar = aowk.ACCESS;
                break;
            case 12:
                aowkVar = aowk.SENIOR_HOURS;
                break;
            case 13:
                aowkVar = aowk.ONLINE_SERVICE_HOURS;
                break;
            default:
                aowkVar = null;
                break;
        }
        if (aowkVar == null) {
            aowkVar = aowk.UNRECOGNIZED;
        }
        a.d = (aian) ((alor) this.c).getOrDefault(aowkVar, null);
        apax apaxVar2 = aowmVar.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it2 = apaxVar2.iterator();
        while (it2.hasNext()) {
            try {
                apun apunVar = ((aowl) it2.next()).b;
                if (apunVar == null) {
                    apunVar = apun.a;
                }
                aibf a2 = aibg.a(t(apunVar));
                a2.b(true);
                arrayList2.add(a2.a());
            } catch (IllegalArgumentException e) {
                throw o(String.format("Special day is not properly defined: %s", e.getMessage()));
            }
        }
        a.i(arrayList2);
        return a.f();
    }

    private final List n(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m((aowm) it.next()));
        }
        return arrayList;
    }

    private static final abra o(String str) {
        return new abra(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static final String p(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static final aiav q(boolean z, boolean z2) {
        if (!z) {
            return aiav.UNKNOWN;
        }
        if (z2) {
            return aiav.TRUE;
        }
        return aiav.FALSE;
    }

    private static final String r(String str) {
        if (!str.isEmpty()) {
            return String.valueOf(str).concat(".png");
        }
        return null;
    }

    private static final LatLng s(apuo apuoVar) {
        return new LatLng(apuoVar.b, apuoVar.c);
    }

    private static final aiaj t(apun apunVar) {
        return aiaj.b(apunVar.b, apunVar.c, apunVar.d);
    }

    private static final Uri u(String str) {
        if (!str.isEmpty()) {
            return Uri.parse(str);
        }
        return null;
    }

    private static final ahyw v(aovr aovrVar) {
        String str = aovrVar.b;
        if (!str.isEmpty()) {
            if (str != null) {
                String p = p(aovrVar.c);
                String p2 = p(aovrVar.d);
                d.t(!new ahzb(str, p, p2).a.isEmpty(), "Name must not be empty.");
                return new ahzb(str, p, p2);
            }
            throw new NullPointerException("Null name");
        }
        throw o("Author name not provided for an AuthorAttribution result.");
    }

    private static final aibi w(aowi aowiVar) {
        aiaj aiajVar;
        aiac aiacVar;
        int i = aowiVar.c;
        aiak a = aiak.a(aowiVar.d, aowiVar.e);
        if ((aowiVar.b & 8) != 0) {
            apun apunVar = aowiVar.f;
            if (apunVar == null) {
                apunVar = apun.a;
            }
            aiajVar = t(apunVar);
        } else {
            aiajVar = null;
        }
        switch (i) {
            case 0:
                aiacVar = aiac.SUNDAY;
                break;
            case 1:
                aiacVar = aiac.MONDAY;
                break;
            case 2:
                aiacVar = aiac.TUESDAY;
                break;
            case 3:
                aiacVar = aiac.WEDNESDAY;
                break;
            case 4:
                aiacVar = aiac.THURSDAY;
                break;
            case 5:
                aiacVar = aiac.FRIDAY;
                break;
            case 6:
                aiacVar = aiac.SATURDAY;
                break;
            default:
                throw o("Day of week must an integer between 0 and 6");
        }
        ajyt a2 = aibi.a(aiacVar, a);
        a2.e = aiajVar;
        a2.m(aowiVar.g);
        return a2.l();
    }

    private static final void x(ahur ahurVar, Object obj, ConcurrentMap concurrentMap, boolean z) {
        Set<ahur> set = (Set) concurrentMap.putIfAbsent(obj, new altx(ahurVar));
        if (set != null) {
            alpr alprVar = new alpr();
            if (z) {
                HashSet hashSet = new HashSet();
                for (ahur ahurVar2 : set) {
                    if (!ahurVar2.b.equals(ahurVar.b)) {
                        hashSet.add(ahurVar2);
                    }
                }
                alprVar.j(hashSet);
            } else {
                alprVar.j(set);
            }
            alprVar.c(ahurVar);
            concurrentMap.put(obj, alprVar.g());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final adeb a(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        removeUserFromGroupRequest.getClass();
        return new adeb(removeUserFromGroupRequest, (Context) this.a.b(), (ajtk) this.b.b(), (aniz) this.c.b(), (armf) this.d, (anen) this.e.b(), 2);
    }

    public final long b() {
        return ((Long) ((abja) this.b).d()).longValue();
    }

    public final void c(int i) {
        ((abja) this.e).e(Integer.valueOf(i));
    }

    public final void d(int i) {
        ((abja) this.c).e(Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    public final afjn e(afka afkaVar) {
        addp addpVar = (addp) this.d.b();
        arwe arweVar = (arwe) this.b.b();
        arweVar.getClass();
        afjy afjyVar = (afjy) this.e.b();
        afjyVar.getClass();
        anca ancaVar = (anca) this.a.b();
        ancaVar.getClass();
        afke afkeVar = (afke) this.c.b();
        afkeVar.getClass();
        return new afjn(addpVar, arweVar, afjyVar, ancaVar, afkeVar, afkaVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, arml] */
    public final ListenableFuture f(String str, ahtt ahttVar) {
        String str2 = ahttVar.c;
        str2.getClass();
        if (str2.length() == 0 && !((atqq) this.b).h(str).b) {
            return aneh.a;
        }
        akiy akiyVar = new akiy(this, str, ahttVar);
        akiy akiyVar2 = (akiy) ((ConcurrentHashMap) this.a.a()).put(str, akiyVar);
        if (akiyVar2 == null || !d.F(akiyVar2.b.c, ahttVar.c)) {
            akiyVar2 = akiyVar;
        }
        akiyVar.c.m(akiyVar2.d.c());
        return akiyVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x032b  */
    /* JADX WARN: Type inference failed for: r3v242, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v244, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aiba g(defpackage.aowr r30) {
        /*
            Method dump skipped, instructions count: 2811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adef.g(aowr):aiba");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void k(aozb aozbVar, Set set, String str, String str2, boolean z, boolean z2) {
        if (!set.isEmpty() && !((AtomicBoolean) this.c).getAndSet(true)) {
            abnr.k(new ahus(this));
        }
        byte[] H = aozbVar.H();
        byte[][] bArr = ExperimentTokens.a;
        ahur ahurVar = new ahur(new ExperimentTokens(str, H, bArr, bArr, bArr, bArr, null, null, null, null), str2);
        if (z) {
            this.d.put(new algx(str2, str), ahurVar);
        } else {
            this.b.put(str2, ahurVar);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (z) {
                x(ahurVar, new algx(str3, str), this.a, z2);
            } else {
                x(ahurVar, str3, this.e, z2);
            }
        }
    }

    public adef(String str) {
        abjc abjcVar = new abjc(str);
        this.d = abjcVar;
        this.e = new abiz(abjcVar, "retries", 0);
        this.c = new abiz(abjcVar, "throttle_counter", 0);
        this.b = new abiw(abjcVar, "last_throttle_counter_reset_timestamp", 0L);
        this.a = new abix(abjcVar, "last_registration_engine_id", "");
    }

    public adef(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public adef(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.emoji_gallery_container);
        findViewById.getClass();
        View findViewById2 = viewGroup.findViewById(R.id.emoji_gallery_recycler_view);
        findViewById2.getClass();
        this.d = (RecyclerView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.recycler_view_bottom_border_view);
        findViewById3.getClass();
        this.e = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.emoji_categories_tab_layout);
        findViewById4.getClass();
        this.c = (TabLayout) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.emoji_bar_backspace);
        findViewById5.getClass();
        this.a = (ImageButton) findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.emoji_bar_backspace_background);
        findViewById6.getClass();
        this.b = findViewById6;
    }

    public adef() {
        this.c = new AtomicBoolean(false);
        this.d = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
    }

    public adef(adze adzeVar) {
        alok alokVar = new alok();
        alokVar.h(aowh.OPERATIONAL, aiax.OPERATIONAL);
        alokVar.h(aowh.CLOSED_TEMPORARILY, aiax.CLOSED_TEMPORARILY);
        alokVar.h(aowh.CLOSED_PERMANENTLY, aiax.CLOSED_PERMANENTLY);
        this.a = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h(aowk.ACCESS, aian.ACCESS);
        alokVar2.h(aowk.BREAKFAST, aian.BREAKFAST);
        alokVar2.h(aowk.BRUNCH, aian.BRUNCH);
        alokVar2.h(aowk.DELIVERY, aian.DELIVERY);
        alokVar2.h(aowk.DINNER, aian.DINNER);
        alokVar2.h(aowk.DRIVE_THROUGH, aian.DRIVE_THROUGH);
        alokVar2.h(aowk.HAPPY_HOUR, aian.HAPPY_HOUR);
        alokVar2.h(aowk.KITCHEN, aian.KITCHEN);
        alokVar2.h(aowk.LUNCH, aian.LUNCH);
        alokVar2.h(aowk.ONLINE_SERVICE_HOURS, aian.ONLINE_SERVICE_HOURS);
        alokVar2.h(aowk.PICKUP, aian.PICKUP);
        alokVar2.h(aowk.SENIOR_HOURS, aian.SENIOR_HOURS);
        alokVar2.h(aowk.TAKEOUT, aian.TAKEOUT);
        this.c = alokVar2.b();
        alok alokVar3 = new alok();
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_UNSPECIFIED, aiae.EV_CONNECTOR_TYPE_UNSPECIFIED);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_OTHER, aiae.EV_CONNECTOR_TYPE_OTHER);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_J1772, aiae.EV_CONNECTOR_TYPE_J1772);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_TYPE_2, aiae.EV_CONNECTOR_TYPE_TYPE_2);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_CHADEMO, aiae.EV_CONNECTOR_TYPE_CHADEMO);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_CCS_COMBO_1, aiae.EV_CONNECTOR_TYPE_CCS_COMBO_1);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_CCS_COMBO_2, aiae.EV_CONNECTOR_TYPE_CCS_COMBO_2);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_TESLA, aiae.EV_CONNECTOR_TYPE_TESLA);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T, aiae.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T);
        alokVar3.h(aovv.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET, aiae.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET);
        this.b = alokVar3.b();
        alok alokVar4 = new alok();
        alokVar4.h(aovw.FUEL_TYPE_UNSPECIFIED, aiag.FUEL_TYPE_UNSPECIFIED);
        alokVar4.h(aovw.DIESEL, aiag.DIESEL);
        alokVar4.h(aovw.REGULAR_UNLEADED, aiag.REGULAR_UNLEADED);
        alokVar4.h(aovw.MIDGRADE, aiag.MIDGRADE);
        alokVar4.h(aovw.PREMIUM, aiag.PREMIUM);
        alokVar4.h(aovw.SP91, aiag.SP91);
        alokVar4.h(aovw.SP91_E10, aiag.SP91_E10);
        alokVar4.h(aovw.SP92, aiag.SP92);
        alokVar4.h(aovw.SP95, aiag.SP95);
        alokVar4.h(aovw.SP95_E10, aiag.SP95_E10);
        alokVar4.h(aovw.SP98, aiag.SP98);
        alokVar4.h(aovw.SP99, aiag.SP99);
        alokVar4.h(aovw.SP100, aiag.SP100);
        alokVar4.h(aovw.LPG, aiag.LPG);
        alokVar4.h(aovw.E80, aiag.E80);
        alokVar4.h(aovw.E85, aiag.E85);
        alokVar4.h(aovw.METHANE, aiag.METHANE);
        alokVar4.h(aovw.BIO_DIESEL, aiag.BIO_DIESEL);
        alokVar4.h(aovw.TRUCK_DIESEL, aiag.TRUCK_DIESEL);
        this.e = alokVar4.b();
        this.d = adzeVar;
    }

    public adef(armf armfVar, armf armfVar2, anen anenVar, atqq atqqVar) {
        armfVar.getClass();
        armfVar2.getClass();
        anenVar.getClass();
        atqqVar.getClass();
        this.c = armfVar;
        this.e = armfVar2;
        this.d = anenVar;
        this.b = atqqVar;
        this.a = armd.a(new agef(this, 18));
    }

    public adef(ahtx ahtxVar, asqc asqcVar, apwt apwtVar, apwt apwtVar2, Executor executor) {
        ahtxVar.getClass();
        asqcVar.getClass();
        apwtVar.getClass();
        apwtVar2.getClass();
        executor.getClass();
        this.b = ahtxVar;
        this.d = asqcVar;
        this.e = apwtVar;
        this.c = apwtVar2;
        this.a = executor;
    }
}
