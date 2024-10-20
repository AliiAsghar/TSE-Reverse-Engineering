package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acn {
    public static final int[] a = new int[0];
    public static final float[] b = new float[0];
    public static final aac c = new aac(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long a(acq acqVar, long j) {
        if (j < 0) {
            j = 0;
        }
        long j2 = ((acv) acqVar).a;
        if (j > j2) {
            return j2;
        }
        return j;
    }

    public static final zz b(ack ackVar, long j, zz zzVar, zz zzVar2, zz zzVar3) {
        return ackVar.c(j * 1000000, zzVar, zzVar2, zzVar3);
    }
}
