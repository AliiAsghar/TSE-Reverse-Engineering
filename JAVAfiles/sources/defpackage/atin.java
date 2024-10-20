package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atin implements atje {
    private final atje[] a;
    private final int b;

    public atin(atje[] atjeVarArr) {
        int a;
        this.a = atjeVarArr;
        int length = atjeVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                atje atjeVar = atjeVarArr[length];
                if (atjeVar != null && (a = atjeVar.a()) > i) {
                    i = a;
                }
            } else {
                this.b = i;
                return;
            }
        }
    }

    @Override // defpackage.atje
    public final int a() {
        return this.b;
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        Object b = atjaVar.b();
        boolean z = false;
        Object obj = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            atje[] atjeVarArr = this.a;
            int length = atjeVarArr.length;
            if (i6 >= length) {
                break;
            }
            atje atjeVar = atjeVarArr[i6];
            if (atjeVar == null) {
                if (i4 > i) {
                    z = true;
                } else {
                    return i;
                }
            } else {
                int c = atjeVar.c(atjaVar, charSequence, i);
                if (c >= i) {
                    if (c <= i4) {
                        continue;
                    } else {
                        if (c >= charSequence.length() || (i3 = i6 + 1) >= length || atjeVarArr[i3] == null) {
                            break;
                        }
                        obj = atjaVar.b();
                        i4 = c;
                    }
                } else if (c < 0 && (i2 = ~c) > i5) {
                    i5 = i2;
                }
                atjaVar.h(b);
                i6++;
            }
        }
        if (i4 <= i && (i4 != i || !z)) {
            return ~i5;
        }
        if (obj != null) {
            atjaVar.h(obj);
        }
        return i4;
    }
}
