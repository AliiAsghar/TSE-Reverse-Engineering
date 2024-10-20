package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebz {
    static final ebz a;
    static final ebz b;
    static final atkn c;
    private static final String d;
    private static final String e;
    private final boolean f;
    private final atkn g;

    static {
        atkn atknVar = ecc.c;
        c = atknVar;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        a = new ebz(false, atknVar);
        b = new ebz(true, atknVar);
    }

    public ebz(boolean z, atkn atknVar) {
        this.f = z;
        this.g = atknVar;
    }

    public static ebz a() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return b;
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006a, code lost:
    
        if (r2 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0074, code lost:
    
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L61;
            case 17: goto L61;
            case 18: goto L60;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007b, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007f, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0087, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int d(java.lang.CharSequence r9) {
        /*
            eby r0 = new eby
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L67
            if (r1 != 0) goto L67
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L39
            java.lang.CharSequence r4 = r0.a
            int r5 = r0.c
            int r4 = java.lang.Character.codePointAt(r4, r5)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r5 = r5 + r8
            r0.c = r5
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L44
        L39:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            byte r4 = defpackage.eby.b(r4)
        L44:
            if (r4 == 0) goto L62
            if (r4 == r7) goto L5f
            r5 = 2
            if (r4 == r5) goto L5f
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L5b;
                case 15: goto L5b;
                case 16: goto L57;
                case 17: goto L57;
                case 18: goto L53;
                default: goto L52;
            }
        L52:
            goto L65
        L53:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L57:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L5b:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L5f:
            if (r3 != 0) goto L65
            goto L7d
        L62:
            if (r3 != 0) goto L65
            goto L81
        L65:
            r1 = r3
            goto Lb
        L67:
            if (r1 != 0) goto L6a
            goto L87
        L6a:
            if (r2 != 0) goto L86
        L6c:
            int r2 = r0.c
            if (r2 <= 0) goto L87
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L7f;
                case 15: goto L7f;
                case 16: goto L7b;
                case 17: goto L7b;
                case 18: goto L78;
                default: goto L77;
            }
        L77:
            goto L6c
        L78:
            int r3 = r3 + 1
            goto L6c
        L7b:
            if (r1 != r3) goto L83
        L7d:
            r9 = r7
            goto L87
        L7f:
            if (r1 != r3) goto L83
        L81:
            r9 = r6
            goto L87
        L83:
            int r3 = r3 + (-1)
            goto L6c
        L86:
            r9 = r2
        L87:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebz.d(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0021. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int e(java.lang.CharSequence r7) {
        /*
            eby r0 = new eby
            r0.<init>(r7)
            int r7 = r0.b
            r0.c = r7
            r7 = 0
            r1 = r7
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L3a
            r5 = 1
            if (r3 == r5) goto L33
            r6 = 2
            if (r3 == r6) goto L33
            r6 = 9
            if (r3 == r6) goto Lc
            switch(r3) {
                case 14: goto L2d;
                case 15: goto L2d;
                case 16: goto L2a;
                case 17: goto L2a;
                case 18: goto L27;
                default: goto L24;
            }
        L24:
            if (r2 != 0) goto Lc
            goto L40
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            if (r2 != r1) goto L30
            goto L35
        L2d:
            if (r2 != r1) goto L30
            goto L3c
        L30:
            int r1 = r1 + (-1)
            goto Lc
        L33:
            if (r1 != 0) goto L37
        L35:
            r7 = r5
            goto L41
        L37:
            if (r2 != 0) goto Lc
            goto L40
        L3a:
            if (r1 != 0) goto L3e
        L3c:
            r7 = r4
            goto L41
        L3e:
            if (r2 != 0) goto Lc
        L40:
            goto Lb
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebz.e(java.lang.CharSequence):int");
    }

    public final String b(String str) {
        return c(str, this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(java.lang.String r8, defpackage.atkn r9) {
        /*
            r7 = this;
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            int r0 = r8.length()
            boolean r9 = r9.d(r8, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            if (r9 == 0) goto L16
            atkn r1 = defpackage.ecc.b
            goto L18
        L16:
            atkn r1 = defpackage.ecc.a
        L18:
            int r2 = r8.length()
            boolean r1 = r1.d(r8, r2)
            boolean r2 = r7.f
            r3 = 0
            r4 = -1
            java.lang.String r5 = ""
            r6 = 1
            if (r2 != 0) goto L37
            if (r1 != 0) goto L34
            int r1 = d(r8)
            if (r1 != r6) goto L32
            goto L34
        L32:
            r1 = r3
            goto L37
        L34:
            java.lang.String r1 = defpackage.ebz.d
            goto L47
        L37:
            boolean r2 = r7.f
            if (r2 == 0) goto L46
            if (r1 == 0) goto L43
            int r1 = d(r8)
            if (r1 != r4) goto L46
        L43:
            java.lang.String r1 = defpackage.ebz.e
            goto L47
        L46:
            r1 = r5
        L47:
            r0.append(r1)
            boolean r1 = r7.f
            if (r9 == r1) goto L61
            if (r6 == r9) goto L53
            r1 = 8234(0x202a, float:1.1538E-41)
            goto L55
        L53:
            r1 = 8235(0x202b, float:1.154E-41)
        L55:
            r0.append(r1)
            r0.append(r8)
            r1 = 8236(0x202c, float:1.1541E-41)
            r0.append(r1)
            goto L64
        L61:
            r0.append(r8)
        L64:
            if (r9 == 0) goto L69
            atkn r9 = defpackage.ecc.b
            goto L6b
        L69:
            atkn r9 = defpackage.ecc.a
        L6b:
            int r1 = r8.length()
            boolean r9 = r9.d(r8, r1)
            boolean r1 = r7.f
            if (r1 != 0) goto L82
            if (r9 != 0) goto L7f
            int r9 = e(r8)
            if (r9 != r6) goto L83
        L7f:
            java.lang.String r5 = defpackage.ebz.d
            goto L91
        L82:
            r3 = r9
        L83:
            boolean r9 = r7.f
            if (r9 == 0) goto L91
            if (r3 == 0) goto L8f
            int r8 = e(r8)
            if (r8 != r4) goto L91
        L8f:
            java.lang.String r5 = defpackage.ebz.e
        L91:
            r0.append(r5)
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebz.c(java.lang.String, atkn):java.lang.String");
    }
}
