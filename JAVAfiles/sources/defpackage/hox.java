package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hox {
    public final hvq a;
    public final ecf b;
    private final Class c;
    private final List d;
    private final String e;

    public hox(Class cls, Class cls2, Class cls3, List list, hvq hvqVar, ecf ecfVar) {
        this.c = cls;
        this.d = list;
        this.a = hvqVar;
        this.b = ecfVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final hpt a(hnu hnuVar, int i, int i2, hnj hnjVar, List list) {
        int size = this.d.size();
        hpt hptVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            hnl hnlVar = (hnl) this.d.get(i3);
            try {
                if (hnlVar.b(hnuVar.a(), hnjVar)) {
                    hptVar = hnlVar.a(hnuVar.a(), i, i2, hnjVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for ".concat(String.valueOf(String.valueOf(hnlVar))), e);
                }
                list.add(e);
            }
            if (hptVar != null) {
                break;
            }
        }
        if (hptVar != null) {
            return hptVar;
        }
        throw new hpp(this.e, new ArrayList(list));
    }

    public final String toString() {
        hvq hvqVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + hvqVar.toString() + "}";
    }
}
