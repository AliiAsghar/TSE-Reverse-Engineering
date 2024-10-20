package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affu {
    public final int a;
    public final int b;
    public final Duration c;
    public final Duration d;
    public final arqr e;
    private final int f;

    public affu() {
        this(0, 0, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof affu)) {
            return false;
        }
        affu affuVar = (affu) obj;
        if (this.a != affuVar.a || this.b != affuVar.b) {
            return false;
        }
        int i = affuVar.f;
        if (d.F(this.c, affuVar.c) && d.F(this.d, affuVar.d) && d.F(this.e, affuVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a * 31) + this.b) * 961) + this.c.hashCode();
        Duration duration = this.d;
        if (duration == null) {
            hashCode = 0;
        } else {
            hashCode = duration.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MicrophoneAudioSourceConfiguration(sampleRate=" + this.a + ", channelCount=" + this.b + ", outputBufferCapacity=0, outputTimeout=" + this.c + ", maxDuration=" + this.d + ", onMaxDurationReached=" + this.e + ")";
    }

    public /* synthetic */ affu(int i, int i2, Duration duration, arqr arqrVar, int i3) {
        Duration cd = (i3 & 8) != 0 ? albo.cd(1) : null;
        duration = (i3 & 16) != 0 ? null : duration;
        arqrVar = (i3 & 32) != 0 ? new jfo((arpe) null, 4, (int[]) null) : arqrVar;
        int i4 = i2 | (((i3 & 2) != 0 ? 0 : 1) ^ 1);
        i = 1 == (i3 & 1) ? 44100 : i;
        cd.getClass();
        arqrVar.getClass();
        this.a = i;
        this.b = i4;
        this.f = 0;
        this.c = cd;
        this.d = duration;
        this.e = arqrVar;
    }
}
