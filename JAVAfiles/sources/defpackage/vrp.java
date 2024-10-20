package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrp implements vrn, acys {
    private static final xze d = xze.g("Bugle", "RcsAvailabilityUtilForProvisioningEngineV2");
    protected Context b;
    volatile vrj c;
    private final anen e;
    private final yab f;
    private final advd g;
    private final vrl h;
    protected boolean a = false;
    private final vrh i = new vrh();

    public vrp(Context context, armf armfVar, armf armfVar2, anen anenVar, armf armfVar3, yab yabVar) {
        this.b = context;
        this.c = (vrj) armfVar2.b();
        this.e = anenVar;
        this.f = yabVar;
        advd advdVar = new advd();
        this.g = advdVar;
        vro vroVar = new vro(advdVar, 0);
        this.h = vroVar;
        this.c.k = Optional.ofNullable(vroVar);
        Iterator it = ((Set) armfVar3.b()).iterator();
        while (it.hasNext()) {
            this.g.a(z((vrl) it.next(), this.e));
        }
        ((utt) armfVar.b()).c(this);
    }

    private static String A(amhv amhvVar) {
        switch (amhvVar) {
            case UNKNOWN_UNINITIALIZED_REASON:
                return "WAITING FOR ENGINE TO CONNECT";
            case UNINITIALIZED_REASON_NO_FAILURE:
                return "NO_AVAILABILITY_FAILURE";
            case UNINITIALIZED_REASON_INTERRUPTED:
                return "INTERRUPTED";
            case UNINITIALIZED_REASON_DISCONNECTED:
                return "DISCONNECTED";
            case UNINITIALIZED_REASON_ENGINE_EXCEPTION:
                return "ENGINE_EXCEPTION";
            case UNINITIALIZED_REASON_RUNNABLE_EXCEPTION:
                return "RUNNABLE_EXCEPTION";
            case UNINITIALIZED_REASON_WEAR:
                return "WEAR";
            case UNINITIALIZED_REASON_INVALID_REGISTRATION:
                return "INVALID_REGISTRATION";
            case UNINITIALIZED_REASON_CONNECTION_TIMEOUT:
                return "TIMEOUT";
            default:
                return "UNKNOWN(" + amhvVar.j + ")";
        }
    }

    private static advc z(vrl vrlVar, Executor executor) {
        ajqh a = advc.a(new adlz(vrlVar, 1), executor);
        a.h(vrlVar);
        a.i(false);
        return a.g();
    }

    @Override // defpackage.vrn
    public final akul a(vrk vrkVar) {
        xyo c = d.c();
        c.H("updateAvailabilityForAllSimsAsync");
        c.z("hint", vrkVar);
        c.q();
        vrj vrjVar = this.c;
        alvw g = vrj.a.g();
        g.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityForAllSimsAsync", 289, "RcsAvailabilityUpdaterLocal.java")).J("updateAvailabilityForAllSimsAsync: scheduling updateAvailabilityForRcsProvisioningId call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", vrkVar, Boolean.valueOf(aczv.L()), Boolean.valueOf(aczv.T()));
        if (aczv.L() && aczv.T()) {
            return vrjVar.a().h(new vqv(vrjVar, vrkVar, 2, null), vrjVar.i);
        }
        return aktp.ah(new ung(vrjVar, vrkVar, 11), vrjVar.i);
    }

    @Override // defpackage.vrn
    public final akul b(adiv adivVar, vrk vrkVar) {
        xyo c = d.c();
        c.H("updateAvailabilityForRcsProvisioningIdAsync");
        c.z("hint", vrkVar);
        c.q();
        vrj vrjVar = this.c;
        alvw g = vrj.a.g();
        g.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityForRcsProvisioningIdAsync", 420, "RcsAvailabilityUpdaterLocal.java")).J("updateAvailabilityForRcsProvisioningIdAsync: scheduling updateAvailabilityForRcsProvisioningId call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", vrkVar, Boolean.valueOf(aczv.L()), Boolean.valueOf(aczv.T()));
        if (aczv.L() && aczv.T()) {
            return vrjVar.a().h(new tul(vrjVar, adivVar, vrkVar, 13, (byte[]) null), vrjVar.i);
        }
        return aktp.ah(new vri(vrjVar, adivVar, vrkVar, 0), vrjVar.i);
    }

    @Override // defpackage.vrn
    public final amhv c() {
        return amhv.UNKNOWN_UNINITIALIZED_REASON;
    }

    @Override // defpackage.vrn
    public final amwt d() {
        return this.c.b();
    }

    @Override // defpackage.vrn
    public final amwt e(String str) {
        return this.c.c(str);
    }

    @Override // defpackage.vrn
    public final amwt f(int i) {
        String l;
        vrj vrjVar = this.c;
        if (i != -1 && i != ((yjy) vrjVar.d.b()).f()) {
            Optional g = vrjVar.l.g(i, false);
            if (g.isPresent()) {
                l = adom.n((adiv) g.get()).a;
            } else {
                l = ((yjy) vrjVar.d.b()).h(i).y();
            }
        } else {
            l = ((adtn) vrjVar.b.b()).l();
        }
        if (l != null) {
            return ((vru) vrjVar.e.b()).b(l);
        }
        throw new IllegalStateException("Sim id is null.");
    }

    @Override // defpackage.vrn
    public final String g(amwt amwtVar, amhv amhvVar) {
        switch (amwtVar.ordinal()) {
            case 0:
                return "This device is pre-Koto";
            case 1:
                return "RCS state is pending. Check back in a moment. ".concat(A(amhvVar));
            case 2:
                return "RCS is disabled for this carrier by Google";
            case 3:
                return "Dogfood RCS is not set up";
            case 4:
                return "You turned off RCS. Turn it back on in settings";
            case 5:
                return "We aren't the default SMS app";
            case 6:
                return "The carrier disabled this device remotely";
            case 7:
                return "RCS is setup";
            case 8:
                return "RCS service version is old";
            case 9:
                return "RCS is disabled due to SIM absent";
            case 10:
                return "Carrier RCS is not set up";
            case 11:
                return "RCS shouldn't be disabled when MSIM M3 is enabled. Please file a bug.";
            case 12:
            default:
                return "RcsAvailabilityUtil returned an invalid state! This is a bug!";
            case 13:
                return "There was an error retrieving current RCS state: ".concat(A(amhvVar));
            case 14:
                return "RCS is disabled because third-party RCS client is enabled";
            case 15:
                return "RCS is disabled because it doesn't have phone permission";
            case 16:
                return "Carrier RCS is setup, waiting for T&C acceptance";
            case 17:
                return "Dogfood RCS is setup, waiting for T&C acceptance";
            case 18:
                return "RCS is disabled due to user rejection of T&Cs";
            case 19:
                return "RCS services can't run in the background";
            case 20:
                return "Availability is unobtainable from this source because PEv2 is disabled";
            case 21:
                return "RCS is disabled, waiting for phenotype to update";
            case 22:
                return "Availability request was done on a stub implementation of the provisioning engine.";
            case 23:
                return "RCS has been disabled via flags.";
            case 24:
                return "RCS has been disabled by EMM. go/rcs-disable-via-emm";
            case 25:
                return "RCS is disabled for the secondary user.";
            case 26:
                return "RCS chatAuth support is disabled in the IMS configuration";
            case 27:
                return "RCS is disabled by provisioning rule";
            case 28:
                return "RCS is disabled for a Wear OS device that does not support RCS";
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return "RCS is disabled by default via provisioning rule. User must manually enable RCS from Settings.";
        }
    }

    @Override // defpackage.vrn
    public final void h(vrl vrlVar) {
        i(vrlVar, this.f);
    }

    @Override // defpackage.vrn
    public final void i(vrl vrlVar, Executor executor) {
        this.g.a(z(vrlVar, executor));
    }

    @Override // defpackage.vrn
    public final void j() {
        if (this.a) {
            return;
        }
        this.b.registerReceiver(this.i, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        this.a = true;
    }

    @Override // defpackage.vrn
    public final void l(vrl vrlVar) {
        this.g.d(vrlVar);
    }

    @Override // defpackage.vrn
    public final void n(vrk vrkVar) {
        xyo c = d.c();
        c.H("updateRcsAvailability");
        c.z("hint", vrkVar);
        c.q();
        this.c.g(vrkVar);
    }

    @Override // defpackage.vrn
    @Deprecated
    public final void o(vrk vrkVar) {
        xyo c = d.c();
        c.H("updateAvailabilityAsync");
        c.z("hint", vrkVar);
        c.q();
        vrj vrjVar = this.c;
        alvw g = vrj.a.g();
        g.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityAsync", 824, "RcsAvailabilityUpdaterLocal.java")).J("updateAvailabilityAsync: scheduling updateRcsAvailability call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", vrkVar, Boolean.valueOf(aczv.L()), Boolean.valueOf(aczv.T()));
        if (aczv.L() && aczv.T()) {
            vrjVar.a().h(new vqv(vrjVar, vrkVar, 3, null), vrjVar.i).k(qiu.b(), andi.a);
        } else {
            aktp.ah(new ung(vrjVar, vrkVar, 14), vrjVar.i).k(qiu.b(), andi.a);
        }
    }

    @Override // defpackage.acys
    public final void onCsLibPhenotypeUpdated() {
        xyo c = d.c();
        c.H("onCsLibPhenotypeUpdated");
        c.q();
    }

    @Override // defpackage.vrn
    public final void p(adiv adivVar, vrk vrkVar) {
        this.c.f(adivVar, vrkVar);
    }

    @Override // defpackage.vrn
    public final boolean q() {
        if (d() == amwt.AVAILABLE) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    public final boolean r() {
        if (d() == amwt.DISABLED_FROM_PREFERENCES) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    @Deprecated
    public final boolean s() {
        int ordinal = d().ordinal();
        if (ordinal == 1 || ordinal == 6 || ordinal == 10 || ordinal == 13 || ordinal == 21) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    public final boolean t() {
        if (d() == amwt.DISABLED_VIA_GSERVICES) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vrn
    public final int u() {
        return 5;
    }

    @Override // defpackage.vrn
    public final amwt v(adiv adivVar) {
        vrj vrjVar = this.c;
        vrjVar.l(adivVar, vrk.NO_HINT, false);
        return vrjVar.c(adom.n(adivVar).a);
    }

    @Override // defpackage.vrn
    public final amwt w(adiv adivVar) {
        vrj vrjVar = this.c;
        amwt c = vrjVar.c(adom.n(adivVar).a);
        if (c != amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            return c;
        }
        vrjVar.f(adivVar, vrk.NO_HINT);
        return vrjVar.c(adom.n(adivVar).a);
    }

    @Override // defpackage.vrn
    @Deprecated
    public final amwt x() {
        vrj vrjVar = this.c;
        amwt b = vrjVar.b();
        if (b != amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            return b;
        }
        vrjVar.g(vrk.NO_HINT);
        return vrjVar.b();
    }

    @Override // defpackage.vrn
    public final void y() {
        this.c.g(vrk.NO_HINT);
    }

    @Override // defpackage.vrn
    public final void k() {
    }

    @Override // defpackage.vrn
    public final void m() {
    }
}
