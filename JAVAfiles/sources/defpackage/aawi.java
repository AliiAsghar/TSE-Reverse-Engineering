package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawi extends aawn {
    private final Rect a;

    public aawi(Rect rect) {
        this.a = rect;
    }

    @Override // defpackage.aawn
    public final Rect a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aawn) {
            return this.a.equals(((aawn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MediaDrawableChangedEvent{drawableBounds=" + this.a.toString() + "}";
    }
}
