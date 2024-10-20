package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class agtv {
    private final long a;
    final String b;
    private final int c;

    public agtv(String str, int i, long j) {
        this.b = str;
        this.c = i;
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(algv algvVar) {
        algvVar.a(this.b);
        algvVar.a(new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(this.a)));
        algvVar.f("queueSize", this.c);
    }
}
