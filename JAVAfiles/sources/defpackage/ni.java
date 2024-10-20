package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ni {
    int a;
    public final Object b;
    public final Object c;
    final Object d;
    public final Object e;
    private final Object f;

    public ni(qdq qdqVar) {
        this.f = new ecg(30);
        this.e = new ArrayList();
        this.b = new ArrayList();
        this.a = 0;
        this.c = qdqVar;
        this.d = new efu(this);
    }

    private final int m(int i, int i2) {
        int i3;
        int i4;
        int size = ((ArrayList) this.b).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            kg kgVar = (kg) ((ArrayList) this.b).get(size);
            int i5 = kgVar.a;
            if (i5 == 8) {
                int i6 = kgVar.b;
                int i7 = kgVar.d;
                if (i6 < i7) {
                    i3 = i7;
                } else {
                    i3 = i6;
                }
                if (i6 < i7) {
                    i4 = i6;
                } else {
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            kgVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            kgVar.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            kgVar.b = i6 + 1;
                        } else if (i2 == 2) {
                            kgVar.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        kgVar.b = i6 + 1;
                        kgVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        kgVar.b = i6 - 1;
                        kgVar.d = i7 - 1;
                    }
                }
            } else {
                int i8 = kgVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= kgVar.d;
                    } else if (i5 == 2) {
                        i += kgVar.d;
                    }
                } else if (i2 == 1) {
                    kgVar.b = i8 + 1;
                } else if (i2 == 2) {
                    kgVar.b = i8 - 1;
                }
            }
        }
        int size2 = ((ArrayList) this.b).size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                kg kgVar2 = (kg) ((ArrayList) this.b).get(size2);
                if (kgVar2.a == 8) {
                    int i9 = kgVar2.d;
                    if (i9 == kgVar2.b || i9 < 0) {
                        ((ArrayList) this.b).remove(size2);
                        h(kgVar2);
                    }
                } else if (kgVar2.d <= 0) {
                    ((ArrayList) this.b).remove(size2);
                    h(kgVar2);
                }
            } else {
                return i;
            }
        }
    }

    private final void n(kg kgVar) {
        int i;
        int i2 = kgVar.a;
        if (i2 != 1 && i2 != 8) {
            int m = m(kgVar.b, i2);
            int i3 = kgVar.b;
            int i4 = kgVar.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    Objects.toString(kgVar);
                    throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(kgVar)));
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < kgVar.d; i6++) {
                int m2 = m(kgVar.b + (i * i6), kgVar.a);
                int i7 = kgVar.a;
                if (i7 == 2 ? m2 == m : !(i7 != 4 || m2 != m + 1)) {
                    i5++;
                } else {
                    kg c = c(i7, m, i5, kgVar.c);
                    f(c, i3);
                    h(c);
                    if (kgVar.a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    m = m2;
                }
            }
            Object obj = kgVar.c;
            h(kgVar);
            if (i5 > 0) {
                kg c2 = c(kgVar.a, m, i5, obj);
                f(c2, i3);
                h(c2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private final void o(kg kgVar) {
        ((ArrayList) this.b).add(kgVar);
        int i = kgVar.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        ((qdq) this.c).S(kgVar.b, kgVar.d);
                        return;
                    }
                    Objects.toString(kgVar);
                    throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(kgVar)));
                }
                ((qdq) this.c).Q(kgVar.b, kgVar.d, kgVar.c);
                return;
            }
            Object obj = this.c;
            qdq qdqVar = (qdq) obj;
            ((RecyclerView) qdqVar.a).S(kgVar.b, kgVar.d, false);
            ((RecyclerView) qdqVar.a).N = true;
            return;
        }
        ((qdq) this.c).R(kgVar.b, kgVar.d);
    }

    private final boolean p(int i) {
        int size = ((ArrayList) this.b).size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            kg kgVar = (kg) ((ArrayList) this.b).get(i2);
            int i4 = kgVar.a;
            if (i4 == 8) {
                if (b(kgVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = kgVar.b;
                int i6 = kgVar.d + i5;
                while (i5 < i6) {
                    if (b(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = ((ArrayList) this.b).size();
        while (i2 < size) {
            kg kgVar = (kg) ((ArrayList) this.b).get(i2);
            int i3 = kgVar.a;
            if (i3 == 8) {
                int i4 = kgVar.b;
                if (i4 == i) {
                    i = kgVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (kgVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = kgVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = kgVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += kgVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ecf, java.lang.Object] */
    public final kg c(int i, int i2, int i3, Object obj) {
        kg kgVar = (kg) this.f.a();
        if (kgVar == null) {
            return new kg(i, i2, i3, obj);
        }
        kgVar.a = i;
        kgVar.b = i2;
        kgVar.d = i3;
        kgVar.c = obj;
        return kgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    public final void d() {
        int size = ((ArrayList) this.b).size();
        for (int i = 0; i < size; i++) {
            ((qdq) this.c).P((kg) ((ArrayList) this.b).get(i));
        }
        i(this.b);
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    public final void e() {
        d();
        int size = ((ArrayList) this.e).size();
        for (int i = 0; i < size; i++) {
            kg kgVar = (kg) ((ArrayList) this.e).get(i);
            int i2 = kgVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            ((qdq) this.c).P(kgVar);
                            ((qdq) this.c).S(kgVar.b, kgVar.d);
                        }
                    } else {
                        ((qdq) this.c).P(kgVar);
                        ((qdq) this.c).Q(kgVar.b, kgVar.d, kgVar.c);
                    }
                } else {
                    ((qdq) this.c).P(kgVar);
                    ((qdq) this.c).T(kgVar.b, kgVar.d);
                }
            } else {
                ((qdq) this.c).P(kgVar);
                ((qdq) this.c).R(kgVar.b, kgVar.d);
            }
        }
        i(this.e);
        this.a = 0;
    }

    final void f(kg kgVar, int i) {
        ((qdq) this.c).P(kgVar);
        int i2 = kgVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                ((qdq) this.c).Q(i, kgVar.d, kgVar.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        ((qdq) this.c).T(i, kgVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni.g():void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecf, java.lang.Object] */
    public final void h(kg kgVar) {
        kgVar.c = null;
        this.f.b(kgVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((kg) list.get(i));
        }
        list.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final void j() {
        i(this.e);
        i(this.b);
        this.a = 0;
    }

    public final boolean k(int i) {
        if ((i & this.a) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (((ArrayList) this.e).size() > 0) {
            return true;
        }
        return false;
    }

    public ni(no noVar, lt ltVar, qm qmVar, nq nqVar) {
        nh nhVar = new nh(this);
        this.f = nhVar;
        this.c = noVar;
        this.d = ltVar;
        this.b = qmVar.b(this);
        this.e = nqVar;
        this.a = noVar.b();
        noVar.D(nhVar);
    }
}
