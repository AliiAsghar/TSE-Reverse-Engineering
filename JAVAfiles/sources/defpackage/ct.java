package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ct implements rv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ct(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rv
    public final /* synthetic */ void a(Object obj) {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    aazt aaztVar = (aazt) this.a;
                    aaztVar.s = (ajcb) obj;
                    aaztVar.j();
                    aazt aaztVar2 = (aazt) this.a;
                    aaztVar2.c().removeTextChangedListener(aaztVar2.t);
                    aazt aaztVar3 = (aazt) this.a;
                    aaztVar3.c().addTextChangedListener(aaztVar3.e());
                    ((aazt) this.a).l();
                    return;
                }
                ru ruVar = (ru) obj;
                cw cwVar = (cw) ((da) this.a).s.pollFirst();
                if (cwVar == null) {
                    toString();
                    Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                    return;
                }
                di diVar = ((da) this.a).b;
                String str = cwVar.a;
                cg c = diVar.c(str);
                if (c == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str)));
                    return;
                } else {
                    c.X(cwVar.b, ruVar.a, ruVar.b);
                    return;
                }
            }
            Map map = (Map) obj;
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (true != ((Boolean) arrayList.get(i3)).booleanValue()) {
                    i = -1;
                } else {
                    i = 0;
                }
                iArr[i3] = i;
            }
            cw cwVar2 = (cw) ((da) this.a).s.pollFirst();
            if (cwVar2 == null) {
                toString();
                Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
                return;
            }
            di diVar2 = ((da) this.a).b;
            String str2 = cwVar2.a;
            cg c2 = diVar2.c(str2);
            if (c2 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                c2.aJ();
                return;
            }
        }
        ru ruVar2 = (ru) obj;
        cw cwVar3 = (cw) ((da) this.a).s.pollLast();
        if (cwVar3 == null) {
            toString();
            Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
            return;
        }
        di diVar3 = ((da) this.a).b;
        String str3 = cwVar3.a;
        cg c3 = diVar3.c(str3);
        if (c3 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        } else {
            c3.X(cwVar3.b, ruVar2.a, ruVar2.b);
        }
    }
}
