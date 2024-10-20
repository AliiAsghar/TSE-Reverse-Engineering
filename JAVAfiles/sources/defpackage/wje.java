package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wje {
    public final wiz a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public wje(wiz wizVar, List list, boolean z, boolean z2) {
        wizVar.getClass();
        list.getClass();
        this.a = wizVar;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wje)) {
            return false;
        }
        wje wjeVar = (wje) obj;
        if (this.a == wjeVar.a && d.F(this.b, wjeVar.b) && this.c == wjeVar.c && this.d == wjeVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "RcsSettingsUiData(rcsGlobalToggleState=" + this.a + ", rcsSettingsSimInfoList=" + this.b + ", rcsDefaultOnConsent=" + this.c + ", showGoogleTos=" + this.d + ")";
    }
}
