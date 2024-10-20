package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vhi {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl");
    public final Context b;
    public final anen c;
    public final alhr d;
    public final armf e;
    public final ConcurrentMap f = new ConcurrentHashMap();
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    private final anen n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;

    public vhi(armf armfVar, final Context context, final anen anenVar, anen anenVar2, armf armfVar2, final armf armfVar3, final armf armfVar4, armf armfVar5, final Optional optional, final Optional optional2, final Optional optional3, final Optional optional4, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        this.b = context;
        this.c = anenVar;
        this.n = anenVar2;
        this.s = armfVar2;
        this.p = armfVar7;
        this.e = armfVar3;
        this.i = optional4;
        this.g = optional2;
        this.h = optional3;
        this.j = armfVar6;
        this.m = armfVar;
        this.k = armfVar8;
        this.l = armfVar9;
        this.r = armfVar10;
        this.q = armfVar11;
        this.d = albo.D(new alhr() { // from class: vhh
            @Override // defpackage.alhr
            public final Object get() {
                Optional empty;
                Optional optional5 = Optional.this;
                Optional optional6 = optional2;
                Optional optional7 = optional3;
                vhi.h(optional5, optional6, optional7);
                veo veoVar = (veo) armfVar3.b();
                veoVar.getClass();
                lpn lpnVar = new lpn(veoVar, 18);
                armf armfVar12 = armfVar4;
                Object obj = optional5.get();
                Object obj2 = optional6.get();
                Object obj3 = optional7.get();
                vba vbaVar = (vba) armfVar12.b();
                Optional optional8 = optional;
                if (optional8.isPresent()) {
                    empty = Optional.of(new vjs((vcu) optional8.get()));
                } else {
                    empty = Optional.empty();
                }
                anen anenVar3 = anenVar;
                return Optional.ofNullable(new vhe(context, lpnVar, (xgj) obj, (vti) obj2, (wpp) obj3, anenVar3, vbaVar, 2, empty, ((Integer) vbh.i.e()).intValue(), ((Integer) vbh.j.e()).intValue(), ((Integer) vbh.k.e()).intValue(), false, false, true));
            }
        });
        this.o = armfVar5;
    }

    public static void h(Optional optional, Optional optional2, Optional optional3) {
        optional.isPresent();
        optional2.isPresent();
        optional3.isPresent();
    }

    private final void i() {
        h(this.i, this.g, this.h);
    }

    public final vhe a(String str, vba vbaVar) {
        i();
        albo.T(true);
        return (vhe) ConcurrentMap.EL.computeIfAbsent(this.f, str, new uoc(this, str, vbaVar, 2));
    }

    public final akul b(aqfn aqfnVar) {
        return c(aqfnVar, Optional.empty());
    }

    public final akul c(aqfn aqfnVar, Optional optional) {
        anen anenVar;
        String str = aqfnVar.c;
        if (!TextUtils.isEmpty(str)) {
            i();
            alvw g = a.g();
            g.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhone", 279, "TachyonReceiverManagerImpl.java")).q("beginning of pullMessagesForPhone");
            akul d = ((vbs) this.o.b()).d(str, 20);
            mmc mmcVar = new mmc((Object) this, str, (Object) optional, (Object) aqfnVar, 19);
            if (((olr) this.p.b()).a()) {
                anenVar = this.n;
            } else {
                anenVar = this.c;
            }
            return d.i(mmcVar, anenVar).h(new vej(17), andi.a);
        }
        return aktp.ag(null);
    }

    public final akul d() {
        if (((odc) this.l.b()).a() && !((wfh) this.k.b()).S()) {
            alvw g = a.g();
            g.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandler", 156, "TachyonReceiverManagerImpl.java")).q("Device data over satellite, skipping start bind");
            return aktp.ag(null);
        }
        alvw d = a.d();
        d.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandler", 159, "TachyonReceiverManagerImpl.java")).q("beginning of startAnonymousBindHandler");
        if (((Optional) this.d.get()).isEmpty()) {
            return aktp.ag(null);
        }
        return ((vhe) ((Optional) this.d.get()).get()).b();
    }

    public final akul e(String str) {
        anen anenVar;
        byte[] bArr = null;
        if (!TextUtils.isEmpty(str)) {
            i();
            if (((odo) this.q.b()).a() && !((wfh) this.k.b()).S()) {
                alvw g = a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startPhoneBindHandler", 328, "TachyonReceiverManagerImpl.java")).q("startPhoneBindHandler skipped because no network available");
                return aktp.ag(null);
            }
            alvw d = a.d();
            d.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startPhoneBindHandler", 332, "TachyonReceiverManagerImpl.java")).q("beginning of startPhoneBindHandler");
            akul d2 = ((vbs) this.o.b()).d(str, 18);
            vfj vfjVar = new vfj(this, str, 4, bArr);
            if (((olr) this.p.b()).a()) {
                anenVar = this.n;
            } else {
                anenVar = this.c;
            }
            return d2.i(vfjVar, anenVar);
        }
        return aktp.ag(null);
    }

    public final synchronized void f() {
        alvw d = a.d();
        d.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "stopAllPhoneBindHandlers", 194, "TachyonReceiverManagerImpl.java")).q("stopping phone bind");
        ConcurrentMap.EL.forEach(this.f, new vhg(0));
    }

    public final synchronized void g() {
        alvw d = a.d();
        d.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "stopAnonymousBindHandler", 183, "TachyonReceiverManagerImpl.java")).q("stopping anonymous bind");
        if (((ode) this.r.b()).a()) {
            ((mbl) this.s.b()).e("Bugle.Ditto.Binding.Stop.Counts", 1);
        }
        ((Optional) this.d.get()).ifPresent(new uhb(13));
    }
}
