package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akyj implements akye {
    final List a;

    public akyj(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.akye
    public final apcr a(Object obj) {
        Object apply;
        final aozy createBuilder = apcr.a.createBuilder();
        for (final akxv akxvVar : this.a) {
            apply = akxvVar.b.apply(obj);
            ((Optional) apply).ifPresent(new Consumer() { // from class: akyi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    aozy.this.ba(akxvVar.a, (apde) obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return (apcr) createBuilder.s();
    }
}
