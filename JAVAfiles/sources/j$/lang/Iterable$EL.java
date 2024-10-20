package j$.lang;

import j$.util.Collection;
import j$.util.List;
import j$.util.Q;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-EL */
/* loaded from: classes5.dex */
public final /* synthetic */ class Iterable$EL {
    public static /* synthetic */ void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof a) {
            ((a) iterable).forEach(consumer);
        } else if (iterable instanceof Collection) {
            Collection.CC.$default$forEach((java.util.Collection) iterable, consumer);
        } else {
            Iterable$CC.$default$forEach(iterable, consumer);
        }
    }

    public static Spliterator spliterator(Iterable iterable) {
        Spliterator spliterator;
        if (iterable instanceof a) {
            return ((a) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet) iterable, 17);
        }
        if (iterable instanceof SortedSet) {
            return Q.d((SortedSet) iterable);
        }
        if (iterable instanceof Set) {
            spliterator = Spliterators.spliterator((Set) iterable, 1);
            return spliterator;
        }
        if (iterable instanceof List) {
            return List.CC.$default$spliterator((java.util.List) iterable);
        }
        if (iterable instanceof java.util.Collection) {
            return Spliterators.spliterator((java.util.Collection) iterable, 0);
        }
        return Spliterators.spliteratorUnknownSize(iterable.iterator(), 0);
    }
}
