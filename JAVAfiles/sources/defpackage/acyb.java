package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import j$.util.Optional;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyb implements apxw {
    private final /* synthetic */ int a;

    public acyb(int i) {
        this.a = i;
    }

    public static String a() {
        return "cslib.test_ramp_down";
    }

    public static String c() {
        return "";
    }

    public static anen d(Context context, anen anenVar) {
        if (adom.e()) {
            anenVar = adom.d(context);
        }
        anenVar.getClass();
        return anenVar;
    }

    public static anen e(Optional optional) {
        anen anenVar;
        armf armfVar = (armf) arsd.k(optional);
        if (armfVar != null && (anenVar = (anen) armfVar.b()) != null) {
            return anenVar;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
        arbjVar.j("moirai-thread-%d");
        anen bB = albo.bB(new ThreadPoolExecutor(1, 4, 10L, timeUnit, linkedBlockingQueue, arbj.t(arbjVar)));
        bB.getClass();
        return bB;
    }

    public static aqut f(String str) {
        aqut aqutVar = new aqut();
        aqutVar.h(new aquj("X-GOOG-API-KEY", aqut.c), str);
        return aqutVar;
    }

    public static anca g() {
        anbz anbzVar = anbz.a;
        anbzVar.getClass();
        return anbzVar;
    }

    public static Uri h() {
        Uri uri = uhy.a;
        uri.getClass();
        return uri;
    }

    public static Map i(Map map) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(((altc) map).d));
        for (Map.Entry entry : ((alor) map).entrySet()) {
            afdo afdoVar = (afdo) entry.getKey();
            int i = afsw.b;
            Iterator it = afst.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (d.F(((afsw) obj).b(), afdoVar.a())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Object obj2 = (afsw) obj;
            if (obj2 == null) {
                obj2 = new afsr(afdoVar.a());
            }
            linkedHashMap.put(obj2, entry.getValue());
        }
        return linkedHashMap;
    }

    public static arpi j(aneo aneoVar, afke afkeVar) {
        aneoVar.getClass();
        afkeVar.getClass();
        arpi g = afkeVar.g(aneoVar);
        g.getClass();
        return g;
    }

    public static arwe k(arpi arpiVar) {
        arpiVar.getClass();
        return arwi.e(arpiVar);
    }

    public static agae l() {
        return agiz.M(agek.a, afie.a);
    }

    public static afks m(eoz eozVar) {
        eozVar.getClass();
        afks afksVar = (afks) new eoy(eozVar).a(afks.class);
        afksVar.getClass();
        return afksVar;
    }

    public static eoz n(Activity activity, cg cgVar, Optional optional) {
        Object obj;
        activity.getClass();
        artx e = arrn.e(cgVar, aeys.r);
        optional.isPresent();
        Iterator a = e.a();
        while (true) {
            if (a.hasNext()) {
                obj = a.next();
                if (!(((cg) obj) instanceof afyf)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        cg cgVar2 = (cg) obj;
        if (cgVar2 != null) {
            return cgVar2;
        }
        return (cj) activity;
    }

    public static agae o() {
        return agiz.M(agek.h, afrf.a);
    }

    public static agae p() {
        return agiz.M(agek.d, afwb.a);
    }

    public static agae q() {
        return agiz.M(agek.e, afxj.a);
    }

    public static afjy r(afji afjiVar, agcp agcpVar) {
        afjiVar.getClass();
        return agcpVar.d(afjiVar);
    }

    public static agva s(Context context, arwe arweVar, afmd afmdVar, afmq afmqVar, Optional optional, afxz afxzVar) {
        Object aflzVar;
        context.getClass();
        arweVar.getClass();
        afmdVar.getClass();
        afmqVar.getClass();
        optional.getClass();
        if (optional.isPresent()) {
            aflzVar = optional.get();
        } else {
            aflzVar = new aflz((byte[]) null);
        }
        return new afng(context, arweVar, afmdVar, afmqVar, ((aflz) aflzVar).a, afxzVar);
    }

    public static atsg t(agcp agcpVar, Executor executor) {
        agcpVar.getClass();
        executor.getClass();
        aiwx aiwxVar = aiwx.a;
        HashMap hashMap = new HashMap();
        ahmc.ae(aiwr.a, hashMap);
        return new atsg(executor, agcpVar, aiwxVar, hashMap);
    }

    public static agcp u(Context context, Optional optional) {
        context.getClass();
        optional.isPresent();
        return new agcp(aqjn.y(new aiuy(new aohs(context, (byte[]) null))), aqjn.y(new aiwh(context, aiwh.b)), Collections.emptyList());
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                return new aegx();
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
