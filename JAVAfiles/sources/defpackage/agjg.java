package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agjg implements agjj {
    public final Duration a;
    public final ascv b;
    public final ascv c;
    public final Duration d;
    public final float e;
    public final agig f;
    public final aggp g;
    public final arqr h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public agjg() {
        /*
            r9 = this;
            j$.time.Duration r1 = j$.time.Duration.ZERO
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            ascd r2 = defpackage.ascy.a(r0)
            ascd r3 = defpackage.ascy.a(r0)
            j$.time.Duration r4 = j$.time.Duration.ZERO
            agjf r6 = new agjf
            r6.<init>()
            aggp r0 = defpackage.aggp.a
            aozy r0 = r0.createBuilder()
            r0.getClass()
            aggp r7 = defpackage.agiz.H(r0)
            agdl r8 = defpackage.agdl.h
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjg.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agjg)) {
            return false;
        }
        agjg agjgVar = (agjg) obj;
        if (d.F(this.a, agjgVar.a) && d.F(this.b, agjgVar.b) && d.F(this.c, agjgVar.c) && d.F(this.d, agjgVar.d) && Float.compare(this.e, agjgVar.e) == 0 && d.F(this.f, agjgVar.f) && d.F(this.g, agjgVar.g) && d.F(this.h, agjgVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Playback(audioDuration=" + this.a + ", isPreparedFlow=" + this.b + ", isPlayingFlow=" + this.c + ", currentTime=" + this.d + ", progress=" + this.e + ", playbackActions=" + this.f + ", voiceMetadata=" + this.g + ", onVoiceMetadataUpdated=" + this.h + ")";
    }

    public agjg(Duration duration, ascv ascvVar, ascv ascvVar2, Duration duration2, float f, agig agigVar, aggp aggpVar, arqr arqrVar) {
        duration.getClass();
        duration2.getClass();
        agigVar.getClass();
        this.a = duration;
        this.b = ascvVar;
        this.c = ascvVar2;
        this.d = duration2;
        this.e = f;
        this.f = agigVar;
        this.g = aggpVar;
        this.h = arqrVar;
    }
}
