package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Window;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhm {
    public final Context a;
    public final anen b;
    public final ngu c;
    public final aksr d;
    public final Uri e;
    public final armf f;
    public MediaPlayer g;
    public final qdq k;
    public boolean h = false;
    private boolean l = false;
    public boolean i = false;
    public Duration j = Duration.ZERO;

    public nhm(Context context, anen anenVar, ngu nguVar, aksr aksrVar, armf armfVar, Uri uri, qdq qdqVar) {
        this.a = context;
        this.b = anenVar;
        this.c = nguVar;
        this.d = aksrVar;
        this.f = armfVar;
        this.e = uri;
        this.k = qdqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Duration a() {
        MediaPlayer mediaPlayer;
        if (this.h && (mediaPlayer = this.g) != null) {
            return Duration.ofMillis(mediaPlayer.getCurrentPosition());
        }
        return Duration.ZERO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Duration b() {
        MediaPlayer mediaPlayer;
        long j = -1;
        if (this.h && (mediaPlayer = this.g) != null) {
            j = mediaPlayer.getDuration();
        }
        return Duration.ofMillis(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        MediaPlayer mediaPlayer;
        if (this.h && (mediaPlayer = this.g) != null) {
            mediaPlayer.pause();
            qdq qdqVar = this.k;
            if (equals(((nhh) qdqVar.a).f)) {
                nhh nhhVar = (nhh) qdqVar.a;
                if (nhhVar.g != null) {
                    ((mck) nhhVar.c.b()).b(((nhh) qdqVar.a).f(), b().toSeconds());
                    ((nhh) qdqVar.a).e(new nhe(2, b(), a()));
                    ((nhh) qdqVar.a).b();
                }
            }
            this.c.a();
            return;
        }
        this.i = false;
    }

    public final void d() {
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null && !this.l) {
            ygu.b(mediaPlayer);
            this.l = true;
            this.h = false;
            this.c.a();
        }
    }

    public final void e(Duration duration) {
        MediaPlayer mediaPlayer;
        if (this.h && (mediaPlayer = this.g) != null) {
            mediaPlayer.seekTo((int) duration.toMillis());
        } else {
            this.j = duration;
        }
    }

    public final void f() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        Window window;
        if (this.h && this.g != null) {
            ngu nguVar = this.c;
            nhi nhiVar = new nhi(this, 0);
            audioAttributes = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            onAudioFocusChangeListener = audioAttributes.setOnAudioFocusChangeListener(nhiVar);
            build = onAudioFocusChangeListener.build();
            nguVar.b = build;
            requestAudioFocus = ((AudioManager) nguVar.a).requestAudioFocus(ex$$ExternalSyntheticApiModelOutline1.m372m(nguVar.b));
            if (requestAudioFocus == 1) {
                this.g.start();
                qdq qdqVar = this.k;
                if (equals(((nhh) qdqVar.a).f)) {
                    nhh nhhVar = (nhh) qdqVar.a;
                    if (nhhVar.g != null) {
                        ((mck) nhhVar.c.b()).c(((nhh) qdqVar.a).f(), b().toSeconds());
                        ((nhh) qdqVar.a).e(new nhe(1, b(), a()));
                        cj fe = ((nhh) qdqVar.a).b.fe();
                        if (fe != null && (window = fe.getWindow()) != null) {
                            window.addFlags(128);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            qdq qdqVar2 = this.k;
            if (equals(((nhh) qdqVar2.a).f)) {
                nhh nhhVar2 = (nhh) qdqVar2.a;
                ngx ngxVar = nhhVar2.g;
                if (ngxVar != null) {
                    nhhVar2.g(ngxVar, ngz.a);
                }
                ((nhh) qdqVar2.a).e(new nhe(2, b(), a()));
                ((alwl) ((alwl) nhh.a.g()).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$AudioControllerSessionStateChangeListener", "onAudioFocusRequestDenied", 364, "AudioAttachmentController.java")).q("Audio playback focus request denied.");
                return;
            }
            return;
        }
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        MediaPlayer mediaPlayer;
        if (this.h && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying()) {
            return true;
        }
        return false;
    }
}
