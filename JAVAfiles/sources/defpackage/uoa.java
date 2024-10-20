package defpackage;

import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uoa implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uoa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        boolean canScheduleExactAlarms;
        switch (this.b) {
            case 0:
                this.a.a(obj);
                return;
            case 1:
                ((alob) this.a).h((ujp) obj);
                return;
            case 2:
                xyo c = uus.a.c();
                c.H("Successfully handled tickle with ID:");
                c.H(this.a);
                c.q();
                return;
            case 3:
                xyo e = uus.a.e();
                e.H("Failed to handle tickle with ID:");
                e.H(this.a);
                e.r((Throwable) obj);
                return;
            case 4:
                xyo c2 = uut.a.c();
                c2.H("Successfully handled tickle with ID:");
                c2.H(this.a);
                c2.q();
                return;
            case 5:
                xyo e2 = uut.a.e();
                e2.H("Failed to handle tickle with ID:");
                e2.H(this.a);
                e2.r((Throwable) obj);
                return;
            case 6:
                uve.a.o("Successfully handled Tachyon ping for ".concat(String.valueOf(this.a)));
                return;
            case 7:
                Object obj2 = this.a;
                uwc uwcVar = (uwc) obj2;
                Instant k = uwcVar.k.k((sqf) obj);
                synchronized (uwcVar.g) {
                    if (((uwc) obj2).h.isPresent() && k.compareTo((Instant) ((uwc) obj2).h.get()) >= 0) {
                        if (((Instant) ((uwc) obj2).h.get()).isAfter(((uwc) obj2).d.f())) {
                            return;
                        }
                    }
                    lzw lzwVar = ((uwc) obj2).e;
                    k.getClass();
                    Object systemService = lzwVar.b.getSystemService("alarm");
                    systemService.getClass();
                    lzwVar.c = (AlarmManager) systemService;
                    aozy createBuilder = lzx.a.createBuilder();
                    createBuilder.getClass();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    lzx lzxVar = (lzx) createBuilder.b;
                    lzxVar.b |= 2;
                    lzxVar.d = "com.google.android.apps.messaging.shared.flaggedmessages.MessageFlaggerTask";
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    lzx lzxVar2 = (lzx) createBuilder.b;
                    lzxVar2.b |= 1;
                    lzxVar2.c = uuid;
                    apag s = createBuilder.s();
                    s.getClass();
                    lzx lzxVar3 = (lzx) s;
                    AlarmManager alarmManager = lzwVar.c;
                    AlarmManager alarmManager2 = null;
                    if (alarmManager == null) {
                        arro.b("alarmManager");
                        alarmManager = null;
                    }
                    jvq jvqVar = new jvq((Object) alarmManager, 3, (short[]) null);
                    AlarmManager alarmManager3 = lzwVar.c;
                    if (alarmManager3 == null) {
                        arro.b("alarmManager");
                        alarmManager3 = null;
                    }
                    jvq jvqVar2 = new jvq((Object) alarmManager3, 4, (int[]) null);
                    Intent a = lqn.e(new ComponentName(lzwVar.b, "com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver"), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM").a();
                    a.getClass();
                    if (Build.VERSION.SDK_INT >= 31) {
                        AlarmManager alarmManager4 = lzwVar.c;
                        if (alarmManager4 == null) {
                            arro.b("alarmManager");
                        } else {
                            alarmManager2 = alarmManager4;
                        }
                        canScheduleExactAlarms = alarmManager2.canScheduleExactAlarms();
                        if (!canScheduleExactAlarms) {
                            ((alvg) lzw.a.g().h("com/google/android/apps/messaging/shared/alarm/BugleAlarmScheduler", "scheduleInternalWithFallback", 84, "BugleAlarmScheduler.kt")).q("Missing permission to use exact alarms.");
                            jvqVar2.a(0, Long.valueOf(k.toEpochMilli()), lzwVar.d.i(a, lzxVar3));
                            ((uwc) obj2).i = Optional.of(lzxVar3);
                            ((uwc) obj2).h = Optional.of(k);
                            xyo c3 = uwc.a.c();
                            c3.H("MessageFlagger processing scheduled for");
                            c3.G(Duration.between(k, ((uwc) obj2).d.f()).getSeconds());
                            c3.H("seconds later.");
                            c3.q();
                            return;
                        }
                    }
                    jvqVar.a(0, Long.valueOf(k.toEpochMilli()), lzwVar.d.i(a, lzxVar3));
                    ((uwc) obj2).i = Optional.of(lzxVar3);
                    ((uwc) obj2).h = Optional.of(k);
                    xyo c32 = uwc.a.c();
                    c32.H("MessageFlagger processing scheduled for");
                    c32.G(Duration.between(k, ((uwc) obj2).d.f()).getSeconds());
                    c32.H("seconds later.");
                    c32.q();
                    return;
                }
            case 8:
                ((xhc) obj).a((ConversationIdType) this.a);
                return;
            case 9:
                aqfk aqfkVar = (aqfk) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                vee veeVar = (vee) aozyVar.b;
                vee veeVar2 = vee.a;
                aqfkVar.getClass();
                veeVar.l = aqfkVar;
                veeVar.b |= 1;
                return;
            case 10:
                aqfj aqfjVar = (aqfj) obj;
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                vee veeVar3 = (vee) aozyVar2.b;
                vee veeVar4 = vee.a;
                aqfjVar.getClass();
                veeVar3.n = aqfjVar;
                veeVar3.b |= 4;
                return;
            case 11:
                aqhz aqhzVar = (aqhz) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                vee veeVar5 = (vee) aozyVar3.b;
                vee veeVar6 = vee.a;
                aqhzVar.getClass();
                veeVar5.s = aqhzVar;
                veeVar5.b |= 16;
                return;
            case 12:
                this.a.put("ID", (String) obj);
                return;
            case 13:
                ((vic) this.a).R(8, (amme) obj);
                return;
            case 14:
                amwh amwhVar = (amwh) obj;
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                amwo amwoVar = (amwo) aozyVar4.b;
                amwo amwoVar2 = amwo.a;
                amwoVar.e = amwhVar.g;
                amwoVar.b |= 1;
                return;
            case 15:
                ((vjl) this.a).h.i(ruy.b((String) obj));
                return;
            case 16:
                ((vjl) this.a).c.J().m(ruy.b((String) obj));
                return;
            case 17:
                ((dyu) this.a).M = (dyr) obj;
                return;
            case 18:
                alwo alwoVar = vkl.a;
                ((dyu) this.a).u = ((vll) obj).a;
                return;
            case 19:
                ((Bundle) this.a).putString("extra_notification_tag", (String) obj);
                return;
            default:
                ((Bundle) this.a).putString("extra_notification_tag", (String) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
