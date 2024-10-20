package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class evi extends IOException {
    public final int a;

    public evi(int i) {
        this.a = i;
    }

    public evi(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public evi(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
