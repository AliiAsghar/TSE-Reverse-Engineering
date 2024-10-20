package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agjc {
    public final agir a;
    public final Duration b;
    public final aftn c;
    public final Float d;
    public final Duration e;
    public final boolean f;
    public final aggp g;

    public agjc(agir agirVar, Duration duration, aftn aftnVar, Float f, Duration duration2, boolean z, aggp aggpVar) {
        this.a = agirVar;
        this.b = duration;
        this.c = aftnVar;
        this.d = f;
        this.e = duration2;
        this.f = z;
        this.g = aggpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agjc)) {
            return false;
        }
        agjc agjcVar = (agjc) obj;
        if (this.a == agjcVar.a && d.F(this.b, agjcVar.b) && d.F(this.c, agjcVar.c) && d.F(this.d, agjcVar.d) && d.F(this.e, agjcVar.e) && this.f == agjcVar.f && d.F(this.g, agjcVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        aftn aftnVar = this.c;
        int i = 0;
        if (aftnVar == null) {
            hashCode = 0;
        } else {
            hashCode = aftnVar.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        Float f = this.d;
        if (f != null) {
            i = f.hashCode();
        }
        return ((((((i2 + i) * 31) + this.e.hashCode()) * 31) + a.v(this.f)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "VoiceFlowRequirements(state=" + this.a + ", recordingTime=" + this.b + ", audioFile=" + this.c + ", seekProgress=" + this.d + ", currentPosition=" + this.e + ", isPrepared=" + this.f + ", voiceMetadata=" + this.g + ")";
    }
}
