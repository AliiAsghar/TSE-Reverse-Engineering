package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apsy extends aptb {
    public final alqc a;
    private final int b;

    public apsy(alqc alqcVar) {
        alqcVar.getClass();
        this.a = alqcVar;
        aluq listIterator = alqcVar.entrySet().listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            int b = ((aptb) entry.getKey()).b();
            i = i < b ? b : i;
            int b2 = ((aptb) entry.getValue()).b();
            if (i < b2) {
                i = b2;
            }
        }
        int i2 = i + 1;
        this.b = i2;
        if (i2 <= 8) {
        } else {
            throw new apss("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aptb
    public final int a() {
        return c((byte) -96);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aptb
    public final int b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        int size;
        int size2;
        aptb aptbVar = (aptb) obj;
        if (a() != aptbVar.a()) {
            size = a();
            size2 = aptbVar.a();
        } else {
            apsy apsyVar = (apsy) aptbVar;
            if (this.a.size() != apsyVar.a.size()) {
                size = this.a.size();
                size2 = apsyVar.a.size();
            } else {
                aluq listIterator = this.a.entrySet().listIterator();
                aluq listIterator2 = apsyVar.a.entrySet().listIterator();
                do {
                    if (!listIterator.hasNext() && !listIterator2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    Map.Entry entry2 = (Map.Entry) listIterator2.next();
                    int compareTo2 = ((aptb) entry.getKey()).compareTo((aptb) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((aptb) entry.getValue()).compareTo((aptb) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return alzz.am(this.a, ((apsy) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        if (this.a.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aluq listIterator = this.a.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            linkedHashMap.put(((aptb) entry.getKey()).toString().replace("\n", "\n  "), ((aptb) entry.getValue()).toString().replace("\n", "\n  "));
        }
        alhm alhmVar = new alhm(new algs(",\n  "), " : ");
        StringBuilder sb = new StringBuilder("{\n  ");
        alhmVar.b(sb, linkedHashMap.entrySet());
        sb.append("\n}");
        return sb.toString();
    }
}
