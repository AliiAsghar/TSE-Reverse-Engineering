package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fff extends Exception {
    public final String a;
    public final boolean b;
    public final ffe c;
    public final String d;

    public fff(eqn eqnVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + eqnVar.toString(), th, eqnVar.o, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i));
    }

    public fff(String str, Throwable th, String str2, boolean z, ffe ffeVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = ffeVar;
        this.d = str3;
    }
}
