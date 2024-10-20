package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyi {
    public final Intent a;

    public ajyi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyi) {
            return this.a.equals(((ajyi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SelectorContext{intent=" + this.a.toString() + "}";
    }

    public ajyi(Intent intent) {
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = intent;
    }
}
