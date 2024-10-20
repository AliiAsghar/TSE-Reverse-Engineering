package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vry {
    public final alog a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public vry() {
        throw null;
    }

    public static alog a(alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).map(new vrx(2));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vry) {
            vry vryVar = (vry) obj;
            if (alzz.at(this.a, vryVar.a) && this.b.equals(vryVar.b) && this.c.equals(vryVar.c) && this.d.equals(vryVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "GroupResolutionQueryResults{allParameterResults=" + String.valueOf(this.a) + ", onlyGlobalIdentifiersResults=" + String.valueOf(optional3) + ", onlySessionIdResults=" + String.valueOf(optional2) + ", telephonyFallbackResults=" + String.valueOf(optional) + "}";
    }

    public vry(alog alogVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = alogVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }
}
