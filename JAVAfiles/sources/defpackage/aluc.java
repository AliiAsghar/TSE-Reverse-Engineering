package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aluc extends aluo {
    final /* synthetic */ alud a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aluc(alud aludVar, Iterator it) {
        super(it);
        this.a = aludVar;
    }

    @Override // defpackage.aluo
    public final /* synthetic */ Object a(Object obj) {
        return new alub(this, (Map.Entry) obj);
    }
}
