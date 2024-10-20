package defpackage;

import android.os.Parcelable;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiai implements Parcelable {
    public final Duration a;
    public final int b;

    public aiai() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiai) {
            aiai aiaiVar = (aiai) obj;
            if (this.a.equals(aiaiVar.a) && this.b == aiaiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Leg{duration=" + this.a.toString() + ", distanceMeters=" + this.b + "}";
    }

    public aiai(Duration duration, int i) {
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.a = duration;
        this.b = i;
    }
}
