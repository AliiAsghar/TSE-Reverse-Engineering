package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygp implements MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
    }
}
