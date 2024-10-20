package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ebn implements Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ ebn(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        alsr a;
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int i = ebp.a;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 1:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 2:
                return ((eqn) obj2).j - ((eqn) obj).j;
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                alsr alsrVar = fjd.a;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                return ((fis) ((List) obj).get(0)).compareTo((fis) ((List) obj2).get(0));
            case 5:
                return ((fir) Collections.max((List) obj)).compareTo((fir) Collections.max((List) obj2));
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i3 = 8;
                almj b3 = almj.b.d((fjc) Collections.max(list, new ebn(i3)), (fjc) Collections.max(list2, new ebn(i3)), new ebn(i3)).b(list.size(), list2.size());
                int i4 = 9;
                return b3.d((fjc) Collections.max(list, new ebn(i4)), (fjc) Collections.max(list2, new ebn(i4)), new ebn(i4)).a();
            case 7:
                return ((fiz) ((List) obj).get(0)).compareTo((fiz) ((List) obj2).get(0));
            case 8:
                fjc fjcVar = (fjc) obj;
                fjc fjcVar2 = (fjc) obj2;
                almj e = almj.b.e(fjcVar.h, fjcVar2.h).b(fjcVar.m, fjcVar2.m).e(fjcVar.n, fjcVar2.n).e(fjcVar.i, fjcVar2.i).e(fjcVar.e, fjcVar2.e).e(fjcVar.g, fjcVar2.g).d(Integer.valueOf(fjcVar.l), Integer.valueOf(fjcVar2.l), alti.a).e(fjcVar.o, fjcVar2.o).e(fjcVar.p, fjcVar2.p);
                if (fjcVar.o && fjcVar.p) {
                    e = e.b(fjcVar.q, fjcVar2.q);
                }
                return e.a();
            case 9:
                fjc fjcVar3 = (fjc) obj;
                fjc fjcVar4 = (fjc) obj2;
                if (fjcVar3.e && fjcVar3.h) {
                    a = fjd.a;
                } else {
                    a = fjd.a.a();
                }
                almj almjVar = almj.b;
                boolean z = fjcVar3.f.y;
                return almjVar.d(Integer.valueOf(fjcVar3.k), Integer.valueOf(fjcVar4.k), a).d(Integer.valueOf(fjcVar3.j), Integer.valueOf(fjcVar4.j), a).a();
            case 10:
                return ((gny) obj).c - ((gny) obj2).c;
            case 11:
                return Float.compare(((gny) obj).b, ((gny) obj2).b);
            case 12:
                return Integer.compare(((frs) obj2).c, ((frs) obj).c);
            case 13:
                return Integer.compare(((fsz) obj).c.a, ((fsz) obj2).c.a);
            case 14:
                return Long.compare(((mkk) obj).a, ((mkk) obj2).a);
            case 15:
                return arrj.q((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 16:
                return arrj.q((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 17:
                return arrj.q(((gjr) obj).a, ((gjr) obj2).a);
            case 18:
                return arrj.q(((gjt) obj).a, ((gjt) obj2).a);
            case 19:
                return arrj.q(idy.b((armo) obj), idy.b((armo) obj2));
            default:
                return arrj.q(0, 0);
        }
    }
}
