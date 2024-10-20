package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cki {
    public static final int[] a(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ckw.b(((cku) list.get(i)).i);
        }
        return iArr;
    }

    public static final Shader b(long j, long j2, List list) {
        c(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), a(list), (float[]) null, ckj.a());
    }

    public static final void c(List list) {
        if (list.size() >= 2) {
        } else {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
    }
}
