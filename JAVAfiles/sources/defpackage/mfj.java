package defpackage;

import android.telephony.ims.ImsException;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mfj implements ancs {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mfj(long j, String str, int i) {
        this.c = i;
        this.a = j;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r9v38, types: [rvm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v55, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.Object, wul] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = 12;
        switch (this.c) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    return aktp.ag(amin.ENGAGEMENT_LEVEL_ACTIVE);
                }
                final long j = this.a;
                return aktp.Z(aktp.Y(((mfo) this.b).w.c.a(), new its(19), andi.a), new ancs() { // from class: mfn
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj2) {
                        if (j - ((Long) obj2).longValue() < mfo.g) {
                            return aktp.ag(amin.ENGAGEMENT_LEVEL_PASSIVE);
                        }
                        return aktp.ag(amin.ENGAGEMENT_LEVEL_INACTIVE);
                    }
                }, andi.a);
            case 1:
                uwu uwuVar = (uwu) ((kpv) this.b).c.b();
                return uwuVar.b.j(new mdq(Math.round((this.a / 1000.0d) / 3600.0d) * 3600000, 7)).h(new ult(uwuVar, 17), uwuVar.c);
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    alvw d = ngv.a.d();
                    d.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 318, "LevelTrackingMediaRecorder.java")).q("start tracking sound level is over");
                    return aktp.ag(null);
                }
                long j2 = this.a;
                Object obj2 = this.b;
                alvw d2 = ngv.a.d();
                d2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 321, "LevelTrackingMediaRecorder.java")).q("start tracking sound level again");
                return ((ngv) obj2).c(j2, j2);
            case 3:
                ((pvd) this.b).e(this.a);
                return aktp.af(new psx("[Single Registration] Failed to force the platform to make a network exchange", (IllegalArgumentException) obj));
            case 4:
                ImsException m68m = anf$$ExternalSyntheticApiModelOutline0.m68m(obj);
                ((pvd) this.b).e(this.a);
                return aktp.af(new psx("[Single Registration] Failed to force the platform to make a network exchange", m68m));
            case 5:
                ((pvd) this.b).e(this.a);
                return aktp.af(new psx("[Single Registration] Failed to force the platform to make a network exchange", (SecurityException) obj));
            case 6:
                return this.b.c(this.a);
            case 7:
                Optional optional = (Optional) obj;
                boolean isEmpty = optional.isEmpty();
                long j3 = this.a;
                if (isEmpty) {
                    return aktp.ag(Long.valueOf(j3));
                }
                Object obj3 = this.b;
                vel velVar = (vel) optional.get();
                String str = (String) obj3;
                if (str.hashCode() == 518434673 && str.equals("registrationExpirationMsKey")) {
                    return velVar.c().h(new mdq(j3, 11), andi.a);
                }
                vel.a.q("Unsupported preference key. Returning default value");
                return aktp.ag(Long.valueOf(j3));
            case 8:
                long longValue = ((Long) obj).longValue();
                long j4 = this.a;
                if (j4 > longValue) {
                    return ((vco) this.b).b.j(new mdq(j4, 8)).h(new vdx(3), andi.a);
                }
                return aktp.ag(null);
            case 9:
                long longValue2 = ((Long) obj).longValue();
                long j5 = this.a;
                if (j5 > longValue2) {
                    return ((vjs) this.b).a.j(new mdq(j5, 10)).h(new vdx(i), andi.a);
                }
                return aktp.ag(null);
            case 10:
                if (((Long) obj).equals(0L)) {
                    return ((xbw) ((xac) this.b).f.b()).b(this.a).h(new woc(i), andi.a);
                }
                return aktp.ag(xaa.NOT_FIRST_FULL_SYNC);
            default:
                return ((ajzk) this.b).b(this.a);
        }
    }

    public /* synthetic */ mfj(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }
}
