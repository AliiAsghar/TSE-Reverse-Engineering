package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apst extends aptb {
    private final alog a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public apst(alog alogVar) {
        alogVar.getClass();
        this.a = alogVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            alog alogVar2 = this.a;
            if (i >= ((alsx) alogVar2).c) {
                break;
            }
            int b = ((aptb) alogVar2.get(i)).b();
            if (i2 < b) {
                i2 = b;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 <= 8) {
        } else {
            throw new apss("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aptb
    public final int a() {
        return c(Byte.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aptb
    public final int b() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        aptb aptbVar = (aptb) obj;
        if (a() != aptbVar.a()) {
            return a() - aptbVar.a();
        }
        apst apstVar = (apst) aptbVar;
        alog alogVar = this.a;
        int i = ((alsx) apstVar.a).c;
        int i2 = ((alsx) alogVar).c;
        if (i2 != i) {
            return i2 - i;
        }
        int i3 = 0;
        while (true) {
            alog alogVar2 = this.a;
            if (i3 >= ((alsx) alogVar2).c) {
                return 0;
            }
            int compareTo = ((aptb) alogVar2.get(i3)).compareTo((aptb) apstVar.a.get(i3));
            if (compareTo != 0) {
                return compareTo;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return alzz.at(this.a, ((apst) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        if (this.a.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        alog alogVar = this.a;
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            arrayList.add(((aptb) alogVar.get(i)).toString().replace("\n", "\n  "));
        }
        algs algsVar = new algs(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        algsVar.h(sb, arrayList);
        sb.append("\n]");
        return sb.toString();
    }
}
