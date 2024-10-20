package defpackage;

import defpackage.ajw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyx implements ajw.e {
    @Override // ajw.e
    public final /* synthetic */ float a() {
        return brg.a;
    }

    @Override // ajw.e
    public final void b(dqv dqvVar, int i, int[] iArr, int[] iArr2) {
        dqvVar.getClass();
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            if (length != 0) {
                if (length != 1) {
                    i -= iArr[length];
                    iArr2[length] = i;
                } else {
                    iArr2[length] = iArr[0];
                }
            } else {
                iArr2[length] = 0;
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return;
            }
        }
    }
}
