package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.UserManager;
import android.provider.Settings;
import j$.util.Optional;
import java.util.Formatter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ezp implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ezp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [nfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, ngx] */
    @Override // defpackage.alhr
    public final Object get() {
        String str;
        int i = 0;
        boolean isDemoUser = false;
        switch (this.b) {
            case 0:
                return this.a;
            case 1:
                AudioManager audioManager = (AudioManager) ((Context) this.a).getApplicationContext().getSystemService("audio");
                dzg.g(audioManager);
                return audioManager;
            case 2:
                return new ezn((Context) this.a);
            case 3:
                return new fgj((Context) this.a, new flq());
            case 4:
                return this.a;
            case 5:
                return new fgj((Context) this.a, new flq());
            case 6:
                return new fjd((Context) this.a);
            case 7:
                return fjm.e((Context) this.a);
            case 8:
                return this.a;
            case 9:
                return this.a;
            case 10:
                return Boolean.valueOf(((fai) this.a).g);
            case 11:
                try {
                    return (fgu) ((Class) this.a).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 12:
                return new ngy(this.a);
            case 13:
                return (weq) this.a.b();
            case 14:
                return ((aoyj) this.a).toByteArray();
            case 15:
                return new Formatter((Appendable) ((jat) this.a).b.get());
            case 16:
                kzo kzoVar = (kzo) this.a;
                if (!((ohf) kzoVar.b.b()).a()) {
                    return new ncr(null);
                }
                if (kzoVar.d().length == 1) {
                    lfl lflVar = (lfl) kzoVar.c.b();
                    yjy yjyVar = (yjy) kzoVar.a.b();
                    Integer num = kzoVar.d()[0];
                    if (num != null) {
                        i = num.intValue();
                    }
                    return lflVar.z(yjyVar.h(i));
                }
                return new ncr(null);
            case 17:
                return ((kzp) this.a).a.b();
            case 18:
                return ghw.r(this.a);
            case 19:
                Object obj = this.a;
                if (!yyb.aG()) {
                    isDemoUser = ((UserManager) ((lxx) obj).d.b()).isDemoUser();
                } else if (Settings.Secure.getInt(((lxx) obj).c.getContentResolver(), "shopdemo", 0) == 1) {
                    isDemoUser = true;
                }
                ((lxx) obj).h = true;
                return Boolean.valueOf(isDemoUser);
            default:
                alwo alwoVar = mat.a;
                if (!xyp.i()) {
                    str = "";
                } else {
                    str = ((yep) this.a).e("bugle_testing_simulation_session_id", "");
                }
                if ("".equals(str)) {
                    return Optional.empty();
                }
                aozy createBuilder = amil.a.createBuilder();
                ((alwl) ((alwl) mat.a.g()).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "extractBugleTestingInfo", 244, "BugleClearcutLoggerImpl.java")).t("Associating clearcut log with simulation: %s", str);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amil amilVar = (amil) createBuilder.b;
                str.getClass();
                amilVar.b |= 2;
                amilVar.d = str;
                return Optional.of((amil) createBuilder.s());
        }
    }
}
