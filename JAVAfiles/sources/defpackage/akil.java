package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akil implements ajzf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akil(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [armf, java.lang.Object] */
    @Override // defpackage.ajzf
    public final ListenableFuture a(ajzd ajzdVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((akos) this.a.b()).e();
            }
            Object obj = this.a;
            ListenableFuture bI = albo.bI(null);
            ((ahiy) obj).q(bI, "com.google.apps.tiktok.account.data.AllAccounts");
            return bI;
        }
        akrh f = aktp.f("AccountEnabled: updateConfigurationsForAllPackages", akrk.a);
        Object obj2 = this.a;
        try {
            ajwt ajwtVar = ajzdVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((akyr) obj2).c.entrySet()) {
                akic akicVar = (akic) entry.getValue();
                if (akicVar == akic.d || akicVar == akic.b) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set keySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(aqjn.J(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((akyr) obj2).k((String) it.next(), ajwtVar));
            }
            ListenableFuture B = akec.B(arrayList);
            f.b(B);
            armd.i(f, null);
            return B;
        } finally {
        }
    }
}
