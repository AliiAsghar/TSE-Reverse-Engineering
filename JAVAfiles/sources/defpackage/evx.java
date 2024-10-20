package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evx extends evv {
    public final int c;
    public final Map d;

    public evx(int i, IOException iOException, Map map) {
        super(a.bV(i, "Response code: "), iOException, 2004);
        this.c = i;
        this.d = map;
    }
}
