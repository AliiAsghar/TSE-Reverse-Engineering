package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahyb extends ahxd {
    public ahyb(aibj aibjVar, String str, agxw agxwVar) {
        super(aibjVar, null, str, agxwVar);
    }

    @Override // defpackage.ahxd
    protected final String a() {
        return "photo";
    }

    @Override // defpackage.ahxd
    public final Map d() {
        aibj aibjVar = (aibj) this.a;
        aiau aiauVar = aibjVar.c;
        HashMap hashMap = new HashMap();
        e(hashMap, "maxheight", aibjVar.b);
        e(hashMap, "maxwidth", aibjVar.a);
        hashMap.put("photoreference", aiauVar.d);
        return hashMap;
    }
}
