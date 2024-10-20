package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        Notification.MessagingStyle addHistoricMessage;
        addHistoricMessage = messagingStyle.addHistoricMessage(message);
        return addHistoricMessage;
    }

    public static float b(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static int c(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static final void d() {
        d.s(true);
        int i = eqh.a;
    }

    public static /* synthetic */ void e() {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
        eul.M(6);
        eul.M(7);
    }

    public static /* synthetic */ void f() {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
        eul.M(6);
    }
}
