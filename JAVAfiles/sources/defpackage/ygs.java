package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygs implements Closeable {
    public static final alwo a = alwo.o("BugleAudio");
    public final ygf b;
    public final Executor c;
    public final AudioManager d;
    public MediaPlayer e;
    public AudioFocusRequest f;
    public int g = 2;
    public ahjj h;
    private final Context i;

    public ygs(Context context, anen anenVar, AudioManager audioManager, MediaPlayer mediaPlayer, ygf ygfVar) {
        this.i = context;
        this.b = ygfVar;
        this.e = mediaPlayer;
        this.c = new anew(anenVar);
        this.d = audioManager;
    }

    private final void e(yge ygeVar) {
        MediaPlayer mediaPlayer = this.e;
        mediaPlayer.getClass();
        if (ygeVar.d() - 1 != 1) {
            AssetFileDescriptor openRawResourceFd = this.i.getResources().openRawResourceFd(ygeVar.b().intValue());
            try {
                mediaPlayer.setDataSource(openRawResourceFd);
                if (openRawResourceFd != null) {
                    openRawResourceFd.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (openRawResourceFd != null) {
                    try {
                        openRawResourceFd.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        mediaPlayer.setDataSource(ygeVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akul a(String str) {
        return aktp.ai(new xfb(this, str, 15, null), this.c);
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            ygu.b(mediaPlayer);
            this.e = null;
            ygf ygfVar = this.b;
            ygfVar.f.ifPresent(new ybf(this, 7));
        }
        this.g = 1;
    }

    public final void c() {
        try {
            e(this.b.a);
        } catch (Resources.NotFoundException | IOException | IllegalArgumentException e) {
            if (this.b.b.isPresent()) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "setDataSource", 264, "PlaybackSession.java")).t("Failed to use data source: %s", this.b.a);
                e((yge) this.b.b.get());
                return;
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qiu.h(a("Future cancellation"));
    }

    public final akul d(ahjj ahjjVar) {
        return aktp.aj(new xpx(this, ahjjVar, 5), this.c).i(new xfv(this, ahjjVar, 14), andi.a);
    }
}
