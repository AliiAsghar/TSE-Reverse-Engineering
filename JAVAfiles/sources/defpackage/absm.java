package defpackage;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absm {
    public final abrv a;
    public final Feature b;

    public absm(abrv abrvVar, Feature feature) {
        this.a = abrvVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof absm)) {
            absm absmVar = (absm) obj;
            if (d.B(this.a, absmVar.a) && d.B(this.b, absmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("key", this.a, arrayList);
        abhg.q("feature", this.b, arrayList);
        return abhg.p(arrayList, this);
    }
}
