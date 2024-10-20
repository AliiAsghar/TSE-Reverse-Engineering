package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Window;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhh {
    public static final alwo a = alwo.o("Bugle");
    public final cg b;
    public final armf c;
    public final PackageManager e;
    public nhm f;
    public ngx g;
    private final armf i;
    private final armf j;
    public boolean h = false;
    public final a d = new a();
    private final ib k = new ib(this, 6);

    public nhh(cg cgVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = cgVar;
        this.i = armfVar;
        this.j = armfVar2;
        this.c = armfVar3;
        this.e = cgVar.y().getPackageManager();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final nhm a(ngx ngxVar) {
        kjp kjpVar = (kjp) this.j.b();
        Uri a2 = ngxVar.a();
        qdq qdqVar = new qdq(this, null);
        Context context = (Context) kjpVar.e.b();
        context.getClass();
        anen anenVar = (anen) kjpVar.d.b();
        anenVar.getClass();
        ngu nguVar = (ngu) kjpVar.c.b();
        aksr aksrVar = (aksr) kjpVar.a.b();
        aksrVar.getClass();
        ?? r6 = kjpVar.b;
        a2.getClass();
        final nhm nhmVar = new nhm(context, anenVar, nguVar, aksrVar, r6, a2, qdqVar);
        this.f = nhmVar;
        this.g = ngxVar;
        ngxVar.addOnAttachStateChangeListener(this.k);
        akbo akboVar = (akbo) this.i.b();
        if (nhmVar.g == null) {
            MediaPlayer a3 = ygu.a();
            nhmVar.g = a3;
            int i = 1;
            a3.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            final aksr aksrVar2 = nhmVar.d;
            final aawp aawpVar = new aawp(nhmVar, i);
            a3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: aksd
                public final /* synthetic */ String b = "AudioAttachmentPlaybackSession#onPreparedListener";

                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    aksr aksrVar3 = aksr.this;
                    MediaPlayer.OnPreparedListener onPreparedListener = aawpVar;
                    akrc b = aksrVar3.b(this.b);
                    try {
                        onPreparedListener.onPrepared(mediaPlayer);
                        b.close();
                    } catch (Throwable th) {
                        try {
                            b.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            int i2 = 0;
            a3.setOnErrorListener(new aksk(nhmVar.d, new nhj(nhmVar, i2), i2));
            a3.setOnCompletionListener(new aksj(nhmVar.d, new nhk(nhmVar, i2), i2));
            final aksr aksrVar3 = nhmVar.d;
            final MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = new MediaPlayer.OnSeekCompleteListener() { // from class: nhl
                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                    nhm nhmVar2 = nhm.this;
                    qdq qdqVar2 = nhmVar2.k;
                    if (nhmVar2.equals(((nhh) qdqVar2.a).f)) {
                        nhh nhhVar = (nhh) qdqVar2.a;
                        if (nhhVar.g != null) {
                            ((mck) nhhVar.c.b()).d(((nhh) qdqVar2.a).f(), nhmVar2.b().toSeconds());
                            Object obj = qdqVar2.a;
                            int i3 = 1;
                            if (true != nhmVar2.g()) {
                                i3 = 2;
                            }
                            ((nhh) obj).e(new nhe(i3, nhmVar2.b(), nhmVar2.a()));
                        }
                    }
                }
            };
            a3.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: aksf
                public final /* synthetic */ String b = "AudioAttachmentPlaybackSession#onSeekCompleteListener";

                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                    aksr aksrVar4 = aksr.this;
                    MediaPlayer.OnSeekCompleteListener onSeekCompleteListener2 = onSeekCompleteListener;
                    akrc b = aksrVar4.b(this.b);
                    try {
                        onSeekCompleteListener2.onSeekComplete(mediaPlayer);
                        b.close();
                    } catch (Throwable th) {
                        try {
                            b.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            akboVar.j(ahlp.l(aktp.ag(nhmVar.e).i(new prf(nhmVar, i), nhmVar.b)), new ahlp(ngxVar.a()), this.d);
            return nhmVar;
        }
        throw new IllegalStateException("Playback session has already been prepared.");
    }

    public final void b() {
        Window window;
        cj fe = this.b.fe();
        if (fe != null && (window = fe.getWindow()) != null) {
            window.clearFlags(128);
        }
    }

    public final void c() {
        aktp.H(this.b, ngy.class, new nhf(this, 0));
        aktp.H(this.b, nhc.class, new nhf(this, 2));
        aktp.H(this.b, nhd.class, new nhf(this, 3));
        this.b.N().c(new nhg(this));
    }

    public final void d() {
        nhm nhmVar = this.f;
        if (nhmVar != null) {
            nhe nheVar = new nhe(3, nhmVar.b(), Duration.ZERO);
            nhmVar.d();
            this.f = null;
            e(nheVar);
        }
        ngx ngxVar = this.g;
        if (ngxVar != null) {
            ngxVar.removeOnAttachStateChangeListener(this.k);
            this.g = null;
        }
        b();
    }

    public final void e(nhe nheVar) {
        ngx ngxVar = this.g;
        if (ngxVar != null && ngxVar.isAttachedToWindow()) {
            this.g.e(nheVar);
        }
    }

    public final int f() {
        AudioAttachmentView audioAttachmentView;
        xuo xuoVar;
        ngx ngxVar = this.g;
        if (ngxVar == null || (xuoVar = (audioAttachmentView = (AudioAttachmentView) ngxVar).e) == null) {
            return 1;
        }
        int f = xuoVar.f() - 1;
        if (f != 0) {
            if (f == 2) {
                return 2;
            }
            if (audioAttachmentView.d) {
                return 5;
            }
            return 6;
        }
        if (audioAttachmentView.d) {
            return 3;
        }
        return 4;
    }

    public final void g(ngx ngxVar, lga lgaVar) {
        if (this.e.hasSystemFeature("android.hardware.type.watch")) {
            lga.T(ngxVar);
        } else {
            ngxVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class a implements akbp<Uri, Void> {
        public a() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            Uri uri;
            Uri uri2 = (Uri) obj;
            nhh nhhVar = nhh.this;
            ngx ngxVar = nhhVar.g;
            if (ngxVar != null) {
                nhhVar.g(ngxVar, new nhb(th));
            }
            if (uri2 != null) {
                nhm nhmVar = nhh.this.f;
                if (nhmVar != null) {
                    uri = nhmVar.e;
                } else {
                    uri = null;
                }
                if (uri2.equals(uri)) {
                    nhh.this.d();
                }
            }
            ((alwl) ((alwl) ((alwl) nhh.a.i()).g(th)).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$SessionPreparedCallback", "onFailure", (char) 450, "AudioAttachmentController.java")).q("Failed to prepare audio playback session.");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
