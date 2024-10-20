package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vka extends unl {
    public static final alwo a = alwo.o("BugleNotifications");
    public final dzt b;
    public final anen c;
    public final anen d;
    public final vkl e;
    public final vln f;
    public final vkt g;
    public final Map h;
    public final Optional i;
    public final Optional j;
    public final armf k;
    public final ahqr l;
    public final xnv m;
    public final yjv n;
    private final Map o;
    private final armf p;
    private final armf q;
    private final vco r;

    public vka(Map map, Context context, anen anenVar, anen anenVar2, vkl vklVar, vln vlnVar, vkt vktVar, Map map2, Optional optional, Optional optional2, vco vcoVar, armf armfVar, armf armfVar2, armf armfVar3, ahqr ahqrVar, xnv xnvVar, yjv yjvVar) {
        this.b = new dzt(context);
        this.o = map;
        this.c = anenVar;
        this.d = anenVar2;
        this.e = vklVar;
        this.f = vlnVar;
        this.g = vktVar;
        this.h = map2;
        this.i = optional;
        this.j = optional2;
        this.r = vcoVar;
        this.p = armfVar;
        this.q = armfVar2;
        this.k = armfVar3;
        this.l = ahqrVar;
        this.m = xnvVar;
        this.n = yjvVar;
    }

    public static upm k(List list) {
        upm b = upm.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            upm upmVar = (upm) it.next();
            if (upmVar == upm.e()) {
                return upm.e();
            }
            if (upmVar == upm.d()) {
                b = upm.d();
            }
        }
        return b;
    }

    @Override // defpackage.unl, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        Long l = (Long) this.p.b();
        l.getClass();
        a2.d(l.intValue());
        Long l2 = (Long) this.q.b();
        l2.getClass();
        a2.e(l2.intValue());
        if (this.b.g()) {
            vkt vktVar = this.g;
            if (!vktVar.k(vktVar.f())) {
                a2.c(unv.FOREGROUND_SERVICE);
                a2.b = this.r.w();
                return a2.a();
            }
        }
        a2.c(unv.WAKELOCK);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("CreateNotificationHandler");
    }

    @Override // defpackage.unx
    public final apca e() {
        return vla.a.getParserForType();
    }

    @Override // defpackage.unl, defpackage.unx
    public final String f() {
        return "shared_notification_queue_name";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.unl
    public final akul j(alog alogVar) {
        EnumMap enumMap = new EnumMap(vlm.class);
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            vla vlaVar = (vla) alogVar.get(i);
            vlm b = vlm.b(vlaVar.e);
            if (b == null) {
                b = vlm.NT_UNKNOWN;
            }
            List list = (List) enumMap.get(b);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(vlaVar);
            enumMap.put((EnumMap) b, (vlm) list);
        }
        alob alobVar = new alob();
        Iterator it = enumMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            vlm vlmVar = (vlm) entry.getKey();
            if (!this.o.containsKey(vlmVar)) {
                alwl alwlVar = (alwl) a.i();
                alwlVar.X(vjh.n, vlmVar);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createAllNotifications", 206, "CreateNotificationHandler.java")).q("No blueprint for notification type, not creating notification");
            } else {
                List list2 = (List) entry.getValue();
                if (list2.isEmpty()) {
                    alwl alwlVar2 = (alwl) a.i();
                    alwlVar2.X(vjh.n, vlmVar);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createAllNotifications", 215, "CreateNotificationHandler.java")).q("Missing inputs for notification type, not creating notification");
                } else {
                    vkh vkhVar = (vkh) this.o.get(vlmVar);
                    vkhVar.getClass();
                    alog b2 = vkhVar.c().b(alog.n(list2));
                    this.l.e(ahka.c("CreateNotificationLatency_", vlmVar));
                    akul ag = aktp.ag(upm.b());
                    ArrayList arrayList = new ArrayList();
                    int size = b2.size();
                    akul akulVar = ag;
                    int i2 = 0;
                    while (i2 < size) {
                        akulVar = akulVar.i(new qcf(this, (List) arrayList, vlmVar, vkhVar, (vla) b2.get(i2), 9), this.c);
                        i2++;
                        it = it;
                    }
                    alobVar.h(akulVar.h(new tul(this, arrayList, vlmVar, 12, (byte[]) null), this.c));
                    it = it;
                }
            }
        }
        alog g = alobVar.g();
        return aktp.ao(g).h(new vib(g, 2), this.c);
    }

    public final akul l(vkh vkhVar) {
        return aktp.ai(new vib(this, 4), this.d).i(new vek(vkhVar, 9), andi.a);
    }
}
