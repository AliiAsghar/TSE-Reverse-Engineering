package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uor {
    final /* synthetic */ uot a;
    private final unx b;
    private final Long[] c;
    private final upm d;

    public uor(uot uotVar, unx unxVar, Long[] lArr, upm upmVar) {
        this.a = uotVar;
        this.b = unxVar;
        this.c = lArr;
        this.d = upmVar;
    }

    public final String toString() {
        String str = (String) DesugarArrays.stream(this.c).map(new unt(6)).collect(Collectors.joining(","));
        String d = this.a.c.d(this.b);
        if (d == null) {
            d = "?";
        }
        Object obj = this.d;
        if (obj == null) {
            obj = "";
        }
        return d + " [" + str + "] " + obj.toString();
    }
}
