package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class wat {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[wbq.values().length];
        b = iArr;
        try {
            iArr[wbq.ERROR_CAUSE_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        int[] iArr2 = new int[wbr.values().length];
        a = iArr2;
        try {
            iArr2[wbr.ERROR_CODE_OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[wbr.ERROR_CODE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
