package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hms extends hmq {
    public final Drawable a;
    private final hmv b;

    public hms(hmv hmvVar, Drawable drawable) {
        hmvVar.getClass();
        this.b = hmvVar;
        this.a = drawable;
        int ordinal = hmvVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new armm();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // defpackage.hmq
    public final hmv a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hms)) {
            return false;
        }
        hms hmsVar = (hms) obj;
        if (this.b == hmsVar.b && d.F(this.a, hmsVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        Drawable drawable = this.a;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Placeholder(status=" + this.b + ", placeholder=" + this.a + ")";
    }
}
