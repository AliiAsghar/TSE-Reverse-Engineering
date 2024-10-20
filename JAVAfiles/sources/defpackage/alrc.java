package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alrc extends alup {
    final /* synthetic */ alrd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrc(alrd alrdVar, ListIterator listIterator) {
        super(listIterator);
        this.a = alrdVar;
    }

    @Override // defpackage.aluo
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
