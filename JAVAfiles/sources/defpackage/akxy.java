package defpackage;

import j$.util.Collection;
import j$.util.function.BiConsumer$CC;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akxy implements BiConsumer {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ akxy(int i) {
        this.b = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((alae) obj).a.addAll((List) obj2);
                return;
            case 1:
                ((akxd) obj).b((alaq) obj2);
                return;
            case 2:
                Collections.addAll(((alab) obj).a, (alad[]) Collection.EL.toArray((List) obj2, new adak(7)));
                return;
            case 3:
                akzy akzyVar = (akzy) obj;
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    akzyVar.a.add((alaw) it.next());
                }
                return;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                ((akyw) obj).e((alaa) obj2);
                return;
            case 7:
                ((akyw) obj).b((String) obj2);
                return;
            case 8:
                ((akyw) obj).d(((Integer) obj2).intValue());
                return;
            case 9:
                ((alob) obj).h(obj2);
                return;
            case 10:
                ((alpr) obj).c(obj2);
                return;
            default:
                ((ahlp) obj).M((alst) obj2);
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.b) {
            case 0:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 1:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 2:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 3:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 7:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 8:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 9:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 10:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }
}
