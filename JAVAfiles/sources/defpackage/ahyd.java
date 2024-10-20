package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahyd extends ahxd {
    public ahyd(aibl aiblVar, Locale locale, String str, agxw agxwVar) {
        super(aiblVar, locale, str, agxwVar);
    }

    @Override // defpackage.ahxd
    protected final String a() {
        return "details/json";
    }

    @Override // defpackage.ahxd
    public final Map d() {
        aibl aiblVar = (aibl) this.a;
        HashMap hashMap = new HashMap();
        e(hashMap, "placeid", aiblVar.a);
        e(hashMap, "sessiontoken", null);
        e(hashMap, "fields", ahyo.a(aiblVar.b));
        return hashMap;
    }
}
