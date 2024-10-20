package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpk implements agpj {
    private final String a;
    private final Object[] b;

    public agpk(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ba A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String c(java.util.List r20, defpackage.agpo r21) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agpk.c(java.util.List, agpo):java.lang.String");
    }

    @Override // defpackage.agpj
    public final String ad(agpo agpoVar) {
        return c(null, agpoVar);
    }

    @Override // defpackage.agpj
    public final String ae(agpo agpoVar, List list) {
        return c(list, agpoVar);
    }

    @Override // defpackage.agpj
    public final void af(adwp adwpVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = this.a.indexOf("$", i);
            if (indexOf == -1) {
                return;
            }
            String str = this.a;
            if (indexOf != str.length() - 1) {
                i = indexOf + 1;
                Object[] objArr = this.b;
                char charAt = str.charAt(i);
                if (i2 < objArr.length) {
                    int i3 = i2 + 1;
                    Object obj = this.b[i2];
                    if (charAt == 'V' && (obj instanceof agmh)) {
                        adwpVar.o(obj.toString(), null);
                    }
                    i2 = i3;
                } else {
                    throw new IllegalArgumentException("too few args for format: ".concat(this.a));
                }
            } else {
                throw new IllegalArgumentException("bad format specifier in format: ".concat(str));
            }
        }
    }
}
