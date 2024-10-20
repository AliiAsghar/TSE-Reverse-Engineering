package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekt {
    public final List a;
    public final aeko b;

    public aekt(List list, aeko aekoVar) {
        list.getClass();
        this.a = list;
        this.b = aekoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekt)) {
            return false;
        }
        aekt aektVar = (aekt) obj;
        if (d.F(this.a, aektVar.a) && d.F(this.b, aektVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aeko aekoVar = this.b;
        if (aekoVar == null) {
            hashCode = 0;
        } else {
            hashCode = aekoVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "WaveformUiData(amplitudeList=" + this.a + ", playbackUiData=" + this.b + ")";
    }
}
