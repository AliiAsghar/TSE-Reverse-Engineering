package defpackage;

import android.util.Pair;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxv {
    public final fvl a;
    public final eqn b;
    public final List c;
    public final fxh d;
    public final fwr e;
    public final String f;
    public final int g;
    public erv h;
    public volatile int i;
    public volatile boolean j;
    public volatile fvp k;

    public fxv(fvl fvlVar, eqn eqnVar, List list, fxh fxhVar, fwr fwrVar) {
        boolean z;
        int i = 0;
        if (eqnVar.C != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.a = fvlVar;
        this.b = eqnVar;
        this.c = list;
        this.d = fxhVar;
        this.e = fwrVar;
        String str = eqnVar.o;
        dzg.g(str);
        String str2 = fxhVar.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (erl.h(str)) {
            str = "video/hevc";
        }
        int i2 = fxhVar.d;
        eqd eqdVar = eqnVar.C;
        if (i2 == 0) {
            if (eqd.i(eqdVar) && fwf.f(str, eqdVar).isEmpty()) {
                if (fwf.f("video/hevc", eqdVar).isEmpty()) {
                    i = 2;
                }
            }
            str3 = str;
        } else {
            str3 = str;
            i = i2;
        }
        Pair create = Pair.create(str3, Integer.valueOf(i));
        this.f = (String) create.first;
        this.g = ((Integer) create.second).intValue();
    }
}
