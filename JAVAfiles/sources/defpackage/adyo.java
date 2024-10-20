package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyo extends adcx {
    public List a;

    public adyo() {
        super(null, null);
    }

    public final List cw() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyo)) {
            return false;
        }
        adyo adyoVar = (adyo) obj;
        if (this.a.size() != adyoVar.cw().size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((adyn) this.a.get(i)).equals(adyoVar.a.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
