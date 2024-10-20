package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhe {
    public final Duration a;
    public final Duration b;
    public final int c;

    public nhe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nhe) {
            nhe nheVar = (nhe) obj;
            if (this.c == nheVar.c && this.a.equals(nheVar.a) && this.b.equals(nheVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.aS(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                str = "STOPPED";
            } else {
                str = "PAUSED";
            }
        } else {
            str = "PLAYING";
        }
        Duration duration = this.a;
        Duration duration2 = this.b;
        return "AudioAttachmentViewModel{playbackState=" + str + ", duration=" + duration.toString() + ", position=" + duration2.toString() + "}";
    }

    public nhe(int i, Duration duration, Duration duration2) {
        this.c = i;
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.a = duration;
        if (duration2 != null) {
            this.b = duration2;
            return;
        }
        throw new NullPointerException("Null position");
    }
}
