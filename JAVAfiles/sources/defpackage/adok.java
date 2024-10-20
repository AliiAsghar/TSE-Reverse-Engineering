package defpackage;

import com.google.android.ims.network.common.RcsEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adok {
    public final RcsEngine a;
    public final aplh b;

    public adok() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adok) {
            adok adokVar = (adok) obj;
            if (this.a.equals(adokVar.a) && this.b.equals(adokVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aplh aplhVar = this.b;
        return "RcsEngineState{rcsEngine=" + this.a.toString() + ", parameters=" + aplhVar.toString() + "}";
    }

    public adok(RcsEngine rcsEngine, aplh aplhVar) {
        if (rcsEngine == null) {
            throw new NullPointerException("Null rcsEngine");
        }
        this.a = rcsEngine;
        if (aplhVar != null) {
            this.b = aplhVar;
            return;
        }
        throw new NullPointerException("Null parameters");
    }
}
