package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atik implements atjg, atje {
    public final atjg[] a;
    public final atje[] b;
    private final int c;
    private final int d;

    public atik(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof atik) {
                e(arrayList, ((atik) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof atik) {
                e(arrayList2, ((atik) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.contains(null) && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            this.a = new atjg[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                atjg atjgVar = (atjg) arrayList.get(i3);
                i2 += atjgVar.b();
                this.a[i3] = atjgVar;
            }
            this.c = i2;
        } else {
            this.a = null;
            this.c = 0;
        }
        if (!arrayList2.contains(null) && !arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            this.b = new atje[size3];
            int i4 = 0;
            for (int i5 = 0; i5 < size3; i5++) {
                atje atjeVar = (atje) arrayList2.get(i5);
                i4 += atjeVar.a();
                this.b[i5] = atjeVar;
            }
            this.d = i4;
            return;
        }
        this.b = null;
        this.d = 0;
    }

    private static final void e(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.atje
    public final int a() {
        return this.d;
    }

    @Override // defpackage.atjg
    public final int b() {
        return this.c;
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        atje[] atjeVarArr = this.b;
        if (atjeVarArr != null) {
            for (int i2 = 0; i2 < atjeVarArr.length && i >= 0; i2++) {
                i = atjeVarArr[i2].c(atjaVar, charSequence, i);
            }
            return i;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        Locale locale2;
        atjg[] atjgVarArr = this.a;
        if (atjgVarArr != null) {
            if (locale == null) {
                locale2 = Locale.getDefault();
            } else {
                locale2 = locale;
            }
            for (atjg atjgVar : atjgVarArr) {
                atjgVar.d(appendable, j, atfuVar, i, atgcVar, locale2);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
