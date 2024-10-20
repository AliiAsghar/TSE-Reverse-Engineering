package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwn {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public fwn(String str, boolean z, boolean z2, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("CodecInfo{type=");
        if (true != this.b) {
            str = "Audio";
        } else {
            str = "Video";
        }
        if (true != this.c) {
            str2 = "Encoder";
        } else {
            str2 = "Decoder";
        }
        sb.append(str.concat(str2));
        sb.append(", configurationFormat=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
