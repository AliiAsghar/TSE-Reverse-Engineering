package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ew implements rt {
    final /* synthetic */ re a;
    private final /* synthetic */ int b;

    public ew(ex exVar, int i) {
        this.b = i;
        this.a = exVar;
    }

    @Override // defpackage.rt
    public final void a() {
        switch (this.b) {
            case 0:
                fa k = ((ex) this.a).k();
                k.e();
                this.a.aK().b("androidx:appcompat");
                k.p();
                return;
            case 1:
                Object obj = ((cj) this.a).e.a;
                cn cnVar = (cn) obj;
                cnVar.e.o(cnVar, (cl) obj, null);
                return;
            case 2:
                re reVar = this.a;
                Bundle b = reVar.aK().b("android:support:activity-result");
                if (b != null) {
                    sb sbVar = reVar.g;
                    ArrayList<Integer> integerArrayList = b.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = b.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = b.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            sbVar.c.addAll(stringArrayList2);
                        }
                        Bundle bundle = b.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle != null) {
                            sbVar.f.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (sbVar.b.containsKey(str)) {
                                Integer num = (Integer) sbVar.b.remove(str);
                                if (!sbVar.f.containsKey(str)) {
                                    Map map = sbVar.a;
                                    arsd.i(map);
                                    map.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            str2.getClass();
                            sbVar.c(intValue, str2);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((ibd) this.a).y();
                return;
            case 4:
                ((iey) this.a).y();
                return;
            case 5:
                ((iyu) this.a).y();
                return;
            case 6:
                ((iyu) this.a).y();
                return;
            case 7:
                ((kmh) this.a).y();
                return;
            case 8:
                ((kox) this.a).y();
                return;
            case 9:
                ((ktu) this.a).y();
                return;
            case 10:
                ((kuu) this.a).y();
                return;
            case 11:
                ((kuv) this.a).y();
                return;
            case 12:
                ((lel) this.a).y();
                return;
            case 13:
                ((lfi) this.a).y();
                return;
            case 14:
                ((lfs) this.a).y();
                return;
            case 15:
                ((lpe) this.a).y();
                return;
            case 16:
                ((lqr) this.a).y();
                return;
            case 17:
                ((lri) this.a).y();
                return;
            case 18:
                ((lrk) this.a).y();
                return;
            case 19:
                ((lrs) this.a).y();
                return;
            default:
                ((lzi) this.a).y();
                return;
        }
    }

    public /* synthetic */ ew(re reVar, int i) {
        this.b = i;
        this.a = reVar;
    }
}
