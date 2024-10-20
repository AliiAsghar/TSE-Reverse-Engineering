package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwc {
    public static final xze a = xze.g("Bugle", "MessageFlagger");
    public final anen b;
    public final anen c;
    public final xnv d;
    public final lzw e;
    public final Map f;
    public final Object g = new Object();
    public Optional h = Optional.empty();
    public Optional i = Optional.empty();
    public final uie j;
    public final uac k;

    public uwc(anen anenVar, anen anenVar2, uie uieVar, xnv xnvVar, Map map, lzw lzwVar, uac uacVar) {
        this.b = anenVar;
        this.c = anenVar2;
        this.j = uieVar;
        this.d = xnvVar;
        this.f = new HashMap(map);
        this.e = lzwVar;
        this.k = uacVar;
    }

    public static final boolean d(MessageIdType messageIdType, tqg tqgVar) {
        Object apply;
        sqm a2 = sqp.a();
        a2.w("flaggedMessageExists");
        apply = new tux(messageIdType, tqgVar, 12).apply(new sqo());
        a2.k(new agpw((sqo) apply));
        return a2.b().K();
    }

    public final akul a() {
        sqm a2 = sqp.a();
        a2.w("processAllFlaggedAndComputeNextTimer");
        return a2.b().s().i(new uwa(this, 2), this.c);
    }

    public final akul b(alog alogVar, tqg tqgVar) {
        byte[] bArr = null;
        if (alogVar.isEmpty()) {
            return aktp.ag(null);
        }
        return aktp.ai(new ulo(alogVar, tqgVar, 12, bArr), this.b).i(new uwa(this, 3), this.c);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final void c() {
        synchronized (this.g) {
            if (this.h.isPresent()) {
                if (this.i.isPresent()) {
                    lzw lzwVar = this.e;
                    Object obj = this.i.get();
                    Object systemService = lzwVar.b.getSystemService("alarm");
                    systemService.getClass();
                    lzwVar.c = (AlarmManager) systemService;
                    Intent a2 = lqn.e(new ComponentName(lzwVar.b, "com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver"), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM").a();
                    a2.getClass();
                    PendingIntent i = lzwVar.d.i(a2, (lzx) obj);
                    AlarmManager alarmManager = lzwVar.c;
                    if (alarmManager == null) {
                        arro.b("alarmManager");
                        alarmManager = null;
                    }
                    alarmManager.cancel(i);
                    this.i = Optional.empty();
                    xyo c = a.c();
                    c.H("MessageFlagger cancelling alert scheduled for");
                    c.G(Duration.between(this.h.get(), this.d.f()).getSeconds());
                    c.H("seconds later.");
                    c.q();
                    this.h = Optional.empty();
                } else {
                    a.q("Cannot delete reminder. Alarm token is null");
                }
            }
        }
    }
}
