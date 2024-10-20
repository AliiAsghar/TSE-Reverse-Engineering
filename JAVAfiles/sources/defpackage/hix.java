package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hix {
    public final boolean a;
    public final boolean b;
    public final String c;

    public hix(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                if (i < length - 1) {
                    i++;
                    char charAt2 = str.charAt(i);
                    if (charAt2 != 'n' && charAt2 != 'N') {
                        sb.append(charAt2);
                    } else {
                        sb.append("\n");
                    }
                    i++;
                } else {
                    charAt = '\\';
                }
            }
            sb.append(charAt);
            i++;
        }
        return sb.toString();
    }
}
