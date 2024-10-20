package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbt {
    public final String a;
    public final arqg b;
    private final boolean c = false;
    private final boolean d = true;

    public afbt(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afbt)) {
            return false;
        }
        afbt afbtVar = (afbt) obj;
        boolean z = afbtVar.c;
        if (!d.F(this.a, afbtVar.a)) {
            return false;
        }
        boolean z2 = afbtVar.d;
        if (d.F(this.b, afbtVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int v = a.v(false);
        arqg arqgVar = this.b;
        if (arqgVar != null) {
            i = arqgVar.hashCode();
        }
        return (((((v * 31) + hashCode) * 31) + a.v(true)) * 31) + i;
    }

    public final String toString() {
        return "VideoControlsUiData(isPlaying=false, formattedTimeString=" + this.a + ", showPlayPauseButton=true, onPlayButtonClick=" + this.b + ")";
    }
}
