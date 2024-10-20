package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fso {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final fst f;
    public final String[] g;
    public final String h;
    public final String i;
    public final fso j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    public fso(String str, String str2, long j, long j2, fst fstVar, String[] strArr, String str3, String str4, fso fsoVar) {
        boolean z;
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = fstVar;
        this.g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        this.d = j;
        this.e = j2;
        dzg.g(str3);
        this.h = str3;
        this.j = fsoVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            esy esyVar = new esy();
            esyVar.a = new SpannableStringBuilder();
            map.put(str, esyVar);
        }
        CharSequence charSequence = ((esy) map.get(str)).a;
        dzg.g(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final fso b(int i) {
        List list = this.m;
        if (list != null) {
            return (fso) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void c(fso fsoVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(fsoVar);
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                fso fsoVar = (fso) this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                fsoVar.d(treeSet, z2);
            }
        }
    }

    public final void e(long j, String str, List list) {
        String str2;
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (h(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            b(i).e(j, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r19, java.util.Map r21, java.util.Map r22, java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fso.f(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    public final void g(long j, boolean z, String str, Map map) {
        boolean z2;
        this.k.clear();
        this.l.clear();
        if (!"metadata".equals(this.a)) {
            if (!"".equals(this.h)) {
                str = this.h;
            }
            if (this.c && z) {
                SpannableStringBuilder i = i(str, map);
                String str2 = this.b;
                dzg.g(str2);
                i.append((CharSequence) str2);
                return;
            }
            if ("br".equals(this.a) && z) {
                i(str, map).append('\n');
                return;
            }
            if (h(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    HashMap hashMap = this.k;
                    String str3 = (String) entry.getKey();
                    CharSequence charSequence = ((esy) entry.getValue()).a;
                    dzg.g(charSequence);
                    hashMap.put(str3, Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(this.a);
                for (int i2 = 0; i2 < a(); i2++) {
                    fso b = b(i2);
                    if (!z && !equals) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    b.g(j, z2, str, map);
                }
                if (equals) {
                    SpannableStringBuilder i3 = i(str, map);
                    int length = i3.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (i3.charAt(length) == ' ');
                    if (length >= 0 && i3.charAt(length) != '\n') {
                        i3.append('\n');
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    HashMap hashMap2 = this.l;
                    String str4 = (String) entry2.getKey();
                    CharSequence charSequence2 = ((esy) entry2.getValue()).a;
                    dzg.g(charSequence2);
                    hashMap2.put(str4, Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }

    public final boolean h(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L) {
            if (this.e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 == -9223372036854775807L && j < this.e) {
            return true;
        }
        if (j2 <= j && j < this.e) {
            return true;
        }
        return false;
    }
}
