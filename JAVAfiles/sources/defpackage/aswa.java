package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aswa {
    public static final aswa a = new aswa("bike128", 12323);
    public static final aswa b = new aswa("bike192", 24659);
    public static final aswa c = new aswa("bike256", 40973);
    public final String d;
    private final int e;

    private aswa(String str, int i) {
        int i2;
        this.d = str;
        this.e = i;
        HashMap hashMap = new HashMap();
        if (((-65535) & i) == 1) {
            int i3 = i - 2;
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i3);
            int i4 = -i;
            for (int i5 = 1; i5 < numberOfLeadingZeros; i5++) {
                int i6 = (2 - (i4 * i4)) * i4;
                int i7 = i6 * (2 - (i4 * i6));
                int i8 = i7 * (2 - (i4 * i7));
                int i9 = 1 << (i5 - 1);
                int i10 = i8 * (2 - (i4 * i8));
                if (i9 >= 64) {
                    Integer valueOf = Integer.valueOf(i9);
                    if (!hashMap.containsKey(valueOf)) {
                        hashMap.put(valueOf, Integer.valueOf(aotl.G(i, i10, i9)));
                    }
                }
                int i11 = 1 << i5;
                if ((i3 & i11) != 0 && (i2 = (i11 - 1) & i3) >= 64) {
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (!hashMap.containsKey(valueOf2)) {
                        hashMap.put(valueOf2, Integer.valueOf(aotl.G(i, i10, i2)));
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int a() {
        return (this.e + 7) >> 3;
    }
}
