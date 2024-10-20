package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcs {
    public final eqn a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final eso i;
    public final boolean j = false;
    public final boolean k = false;
    public final boolean l = false;

    public fcs(eqn eqnVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, eso esoVar) {
        this.a = eqnVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = esoVar;
    }

    private static AudioAttributes d(epz epzVar) {
        return (AudioAttributes) epzVar.a().a;
    }

    public final long a(long j) {
        return eul.v(j, this.e);
    }

    public final AudioTrack b(epz epzVar, int i) {
        AudioTrack audioTrack;
        boolean z;
        AudioTrack.Builder offloadedPlayback;
        try {
            if (eul.a >= 29) {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(d(epzVar)).setAudioFormat(eul.B(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i);
                if (this.c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z);
                audioTrack = offloadedPlayback.build();
            } else {
                audioTrack = new AudioTrack(d(epzVar), eul.B(this.e, this.f, this.g), this.h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new fci(state, this.e, this.f, this.h, this.a, c(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new fci(0, this.e, this.f, this.h, this.a, c(), e);
        }
    }

    public final boolean c() {
        if (this.c == 1) {
            return true;
        }
        return false;
    }
}
