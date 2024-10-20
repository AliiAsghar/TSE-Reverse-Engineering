package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;

/* loaded from: classes5.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(Spliterators.l(tArr, 0, tArr.length, 1040), false);
    }

    public static IntStream stream(int[] iArr) {
        return StreamSupport.a(Spliterators.j(iArr, 0, iArr.length));
    }
}
