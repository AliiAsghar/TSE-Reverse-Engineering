package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyp {
    public dyp() {
    }

    public static Notification.BubbleMetadata c(dyr dyrVar) {
        Notification.BubbleMetadata.Builder icon;
        Notification.BubbleMetadata.Builder intent;
        Notification.BubbleMetadata.Builder deleteIntent;
        Notification.BubbleMetadata.Builder autoExpandBubble;
        Notification.BubbleMetadata.Builder suppressNotification;
        Notification.BubbleMetadata build;
        if (dyrVar.a == null) {
            return null;
        }
        icon = new Notification.BubbleMetadata.Builder().setIcon(dyrVar.c.c());
        intent = icon.setIntent(dyrVar.a);
        deleteIntent = intent.setDeleteIntent(dyrVar.b);
        autoExpandBubble = deleteIntent.setAutoExpandBubble(dyrVar.a());
        suppressNotification = autoExpandBubble.setSuppressNotification(dyrVar.b());
        int i = dyrVar.d;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        int i2 = dyrVar.e;
        if (i2 != 0) {
            suppressNotification.setDesiredHeightResId(i2);
        }
        build = suppressNotification.build();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dyr d(Notification.BubbleMetadata bubbleMetadata) {
        PendingIntent intent;
        PendingIntent intent2;
        Icon icon;
        boolean autoExpandBubble;
        PendingIntent deleteIntent;
        boolean isNotificationSuppressed;
        int desiredHeight;
        int desiredHeightResId;
        int desiredHeightResId2;
        int desiredHeight2;
        intent = bubbleMetadata.getIntent();
        if (intent == null) {
            return null;
        }
        intent2 = bubbleMetadata.getIntent();
        icon = bubbleMetadata.getIcon();
        rhc rhcVar = new rhc(intent2, dzd.h(icon));
        autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        rhcVar.c(autoExpandBubble);
        deleteIntent = bubbleMetadata.getDeleteIntent();
        rhcVar.e = deleteIntent;
        isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
        rhcVar.f(isNotificationSuppressed);
        desiredHeight = bubbleMetadata.getDesiredHeight();
        if (desiredHeight != 0) {
            desiredHeight2 = bubbleMetadata.getDesiredHeight();
            rhcVar.d(desiredHeight2);
        }
        desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
        if (desiredHeightResId != 0) {
            desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
            rhcVar.e(desiredHeightResId2);
        }
        return rhcVar.b();
    }

    public static Set e() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public dyp(byte[] bArr) {
    }

    public void b() {
    }

    public void a(Throwable th) {
    }
}
