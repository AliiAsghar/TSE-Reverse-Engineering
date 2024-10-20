package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aran {
    public String a = "unknown-authority";
    public aqrm b = aqrm.a;
    public String c;
    public aqsy d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof aran)) {
            return false;
        }
        aran aranVar = (aran) obj;
        if (!this.a.equals(aranVar.a) || !this.b.equals(aranVar.b) || !d.B(this.c, aranVar.c) || !d.B(this.d, aranVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
