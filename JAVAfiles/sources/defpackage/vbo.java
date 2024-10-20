package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vbo implements ancr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vbo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [apwt, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        akul c;
        akul c2;
        akul c3;
        akul c4;
        akul c5;
        int i = 14;
        int i2 = 13;
        int i3 = 1;
        int i4 = 12;
        switch (this.b) {
            case 0:
                return ((vbq) this.a).m().o(4);
            case 1:
                return ((vbq) this.a).m().o(5);
            case 2:
                return aktp.af((Throwable) this.a);
            case 3:
                Object obj = this.a;
                RcsAvailabilityLogWorker rcsAvailabilityLogWorker = (RcsAvailabilityLogWorker) obj;
                return rcsAvailabilityLogWorker.h.e(wwm.a).h(new vgd(obj, 11), rcsAvailabilityLogWorker.g);
            case 4:
                Object obj2 = this.a;
                RcsAvailabilityLogWorker rcsAvailabilityLogWorker2 = (RcsAvailabilityLogWorker) obj2;
                return rcsAvailabilityLogWorker2.h.d().h(new vgd(obj2, i4), rcsAvailabilityLogWorker2.g);
            case 5:
                return aktp.ag(this.a);
            case 6:
                Object obj3 = this.a;
                return qjh.b(new ncd(obj3, 2, (char[]) null), ((wvy) obj3).d);
            case 7:
                aiut.b();
                Object obj4 = this.a;
                String cls = obj4.getClass().toString();
                akrh a = ((xcf) obj4).a();
                try {
                    xyo d = xcj.a.d();
                    d.H("Beginning background startup task:");
                    d.H(cls);
                    d.q();
                    akul b = ((xcf) obj4).b();
                    b.k(akto.h(new xch(cls, 0)), andi.a);
                    a.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 8:
                xmh xmhVar = (xmh) ((xgw) this.a).f.b();
                c = qjh.c(xmhVar.d, arpj.a, arwf.a, new xjs(xmhVar, (arpe) null, 7, (char[]) null));
                return c;
            case 9:
                xmh xmhVar2 = (xmh) ((xgw) this.a).f.b();
                c2 = qjh.c(xmhVar2.d, arpj.a, arwf.a, new xjs(xmhVar2, (arpe) null, 6, (byte[]) null));
                return c2;
            case 10:
                Object obj5 = this.a;
                xzk xzkVar = (xzk) obj5;
                return xzkVar.c.h().i(new xfn(obj5, i4), xzkVar.b);
            case 11:
                return aktp.ag((Integer) ((zas) this.a).e.get());
            case 12:
                zas zasVar = (zas) this.a;
                if (((abqb) zasVar.j).h((Context) zasVar.f, 12200000) == 0) {
                    i3 = 0;
                }
                if (!((ykw) zasVar.b).q("has_sent_a_message", false)) {
                    i3 |= 4;
                }
                if (((ykw) zasVar.b).d("max_conversation_count", 0) < ((Integer) utw.s.e()).intValue()) {
                    i3 |= 8;
                }
                if (((ykw) zasVar.b).q("has_dismissed_hats", false)) {
                    i3 |= 16;
                }
                long epochMilli = ((xnv) zasVar.i).f().toEpochMilli();
                if (epochMilli - ((Long) yfe.o.e()).longValue() < Math.min(((ykw) zasVar.b).e("last_app_update_time_millis", epochMilli), ((ykw) zasVar.b).e("app_install_time_millis", epochMilli))) {
                    i3 |= 32;
                }
                long epochMilli2 = ((xnv) zasVar.i).f().toEpochMilli() - ((Long) yfe.m.e()).longValue();
                if (epochMilli2 < ((ykw) zasVar.b).e("rating_prompt_last_time_millis", epochMilli2)) {
                    i3 |= 64;
                }
                int intValue = yuv.a((Context) zasVar.f).b - ((Integer) yfe.n.e()).intValue();
                if (intValue < ((ykw) zasVar.b).d("rating_prompt_shown_version", intValue)) {
                    i3 |= 128;
                }
                if (((Integer) zasVar.e.get()).intValue() % ((Integer) yfe.p.e()).intValue() != 0) {
                    i3 |= 256;
                }
                return aktp.ag(Integer.valueOf(i3));
            case 13:
                Object obj6 = this.a;
                zai zaiVar = (zai) obj6;
                return akul.g(((akbj) ((zas) zaiVar.c).c).c()).i(new xfn(obj6, i2), zaiVar.e);
            case 14:
                return aktp.ad(this.a);
            case 15:
                Object obj7 = this.a;
                yin yinVar = (yin) obj7;
                return aktp.ah(new ybh(obj7, 9), yinVar.e).i(new xfn(obj7, i), yinVar.d);
            case 16:
                yiw.D.m("Handler was called even though smart replies are not enabled.");
                return aktp.ag(upm.b());
            case 17:
                Object obj8 = this.a;
                akrh e = aktp.e("MoiraiApiInitializationManager#createInitializationResultFuture");
                try {
                    adve adveVar = (adve) ((yqn) obj8).d.b();
                    akul h = akul.g(arro.I(arwi.e(arws.b), new adzx((aiim) adveVar.b.b(), null, 1))).h(new yez(adveVar, i4), adveVar.a);
                    e.b(h);
                    aktp.aa(h, new isn(obj8, 13), ((yqn) obj8).l);
                    e.close();
                    return h;
                } catch (Throwable th3) {
                    try {
                        e.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 18:
                luz luzVar = (luz) ((aalt) this.a).bg.b();
                c3 = qjh.c(luzVar.d, arpj.a, arwf.a, new lgp(luzVar, (arpe) null, 7));
                return c3;
            case 19:
                luz luzVar2 = (luz) ((aalt) this.a).bg.b();
                c4 = qjh.c(luzVar2.d, arpj.a, arwf.a, new lgp(luzVar2, (arpe) null, 8, (byte[]) null));
                return c4;
            default:
                rjx rjxVar = (rjx) ((aalt) this.a).aU.b();
                c5 = qjh.c(rjxVar.h, arpj.a, arwf.a, new qsk(rjxVar, new rkc(true), (arpe) null, 14));
                return c5;
        }
    }
}
