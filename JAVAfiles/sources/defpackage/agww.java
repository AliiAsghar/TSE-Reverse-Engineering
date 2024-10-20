package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agww extends AbstractList {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList");
    public final int b;
    public final List c;
    public final int[] d;
    public int e;
    private final int[] f;
    private final int g;
    private final int h;

    public agww(alog alogVar, int i, int i2) {
        ArrayList arrayList = new ArrayList(alogVar);
        this.c = arrayList;
        this.g = i;
        this.h = i2;
        int size = arrayList.size();
        this.b = size;
        this.f = new int[size];
        this.d = new int[size];
        e();
        if (alogVar.isEmpty()) {
            ((alvg) a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "<init>", 44, "ItemViewDataFlatList.java")).q("Initialized with empty categorized sources");
        }
    }

    private final void e() {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.b; i4++) {
            alog alogVar = (alog) this.c.get(i4);
            int size = alogVar.size();
            this.d[i4] = i3;
            int max = Math.max((int) Math.ceil(size / this.h), this.g);
            if (size != 0 && (size != 1 || !(alogVar.get(0) instanceof agwo))) {
                i2 = (max * this.h) + 1;
            } else {
                if (max > 0) {
                    i = (max - 1) * this.h;
                } else {
                    i = 0;
                }
                i2 = i + 2;
            }
            this.f[i4] = i2;
            i3 += i2;
        }
        this.e = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= this.b || i < this.d[i3]) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        if (i >= this.b) {
            ((alvg) a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategorySize", 140, "ItemViewDataFlatList.java")).u("Too large categoryIndex (%s vs %s)", i, this.b);
            return 0;
        }
        return this.f[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final agwv get(int i) {
        int[] iArr = this.d;
        int a2 = a(i);
        int i2 = i - iArr[a2];
        if (i2 < 0) {
            ((alvg) a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "get", 89, "ItemViewDataFlatList.java")).u("position (%d) for category (%d) is invalid", i, a2);
            return agvn.b;
        }
        if (i2 == 0) {
            return new agvl(a2, 0);
        }
        if (i2 < ((alog) this.c.get(a2)).size() + 1) {
            return (agwv) ((alog) this.c.get(a2)).get(i2 - 1);
        }
        if (i2 == 1 && ((alog) this.c.get(a2)).isEmpty()) {
            return agwo.b;
        }
        return agvn.b;
    }

    public final void d(int i, alog alogVar) {
        if (this.b == 0) {
            ((alvg) a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "updateSourcesByIndex", 50, "ItemViewDataFlatList.java")).q("Couldn't update due to empty categorizes sources");
        } else {
            this.c.set(0, alogVar);
            e();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
