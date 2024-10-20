package defpackage;

import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vhf implements armf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vhf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r3v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [armf, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        Object obj;
        String str = "Digest";
        boolean z = false;
        switch (this.c) {
            case 0:
                vhi vhiVar = (vhi) this.a;
                vev vevVar = (vev) vhiVar.m.b();
                String str2 = (String) this.b;
                vevVar.a(str2, 21);
                qei c = ((psq) vhiVar.j.b()).c(str2);
                veo veoVar = (veo) vhiVar.e.b();
                aqfn cI = yyb.cI(c);
                akrh e = aktp.e("GrpcProxies#getPhoneMessagingGrpcProxy");
                try {
                    alvw d = veo.a.d();
                    d.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/grpcproxies/GrpcProxies", "getPhoneMessagingGrpcProxy", 106, "GrpcProxies.java")).q("Phone channel bound to identity messaging grpc is used.");
                    wpp wppVar = (wpp) veoVar.c.b();
                    cI.getClass();
                    if (((Optional) wppVar.a).isPresent() && ((Optional) wppVar.b).isPresent()) {
                        wpp wppVar2 = (wpp) wppVar.c.b();
                        lfw lfwVar = new lfw(wppVar, 12);
                        akrh e2 = aktp.e("GrpcProxyFactory#createWithChannelConfiguration");
                        try {
                            adae adaeVar = (adae) wppVar2.c.b();
                            String str3 = cI.c;
                            str3.getClass();
                            vcq a = ((vdf) wppVar2.b.b()).a(adaeVar.d(str3));
                            vcv vcvVar = (vcv) wppVar2.a.b();
                            vcvVar.getClass();
                            obj = lfwVar.a(a, vcvVar);
                            armd.i(e2, null);
                        } finally {
                        }
                    } else {
                        obj = (vcy) ((wpp) wppVar.c.b()).R(cI, vcz.a);
                    }
                    e.close();
                    return obj;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                xze xzeVar = rul.a;
                ((AtomicBoolean) this.b).set(true);
                return this.a;
            case 2:
                if (((acxk) this.a.b()).a() || ((olg) this.b.b()).a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                wyh wyhVar = (wyh) this.a;
                return ((msk) wyhVar.a.b()).v(((msk) wyhVar.a.b()).t((String) this.b, wyhVar.m));
            case 4:
                return ((xja) this.b).b((wyh) this.a);
            case 5:
                return ((xja) this.b).a((xhv) this.a);
            case 6:
                wye wyeVar = (wye) this.a;
                return ((xja) this.b).v.a(wxr.a, wyeVar.i, albo.ag(wyeVar.a));
            case 7:
                advp advpVar = new advp("FileTransferModule");
                if (true == aczf.J()) {
                    str = "GbaBased";
                }
                advr.l(advpVar, "initializing download %s HttpRequestExecutorFactory", str);
                if (aczf.J()) {
                    return this.b;
                }
                return this.a;
            case 8:
                advp advpVar2 = new advp("FileTransferModule");
                if (true == aczf.I()) {
                    str = "GbaBased";
                }
                advr.l(advpVar2, "initializing upload %s HttpRequestExecutorFactory", str);
                if (aczf.I()) {
                    return this.b;
                }
                return this.a;
            case 9:
                Object obj2 = this.a;
                obj2.getClass();
                return (akin) this.b.a(obj2);
            case 10:
                return new aknp((akmy) this.b, (ajwt) this.a);
            case 11:
                return akrl.e(akrl.d((Set) this.b.b()), (akrl) ((aksr) this.a).c);
            default:
                ?? r0 = this.b;
                akrx g = ((aksr) this.a).g("Create gRPC Service Impl ".concat(String.valueOf((String) r0.getKey())), akrk.a);
                try {
                    aqrn aqrnVar = (aqrn) ((armf) r0.getValue()).b();
                    g.close();
                    return aqrnVar;
                } catch (Throwable th3) {
                    try {
                        g.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }

    public /* synthetic */ vhf(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
