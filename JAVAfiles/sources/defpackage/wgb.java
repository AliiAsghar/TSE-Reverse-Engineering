package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wgb implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wgb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v45, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v52, types: [arwe, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul c;
        akul c2;
        int i = 13;
        int i2 = 4;
        switch (this.b) {
            case 0:
                String str = (String) ((Optional) obj).map(new wga(0)).orElse(null);
                if (str == null) {
                    return aktp.ag(Optional.empty());
                }
                return ((wgd) this.a).d(str);
            case 1:
                Stream map = Collection.EL.stream((Set) obj).map(new wga(i2));
                Object obj2 = this.a;
                Stream map2 = map.map(new vxg(obj2, i));
                int i3 = alog.d;
                return aktp.ak((alog) map2.collect(alls.a)).h(new wax(18), ((wgd) obj2).f);
            case 2:
                alog alogVar = (alog) obj;
                if (alogVar.isEmpty()) {
                    return aktp.ag(null);
                }
                wjn wjnVar = (wjn) this.a;
                wjnVar.h.A(alogVar);
                xyo c3 = wjn.a.c();
                c3.H("Refresh notification for RCS still sending");
                c3.z("messageIds", alogVar);
                c3.q();
                return wjnVar.f.a(alogVar, tqg.RCS_STILL_SENDING);
            case 3:
                Optional optional = (Optional) obj;
                if (optional.isPresent() && ((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                    return ((wzp) ((RestoreReceiver) this.a).o.b()).f((amvm) optional.get()).h(new whf(19), andi.a);
                }
                return aktp.ag(null);
            case 4:
                long longValue = ((Long) obj).longValue();
                Object obj3 = this.a;
                wor worVar = (wor) obj3;
                return akul.g(((aiwu) worVar.d.a).a()).h(new woc(i2), andi.a).h(new tti(obj3, longValue, i2), worVar.c);
            case 5:
                return d.Y(this.a, obj);
            case 6:
                return d.Y(this.a, obj);
            case 7:
                return d.Y(this.a, obj);
            case 8:
                Object obj4 = this.a;
                xcj xcjVar = (xcj) obj4;
                return xcjVar.i.b().h(new wxv(obj4, 10), xcjVar.e);
            case 9:
                aqwb aqwbVar = (aqwb) obj;
                return aktp.af(new aniq("Registration to tachyon failed.", anme.c(aqwbVar, (xdj) ((zai) this.a).e), aqwbVar));
            case 10:
                String str2 = (String) obj;
                boolean isEmpty = TextUtils.isEmpty(str2);
                Object obj5 = this.a;
                if (!isEmpty) {
                    akrh e = aktp.e("TachygramAuthTokenProvider#getRegistrationProvider");
                    try {
                        akul d = ((vbs) ((abrd) obj5).e).d(str2, 13);
                        e.b(d);
                        e.close();
                        return d;
                    } catch (Throwable th) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                throw new aniq("Could not access RCS msisdn at this time.", new anit(anir.q, anis.d), null);
            case 11:
                aqwb aqwbVar2 = (aqwb) obj;
                return aktp.af(new aniq("Registration to tachyon failed.", anme.c(aqwbVar2, (xdj) ((abrd) this.a).c), aqwbVar2));
            case 12:
                znj znjVar = (znj) obj;
                alwo alwoVar = xdn.a;
                c = qjh.c(znjVar.b, arpj.a, arwf.a, new xgk(znjVar, (Iterable) this.a, (arpe) null, 3));
                return c;
            case 13:
                alwo alwoVar2 = xdn.a;
                return ((znj) obj).T((aqfn) this.a);
            case 14:
                alwo alwoVar3 = xdn.a;
                return ((znj) obj).U((aqfn) this.a);
            case 15:
                znj znjVar2 = (znj) obj;
                Object obj6 = this.a;
                obj6.getClass();
                c2 = qjh.c(znjVar2.b, arpj.a, arwf.a, new wwh(znjVar2, (anji) obj6, (arpe) null, 8));
                return c2;
            case 16:
                return ((xew) this.a).a((qey) obj, "handleGroupFeaturesUpdate");
            case 17:
                return ((qco) ((xfk) this.a).b.b()).i((qgg) obj);
            case 18:
                return ((qco) this.a).f((qfo) obj);
            case 19:
                Throwable th3 = (Throwable) obj;
                boolean z = th3 instanceof xfg;
                Object obj7 = this.a;
                if (z) {
                    alvw i4 = xfo.d.i();
                    i4.X(alwp.a, "BugleTachygram");
                    alvg alvgVar = (alvg) ((alvg) i4).g(th3);
                    alvgVar.X(ydl.e, ((anjw) obj7).a);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramTransportMessageHandlerChapiAdapter", "handleMessages", 136, "TachygramTransportMessageHandlerChapiAdapter.java")).q("Transient failure to process incoming Tachygram message");
                } else {
                    alvw h = xfo.d.h();
                    h.X(alwp.a, "BugleTachygram");
                    alvg alvgVar2 = (alvg) ((alvg) h).g(th3);
                    alvgVar2.X(ydl.e, ((anjw) obj7).a);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramTransportMessageHandlerChapiAdapter", "handleMessages", 143, "TachygramTransportMessageHandlerChapiAdapter.java")).q("Failed to process incoming Tachygram message");
                }
                return aktp.af(th3);
            default:
                Optional optional2 = (Optional) obj;
                algf algfVar = xfo.a;
                if (optional2.isPresent()) {
                    return aktp.ag((qei) optional2.get());
                }
                Object obj8 = this.a;
                throw new xfg("Sync did not resolve loading endpoint. SyncResult: " + ((xec) obj8).ordinal(), xec.c.equals(obj8));
        }
    }
}
