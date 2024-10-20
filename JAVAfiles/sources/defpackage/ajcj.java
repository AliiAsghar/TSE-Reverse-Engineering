package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajcj {
    public final Map a;

    public ajcj(Map map) {
        map.getClass();
        this.a = map;
    }

    public final ajcj a(ajcj ajcjVar) {
        return new ajcj(aqjn.p(this.a, ajcjVar.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ajcj) && d.F(this.a, ((ajcj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SwatchiePalette(data=" + this.a + ")";
    }
}
