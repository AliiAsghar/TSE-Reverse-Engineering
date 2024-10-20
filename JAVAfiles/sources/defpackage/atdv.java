package defpackage;

import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atdv {
    public CronetProvider a;
    public atei b;

    public final boolean equals(Object obj) {
        if ((obj instanceof atdv) && this.a.equals(((atdv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
