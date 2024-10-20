package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aopa {
    private static final int a;

    static {
        int i;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i = Integer.parseInt(split[0]);
            if (i == 1) {
                if (split.length > 1) {
                    i = Integer.parseInt(split[1]);
                } else {
                    i = 1;
                }
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char charAt = property.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        a = i;
    }

    public static boolean a() {
        if (a >= 9) {
            return true;
        }
        return false;
    }
}
