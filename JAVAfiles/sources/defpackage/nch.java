package defpackage;

import android.content.Context;
import j$.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nch implements nck {
    public static final alpt a = alpt.v(111, 110, 106, 107, 112, 13, 12);
    private final Context b;

    public nch(Context context) {
        this.b = context;
    }

    @Override // defpackage.nck
    public final alor a(Map map) {
        if (yhx.g(this.b)) {
            return (alor) Collection.EL.stream(map.entrySet()).filter(new mmd(20)).collect(alls.a(new nas(19), new nas(20)));
        }
        return alor.j(map);
    }
}
