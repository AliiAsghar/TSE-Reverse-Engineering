package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivf {
    public final String a;
    public final List b;

    public aivf(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ahmc.af(!list.isEmpty(), "Missing param values", new Object[0]);
        this.a = str;
        arrayList.addAll(list);
    }

    public final String toString() {
        return aivi.a(this.a) + "=" + TextUtils.join("+", this.b);
    }
}
