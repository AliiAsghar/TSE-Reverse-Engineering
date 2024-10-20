package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alra extends alup {
    final /* synthetic */ alrb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alra(alrb alrbVar, ListIterator listIterator) {
        super(listIterator);
        this.a = alrbVar;
    }

    @Override // defpackage.aluo
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
