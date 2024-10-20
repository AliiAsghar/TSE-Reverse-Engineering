package defpackage;

import android.graphics.Point;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xqk {
    public final Point a;
    public final Duration b;

    public xqk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xqk) {
            xqk xqkVar = (xqk) obj;
            if (this.a.equals(xqkVar.a) && this.b.equals(xqkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Duration duration = this.b;
        return "VideoMetadata{videoSize=" + this.a.toString() + ", duration=" + duration.toString() + "}";
    }

    public xqk(Point point, Duration duration) {
        this.a = point;
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.b = duration;
    }
}
