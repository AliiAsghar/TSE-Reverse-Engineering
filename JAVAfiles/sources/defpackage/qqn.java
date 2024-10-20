package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqn {
    final /* synthetic */ Collection a;
    final /* synthetic */ qqq b;

    public qqn(qqq qqqVar, Collection collection) {
        this.a = collection;
        this.b = qqqVar;
    }

    public final String toString() {
        Stream map = Collection.EL.stream(this.a).map(new qcr(this.b, 14));
        int i = alog.d;
        return ((alog) map.collect(alls.a)).toString();
    }
}
