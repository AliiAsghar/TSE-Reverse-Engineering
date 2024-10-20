package defpackage;

import android.net.Network;
import android.os.Message;
import android.os.PowerManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhf extends adhd {
    public final /* synthetic */ adhw b;
    private PowerManager.WakeLock c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhf(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "ConnectingState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        if (adaa.a() > 0) {
            PowerManager.WakeLock newWakeLock = this.b.O.newWakeLock(1, "rcs:ConnectingState");
            this.c = newWakeLock;
            newWakeLock.acquire((adaa.a() + 1) * 1000);
        }
        this.b.F(new adha(this, 7));
        if (((Boolean) adhw.j.a()).booleanValue() && adaa.a() > 0) {
            this.b.t(18, adaa.a() * 1200);
        }
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void c() {
        PowerManager.WakeLock wakeLock = this.c;
        if (wakeLock != null) {
            try {
                wakeLock.release();
            } catch (RuntimeException unused) {
                advr.c("Wakelock is already released.", new Object[0]);
            }
        }
        if (((Boolean) adhw.j.a()).booleanValue()) {
            this.b.p(18);
        }
        super.c();
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        Optional findFirst;
        String str;
        aikb x;
        int i = message.what;
        int i2 = 1;
        int i3 = 0;
        if (i != 8) {
            int i4 = 10;
            if (i != 10) {
                if (i != 21) {
                    if (i != 12) {
                        if (i != 13) {
                            switch (i) {
                                case 17:
                                    this.b.N(acok.SIM_REMOVED);
                                    adhw adhwVar = this.b;
                                    adhwVar.w(adhwVar.ad);
                                    return true;
                                case 18:
                                    advr.g("Connection Timeout.", new Object[0]);
                                    adhw adhwVar2 = this.b;
                                    adhwVar2.w(adhwVar2.ag);
                                    return true;
                                case 19:
                                    adhw adhwVar3 = this.b;
                                    adhwVar3.w(adhwVar3.ag);
                                    return true;
                                default:
                                    return super.e(message);
                            }
                        }
                        if (message.obj instanceof aior) {
                            this.b.v = (aior) message.obj;
                        }
                        aior aiorVar = this.b.v;
                        if (Objects.isNull(aiorVar)) {
                            advr.g("Null SipTransport.", new Object[0]);
                            adhw adhwVar4 = this.b;
                            adhwVar4.w(adhwVar4.ag);
                        } else {
                            if (((Boolean) adhw.d.a()).booleanValue()) {
                                this.b.I();
                                this.b.A();
                            }
                            adhw adhwVar5 = this.b;
                            if (adhwVar5.l) {
                                adfn adfnVar = adhwVar5.z;
                                if (adfnVar == null) {
                                    advr.g("NetworkInterface is not available.", new Object[0]);
                                    adhw adhwVar6 = this.b;
                                    adhwVar6.w(adhwVar6.U);
                                } else {
                                    x = adhwVar5.x(adcx.o(adfnVar, adhwVar5.G), aiorVar, adhwVar5.p);
                                }
                            } else {
                                adey adeyVar = adhwVar5.u;
                                if (adeyVar == null) {
                                    advr.g("ImsNetworkInterface is not selected.", new Object[0]);
                                    adhw adhwVar7 = this.b;
                                    adhwVar7.w(adhwVar7.U);
                                } else {
                                    adhw adhwVar8 = this.b;
                                    x = adhwVar8.x(adeyVar.b(adhwVar8.G), aiorVar, adhwVar8.p);
                                }
                            }
                            adhw adhwVar9 = this.b;
                            adhwVar9.r.a = x;
                            adhwVar9.aj.c();
                            adhw adhwVar10 = this.b;
                            adhwVar10.D = 600000;
                            adhwVar10.w(adhwVar10.W);
                        }
                    } else {
                        this.b.q(13);
                        return true;
                    }
                } else {
                    advr.r(this.b.m, "Network is lost.", new Object[0]);
                    this.b.O();
                    adhw adhwVar11 = this.b;
                    adhwVar11.w(adhwVar11.ag);
                    return true;
                }
            } else {
                adhw adhwVar12 = this.b;
                if (adhwVar12.l) {
                    adfn adfnVar2 = adhwVar12.z;
                    if (adfnVar2 != null) {
                        advr.d(adhwVar12.m, "Creating SIP transport: NetworkInterface: %s", advq.GENERIC.c(adfnVar2));
                        if (aczf.P()) {
                            findFirst = Collection.EL.stream(adfnVar2.a).filter(new addf(i4)).findFirst();
                        } else {
                            findFirst = Collection.EL.stream(adfnVar2.a).filter(new addf(11)).findFirst();
                        }
                        if (findFirst.isEmpty()) {
                            findFirst = Collection.EL.stream(adfnVar2.a).findFirst();
                        }
                        if (findFirst.isPresent()) {
                            str = ((InetAddress) findFirst.get()).getHostAddress();
                        } else {
                            str = "";
                        }
                        String str2 = str;
                        if (albo.ah(str2)) {
                            advr.r(this.b.m, "Empty IP address.", new Object[0]);
                            adhw adhwVar13 = this.b;
                            adhwVar13.w(adhwVar13.U);
                        } else {
                            advr.p(this.b.m, "Selected local IP address: %s", advq.IP_ADDRESS.c(str2));
                            adju adjuVar = this.b.G;
                            ailf ailfVar = new ailf(adjuVar.g, adjuVar.h, adjuVar.i);
                            long millis = TimeUnit.SECONDS.toMillis(adaa.a());
                            ListenableFuture bM = albo.bM(new imh(this, adfnVar2, str2, ailfVar, 18), this.b.N);
                            if (millis > 0) {
                                ancd.f(ancd.f(((anee) ancj.f(anee.o(bM), new tti(this, millis, i4), this.b.N)).p(millis, TimeUnit.MILLISECONDS, this.b.N), TimeoutException.class, new aald(this, 19), this.b.N), IOException.class, new aald(this, 20), this.b.N);
                            } else {
                                ancd.f(ancj.f(anee.o(bM), new adhe(this, i2), this.b.N), IOException.class, new adhe(this, i3), this.b.N);
                            }
                        }
                    } else {
                        advr.r(adhwVar12.m, "Null NetworkInterface.", new Object[0]);
                        adhw adhwVar14 = this.b;
                        adhwVar14.w(adhwVar14.U);
                    }
                } else {
                    advr.d(adhwVar12.m, "Creating SIP transport.", new Object[0]);
                    adey adeyVar2 = this.b.u;
                    if (adeyVar2 == null) {
                        advr.g("ImsNetworkInterface is not selected.", new Object[0]);
                        adhw adhwVar15 = this.b;
                        adhwVar15.w(adhwVar15.U);
                    } else {
                        adju adjuVar2 = this.b.G;
                        ailf ailfVar2 = new ailf(adjuVar2.g, adjuVar2.h, adjuVar2.i);
                        Network network = adeyVar2.g;
                        String str3 = adeyVar2.e.a;
                        if (network == null) {
                            advr.g("Failed to create SipTransport. Null Network.", new Object[0]);
                            adhw adhwVar16 = this.b;
                            adhwVar16.w(adhwVar16.ag);
                        } else if (str3 == null) {
                            advr.g("Failed to create SipTransport. Null IP Address.", new Object[0]);
                            adhw adhwVar17 = this.b;
                            adhwVar17.w(adhwVar17.ag);
                        } else if (adaa.a() > 0) {
                            long millis2 = TimeUnit.SECONDS.toMillis(adaa.a());
                            ancd.f(ancd.f(((anee) ancj.f(anee.o(albo.bM(new kwr(this, network, adeyVar2, str3, ailfVar2, 8), this.b.N)), new adhe(this, 2), this.b.N)).p(millis2, TimeUnit.MILLISECONDS, this.b.N), TimeoutException.class, new tti(this, millis2, 9), this.b.N), IOException.class, new adhe(this, 3), this.b.N);
                        } else {
                            try {
                                adhw adhwVar18 = this.b;
                                adhwVar18.v = g(network, adeyVar2.b(adhwVar18.G), adeyVar2.d(), str3, adeyVar2.e());
                                this.b.q(12);
                            } catch (aild | IllegalArgumentException e) {
                                advr.j(e, this.b.m, "Failed to create a SIP transport.", new Object[0]);
                                adhw adhwVar19 = this.b;
                                adhwVar19.w(adhwVar19.ag);
                            }
                        }
                    }
                }
            }
            return true;
        }
        advr.l(this.b.m, "Disconnecting socket.", new Object[0]);
        this.b.N(message.obj);
        adhw adhwVar20 = this.b;
        adhwVar20.w(adhwVar20.ad);
        return true;
    }

    public final aior g(Network network, ailh ailhVar, String str, String str2, List list) {
        adhw adhwVar = this.b;
        adju adjuVar = adhwVar.G;
        aior a = adhwVar.s.a(ailhVar, network, str, str2, list, adjuVar.p, adjuVar.q);
        ((aipa) a).c = new adhz(this.b);
        return a;
    }
}
