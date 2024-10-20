package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aksk implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aksk(aksr aksrVar, MediaPlayer.OnErrorListener onErrorListener, int i) {
        this.d = i;
        this.a = aksrVar;
        this.b = "AudioAttachmentPlaybackSession#onErrorListener";
        this.c = onErrorListener;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.d != 0) {
            ((alwl) ygs.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getErrorListener", 231, "PlaybackSession.java")).u("Media player encountered an error: type = %d, code = %d", i, i2);
            Object obj = this.b;
            if (obj != null) {
                ((ahjj) obj).s();
            }
            Object obj2 = this.c;
            Object obj3 = this.a;
            qiu.h(aktp.ah(new uym(obj3, obj2, i, i2, 2), ((ygs) obj3).c));
            return true;
        }
        akrc b = ((aksr) this.a).b((String) this.b);
        try {
            boolean onError = this.c.onError(mediaPlayer, i, i2);
            b.close();
            return onError;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ aksk(ygs ygsVar, ahjj ahjjVar, dtq dtqVar, int i) {
        this.d = i;
        this.a = ygsVar;
        this.b = ahjjVar;
        this.c = dtqVar;
    }
}
