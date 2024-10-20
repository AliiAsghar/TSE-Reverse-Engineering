package defpackage;

import android.media.metrics.LogSessionId;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbz {
    public final String a;
    private final fby b;
    private final Object c;

    static {
        if (eul.a < 31) {
            new fbz("");
        } else {
            int i = fby.b;
        }
    }

    public fbz(LogSessionId logSessionId, String str) {
        this.b = new fby(logSessionId);
        this.a = "";
        this.c = new Object();
    }

    public final LogSessionId a() {
        fby fbyVar = this.b;
        dzg.g(fbyVar);
        return fbyVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbz)) {
            return false;
        }
        fbz fbzVar = (fbz) obj;
        if (Objects.equals(this.a, fbzVar.a) && Objects.equals(this.b, fbzVar.b) && Objects.equals(this.c, fbzVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public fbz(String str) {
        dzg.d(eul.a < 31);
        this.a = "";
        this.b = null;
        this.c = new Object();
    }
}
