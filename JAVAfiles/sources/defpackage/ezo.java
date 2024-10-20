package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezo extends ern {
    public final int c;
    public final String d;
    public final int e;
    public final eqn f;
    public final int g;
    public final fgv h;
    final boolean i;

    static {
        eul.M(1001);
        eul.M(1002);
        eul.M(1003);
        eul.M(1004);
        eul.M(1005);
        eul.M(1006);
    }

    public ezo(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ezo a(fgv fgvVar) {
        String message = getMessage();
        int i = eul.a;
        return new ezo(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, fgvVar, this.b, this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ezo(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.eqn r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L5f
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r17
            r6 = r18
            goto L65
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r19)
            int r2 = defpackage.eul.a
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L65
        L5f:
            r5 = r17
            r6 = r18
            java.lang.String r0 = "Source error"
        L65:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L72
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L72:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezo.<init>(int, java.lang.Throwable, int, java.lang.String, int, eqn, int, boolean):void");
    }

    private ezo(String str, Throwable th, int i, int i2, String str2, int i3, eqn eqnVar, int i4, fgv fgvVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        d.s(z2);
        d.s(th != null);
        this.c = i5;
        this.d = str2;
        this.e = i3;
        this.f = eqnVar;
        this.g = i4;
        this.h = fgvVar;
        this.i = z;
    }
}
