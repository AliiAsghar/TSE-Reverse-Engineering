package defpackage;

import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcj implements ajoa {
    public final vbs c;
    public final RcsProfileService d;
    public final armf e;
    public final anen f;
    public final anen g;
    public final armf h;
    public final AtomicBoolean i = new AtomicBoolean();
    private final armf k;
    private final armf l;
    private static final String j = RcsProfileService.class.getName();
    public static final xze a = xze.g("BugleNetwork", "TachyonPhoneRegistration");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager");

    public vcj(vbs vbsVar, RcsProfileService rcsProfileService, armf armfVar, armf armfVar2, anen anenVar, anen anenVar2, armf armfVar3, armf armfVar4) {
        this.c = vbsVar;
        this.d = rcsProfileService;
        this.k = armfVar;
        this.e = armfVar2;
        this.f = anenVar;
        this.g = anenVar2;
        this.h = armfVar3;
        this.l = armfVar4;
    }

    public final akul d(Optional optional) {
        String str;
        if (!h()) {
            return aktp.af(new IllegalStateException("Tachyon phone registration flag disabled"));
        }
        a.o("Ensuring Tachyon phone registration");
        vbs vbsVar = this.c;
        if (optional.isPresent()) {
            str = ((qei) optional.get()).d;
        } else {
            str = "";
        }
        return vbsVar.d(str, 12).i(new vbn(this, 16), this.g).h(new vbj(13), andi.a).e(aqwb.class, new vbj(14), andi.a);
    }

    public final akul e() {
        return ((adjc) this.k.b()).f().h(new uzs(this, 14), this.g).h(new vbj(10), andi.a);
    }

    public final akul f(qei qeiVar) {
        byte[] bArr = null;
        if (!h()) {
            alvw g = b.g();
            g.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 148, "TachyonPhoneRegistrationManager.java")).q("Tachyon phone registration flag disabled.");
            return aktp.ag(null);
        }
        alvi alviVar = b;
        alvw g2 = alviVar.g();
        g2.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 151, "TachyonPhoneRegistrationManager.java")).q("Tachyon phone registration flag enabled.");
        this.i.set(true);
        if (qeiVar.d.isEmpty()) {
            alvw i = alviVar.i();
            i.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 155, "TachyonPhoneRegistrationManager.java")).q("No chat endpoint provided for registration. Attempting to acquire from profile service.");
            if (!this.d.isConnected()) {
                alvw i2 = alviVar.i();
                i2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 160, "TachyonPhoneRegistrationManager.java")).q("Config update received but no chat endpoint could be acquired");
                return aktp.ag(null);
            }
            alvw i3 = alviVar.i();
            i3.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 164, "TachyonPhoneRegistrationManager.java")).q("Forcing Tachyon phone registration for all self identities");
            return e();
        }
        return aktp.aj(new uvj(this, qeiVar, 5, bArr), this.g);
    }

    @Override // defpackage.ajoa
    public final void fH(String str) {
        akrh e = aktp.e("SynchronousRcsService#handleServiceConnected");
        try {
            if (!h()) {
                a.l("Tachyon phone registration flag disabled");
            } else {
                xze xzeVar = a;
                xzeVar.l("Tachyon phone registration flag enabled");
                if (j.equals(str)) {
                    if (!this.d.isConnected()) {
                        xzeVar.q("Profile service is not connected at service connected callback.");
                    } else {
                        yyb.aO(e(), "BugleNetwork", "Failed to ensure Tachyon phone registration.");
                    }
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul g(vbq vbqVar) {
        return vbqVar.l(vaz.FORCE_REFRESH).h(new uzs(this, 13), andi.a);
    }

    public final boolean h() {
        return vht.d();
    }

    @Override // defpackage.ajoa
    public final void c(String str) {
    }

    @Override // defpackage.ajoa
    public final void fG(String str, ajnz ajnzVar) {
    }
}
