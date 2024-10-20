package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidj {
    public final alog a;

    public aidj() {
        throw null;
    }

    public static aidj a(List list) {
        return new aidj(alog.n(list));
    }

    public final String b() {
        return (String) Collection.EL.stream(this.a).map(new agnz(13)).collect(Collectors.joining(","));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aidj) {
            return alzz.at(this.a, ((aidj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "EventVector{eventCodes=" + this.a.toString() + "}";
    }

    public aidj(alog alogVar) {
        if (alogVar == null) {
            throw new NullPointerException("Null eventCodes");
        }
        this.a = alogVar;
    }
}
