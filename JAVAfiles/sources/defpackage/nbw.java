package defpackage;

import j$.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbw implements nck {
    public final alpt a = altg.a;

    @Override // defpackage.nck
    public final alor a(Map map) {
        return (alor) Collection.EL.stream(map.entrySet()).filter(new ncc(this, 1)).collect(alls.a(new nas(17), new nas(18)));
    }
}
