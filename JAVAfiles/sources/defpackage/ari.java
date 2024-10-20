package defpackage;

import defpackage.are;
import defpackage.asl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ari {
    public static final List a(ars arsVar, asl aslVar, are areVar) {
        artb artbVar;
        if (!areVar.c() && aslVar.isEmpty()) {
            return arnv.a;
        }
        ArrayList arrayList = new ArrayList();
        if (areVar.c()) {
            int i = ((are.a) areVar.a.b()).a;
            cbh cbhVar = areVar.a;
            int i2 = cbhVar.b;
            if (i2 > 0) {
                Object[] objArr = cbhVar.a;
                int i3 = 0;
                do {
                    int i4 = ((are.a) objArr[i3]).a;
                    if (i4 < i) {
                        i = i4;
                    }
                    i3++;
                } while (i3 < i2);
            }
            if (i < 0) {
                aju.c("negative minIndex");
            }
            int i5 = ((are.a) areVar.a.b()).b;
            cbh cbhVar2 = areVar.a;
            int i6 = cbhVar2.b;
            if (i6 > 0) {
                Object[] objArr2 = cbhVar2.a;
                int i7 = 0;
                do {
                    int i8 = ((are.a) objArr2[i7]).b;
                    if (i8 > i5) {
                        i5 = i8;
                    }
                    i7++;
                } while (i7 < i6);
            }
            artbVar = new artb(i, Math.min(i5, arsVar.e() - 1));
        } else {
            artbVar = artb.d;
        }
        int a = aslVar.a();
        for (int i9 = 0; i9 < a; i9++) {
            asl.a aVar = aslVar.get(i9);
            int a2 = art.a(arsVar, aVar.d(), aVar.a());
            int i10 = artbVar.a;
            if ((a2 > artbVar.b || i10 > a2) && a2 >= 0 && a2 < arsVar.e()) {
                arrayList.add(Integer.valueOf(a2));
            }
        }
        int i11 = artbVar.a;
        int i12 = artbVar.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
