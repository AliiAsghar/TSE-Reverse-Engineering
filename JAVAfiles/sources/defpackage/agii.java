package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agii {
    public final ascv a;
    public final List b;
    public final boolean c;
    public final ascv d;

    public agii() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agii)) {
            return false;
        }
        agii agiiVar = (agii) obj;
        if (d.F(this.a, agiiVar.a) && d.F(this.b, agiiVar.b) && this.c == agiiVar.c && d.F(this.d, agiiVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "VoiceMoodConfiguration(enabled=" + this.a + ", voiceMoods=" + this.b + ", animateVoiceMoodOptions=" + this.c + ", isAnimationsSettingEnabled=" + this.d + ")";
    }

    public agii(ascv ascvVar, List list, boolean z, ascv ascvVar2) {
        ascvVar.getClass();
        list.getClass();
        this.a = ascvVar;
        this.b = list;
        this.c = z;
        this.d = ascvVar2;
    }

    public /* synthetic */ agii(List list, int i) {
        this((i & 1) != 0 ? ascy.a(false) : null, (i & 2) != 0 ? arnv.a : list, false, ascy.a(true));
    }
}
