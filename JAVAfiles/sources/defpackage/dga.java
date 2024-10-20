package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dga {
    public static final String a(int i, bwj bwjVar) {
        return dfz.a(bwjVar).getString(i);
    }

    public static final String b(int i, Object[] objArr, bwj bwjVar) {
        return dfz.a(bwjVar).getString(i, Arrays.copyOf(objArr, objArr.length));
    }
}
