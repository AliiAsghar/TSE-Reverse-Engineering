package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder");
    public final Context b;
    public MediaRecorder c;
    public final hgj d;
    private final aneo e;
    private final anen f;
    private final yxb g;
    private Uri h;
    private ParcelFileDescriptor i;
    private akul j;

    public ngv(Context context, aneo aneoVar, anen anenVar, hgj hgjVar, yxb yxbVar) {
        this.b = context;
        this.e = aneoVar;
        this.f = anenVar;
        this.d = hgjVar;
        this.g = yxbVar;
    }

    private static int f(int i) {
        int i2 = (i / 307200) * 60;
        if (i2 == 0) {
            return (i / 51200) * 10;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ascc] */
    private final void g() {
        akul akulVar = this.j;
        if (akulVar != null && !akulVar.isDone()) {
            this.j.cancel(true);
        }
        this.d.a.e();
    }

    public final int a(int i) {
        if (this.g.a()) {
            int f = f(i);
            if (((Boolean) nhr.a.e()).booleanValue()) {
                return Math.min(((Integer) nhr.b.e()).intValue(), f);
            }
            return f;
        }
        if (((Boolean) nhr.a.e()).booleanValue()) {
            return ((Integer) nhr.b.e()).intValue();
        }
        return f(i);
    }

    public final Uri b() {
        MediaRecorder mediaRecorder;
        synchronized (ngv.class) {
            MediaRecorder mediaRecorder2 = this.c;
            if (mediaRecorder2 != null) {
                byte[] bArr = null;
                try {
                    try {
                        mediaRecorder2.stop();
                        mediaRecorder = this.c;
                    } catch (RuntimeException e) {
                        alvw i = a.i();
                        i.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "stopRecording", 207, "LevelTrackingMediaRecorder.java")).t("Something went wrong when stopping media recorder. %s", e);
                        Uri uri = this.h;
                        if (uri != null) {
                            aktp.ah(new nan(this, uri, 4, bArr), this.f).k(qiu.b(), andi.a);
                            this.h = null;
                        }
                        MediaRecorder mediaRecorder3 = this.c;
                        if (mediaRecorder3 != null) {
                            mediaRecorder3.release();
                        }
                    }
                    if (mediaRecorder != null) {
                        mediaRecorder.release();
                        this.c = null;
                    }
                } catch (Throwable th) {
                    MediaRecorder mediaRecorder4 = this.c;
                    if (mediaRecorder4 != null) {
                        mediaRecorder4.release();
                        this.c = null;
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("Not currently recording!");
            }
        }
        ParcelFileDescriptor parcelFileDescriptor = this.i;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
            this.i = null;
        }
        g();
        return this.h;
    }

    public final akul c(long j, long j2) {
        return akul.g(this.e.schedule(new mig(this, 8), j, TimeUnit.MILLISECONDS)).i(new mfj(this, j2, 2), this.e).e(InterruptedException.class, new mme(16), this.e);
    }

    public final boolean d() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean e(MediaRecorder.OnErrorListener onErrorListener, MediaRecorder.OnInfoListener onInfoListener, int i) {
        String str;
        synchronized (ngv.class) {
            if (this.c == null) {
                if (((Boolean) nhr.a.e()).booleanValue()) {
                    str = "m4a";
                } else {
                    str = "amr";
                }
                Uri d = uhl.d(str, this.b);
                MediaRecorder mediaRecorder = new MediaRecorder();
                if (d == null) {
                    return false;
                }
                try {
                    ParcelFileDescriptor openFileDescriptor = this.b.getContentResolver().openFileDescriptor(d, "wt");
                    if (openFileDescriptor == null) {
                        alvw h = a.h();
                        h.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 147, "LevelTrackingMediaRecorder.java")).q("Unable to open the scratch file URI.");
                        return false;
                    }
                    mediaRecorder.setAudioSource(1);
                    int a2 = a(i);
                    if (a2 == 0) {
                        alvw h2 = a.h();
                        h2.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) h2).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 155, "LevelTrackingMediaRecorder.java")).q("Something went wrong when starting media recorder.");
                        return false;
                    }
                    mediaRecorder.setMaxDuration((int) TimeUnit.SECONDS.toMillis(a2));
                    if (((Boolean) nhr.a.e()).booleanValue()) {
                        mediaRecorder.setOutputFormat(2);
                        mediaRecorder.setAudioEncoder(3);
                        mediaRecorder.setAudioSamplingRate(((Integer) nhr.d.e()).intValue());
                        mediaRecorder.setAudioEncodingBitRate(((Integer) nhr.e.e()).intValue());
                    } else {
                        mediaRecorder.setOutputFormat(3);
                        mediaRecorder.setAudioEncoder(1);
                    }
                    mediaRecorder.setMaxFileSize((int) (i * 0.8f));
                    mediaRecorder.setOutputFile(openFileDescriptor.getFileDescriptor());
                    mediaRecorder.setOnErrorListener(onErrorListener);
                    mediaRecorder.setOnInfoListener(onInfoListener);
                    mediaRecorder.prepare();
                    mediaRecorder.start();
                    g();
                    long intValue = ((Integer) nhr.h.e()).intValue();
                    if (intValue <= 0) {
                        alvw d2 = a.d();
                        d2.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevel", 340, "LevelTrackingMediaRecorder.java")).q("Audio level polling is disabled by override.");
                    } else {
                        this.j = c(0L, intValue);
                    }
                    this.c = mediaRecorder;
                    this.h = d;
                    this.i = openFileDescriptor;
                    return true;
                } catch (Exception e) {
                    alvw i2 = a.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i2).g(e)).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 182, "LevelTrackingMediaRecorder.java")).t("Something went wrong when starting media recorder. %s", e);
                    return false;
                }
            }
            throw new IllegalStateException("Trying to start a new recording session while already recording!");
        }
    }
}
