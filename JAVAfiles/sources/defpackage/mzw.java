package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzw {
    public nbe a;
    public String b;
    public alor c;
    public alog d;
    public byte e;
    public int f;
    public ndk g;
    private alog h;
    private alog i;
    private alog j;

    public final mzx a() {
        if (this.e == 1 && this.f != 0 && this.h != null && this.c != null && this.i != null && this.j != null && this.d != null) {
            return new mzx(this.g, this.a, this.b, this.f, this.h, this.c, this.i, this.j, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" starred");
        }
        if (this.f == 0) {
            sb.append(" contentCategory");
        }
        if (this.h == null) {
            sb.append(" annotations");
        }
        if (this.c == null) {
            sb.append(" voiceTranscriptions");
        }
        if (this.i == null) {
            sb.append(" readByRecipients");
        }
        if (this.j == null) {
            sb.append(" failedToDecryptRecipients");
        }
        if (this.d == null) {
            sb.append(" editHistory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(alog alogVar) {
        if (alogVar != null) {
            this.h = alogVar;
            return;
        }
        throw new NullPointerException("Null annotations");
    }

    public final void c(alog alogVar) {
        if (alogVar != null) {
            this.j = alogVar;
            return;
        }
        throw new NullPointerException("Null failedToDecryptRecipients");
    }

    public final void d(alog alogVar) {
        if (alogVar != null) {
            this.i = alogVar;
            return;
        }
        throw new NullPointerException("Null readByRecipients");
    }
}
