package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0050a;

/* loaded from: classes5.dex */
abstract /* synthetic */ class j {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0050a.values().length];
        a = iArr;
        try {
            iArr[EnumC0050a.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC0050a.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC0050a.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
