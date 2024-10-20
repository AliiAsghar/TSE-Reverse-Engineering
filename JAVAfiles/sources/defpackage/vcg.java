package defpackage;

import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcg extends xcf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/TachyonBackgroundStartupTask");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final anen k;
    private final ppb l;
    private final armf m;

    public vcg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, anen anenVar, armf armfVar9, ppb ppbVar) {
        this.b = armfVar;
        this.f = armfVar2;
        this.g = armfVar4;
        this.c = armfVar5;
        this.h = armfVar6;
        this.d = armfVar3;
        this.i = armfVar7;
        this.e = armfVar8;
        this.k = anenVar;
        this.m = armfVar9;
        this.l = ppbVar;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("TachyonBackgroundStartupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        akul i;
        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
        xzb.j("BugleNetwork", "Startup: registering tachyon.");
        listenableFutureArr[0] = ((vax) this.b.b()).s().i(new vbn(this, 14), andi.a);
        if (!vht.d()) {
            i = aktp.ag(null);
        } else if (!((yjy) this.h.b()).q()) {
            xzb.j("BugleNetwork", "Startup: skip phone registration because of no sim.");
            i = aktp.ag(null);
        } else {
            xzb.j("BugleNetwork", "Startup: registering tachyon for phone.");
            ((wui) this.g.b()).n((ajoa) this.c.b());
            if (!((ansy) ((pon) this.l).a.b()).e("bugle.remove_profile_service_check_for_startup_register") && !((RcsProfileService) this.f.b()).isConnected()) {
                xzb.j("BugleNetwork", "Profile service is not connected at startup task.");
                i = aktp.ag(null);
            } else {
                i = ((adjc) this.i.b()).f().i(new vbn(this, 15), this.k);
            }
        }
        listenableFutureArr[1] = i;
        return akul.g(aktp.ar(listenableFutureArr).m(new aidu(null, 18), this.k));
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }
}
