package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acmg implements acmi {
    private final /* synthetic */ int a;

    @Override // defpackage.acmi
    public final Map a(int i) {
        if (this.a != 0) {
            return new HashMap(i, 1.0f);
        }
        return new TreeMap();
    }
}
