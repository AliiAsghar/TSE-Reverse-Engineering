package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Icon;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyq {
    public static Notification.BubbleMetadata a(dyr dyrVar) {
        Notification.BubbleMetadata.Builder builder;
        Notification.BubbleMetadata.Builder deleteIntent;
        Notification.BubbleMetadata.Builder autoExpandBubble;
        Notification.BubbleMetadata build;
        String str = dyrVar.g;
        if (str != null) {
            builder = new Notification.BubbleMetadata.Builder(str);
        } else {
            builder = new Notification.BubbleMetadata.Builder(dyrVar.a, dyrVar.c.c());
        }
        deleteIntent = builder.setDeleteIntent(dyrVar.b);
        autoExpandBubble = deleteIntent.setAutoExpandBubble(dyrVar.a());
        autoExpandBubble.setSuppressNotification(dyrVar.b());
        int i = dyrVar.d;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        int i2 = dyrVar.e;
        if (i2 != 0) {
            builder.setDesiredHeightResId(i2);
        }
        build = builder.build();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dyr b(Notification.BubbleMetadata bubbleMetadata) {
        String shortcutId;
        rhc rhcVar;
        PendingIntent intent;
        Icon icon;
        boolean autoExpandBubble;
        PendingIntent deleteIntent;
        boolean isNotificationSuppressed;
        int desiredHeight;
        int desiredHeightResId;
        int desiredHeightResId2;
        int desiredHeight2;
        String shortcutId2;
        shortcutId = bubbleMetadata.getShortcutId();
        if (shortcutId == null) {
            intent = bubbleMetadata.getIntent();
            icon = bubbleMetadata.getIcon();
            rhcVar = new rhc(intent, dzd.h(icon));
        } else {
            shortcutId2 = bubbleMetadata.getShortcutId();
            rhcVar = new rhc(shortcutId2);
        }
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

    public static List c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void d(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    public static long f(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void g(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + i);
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public boolean e(CharSequence charSequence) {
        return charSequence instanceof eca;
    }
}
