package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegl extends akwk {
    public static final /* synthetic */ int b = 0;
    public final List a;

    public aegl(List list) {
        List list2 = (List) Collection.EL.stream(list).map(new aegk(0)).collect(Collectors.toUnmodifiableList());
        this.a = list2;
        Collection.EL.stream(list2).map(new aegk(2)).forEach(new aavc(17));
    }

    @Override // defpackage.akwk
    public final boolean a(akxm akxmVar) {
        if (akxmVar instanceof aegm) {
            return ((aegm) akxmVar).a();
        }
        return true;
    }
}
