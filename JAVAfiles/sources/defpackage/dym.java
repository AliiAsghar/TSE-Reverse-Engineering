package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dym {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }

    public static final void d(ead eadVar, Set set, Map map) {
        if (!TextUtils.isEmpty(eadVar.e)) {
            Intent[] intentArr = eadVar.c;
            if (intentArr != null && intentArr.length != 0) {
                return;
            } else {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    public static Executor e() {
        Handler handler;
        if (Build.VERSION.SDK_INT < 28) {
            handler = new Handler(Looper.getMainLooper());
        } else {
            handler = Handler.createAsync(Looper.getMainLooper());
        }
        handler.getClass();
        return new fcv(handler, 1);
    }
}
