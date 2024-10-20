package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvz extends dwh {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f4, code lost:
    
        if (r6 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f8, code lost:
    
        if (r7 != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    @Override // defpackage.dwc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.dun r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvz.a(dun, boolean):void");
    }

    @Override // defpackage.dwc
    public final boolean ay() {
        return true;
    }

    public final int b() {
        int i = this.a;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.aM;
            if (i4 >= i) {
                break;
            }
            dwc dwcVar = this.aL[i4];
            if ((this.b || dwcVar.ay()) && ((((i2 = this.a) == 0 || i2 == 1) && !dwcVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !dwcVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.aM; i6++) {
            dwc dwcVar2 = this.aL[i6];
            if (this.b || dwcVar2.ay()) {
                if (!z2) {
                    int i7 = this.a;
                    if (i7 == 0) {
                        i5 = dwcVar2.U(2).a();
                    } else if (i7 == 1) {
                        i5 = dwcVar2.U(4).a();
                    } else if (i7 == 2) {
                        i5 = dwcVar2.U(3).a();
                    } else if (i7 == 3) {
                        i5 = dwcVar2.U(5).a();
                    }
                }
                int i8 = this.a;
                if (i8 == 0) {
                    i5 = Math.min(i5, dwcVar2.U(2).a());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, dwcVar2.U(4).a());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, dwcVar2.U(3).a());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, dwcVar2.U(5).a());
                }
                z2 = true;
            }
        }
        int i9 = i5 + this.c;
        int i10 = this.a;
        if (i10 != 0 && i10 != 1) {
            A(i9, i9);
        } else {
            z(i9, i9);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.dwc
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.dwc
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.dwc
    public final String toString() {
        String str = "[Barrier] " + this.as + " {";
        for (int i = 0; i < this.aM; i++) {
            dwc dwcVar = this.aL[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str.concat(String.valueOf(dwcVar.as));
        }
        return str.concat("}");
    }
}
