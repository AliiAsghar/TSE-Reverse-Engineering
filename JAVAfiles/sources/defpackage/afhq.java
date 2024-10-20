package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhq {
    public final afgl a;
    public Size b;
    public int c;
    public int d;
    public final Map e = new LinkedHashMap();

    public afhq(afgl afglVar) {
        this.a = afglVar;
    }

    public final void a(boolean z, boolean z2) {
        int i;
        this.e.clear();
        if (z) {
            this.e.put(0, new ajws(6, 1));
            i = 1;
        } else {
            i = 0;
        }
        if (z2) {
            this.e.put(Integer.valueOf(i), new ajws(6, 1));
            i++;
        }
        this.e.putAll(aqjn.n(new armo(Integer.valueOf(i), new ajws(3, 2)), new armo(Integer.valueOf(i + 1), new ajws(3, 1)), new armo(Integer.valueOf(i + 2), new ajws(3, 1))));
    }
}
