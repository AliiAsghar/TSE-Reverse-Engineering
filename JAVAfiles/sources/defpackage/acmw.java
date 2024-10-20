package defpackage;

import android.content.Context;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acmw implements Runnable {
    private static final int a = Math.max(2, albo.co(((Long) ((acza) acyu.a().b.f).a()).longValue()));
    public final String b;
    public final Context c;
    public acmz d;
    private int e = 0;
    private int f = 1;

    public acmw(String str, Context context, acmz acmzVar) {
        this.b = str;
        this.c = context;
        this.d = acmzVar;
    }

    private static int g() {
        return Math.max(1, albo.co(((Long) ((acza) acyu.a().b.k).a()).longValue()));
    }

    private final void h(Integer num) {
        int i;
        if (!e()) {
            return;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (!advh.h()) {
            advr.d(advh.a, "Analytics are disabled. Ignoring UMA histogram %s", "RcsEngine.BusinessInfo.Retrieval.Failed.Counts");
            return;
        }
        aboj abojVar = advh.b;
        abojVar.getClass();
        abojVar.d("RcsEngine.BusinessInfo.Retrieval.Failed.Counts").a(i, 1L, aboj.b);
        advh.f();
    }

    private final void i(int i, Integer num) {
        if (e() && i != Integer.MIN_VALUE) {
            if (num != null && num.intValue() == 200) {
                advh.g(i);
            } else {
                advh.c(i);
            }
        }
    }

    protected abstract acmz a(HttpsURLConnection httpsURLConnection);

    public abstract String b();

    public abstract String c();

    protected abstract void d(HttpsURLConnection httpsURLConnection);

    protected abstract boolean e();

    public HttpsURLConnection f(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setDoInput(true);
        return httpsURLConnection;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:23|24|(6:69|70|(2:72|(1:74))(1:77)|(1:76)|58|59)(2:26|(5:65|66|(1:68)|58|59)(3:28|(2:30|(3:32|152|38)(1:55))(1:64)|56))|60|61|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018a, code lost:
    
        if (r5 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cd, code lost:
    
        if (r4 == 0) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01de  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmw.run():void");
    }
}
