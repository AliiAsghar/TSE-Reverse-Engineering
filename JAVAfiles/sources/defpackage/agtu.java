package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agtu extends agtv {
    final Throwable a;
    private final String c;
    private final long d;

    public agtu(String str, String str2, int i, long j, long j2, Throwable th) {
        super(str2, i, j);
        this.a = th;
        this.c = str;
        this.d = j2;
    }

    public final String toString() {
        algv algvVar = new algv("Finish");
        a(algvVar);
        algvVar.a(this.c);
        algvVar.e("durationSinceStart", ((float) this.d) / 1000000.0f);
        algvVar.a(this.a);
        algvVar.c();
        return algvVar.toString();
    }
}
