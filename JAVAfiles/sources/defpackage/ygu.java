package defpackage;

import android.media.MediaPlayer;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygu {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager");
    private static final Set b = DesugarCollections.synchronizedSet(new HashSet());

    public static MediaPlayer a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        b.add(mediaPlayer);
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager", "create", 38, "MediaPlayerManager.java")).r("MediaPlayerManager: created %d", mediaPlayer.hashCode());
        return mediaPlayer;
    }

    public static void b(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        albo.T(b.remove(mediaPlayer));
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager", "release", 48, "MediaPlayerManager.java")).r("MediaPlayerManager: released %d", mediaPlayer.hashCode());
    }
}
