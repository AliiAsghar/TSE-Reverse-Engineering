package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface csv {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final csv a = new csv() { // from class: csv.a.1
            @Override // defpackage.csv
            public final long a(long j, long j2) {
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = Float.floatToRawIntBits(max);
                long floatToRawIntBits2 = Float.floatToRawIntBits(max);
                int i = cvj.a;
                return (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            }
        };
        public static final csv b = new csv() { // from class: csv.a.5
            @Override // defpackage.csv
            public final long a(long j, long j2) {
                float a2 = csw.a(j, j2);
                long floatToRawIntBits = Float.floatToRawIntBits(a2);
                long floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                int i = cvj.a;
                return (floatToRawIntBits << 32) | (4294967295L & floatToRawIntBits2);
            }
        };
        public static final csv c = new csv() { // from class: csv.a.3
            @Override // defpackage.csv
            public final long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                int i = cvj.a;
                return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
            }
        };
        public static final csv d = new csv() { // from class: csv.a.4
            @Override // defpackage.csv
            public final long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                int i = cvj.a;
                return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
            }
        };
        public static final csv e = new csv() { // from class: csv.a.6
            @Override // defpackage.csv
            public final long a(long j, long j2) {
                long j3;
                long j4;
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    j3 = Float.floatToRawIntBits(1.0f) << 32;
                    j4 = Float.floatToRawIntBits(1.0f) & 4294967295L;
                    int i = cvj.a;
                } else {
                    float a2 = csw.a(j, j2);
                    long floatToRawIntBits = Float.floatToRawIntBits(a2);
                    long floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    j3 = floatToRawIntBits << 32;
                    j4 = floatToRawIntBits2 & 4294967295L;
                    int i2 = cvj.a;
                }
                return j3 | j4;
            }
        };
        public static final csy f = new csy();
        public static final csv g = new csv() { // from class: csv.a.2
            @Override // defpackage.csv
            public final long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2);
                int i = cvj.a;
                return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
            }
        };
    }

    static {
        csv csvVar = a.a;
    }

    long a(long j, long j2);
}
