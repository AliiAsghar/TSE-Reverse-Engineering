package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmz extends afnb {
    public final aflp a;

    public afmz(aflp aflpVar) {
        this.a = aflpVar;
    }

    @Override // defpackage.afnb
    public final aflp a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afmz) && d.F(this.a, ((afmz) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afnb
    public final Set f() {
        return arnx.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleEmoji(base=" + this.a + ")";
    }
}
