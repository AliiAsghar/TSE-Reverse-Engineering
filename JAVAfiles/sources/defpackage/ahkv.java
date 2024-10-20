package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahkv {
    private static final int[] g = new int[0];
    private static final String[] h = new String[0];
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    private final ahku i;

    public ahkv(String str, String str2, int i, long j, int[] iArr, String[] strArr, ahku ahkuVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.i = ahkuVar;
    }

    public static boolean a(Object obj) {
        if (obj != null && !(obj instanceof ahlf)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahkv)) {
            return false;
        }
        ahkv ahkvVar = (ahkv) obj;
        if (Objects.equals(this.b, ahkvVar.b) && Objects.equals(this.c, ahkvVar.c) && this.d == ahkvVar.d && this.a == ahkvVar.a && Arrays.equals(this.e, ahkvVar.e) && Arrays.equals(this.f, ahkvVar.f) && Objects.equals(this.i, ahkvVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.i);
    }

    public ahkv(String str, String str2, int i, long j, ahku ahkuVar) {
        this(str, str2, i, j, g, h, ahkuVar);
    }
}
