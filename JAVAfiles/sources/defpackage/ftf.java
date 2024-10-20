package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftf implements frc {
    private final List a;
    private final long[] b;
    private final long[] c;

    public ftf(List list) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            mkk mkkVar = (mkk) list.get(i);
            long[] jArr = this.b;
            int i2 = i + i;
            jArr[i2] = mkkVar.a;
            jArr[i2 + 1] = mkkVar.b;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // defpackage.frc
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.frc
    public final int b(long j) {
        long[] jArr = this.c;
        int ah = eul.ah(jArr, j, false);
        if (ah < jArr.length) {
            return ah;
        }
        return -1;
    }

    @Override // defpackage.frc
    public final long c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (i >= this.c.length) {
            z2 = false;
        }
        d.s(z2);
        return this.c[i];
    }

    @Override // defpackage.frc
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                mkk mkkVar = (mkk) this.a.get(i);
                Object obj = mkkVar.c;
                if (((esz) obj).x == -3.4028235E38f) {
                    arrayList2.add(mkkVar);
                } else {
                    arrayList.add(obj);
                }
            }
        }
        Collections.sort(arrayList2, new ebn(14));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            esy esyVar = new esy((esz) ((mkk) arrayList2.get(i3)).c);
            esyVar.c((-1) - i3, 1);
            arrayList.add(esyVar.a());
        }
        return arrayList;
    }
}
