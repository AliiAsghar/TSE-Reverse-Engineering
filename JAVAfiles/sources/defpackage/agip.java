package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agip implements agen {
    public final ascv a;
    public final arqg b;
    public final agih c;
    public final ascv d;
    public final asai e;
    public final ascv f;
    public final ascv g;
    public final agii h;
    public final boolean i;
    public final Optional j;
    public final boolean k;
    public final boolean l;
    public final ygv m;

    public agip(ascv ascvVar, arqg arqgVar, agih agihVar, ascv ascvVar2, asai asaiVar, ascv ascvVar3, ascv ascvVar4, agii agiiVar, ygv ygvVar, boolean z, Optional optional, boolean z2, boolean z3) {
        agiiVar.getClass();
        this.a = ascvVar;
        this.b = arqgVar;
        this.c = agihVar;
        this.d = ascvVar2;
        this.e = asaiVar;
        this.f = ascvVar3;
        this.g = ascvVar4;
        this.h = agiiVar;
        this.m = ygvVar;
        this.i = z;
        this.j = optional;
        this.k = z2;
        this.l = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agip)) {
            return false;
        }
        agip agipVar = (agip) obj;
        if (d.F(this.a, agipVar.a) && d.F(this.b, agipVar.b) && d.F(this.c, agipVar.c) && d.F(this.d, agipVar.d) && d.F(this.e, agipVar.e) && d.F(this.f, agipVar.f) && d.F(this.g, agipVar.g) && d.F(this.h, agipVar.h) && d.F(this.m, agipVar.m) && this.i == agipVar.i && d.F(this.j, agipVar.j) && this.k == agipVar.k && this.l == agipVar.l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.m.hashCode()) * 31) + a.v(this.i)) * 31) + this.j.hashCode()) * 31) + a.v(this.k)) * 31) + a.v(this.l);
    }

    public final String toString() {
        return "VoiceConfiguration(voiceInputStateFlow=" + this.a + ", maxRecordingDuration=" + this.b + ", recordingActions=" + this.c + ", recordingTimerFlow=" + this.d + ", audioLevelFlow=" + this.e + ", errorMessageFlow=" + this.f + ", audioFileFlow=" + this.g + ", moodConfiguration=" + this.h + ", glideImageManager=" + this.m + ", pauseAudioPlaybackOnClose=" + this.i + ", xenoAudioProcessorState=" + this.j + ", useParentTheme=" + this.k + ", catchPlaybackPreparationException=" + this.l + ")";
    }

    public /* synthetic */ agip(ascv ascvVar, arqg arqgVar, agih agihVar, ascv ascvVar2, asai asaiVar, ascv ascvVar3, ascv ascvVar4, agii agiiVar, ygv ygvVar, boolean z, int i) {
        this((i & 1) != 0 ? ascy.a(agiq.b) : ascvVar, (i & 2) != 0 ? afrg.n : arqgVar, (i & 4) != 0 ? new agio() : agihVar, (i & 8) != 0 ? ascy.a(Duration.ZERO) : ascvVar2, (i & 16) != 0 ? new aghw(new aggs[0], 8) : asaiVar, (i & 32) != 0 ? ascy.a(null) : ascvVar3, (i & 64) != 0 ? ascy.a(null) : ascvVar4, (i & 128) != 0 ? new agii(null, 15) : agiiVar, ygvVar, (!((i & 512) == 0)) | z, Optional.empty(), false, false);
    }
}
