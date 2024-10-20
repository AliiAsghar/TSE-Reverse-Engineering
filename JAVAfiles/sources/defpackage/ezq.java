package defpackage;

import j$.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ezq implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ ezq(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ezk(new fjl(), 2500, 5000);
            case 1:
                return albo.bB(Executors.newSingleThreadExecutor());
            case 2:
                int i = fkb.a;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    dzg.g(invoke);
                    return (esi) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 3:
                alhr alhrVar = ier.a;
                return uuh.f(uuh.b, "birthday_nudge_recent_message_threshold_seconds", 31536000L);
            case 4:
                alhr alhrVar2 = ier.a;
                return uuh.e(uuh.b, "birthday_nudge_days_to_sync", 2);
            case 5:
                alhr alhrVar3 = ier.a;
                return uuh.e(uuh.b, "cake_animation_repeat_count", -1);
            case 6:
                uuf uufVar = ipe.a;
                try {
                    return (ahil) apag.parseFrom(ahil.a, (byte[]) ipe.n.e(), aozs.a());
                } catch (apba unused) {
                    return ahil.a;
                }
            case 7:
                return new SimpleDateFormat("h:mm aa", Locale.US);
            case 8:
                return new SimpleDateFormat("MMM d, h:mm aa", Locale.US);
            case 9:
                return new SimpleDateFormat("EEE, MMM d, h:mm aa", Locale.US);
            case 10:
                return new SimpleDateFormat("H:mm", Locale.US);
            case 11:
                return new SimpleDateFormat("MMM d, H:mm", Locale.US);
            case 12:
                return new SimpleDateFormat("EEE, MMM d, H:mm", Locale.US);
            case 13:
                return new SimpleDateFormat("EEE, MMM d", Locale.US);
            case 14:
                return new StringBuilder();
            case 15:
                return uuh.f(uuh.b, "birthday_nudge_sync_worker_interval_sec", TimeUnit.DAYS.toSeconds(1L));
            case 16:
                alwo alwoVar = lpm.a;
                return uuh.f(uuh.b, "birthday_nudge_sync_worker_initial_delay_sec", 0L);
            case 17:
                return Optional.of("US");
            case 18:
                return alwo.o("BugleStartup");
            case 19:
                snb snbVar = new snb();
                snbVar.f("deleteAllLighterConversations");
                snbVar.b(new mmv(12));
                return Integer.valueOf(snbVar.d());
            default:
                uuf uufVar2 = mrk.a;
                return msy.BOT;
        }
    }
}
