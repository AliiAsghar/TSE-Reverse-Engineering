package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpy extends IllegalStateException {
    public akpy(String str) {
        super(a(null, str));
    }

    private static String a(String str, String str2) {
        String concat;
        if (str == null) {
            concat = "";
        } else {
            concat = ": ".concat(str);
        }
        return a.bZ(concat, str2, "Starting new trace ", " when already associated with a trace", ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
    }

    public akpy(String str, String str2, Throwable th) {
        super(a(str, str2), th);
    }
}
