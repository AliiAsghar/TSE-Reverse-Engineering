package j$.time.format;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
class n {
    protected String a;
    protected String b;
    protected char c;
    protected n d;
    protected n e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(String str, String str2, n nVar, int i) {
        this(str, str2, nVar);
    }

    private boolean b(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && c(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i == this.a.length()) {
            if (i < str.length()) {
                String substring = str.substring(i);
                for (n nVar = this.d; nVar != null; nVar = nVar.e) {
                    if (c(nVar.c, substring.charAt(0))) {
                        return nVar.b(substring, str2);
                    }
                }
                n e = e(substring, str2, null);
                e.e = this.d;
                this.d = e;
                return true;
            }
            this.b = str2;
            return true;
        }
        n e2 = e(this.a.substring(i), this.b, this.d);
        this.a = str.substring(0, i);
        this.d = e2;
        if (i < str.length()) {
            this.d.e = e(str.substring(i), str2, null);
            this.b = null;
        } else {
            this.b = str2;
        }
        return true;
    }

    public static n f(w wVar) {
        if (wVar.k()) {
            return new n("", null, null);
        }
        return new n("", null, null);
    }

    public static n g(Set set, w wVar) {
        n f = f(wVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.b(str, str);
        }
        return f;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    protected boolean c(char c, char c2) {
        return c == c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        r0 = r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r6.setIndex(r2);
        r5 = r0.d(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r2 != r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (c(r0.c, r5.charAt(r2)) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.lang.CharSequence r5, java.text.ParsePosition r6) {
        /*
            r4 = this;
            int r0 = r6.getIndex()
            int r1 = r5.length()
            boolean r2 = r4.h(r5, r0, r1)
            if (r2 != 0) goto L10
            r5 = 0
            return r5
        L10:
            java.lang.String r2 = r4.a
            int r2 = r2.length()
            int r2 = r2 + r0
            j$.time.format.n r0 = r4.d
            if (r0 == 0) goto L37
            if (r2 == r1) goto L37
        L1d:
            char r1 = r0.c
            char r3 = r5.charAt(r2)
            boolean r1 = r4.c(r1, r3)
            if (r1 == 0) goto L33
            r6.setIndex(r2)
            java.lang.String r5 = r0.d(r5, r6)
            if (r5 == 0) goto L37
            return r5
        L33:
            j$.time.format.n r0 = r0.e
            if (r0 != 0) goto L1d
        L37:
            r6.setIndex(r2)
            java.lang.String r5 = r4.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.n.d(java.lang.CharSequence, java.text.ParsePosition):java.lang.String");
    }

    protected n e(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    protected boolean h(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length > 0) {
                int i5 = i3 + 1;
                int i6 = i + 1;
                if (!c(this.a.charAt(i3), charSequence.charAt(i))) {
                    return false;
                }
                i = i6;
                length = i4;
                i3 = i5;
            } else {
                return true;
            }
        }
    }

    private n(String str, String str2, n nVar) {
        this.a = str;
        this.b = str2;
        this.d = nVar;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }
}
