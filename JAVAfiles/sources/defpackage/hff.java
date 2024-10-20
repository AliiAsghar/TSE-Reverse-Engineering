package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hff implements hfe {
    public final List a;

    public hff(List list) {
        this.a = list;
    }

    @Override // defpackage.hfe
    public final List b() {
        return this.a;
    }

    @Override // defpackage.hfe
    public final boolean c() {
        if (this.a.isEmpty()) {
            return true;
        }
        if (this.a.size() == 1 && ((hie) this.a.get(0)).e()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
