package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class viq {
    public static final alwo a = alwo.o("BugleNotifications");
    public final armf b;
    public final alhr c;
    private final Context d;

    public viq(Context context, armf armfVar, armf armfVar2) {
        this.d = context;
        this.b = armfVar;
        this.c = new uqw(armfVar2, 20);
    }

    public static amwh a(amwh amwhVar, MessageCoreData messageCoreData) {
        boolean z;
        boolean z2;
        amwh amwhVar2;
        boolean z3 = false;
        if (!messageCoreData.cI() && !messageCoreData.cJ()) {
            z = false;
        } else {
            z = true;
        }
        if (!messageCoreData.cB() && !messageCoreData.cC()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (messageCoreData.cQ() || messageCoreData.cS()) {
            z3 = true;
        }
        amwh amwhVar3 = amwh.MESSAGE_TYPE_UNKNOWN;
        if (z) {
            amwhVar2 = amwh.MESSAGE_TYPE_RCS;
        } else {
            amwhVar2 = amwhVar3;
        }
        if (z2) {
            amwhVar2 = amwh.MESSAGE_TYPE_MMS;
        }
        if (z3) {
            amwhVar2 = amwh.MESSAGE_TYPE_SMS;
        }
        if (amwhVar != amwhVar3 && amwhVar != amwhVar2) {
            return amwh.MESSAGE_TYPE_HYBRID;
        }
        return amwhVar2;
    }

    public static int c(Throwable th) {
        if (th instanceof NullPointerException) {
            return 2;
        }
        if (th instanceof SecurityException) {
            return 3;
        }
        if (th instanceof IllegalArgumentException) {
            return 5;
        }
        if (th instanceof IllegalStateException) {
            return 6;
        }
        if (th instanceof RuntimeException) {
            return 4;
        }
        return 1;
    }

    public final boolean b() {
        int bubblePreference;
        NotificationManager notificationManager = (NotificationManager) this.d.getSystemService("notification");
        if (notificationManager != null && yhx.e) {
            bubblePreference = notificationManager.getBubblePreference();
            if (bubblePreference != 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        aozy createBuilder = amwo.a.createBuilder();
        amwl amwlVar = amwl.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amwo amwoVar = (amwo) apagVar;
        amwlVar.getClass();
        amwoVar.d = amwlVar;
        amwoVar.c = 3;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amwo amwoVar2 = (amwo) createBuilder.b;
        amwoVar2.g = i - 1;
        amwoVar2.b |= 4;
        amwo amwoVar3 = (amwo) createBuilder.s();
        maq maqVar = (maq) this.b.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.NOTIFICATION_METRICS_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amwoVar3.getClass();
        amfrVar2.aU = amwoVar3;
        amfrVar2.f |= 2048;
        maqVar.j(amfqVar);
    }

    public final void e(int i, Duration duration) {
        f(Optional.empty(), i, duration);
    }

    public final void f(Optional optional, int i, Duration duration) {
        aozy createBuilder = amwi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amwi amwiVar = (amwi) createBuilder.b;
        amwiVar.c = i - 1;
        amwiVar.b |= 1;
        long millis = duration.toMillis();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amwi amwiVar2 = (amwi) createBuilder.b;
        amwiVar2.b |= 2;
        amwiVar2.d = millis;
        aozy createBuilder2 = amwo.a.createBuilder();
        boolean b = b();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amwo amwoVar = (amwo) createBuilder2.b;
        amwoVar.b |= 2;
        amwoVar.f = b;
        amwi amwiVar3 = (amwi) createBuilder.s();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amwo amwoVar2 = (amwo) apagVar;
        amwiVar3.getClass();
        amwoVar2.d = amwiVar3;
        amwoVar2.c = 5;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amwo amwoVar3 = (amwo) createBuilder2.b;
        amwoVar3.g = 1;
        amwoVar3.b |= 4;
        optional.ifPresent(new uoa(createBuilder2, 14));
        maq maqVar = (maq) this.b.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.NOTIFICATION_METRICS_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amwo amwoVar4 = (amwo) createBuilder2.s();
        amwoVar4.getClass();
        amfrVar2.aU = amwoVar4;
        amfrVar2.f |= 2048;
        maqVar.j(amfqVar);
    }

    public final void g(amwh amwhVar, int i, int i2, Optional optional) {
        aozy createBuilder = amwn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amwn amwnVar = (amwn) apagVar;
        amwnVar.c = i - 1;
        amwnVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amwn amwnVar2 = (amwn) createBuilder.b;
        amwnVar2.d = i2 - 1;
        amwnVar2.b |= 2;
        optional.isPresent();
        boolean booleanValue = ((Boolean) optional.get()).booleanValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amwn amwnVar3 = (amwn) createBuilder.b;
        amwnVar3.b |= 4;
        amwnVar3.e = booleanValue;
        aozy createBuilder2 = amwo.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amwo amwoVar = (amwo) createBuilder2.b;
        amwoVar.e = amwhVar.g;
        amwoVar.b |= 1;
        boolean b = b();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amwo amwoVar2 = (amwo) apagVar2;
        amwoVar2.b |= 2;
        amwoVar2.f = b;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        amwo amwoVar3 = (amwo) createBuilder2.b;
        amwn amwnVar4 = (amwn) createBuilder.s();
        amwnVar4.getClass();
        amwoVar3.d = amwnVar4;
        amwoVar3.c = 4;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amwo amwoVar4 = (amwo) createBuilder2.b;
        amwoVar4.g = 1;
        amwoVar4.b |= 4;
        amwo amwoVar5 = (amwo) createBuilder2.s();
        maq maqVar = (maq) this.b.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.NOTIFICATION_METRICS_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amwoVar5.getClass();
        amfrVar2.aU = amwoVar5;
        amfrVar2.f |= 2048;
        maqVar.j(amfqVar);
    }
}
