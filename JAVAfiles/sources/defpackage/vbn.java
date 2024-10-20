package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vbn implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vbn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r2v64, types: [vfc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v66, types: [vgq, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        dtq dtqVar;
        int i = 9;
        int i2 = 12;
        int i3 = 4;
        int i4 = 5;
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        switch (this.b) {
            case 0:
                return ((vfo) this.a).e((aqff) obj);
            case 1:
                aqet aqetVar = (aqet) obj;
                boolean z = aqetVar.d;
                Object obj2 = this.a;
                if (z) {
                    alvw g = vbq.a.g();
                    g.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 263, "PhoneRegistrationProvider.java")).q("Registration request is completed and verified.");
                    aqfg aqfgVar = aqetVar.e;
                    if (aqfgVar == null) {
                        aqfgVar = aqfg.a;
                    }
                    vbq vbqVar = (vbq) obj2;
                    return akul.g(aktp.as(((vby) obj2).v(aqfgVar), vbqVar.p(aqetVar.g), vbqVar.m().o(3)).m(new uvp(aqfgVar, i2), andi.a));
                }
                alvw g2 = vbq.a.g();
                g2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "handleUnverifiedResponse", 440, "PhoneRegistrationProvider.java")).q("Received a valid unverified Tachyon RegisterResponse. Waiting for OTP.");
                vbq vbqVar2 = (vbq) obj2;
                vel m = vbqVar2.m();
                aqfg aqfgVar2 = aqetVar.e;
                if (aqfgVar2 == null) {
                    aqfgVar2 = aqfg.a;
                }
                return akul.g(m.k(aqfgVar2.b.H())).i(new vbn(obj2, i3), vbqVar2.i).f(TimeoutException.class, new uva(i4), andi.a);
            case 2:
                aqff aqffVar = (aqff) obj;
                if ((aqffVar.b & 2) != 0) {
                    if (aqffVar.e.G()) {
                        return aktp.af(new IllegalStateException("Verify response has no registration Id"));
                    }
                    alvw g3 = vbq.a.g();
                    g3.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "handleVerifyResponse", 609, "PhoneRegistrationProvider.java")).q("VerifyResponse contains valid token. Updating data store.");
                    aqfg aqfgVar3 = aqffVar.d;
                    if (aqfgVar3 == null) {
                        aqfgVar3 = aqfg.a;
                    }
                    Object obj3 = this.a;
                    vbq vbqVar3 = (vbq) obj3;
                    return aktp.ap(((vby) obj3).v(aqfgVar3), vbqVar3.p(aqffVar.e)).i(new vbo(obj3, i6), andi.a).i(new vbn(obj3, i4), vbqVar3.o).i(new vbn(obj3, 6), vbqVar3.o).h(new uzs(aqffVar, 10), andi.a);
                }
                return aktp.af(new IllegalStateException("Verify response has no token"));
            case 3:
                Throwable th = (Throwable) obj;
                alvw i8 = vbq.a.i();
                i8.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) ((alvg) i8).g(th)).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFutureWithFailure", (char) 645, "PhoneRegistrationProvider.java")).q("Failed to handle OTP, failing awaiting futures.");
                Object obj4 = this.a;
                vbq vbqVar4 = (vbq) obj4;
                synchronized (vbqVar4.k) {
                    dtqVar = ((vbq) obj4).l;
                    ((vbq) obj4).l = null;
                }
                if (dtqVar != null) {
                    dtqVar.d(th);
                }
                return akul.g(vbqVar4.m().k(new byte[0])).i(new vbn(th, 7), andi.a);
            case 4:
                vbq vbqVar5 = (vbq) this.a;
                return akul.g(d.m(new uqe(vbqVar5, 2))).j(((Integer) vbq.f.e()).intValue(), TimeUnit.SECONDS, vbqVar5.i);
            case 5:
                return ((vbq) this.a).m().k(new byte[0]);
            case 6:
                return ((vbq) this.a).m().g();
            case 7:
                return aktp.af((Throwable) this.a);
            case 8:
                Throwable th2 = (Throwable) obj;
                vby.m.r("Failed to register with Tachyon", th2);
                if (th2 instanceof aqwb) {
                    asky b = vch.b(th2);
                    Status.Code a = vch.a(th2);
                    if (b == asky.DASHER_ACCOUNT_RESTRICTED) {
                        xyo e = vby.m.e();
                        e.H("Got Dasher account restricted error in StatusRuntimeException");
                        e.z("error", b);
                        e.z("status", a);
                        e.r(th2);
                        return aktp.af(new vbw(th2));
                    }
                    if (b == asky.UNICORN_ACCOUNT_RESTRICTED) {
                        xyo e2 = vby.m.e();
                        e2.H("Got Unicorn account restricted error in StatusRuntimeException");
                        e2.z("error", b);
                        e2.z("status", a);
                        e2.r(th2);
                        return aktp.af(new vbx(th2));
                    }
                    vby vbyVar = (vby) this.a;
                    if (vbyVar.r.isPresent()) {
                        xyo e3 = vby.m.e();
                        e3.H("Got error in StatusRuntimeException. Notifying tachyon registration error listeners");
                        e3.z("error", b);
                        e3.z("status", a);
                        e3.r(th2);
                        vgp b2 = vbyVar.b();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((Set) vbyVar.r.get()).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((vgx) it.next()).e(b2, b));
                        }
                        return aktp.am(arrayList).i(new vbo(th2, i7), andi.a);
                    }
                }
                return aktp.af(th2);
            case 9:
                return ((vby) this.a).n((byte[]) obj);
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    vby.m.o("Tachyon registration token is null, ignore immediate refresh");
                    return aktp.ag(null);
                }
                return ((vby) this.a).l(vaz.FORCE_REFRESH).h(new vbj(i), andi.a);
            case 11:
                return this.a.e((aqer) obj);
            case 12:
                ?? r2 = this.a;
                ListenableFuture e4 = r2.e((apbt) obj);
                r2.j();
                return e4;
            case 13:
                ?? r22 = this.a;
                ListenableFuture e5 = r22.e((apbt) obj);
                r22.j();
                return e5;
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    return albo.bI(aqfg.a);
                }
                return ((vax) ((vcg) this.a).b.b()).q();
            case 15:
                Set set = (Set) obj;
                if (set.isEmpty()) {
                    alvw i9 = vcg.a.i();
                    i9.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) i9).h("com/google/android/apps/messaging/shared/net/TachyonBackgroundStartupTask", "registerByPhones", 137, "TachyonBackgroundStartupTask.java")).q("No available phone number to start tachyon for.");
                    return aktp.ag(null);
                }
                Stream map = Collection.EL.stream(set).map(new vbk(this.a, 14));
                int i10 = alog.d;
                return aktp.am((Iterable) map.collect(alls.a)).h(new vcr(i5), andi.a);
            case 16:
                vbq vbqVar6 = (vbq) obj;
                akul g4 = akul.g(vbqVar6.s());
                akul h = vbqVar6.m().e().h(new vbj(i4), andi.a);
                akul h2 = vbqVar6.m().e().h(new vbj(i3), andi.a);
                ahmn ap = aktp.ap(g4, h, h2);
                vcj vcjVar = (vcj) this.a;
                return ap.i(new tvp(vcjVar, g4, vbqVar6, h, h2, 3), vcjVar.f);
            case 17:
                String str = (String) obj;
                Object obj5 = this.a;
                vcj vcjVar2 = (vcj) obj5;
                if (!vcjVar2.h()) {
                    return aktp.af(new IllegalStateException("Tachyon phone registration flag disabled"));
                }
                vcj.a.o("Ensuring Tachyon phone registration");
                return vcjVar2.c.d(str, 12).i(new vbn(obj5, 16), vcjVar2.g).h(new vbj(11), andi.a).e(aqwb.class, new vbj(i2), andi.a);
            case 18:
                return ((vbq) obj).o((String) this.a);
            case 19:
                asmb asmbVar = (asmb) obj;
                vco vcoVar = (vco) ((vcs) this.a).b.b();
                byte[] a2 = ((atju) asmbVar.a).a();
                Object obj6 = ((atoi) asmbVar.b).a;
                synchronized (vcoVar.a) {
                    ((ykw) vcoVar.a).i("tachyon_public_key", a2);
                    ((ykw) vcoVar.a).i("tachyon_private_key", (byte[]) obj6);
                }
                return vcoVar.b.j(new uvz(a2, obj6, 8)).h(new vdx(i4), andi.a).h(new uzs(asmbVar, 15), andi.a);
            default:
                vee veeVar = (vee) obj;
                aozb aozbVar = veeVar.g;
                aozb aozbVar2 = veeVar.f;
                byte[] H = aozbVar.H();
                byte[] H2 = aozbVar2.H();
                if (!aozbVar.G() && !aozbVar2.G()) {
                    alvw d = vcs.a.d();
                    d.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "ensurePhoneKeyPairBytes", 257, "CryptoHelper.java")).q("CryptoHelper: Using existing identity key");
                    return aktp.ag(new byte[][]{H2, H});
                }
                Object obj7 = this.a;
                asmb x = atow.x();
                Object obj8 = x.a;
                Object obj9 = x.b;
                byte[] a3 = ((atju) obj8).a();
                alvw d2 = vcs.a.d();
                d2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "ensurePhoneKeyPairBytes", 243, "CryptoHelper.java")).q("CryptoHelper: Storing new identity key");
                return ((vel) obj7).b.j(new uvz(a3, ((atoi) obj9).a, i)).h(new vej(i3), andi.a).i(new vek(obj7, i5), andi.a).h(new vbj(19), andi.a);
        }
    }
}
