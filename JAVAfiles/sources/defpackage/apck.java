package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apck {
    public static final apcv a;

    static {
        apcc apccVar = apcc.a;
        a = new apcv();
    }

    public static void A(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apah) {
                apah apahVar = (apah) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apahVar.c; i4++) {
                        apahVar.d(i4);
                        i3 += 4;
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apahVar.c) {
                        ((aozl) aojjVar.b).p(apahVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apahVar.c) {
                    ((aozl) aojjVar.b).o(i, apahVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).intValue();
                    i5 += 4;
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).p(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void B(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apbk) {
                apbk apbkVar = (apbk) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apbkVar.c; i4++) {
                        apbkVar.a(i4);
                        i3 += 8;
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apbkVar.c) {
                        ((aozl) aojjVar.b).r(apbkVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apbkVar.c) {
                    ((aozl) aojjVar.b).q(i, apbkVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).longValue();
                    i5 += 8;
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).r(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void C(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apah) {
                apah apahVar = (apah) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apahVar.c; i4++) {
                        i3 += aozl.U(apahVar.d(i4));
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apahVar.c) {
                        ((aozl) aojjVar.b).ap(apahVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apahVar.c) {
                    ((aozl) aojjVar.b).ao(i, apahVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += aozl.U(((Integer) list.get(i6)).intValue());
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).ap(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).ao(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void D(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apbk) {
                apbk apbkVar = (apbk) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apbkVar.c; i4++) {
                        i3 += aozl.W(apbkVar.a(i4));
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apbkVar.c) {
                        ((aozl) aojjVar.b).ar(apbkVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apbkVar.c) {
                    ((aozl) aojjVar.b).aq(i, apbkVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += aozl.W(((Long) list.get(i6)).longValue());
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).ar(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).aq(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void E(int i, List list, aojj aojjVar) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apbh) {
                apbh apbhVar = (apbh) list;
                while (i2 < list.size()) {
                    Object c = apbhVar.c();
                    if (c instanceof String) {
                        ((aozl) aojjVar.b).y(i, (String) c);
                    } else {
                        ((aozl) aojjVar.b).m(i, (aozb) c);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).y(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void F(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apah) {
                apah apahVar = (apah) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apahVar.c; i4++) {
                        i3 += aozl.ab(apahVar.d(i4));
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apahVar.c) {
                        ((aozl) aojjVar.b).C(apahVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apahVar.c) {
                    ((aozl) aojjVar.b).B(i, apahVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += aozl.ab(((Integer) list.get(i6)).intValue());
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).C(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void G(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apbk) {
                apbk apbkVar = (apbk) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apbkVar.c; i4++) {
                        i3 += aozl.ad(apbkVar.a(i4));
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apbkVar.c) {
                        ((aozl) aojjVar.b).E(apbkVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apbkVar.c) {
                    ((aozl) aojjVar.b).D(i, apbkVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += aozl.ad(((Long) list.get(i6)).longValue());
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).E(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int a(List list) {
        return list.size() * 4;
    }

    public static int b(List list) {
        return list.size() * 8;
    }

    public static int c(int i, Object obj, apcj apcjVar) {
        if (obj instanceof apbg) {
            return aozl.N(i, (apbg) obj);
        }
        return aozl.Z(i) + aozl.R((apbt) obj, apcjVar);
    }

    public static int d(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            i = 0;
            while (i2 < size) {
                i += aozl.U(apahVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aozl.U(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof apbk) {
            apbk apbkVar = (apbk) list;
            i = 0;
            while (i2 < size) {
                i += aozl.W(apbkVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aozl.W(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int f(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            i = 0;
            while (i2 < size) {
                i += aozl.ab(apahVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aozl.ab(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static Object g(Object obj, int i, List list, apal apalVar, Object obj2, apcv apcvVar) {
        if (apalVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (apalVar.a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = i(obj, i, intValue, obj2, apcvVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (apalVar.a(intValue2) == null) {
                    obj2 = i(obj, i, intValue2, obj2, apcvVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object h(Object obj, int i, List list, apam apamVar, Object obj2, apcv apcvVar) {
        if (apamVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (apamVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = i(obj, i, intValue, obj2, apcvVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!apamVar.a(intValue2)) {
                    obj2 = i(obj, i, intValue2, obj2, apcvVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object i(Object obj, int i, int i2, Object obj2, apcv apcvVar) {
        if (obj2 == null) {
            obj2 = apcvVar.b(obj);
        }
        apcvVar.d(obj2, i, i2);
        return obj2;
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aozl.au(i);
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aozl.av(i);
    }

    public static /* synthetic */ int l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            i = 0;
            while (i2 < size) {
                i += aozl.L(apahVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aozl.L(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static /* synthetic */ int m(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof apbk) {
            apbk apbkVar = (apbk) list;
            i = 0;
            while (i2 < size) {
                i += aozl.ad(apbkVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aozl.ad(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void n(Object obj, Object obj2) {
        aozu c = aoue.c(obj2);
        if (!c.i()) {
            aozu d = aoue.d(obj);
            int i = c.b.b;
            for (int i2 = 0; i2 < i; i2++) {
                d.g(c.b.d(i2));
            }
            Iterator it = c.b.a().iterator();
            while (it.hasNext()) {
                d.g((Map.Entry) it.next());
            }
        }
    }

    public static void o(Object obj, Object obj2) {
        apcw f = apcv.f(obj);
        apcw f2 = apcv.f(obj2);
        if (!apcw.a.equals(f2)) {
            if (apcw.a.equals(f)) {
                f = apcw.b(f, f2);
            } else if (!f2.equals(apcw.a)) {
                f.c();
                int i = f.b + f2.b;
                f.d(i);
                System.arraycopy(f2.c, 0, f.c, f.b, f2.b);
                System.arraycopy(f2.d, 0, f.d, f.b, f2.b);
                f.b = i;
            }
        }
        apcv.g(obj, f);
    }

    public static void p(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof aoys) {
                aoys aoysVar = (aoys) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < aoysVar.c; i4++) {
                        aoysVar.g(i4);
                        i3++;
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < aoysVar.c) {
                        ((aozl) aojjVar.b).j(aoysVar.g(i2) ? (byte) 1 : (byte) 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < aoysVar.c) {
                    ((aozl) aojjVar.b).l(i, aoysVar.g(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) list.get(i6)).booleanValue();
                    i5++;
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void q(int i, List list, aojj aojjVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((aozl) aojjVar.b).m(i, (aozb) list.get(i2));
            }
        }
    }

    public static void r(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof aozm) {
                aozm aozmVar = (aozm) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < aozmVar.d; i4++) {
                        aozmVar.d(i4);
                        i3 += 8;
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < aozmVar.d) {
                        ((aozl) aojjVar.b).ak(aozmVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < aozmVar.d) {
                    ((aozl) aojjVar.b).aj(i, aozmVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Double) list.get(i6)).doubleValue();
                    i5 += 8;
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).ak(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).aj(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void s(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apah) {
                apah apahVar = (apah) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apahVar.c; i4++) {
                        i3 += aozl.L(apahVar.d(i4));
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apahVar.c) {
                        ((aozl) aojjVar.b).t(apahVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apahVar.c) {
                    ((aozl) aojjVar.b).s(i, apahVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += aozl.L(((Integer) list.get(i6)).intValue());
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).t(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apah) {
                apah apahVar = (apah) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apahVar.c; i4++) {
                        apahVar.d(i4);
                        i3 += 4;
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apahVar.c) {
                        ((aozl) aojjVar.b).p(apahVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apahVar.c) {
                    ((aozl) aojjVar.b).o(i, apahVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).intValue();
                    i5 += 4;
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).p(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apbk) {
                apbk apbkVar = (apbk) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apbkVar.c; i4++) {
                        apbkVar.a(i4);
                        i3 += 8;
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apbkVar.c) {
                        ((aozl) aojjVar.b).r(apbkVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apbkVar.c) {
                    ((aozl) aojjVar.b).q(i, apbkVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).longValue();
                    i5 += 8;
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).r(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof aozw) {
                aozw aozwVar = (aozw) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < aozwVar.d; i4++) {
                        aozwVar.d(i4);
                        i3 += 4;
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < aozwVar.d) {
                        ((aozl) aojjVar.b).am(aozwVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < aozwVar.d) {
                    ((aozl) aojjVar.b).al(i, aozwVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) list.get(i6)).floatValue();
                    i5 += 4;
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).am(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).al(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void w(int i, List list, aojj aojjVar, apcj apcjVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aojjVar.k(i, list.get(i2), apcjVar);
            }
        }
    }

    public static void x(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apah) {
                apah apahVar = (apah) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apahVar.c; i4++) {
                        i3 += aozl.L(apahVar.d(i4));
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apahVar.c) {
                        ((aozl) aojjVar.b).t(apahVar.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apahVar.c) {
                    ((aozl) aojjVar.b).s(i, apahVar.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += aozl.L(((Integer) list.get(i6)).intValue());
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).t(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void y(int i, List list, aojj aojjVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof apbk) {
                apbk apbkVar = (apbk) list;
                if (z) {
                    ((aozl) aojjVar.b).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < apbkVar.c; i4++) {
                        i3 += aozl.ad(apbkVar.a(i4));
                    }
                    ((aozl) aojjVar.b).C(i3);
                    while (i2 < apbkVar.c) {
                        ((aozl) aojjVar.b).E(apbkVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < apbkVar.c) {
                    ((aozl) aojjVar.b).D(i, apbkVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((aozl) aojjVar.b).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += aozl.ad(((Long) list.get(i6)).longValue());
                }
                ((aozl) aojjVar.b).C(i5);
                while (i2 < list.size()) {
                    ((aozl) aojjVar.b).E(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((aozl) aojjVar.b).D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void z(int i, List list, aojj aojjVar, apcj apcjVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aojjVar.n(i, list.get(i2), apcjVar);
            }
        }
    }
}
