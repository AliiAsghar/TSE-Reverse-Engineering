package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class r {

    @Deprecated
    public final Set a;

    @Deprecated
    public final boolean b;

    @Deprecated
    public final int c;

    private r(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else if (str.startsWith("decimal")) {
            i = 2;
        } else {
            throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : w.e.split(str.substring(7).trim())) {
            if (!str2.equals("…") && !str2.equals("...")) {
                if (!z2) {
                    String[] split = w.f.split(str2);
                    int length = split.length;
                    if (length != 1) {
                        if (length == 2) {
                            p pVar = new p(split[0]);
                            p pVar2 = new p(split[1]);
                            b(i, pVar);
                            b(i, pVar2);
                            linkedHashSet.add(new q(pVar, pVar2));
                        } else {
                            throw new IllegalArgumentException("Ill-formed number range: ".concat(String.valueOf(str2)));
                        }
                    } else {
                        p pVar3 = new p(split[0]);
                        b(i, pVar3);
                        linkedHashSet.add(new q(pVar3, pVar3));
                    }
                } else {
                    throw new IllegalArgumentException("Can only have … at the end of samples: ".concat(String.valueOf(str2)));
                }
            } else {
                z2 = true;
                z = false;
            }
        }
        return new r(i, DesugarCollections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, p pVar) {
        boolean z;
        boolean z2 = false;
        if (i != 1) {
            z = false;
        } else {
            z = true;
        }
        if (pVar.b == 0) {
            z2 = true;
        }
        if (z == z2) {
        } else {
            throw new IllegalArgumentException("Ill-formed number range: ".concat(pVar.toString()));
        }
    }

    @Deprecated
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        if (this.c != 1) {
            str = "DECIMAL";
        } else {
            str = "INTEGER";
        }
        sb.append(str.toLowerCase(Locale.ENGLISH));
        for (q qVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(qVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
