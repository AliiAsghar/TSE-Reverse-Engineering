package defpackage;

import android.media.MediaPlayer;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhv implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer");
    private final LinkedList b = new LinkedList();
    private final Object c = new Object();

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                synchronized (this.c) {
                }
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        alvw i3 = a.i();
        i3.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "onError", 277, "NotificationPlayer.java")).u("NotificationPlayer failed: error type: %d, extra code: %d", i, i2);
        return false;
    }
}
