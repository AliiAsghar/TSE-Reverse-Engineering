package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.Context;
import android.media.MediaFormat;
import android.os.UserManager;
import java.nio.ByteBuffer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }

    public static boolean b(Context context) {
        boolean isUserUnlocked;
        isUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        return isUserUnlocked;
    }

    public static String c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static int f(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r1 != 22) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.media.MediaFormat g(defpackage.eqn r6) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzh.g(eqn):android.media.MediaFormat");
    }

    public static void h(MediaFormat mediaFormat, eqd eqdVar) {
        if (eqdVar != null) {
            i(mediaFormat, "color-transfer", eqdVar.e);
            i(mediaFormat, "color-standard", eqdVar.c);
            i(mediaFormat, "color-range", eqdVar.d);
            byte[] bArr = eqdVar.f;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void i(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void j(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void k(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(a.bV(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void l(MediaFormat mediaFormat, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
    }

    private static void m(MediaFormat mediaFormat, String str, int i) {
        int i2;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        mediaFormat.setInteger(str, i2);
    }
}
