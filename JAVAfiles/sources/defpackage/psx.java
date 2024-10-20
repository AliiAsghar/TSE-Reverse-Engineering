package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class psx extends Exception {
    public final boolean a;
    public int b;

    public psx(String str) {
        super(str);
        this.b = -1;
        this.a = false;
    }

    public psx(String str, int i, boolean z) {
        super(str);
        this.a = z;
        this.b = i;
    }

    public psx(String str, Throwable th) {
        this(str, th, false);
    }

    public psx(String str, Throwable th, boolean z) {
        super(str, th);
        this.b = -1;
        this.a = z;
    }
}
