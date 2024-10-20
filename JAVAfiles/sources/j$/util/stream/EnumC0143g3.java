package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC0143g3 {
    public static final EnumC0143g3 DISTINCT;
    public static final EnumC0143g3 ORDERED;
    public static final EnumC0143g3 SHORT_CIRCUIT;
    public static final EnumC0143g3 SIZED;
    public static final EnumC0143g3 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final /* synthetic */ EnumC0143g3[] v;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        EnumC0138f3 enumC0138f3 = EnumC0138f3.SPLITERATOR;
        C0133e3 G = G(enumC0138f3);
        EnumC0138f3 enumC0138f32 = EnumC0138f3.STREAM;
        G.a(enumC0138f32);
        EnumC0138f3 enumC0138f33 = EnumC0138f3.OP;
        G.a.put((EnumMap) enumC0138f33, (EnumC0138f3) 3);
        EnumC0143g3 enumC0143g3 = new EnumC0143g3("DISTINCT", 0, 0, G);
        DISTINCT = enumC0143g3;
        C0133e3 G2 = G(enumC0138f3);
        G2.a(enumC0138f32);
        G2.a.put((EnumMap) enumC0138f33, (EnumC0138f3) 3);
        EnumC0143g3 enumC0143g32 = new EnumC0143g3("SORTED", 1, 1, G2);
        SORTED = enumC0143g32;
        C0133e3 G3 = G(enumC0138f3);
        G3.a(enumC0138f32);
        EnumMap enumMap = G3.a;
        enumMap.put((EnumMap) enumC0138f33, (EnumC0138f3) 3);
        EnumC0138f3 enumC0138f34 = EnumC0138f3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC0138f34, (EnumC0138f3) 2);
        EnumC0138f3 enumC0138f35 = EnumC0138f3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC0138f35, (EnumC0138f3) 2);
        EnumC0143g3 enumC0143g33 = new EnumC0143g3("ORDERED", 2, 2, G3);
        ORDERED = enumC0143g33;
        C0133e3 G4 = G(enumC0138f3);
        G4.a(enumC0138f32);
        G4.a.put((EnumMap) enumC0138f33, (EnumC0138f3) 2);
        EnumC0143g3 enumC0143g34 = new EnumC0143g3("SIZED", 3, 3, G4);
        SIZED = enumC0143g34;
        C0133e3 G5 = G(enumC0138f33);
        G5.a(enumC0138f34);
        EnumC0143g3 enumC0143g35 = new EnumC0143g3("SHORT_CIRCUIT", 4, 12, G5);
        SHORT_CIRCUIT = enumC0143g35;
        v = new EnumC0143g3[]{enumC0143g3, enumC0143g32, enumC0143g33, enumC0143g34, enumC0143g35};
        f = t(enumC0138f3);
        g = t(enumC0138f32);
        h = t(enumC0138f33);
        t(enumC0138f34);
        t(enumC0138f35);
        int i2 = 0;
        for (EnumC0143g3 enumC0143g36 : values()) {
            i2 |= enumC0143g36.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC0143g3 enumC0143g37 = DISTINCT;
        m = enumC0143g37.c;
        n = enumC0143g37.d;
        EnumC0143g3 enumC0143g38 = SORTED;
        o = enumC0143g38.c;
        p = enumC0143g38.d;
        EnumC0143g3 enumC0143g39 = ORDERED;
        q = enumC0143g39.c;
        r = enumC0143g39.d;
        EnumC0143g3 enumC0143g310 = SIZED;
        s = enumC0143g310.c;
        t = enumC0143g310.d;
        u = SHORT_CIRCUIT.c;
    }

    private EnumC0143g3(String str, int i2, int i3, C0133e3 c0133e3) {
        EnumC0138f3[] values = EnumC0138f3.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = c0133e3.a;
            if (i4 < length) {
                Map.EL.putIfAbsent(enumMap, values[i4], 0);
                i4++;
            } else {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
        }
    }

    private static C0133e3 G(EnumC0138f3 enumC0138f3) {
        C0133e3 c0133e3 = new C0133e3(new EnumMap(EnumC0138f3.class));
        c0133e3.a(enumC0138f3);
        return c0133e3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a0(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    private static int t(EnumC0138f3 enumC0138f3) {
        int i2 = 0;
        for (EnumC0143g3 enumC0143g3 : values()) {
            i2 |= ((Integer) enumC0143g3.a.get(enumC0138f3)).intValue() << enumC0143g3.b;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        if (i2 != 0 && spliterator.getComparator() != null) {
            return characteristics & i3 & (-5);
        }
        return characteristics & i3;
    }

    public static EnumC0143g3 valueOf(String str) {
        return (EnumC0143g3) Enum.valueOf(EnumC0143g3.class, str);
    }

    public static EnumC0143g3[] values() {
        return (EnumC0143g3[]) v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D(int i2) {
        int i3 = this.e;
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y(int i2) {
        if ((i2 & this.e) == this.c) {
            return true;
        }
        return false;
    }
}
