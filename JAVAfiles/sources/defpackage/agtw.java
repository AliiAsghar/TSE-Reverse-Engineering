package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agtw extends agtv {
    private final String a;
    private final long c;

    public agtw(String str, String str2, int i, long j, long j2) {
        super(str2, i, j);
        this.a = str;
        this.c = j2;
    }

    public final String toString() {
        algv algvVar = new algv("Start");
        a(algvVar);
        algvVar.a(this.a);
        algvVar.e("durationSinceEnqueue", ((float) this.c) / 1000000.0f);
        return algvVar.toString();
    }
}
