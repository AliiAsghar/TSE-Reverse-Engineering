package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcf implements gdm {
    public static final gcf a = new gcf(gbg.a);
    public final List b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gcf(gbg gbgVar) {
        this(gbgVar.c, gbgVar.d, gbgVar.e);
        gbgVar.getClass();
    }

    private static final int j(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((gec) it.next()).c.size();
        }
        return i;
    }

    @Override // defpackage.gdm
    public final int a() {
        return this.c;
    }

    public final int b() {
        int[] iArr = ((gec) aqjn.X(this.b)).b;
        int i = iArr[0];
        arob it = new artb(1, aqil.g(iArr)).iterator();
        while (it.a) {
            int i2 = iArr[it.a()];
            if (i > i2) {
                i = i2;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    public final int c() {
        int[] iArr = ((gec) aqjn.ac(this.b)).b;
        int i = iArr[0];
        arob it = new artb(1, aqil.g(iArr)).iterator();
        while (it.a) {
            int i2 = iArr[it.a()];
            if (i < i2) {
                i = i2;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    @Override // defpackage.gdm
    public final int d() {
        return this.e;
    }

    @Override // defpackage.gdm
    public final int e() {
        return this.d;
    }

    @Override // defpackage.gdm
    public final int f() {
        return this.d + this.c + this.e;
    }

    public final ged g(int i) {
        int i2 = 0;
        int i3 = i - this.d;
        while (i3 >= ((gec) this.b.get(i2)).c.size() && i2 < aqjn.z(this.b)) {
            i3 -= ((gec) this.b.get(i2)).c.size();
            i2++;
        }
        gec gecVar = (gec) this.b.get(i2);
        int i4 = i - this.d;
        int f = ((f() - i) - this.e) - 1;
        int b = b();
        int c = c();
        int i5 = gecVar.d;
        List list = gecVar.e;
        return new ged(i5, i3, i4, f, b, c);
    }

    @Override // defpackage.gdm
    public final Object h(int i) {
        int size = this.b.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((gec) this.b.get(i2)).c.size();
            if (size2 > i) {
                break;
            }
            i2++;
            i -= size2;
        }
        return ((gec) this.b.get(i2)).c.get(i);
    }

    public final dyh i(dyh dyhVar) {
        dyhVar.getClass();
        if (dyhVar instanceof gbg) {
            gbg gbgVar = (gbg) dyhVar;
            List list = gbgVar.c;
            gbb gbbVar = gbgVar.b;
            int j = j(list);
            int ordinal = gbbVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        int i = this.e;
                        int i2 = this.c;
                        List list2 = this.b;
                        list2.addAll(list2.size(), gbgVar.c);
                        this.c += j;
                        this.e = gbgVar.e;
                        int i3 = this.d + i2;
                        List list3 = gbgVar.c;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            aqjn.S(arrayList, ((gec) it.next()).c);
                        }
                        return new gcr(i3, arrayList, this.e, i);
                    }
                    throw new armm();
                }
                int i4 = this.d;
                this.b.addAll(0, gbgVar.c);
                this.c += j;
                this.d = gbgVar.d;
                List list4 = gbgVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    aqjn.S(arrayList2, ((gec) it2.next()).c);
                }
                return new gcu(arrayList2, this.d, i4);
            }
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (dyhVar instanceof gbe) {
            gbe gbeVar = (gbe) dyhVar;
            artb artbVar = new artb(gbeVar.b, gbeVar.c);
            Iterator it3 = this.b.iterator();
            int i5 = 0;
            while (it3.hasNext()) {
                gec gecVar = (gec) it3.next();
                int[] iArr = gecVar.b;
                int i6 = 0;
                while (true) {
                    if (i6 > 0) {
                        break;
                    }
                    if (artbVar.e(iArr[i6])) {
                        i5 += gecVar.c.size();
                        it3.remove();
                        break;
                    }
                    i6++;
                }
            }
            int i7 = this.c - i5;
            this.c = i7;
            if (gbeVar.a == gbb.PREPEND) {
                int i8 = this.d;
                int i9 = gbeVar.d;
                this.d = i9;
                return new gct(i5, i9, i8);
            }
            int i10 = this.e;
            int i11 = gbeVar.d;
            this.e = i11;
            return new gcs(this.d + i7, i5, i11, i10);
        }
        throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final String toString() {
        int i = this.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(h(i2));
        }
        return "[(" + this.d + " placeholders), " + aqjn.aK(arrayList, null, null, null, null, 63) + ", (" + this.e + " placeholders)]";
    }

    public gcf(List list, int i, int i2) {
        list.getClass();
        this.b = aqjn.az(list);
        this.c = j(list);
        this.d = i;
        this.e = i2;
    }
}
