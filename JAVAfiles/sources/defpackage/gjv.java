package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjv implements gjy {
    public final Set a = new LinkedHashSet();

    public gjv(iba ibaVar) {
        ibaVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.gjy
    public final Bundle a() {
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        List ax = aqjn.ax(this.a);
        if (ax instanceof ArrayList) {
            arrayList = (ArrayList) ax;
        } else {
            arrayList = new ArrayList<>(ax);
        }
        bundle.putStringArrayList("classes_to_restore", arrayList);
        return bundle;
    }
}
