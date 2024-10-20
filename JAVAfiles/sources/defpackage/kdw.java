package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kdw implements Comparator {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ffo] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, aqvx] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.lang.Comparable] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        int i;
        boolean z2 = true;
        int i2 = 1;
        switch (this.b) {
            case 0:
                return ((Number) this.a.a(obj, obj2)).intValue();
            case 1:
                int i3 = ffp.a;
                ?? r0 = this.a;
                return r0.a(obj2) - r0.a(obj);
            case 2:
                return ((Number) this.a.a(obj, obj2)).intValue();
            case 3:
                ?? r02 = this.a;
                return arrj.q(r02.a(obj), r02.a(obj2));
            case 4:
                ?? r03 = this.a;
                return arrj.q(r03.a(obj), r03.a(obj2));
            case 5:
                int compare = this.a.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return arrj.q(((SelfIdentityIdImpl) ((nfw) obj).f()).a, ((SelfIdentityIdImpl) ((nfw) obj2).f()).a);
            case 6:
                return arrj.q(Boolean.valueOf(((rcr) this.a).m((smr) obj)), Boolean.valueOf(((rcr) this.a).m((smr) obj2)));
            case 7:
                int compare2 = this.a.compare(obj, obj2);
                if (compare2 != 0) {
                    return compare2;
                }
                return arrj.q(Long.valueOf(((smr) obj).u()), Long.valueOf(((smr) obj2).u()));
            case 8:
                int i4 = ((xtg) obj2).f.e;
                Object obj3 = this.a;
                if (obj3 == null || i4 != ((Integer) obj3).intValue()) {
                    z = false;
                } else {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                int i5 = ((xtg) obj).f.e;
                Object obj4 = this.a;
                if (obj4 == null || i5 != ((Integer) obj4).intValue()) {
                    z2 = false;
                }
                return arrj.q(valueOf, Boolean.valueOf(z2));
            case 9:
                int compare3 = this.a.compare(obj, obj2);
                if (compare3 != 0) {
                    return compare3;
                }
                return arrj.q(Integer.valueOf(((xtg) obj).e), Integer.valueOf(((xtg) obj2).e));
            case 10:
                if (((zzt) obj).b == this.a) {
                    i = 0;
                } else {
                    i = 1;
                }
                Integer valueOf2 = Integer.valueOf(i);
                if (((zzt) obj2).b == this.a) {
                    i2 = 0;
                }
                return arrj.q(valueOf2, Integer.valueOf(i2));
            case 11:
                int i6 = ajcc.a;
                return ((Collator) this.a).compare(((ajcb) obj).b, ((ajcb) obj2).b);
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Comparator comparator = alqc.a;
                entry.getClass();
                entry2.getClass();
                return this.a.compare(entry.getKey(), entry2.getKey());
            case 13:
                ?? r04 = this.a;
                int a = r04.a(obj) - r04.a(obj2);
                if (a != 0) {
                    return a;
                }
                return obj.getClass().getName().compareTo(obj2.getClass().getName());
            default:
                for (int i7 = 0; i7 < 2; i7++) {
                    arqr arqrVar = ((arqr[]) this.a)[i7];
                    int q = arrj.q((Comparable) arqrVar.a(obj), (Comparable) arqrVar.a(obj2));
                    if (q != 0) {
                        return q;
                    }
                }
                return 0;
        }
    }

    public kdw(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
