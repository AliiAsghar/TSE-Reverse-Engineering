package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aibb implements Parcelable {
    public final aiba a;
    public final double b;

    public aibb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibb) {
            aibb aibbVar = (aibb) obj;
            if (this.a.equals(aibbVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aibbVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)));
    }

    public final String toString() {
        return "PlaceLikelihood{place=" + this.a.toString() + ", likelihood=" + this.b + "}";
    }

    public aibb(aiba aibaVar, double d) {
        if (aibaVar == null) {
            throw new NullPointerException("Null place");
        }
        this.a = aibaVar;
        this.b = d;
    }
}
