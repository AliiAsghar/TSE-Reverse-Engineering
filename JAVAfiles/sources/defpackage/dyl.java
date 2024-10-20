package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyl {
    public dyl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigLargeIcon(icon);
    }

    public static long b(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void c(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + i);
    }

    public dyl(byte[] bArr) {
    }

    public void e() {
    }

    public void d(Throwable th) {
    }
}
