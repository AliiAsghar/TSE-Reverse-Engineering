package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbs {
    public final int a;
    public final acit b = new acit();
    final Bundle c;

    public acbs(int i, Bundle bundle) {
        this.a = i;
        this.c = bundle;
    }

    public final void a(acbt acbtVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", a.bY(acbtVar, this, "Failing ", " with "));
        }
        this.b.a(acbtVar);
    }

    public final String toString() {
        return "Request { what=1 id=" + this.a + " oneWay=false}";
    }
}
