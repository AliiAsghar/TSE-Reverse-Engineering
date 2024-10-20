package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class algc implements algy {
    public static algc l(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new alfm(charSequence);
                }
                return new alft(charSequence.charAt(0), charSequence.charAt(1));
            }
            return new alfs(charSequence.charAt(0));
        }
        return alfz.a;
    }

    public static algc m(CharSequence charSequence) {
        return l(charSequence).f();
    }

    public static String n(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    private static algc o(int i, BitSet bitSet, String str) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                int i3 = 2;
                if (i != 2) {
                    int length = bitSet.length();
                    if (i <= 1023 && length > i * 64) {
                        int cardinality = bitSet.cardinality();
                        boolean z = bitSet.get(0);
                        if (cardinality != 1) {
                            int highestOneBit = Integer.highestOneBit(cardinality - 1);
                            i3 = highestOneBit + highestOneBit;
                            while (i3 * 0.5d < cardinality) {
                                i3 += i3;
                            }
                        }
                        char[] cArr = new char[i3];
                        int i4 = i3 - 1;
                        int nextSetBit = bitSet.nextSetBit(0);
                        long j = 0;
                        while (nextSetBit != -1) {
                            long j2 = (1 << nextSetBit) | j;
                            int o = alhg.o(nextSetBit);
                            while (true) {
                                i2 = o & i4;
                                if (cArr[i2] == 0) {
                                    break;
                                }
                                o = i2 + 1;
                            }
                            cArr[i2] = (char) nextSetBit;
                            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
                            j = j2;
                        }
                        return new alhg(cArr, j, z, str);
                    }
                    return new alfo(bitSet, str);
                }
                char nextSetBit2 = (char) bitSet.nextSetBit(0);
                return new alft(nextSetBit2, (char) bitSet.nextSetBit(nextSetBit2 + 1));
            }
            return new alfs((char) bitSet.nextSetBit(0));
        }
        return alfz.a;
    }

    @Override // defpackage.algy
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return c(((Character) obj).charValue());
    }

    public void b(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (c((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public abstract boolean c(char c);

    public int d(CharSequence charSequence) {
        return e(charSequence, 0);
    }

    public int e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        albo.ae(i, length);
        while (i < length) {
            if (c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public algc f() {
        return new alfx(this);
    }

    public algc g(algc algcVar) {
        return new alga(this, algcVar);
    }

    public boolean h(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (c(charSequence.charAt(length)));
        return false;
    }

    public boolean i(CharSequence charSequence) {
        if (d(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public algc j() {
        String concat;
        BitSet bitSet = new BitSet();
        b(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality + cardinality <= 65536) {
            return o(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        String algcVar = toString();
        if (algcVar.endsWith(".negate()")) {
            concat = algcVar.substring(0, algcVar.length() - 9);
        } else {
            concat = String.valueOf(algcVar).concat(".negate()");
        }
        return new alfj(o(i, bitSet, concat), algcVar);
    }

    public final int k(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (c(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }
}
