package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fni extends fnk {
    public long a;
    public long[] b;
    public long[] c;

    public fni() {
        super(new flr());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static Double d(euf eufVar) {
        return Double.valueOf(Double.longBitsToDouble(eufVar.q()));
    }

    private static Object e(euf eufVar, int i) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) d(eufVar).doubleValue());
                                eufVar.K(2);
                                return date;
                            }
                            int m = eufVar.m();
                            ArrayList arrayList = new ArrayList(m);
                            for (int i2 = 0; i2 < m; i2++) {
                                Object e = e(eufVar, eufVar.j());
                                if (e != null) {
                                    arrayList.add(e);
                                }
                            }
                            return arrayList;
                        }
                        return g(eufVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String f = f(eufVar);
                        int j = eufVar.j();
                        if (j == 9) {
                            return hashMap;
                        }
                        Object e2 = e(eufVar, j);
                        if (e2 != null) {
                            hashMap.put(f, e2);
                        }
                    }
                } else {
                    return f(eufVar);
                }
            } else {
                if (eufVar.j() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return d(eufVar);
        }
    }

    private static String f(euf eufVar) {
        int n = eufVar.n();
        int i = eufVar.b;
        eufVar.K(n);
        return new String(eufVar.a, i, n);
    }

    private static HashMap g(euf eufVar) {
        int m = eufVar.m();
        HashMap hashMap = new HashMap(m);
        for (int i = 0; i < m; i++) {
            String f = f(eufVar);
            Object e = e(eufVar, eufVar.j());
            if (e != null) {
                hashMap.put(f, e);
            }
        }
        return hashMap;
    }

    @Override // defpackage.fnk
    protected final boolean a(euf eufVar) {
        return true;
    }

    @Override // defpackage.fnk
    protected final boolean b(euf eufVar, long j) {
        if (eufVar.j() == 2 && "onMetaData".equals(f(eufVar)) && eufVar.b() != 0 && eufVar.j() == 8) {
            HashMap g = g(eufVar);
            Object obj = g.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.a = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = g.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.b = new long[size];
                    this.c = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.b[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.c[i] = ((Double) obj5).longValue();
                        } else {
                            this.b = new long[0];
                            this.c = new long[0];
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }
}
