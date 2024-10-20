package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adks {
    private static final alwo e = alwo.o(advo.a);
    public final ExecutorService a;
    public final yjy b;
    public final acnz c;
    public final adae d;
    private final adtl f;
    private final adko g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final adtl k;

    public adks(acnz acnzVar, adae adaeVar, adtl adtlVar, adtl adtlVar2, adko adkoVar, yjy yjyVar, ExecutorService executorService, armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = acnzVar;
        this.d = adaeVar;
        this.k = adtlVar;
        this.f = adtlVar2;
        this.g = adkoVar;
        this.b = yjyVar;
        this.h = armfVar;
        this.i = armfVar2;
        this.a = executorService;
        this.j = armfVar3;
    }

    private static void e(HttpURLConnection httpURLConnection, adlw adlwVar, adjj adjjVar, int i) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        adlwVar.az(adjjVar, i);
    }

    private final void f(Context context, String str, List list) {
        if (((acxv) this.h.b()).a()) {
            aday adayVar = (aday) this.i.b();
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((aonx) adayVar.b).j((adjn) it.next()));
            }
            adayVar.j(str).edit().putStringSet("provisioning_engine_cookies_key", hashSet).commit();
            return;
        }
        adnu a = adnu.a();
        HashSet hashSet2 = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet2.add(a.c.j((adjn) it2.next()));
        }
        adnu.e(context, str).edit().putStringSet("provisioning_engine_cookies_key", hashSet2).commit();
    }

    private final void g(Context context, admx admxVar, int i, String str, String str2, adiv adivVar) {
        int i2;
        String str3;
        String str4;
        apkn apknVar = apkn.RCS_PROVISIONING_UNKNOWN_STATE;
        String str5 = (String) Optional.ofNullable(str2).map(new adkk(19)).orElse("unknown");
        admy admyVar = new admy();
        admyVar.g(apknVar);
        admyVar.d = 2;
        if (str != null) {
            admyVar.b = str;
            admyVar.f(str5);
            if (admyVar.e == null) {
                admyVar.e = apia.a.createBuilder();
            }
            aozy aozyVar = admyVar.e;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apia apiaVar = (apia) aozyVar.b;
            apia apiaVar2 = apia.a;
            apiaVar.c = i - 1;
            apiaVar.b |= 1;
            admyVar.g(admxVar.a);
            admyVar.f(admxVar.c);
            acnz acnzVar = this.c;
            aozy aozyVar2 = admyVar.e;
            if (aozyVar2 != null) {
                admyVar.f = (apia) aozyVar2.s();
            } else if (admyVar.f == null) {
                admyVar.f = (apia) apia.a.createBuilder().s();
            }
            apkn apknVar2 = admyVar.a;
            if (apknVar2 != null && (i2 = admyVar.d) != 0 && (str3 = admyVar.b) != null && (str4 = admyVar.c) != null) {
                admv admvVar = new admv(apknVar2, i2, str3, str4, (apia) admyVar.f);
                aozy createBuilder = apjl.a.createBuilder();
                aozy createBuilder2 = apib.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apia apiaVar3 = admvVar.d;
                apag apagVar = createBuilder2.b;
                apib apibVar = (apib) apagVar;
                apiaVar3.getClass();
                apibVar.d = apiaVar3;
                apibVar.c = 3;
                String str6 = admvVar.b;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                apib apibVar2 = (apib) apagVar2;
                str6.getClass();
                apibVar2.b |= 2;
                apibVar2.f = str6;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                apib apibVar3 = (apib) apagVar3;
                apibVar3.e = 2;
                apibVar3.b |= 1;
                int i3 = admvVar.e;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                apib apibVar4 = (apib) createBuilder2.b;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    apibVar4.h = i4;
                    apibVar4.b |= 8;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apjl apjlVar = (apjl) createBuilder.b;
                    apib apibVar5 = (apib) createBuilder2.s();
                    apibVar5.getClass();
                    apjlVar.r = apibVar5;
                    apjlVar.b |= 16384;
                    apkn apknVar3 = admvVar.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apjl apjlVar2 = (apjl) createBuilder.b;
                    apjlVar2.c = apknVar3.H;
                    apjlVar2.b |= 1;
                    acnzVar.z(context, acnzVar.p(createBuilder, adivVar), admvVar.c);
                    return;
                }
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            if (admyVar.a == null) {
                sb.append(" requestState");
            }
            if (admyVar.d == 0) {
                sb.append(" provisioningEngineWorker");
            }
            if (admyVar.b == null) {
                sb.append(" requestId");
            }
            if (admyVar.c == null) {
                sb.append(" provisioningSessionId");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null requestId");
    }

    public final void a(HttpURLConnection httpURLConnection, InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                advr.s(e2, "Unable to close response body input stream in state %s", str);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Context context, String str) {
        int i = alog.d;
        f(context, str, alsx.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Context context, String str, HttpURLConnection httpURLConnection) {
        xyl.l(httpURLConnection);
        ArrayList arrayList = new ArrayList();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        ArrayList<String> arrayList2 = new ArrayList();
        if (headerFields != null) {
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value != null && ("Set-Cookie".equals(key) || "Set-Cookie2".equals(key))) {
                    arrayList2.addAll(value);
                }
            }
        }
        ArrayList<HttpCookie> arrayList3 = new ArrayList();
        for (String str2 : arrayList2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    arrayList3.addAll(HttpCookie.parse(str2));
                } catch (IllegalArgumentException unused) {
                    advr.q("Error parsing a cookie header '%s'", str2);
                }
            }
        }
        for (HttpCookie httpCookie : arrayList3) {
            advr.o("Found [%s] cookie [%s]", httpCookie.getName(), advq.GENERIC.c(httpCookie.getValue()));
            if (!httpCookie.getDiscard() && !httpCookie.hasExpired()) {
                arrayList.add(new adjn(httpCookie));
            } else {
                advr.o("Ignore discarded, expired or empty name cookie", new Object[0]);
            }
        }
        if (arrayList.isEmpty()) {
            advr.q("Couldn't find cookies", new Object[0]);
        }
        f(context, str, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(24:4|5|(1:7)|8|(1:10)|11|12|(3:18|19|(25:23|24|25|26|27|28|(1:30)|31|(1:33)|34|(1:36)|37|38|39|(1:41)|42|(1:44)|45|46|(2:48|(10:50|51|52|53|54|55|(1:57)|(1:59)|60|61)(1:80))(1:85)|81|82|83|60|61))|116|(14:134|(8:138|(1:140)|141|142|143|144|145|146)|39|(0)|42|(0)|45|46|(0)(0)|81|82|83|60|61)|119|(1:127)|39|(0)|42|(0)|45|46|(0)(0)|81|82|83|60|61) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0349, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0347, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x034d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x034b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a3 A[Catch: adux -> 0x034f, adna -> 0x0351, IOException -> 0x0353, SocketTimeoutException -> 0x0359, all -> 0x0369, TryCatch #8 {all -> 0x0369, blocks: (B:5:0x0019, B:7:0x003a, B:8:0x0041, B:10:0x0049, B:11:0x0050, B:14:0x0066, B:19:0x0073, B:21:0x007d, B:23:0x0085, B:25:0x008c, B:38:0x013b, B:39:0x0251, B:41:0x02a3, B:42:0x02a6, B:44:0x02c4, B:45:0x02c7, B:48:0x02ea, B:50:0x02f0, B:57:0x031c, B:59:0x0321, B:89:0x036c, B:94:0x038c, B:74:0x0337, B:73:0x0334, B:81:0x033e, B:83:0x0342, B:106:0x014b, B:105:0x0148, B:109:0x014f, B:116:0x0164, B:119:0x020f, B:121:0x0225, B:123:0x0233, B:125:0x023b, B:127:0x0243, B:128:0x0174, B:132:0x0181, B:134:0x018b, B:136:0x019d, B:138:0x01a5, B:140:0x01b9, B:141:0x01bc, B:143:0x01d3, B:146:0x01e8, B:157:0x01f7, B:156:0x01f4, B:160:0x01fb), top: B:4:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02c4 A[Catch: adux -> 0x034f, adna -> 0x0351, IOException -> 0x0353, SocketTimeoutException -> 0x0359, all -> 0x0369, TryCatch #8 {all -> 0x0369, blocks: (B:5:0x0019, B:7:0x003a, B:8:0x0041, B:10:0x0049, B:11:0x0050, B:14:0x0066, B:19:0x0073, B:21:0x007d, B:23:0x0085, B:25:0x008c, B:38:0x013b, B:39:0x0251, B:41:0x02a3, B:42:0x02a6, B:44:0x02c4, B:45:0x02c7, B:48:0x02ea, B:50:0x02f0, B:57:0x031c, B:59:0x0321, B:89:0x036c, B:94:0x038c, B:74:0x0337, B:73:0x0334, B:81:0x033e, B:83:0x0342, B:106:0x014b, B:105:0x0148, B:109:0x014f, B:116:0x0164, B:119:0x020f, B:121:0x0225, B:123:0x0233, B:125:0x023b, B:127:0x0243, B:128:0x0174, B:132:0x0181, B:134:0x018b, B:136:0x019d, B:138:0x01a5, B:140:0x01b9, B:141:0x01bc, B:143:0x01d3, B:146:0x01e8, B:157:0x01f7, B:156:0x01f4, B:160:0x01fb), top: B:4:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ea A[Catch: adux -> 0x034f, adna -> 0x0351, IOException -> 0x0353, SocketTimeoutException -> 0x0359, all -> 0x0369, TryCatch #8 {all -> 0x0369, blocks: (B:5:0x0019, B:7:0x003a, B:8:0x0041, B:10:0x0049, B:11:0x0050, B:14:0x0066, B:19:0x0073, B:21:0x007d, B:23:0x0085, B:25:0x008c, B:38:0x013b, B:39:0x0251, B:41:0x02a3, B:42:0x02a6, B:44:0x02c4, B:45:0x02c7, B:48:0x02ea, B:50:0x02f0, B:57:0x031c, B:59:0x0321, B:89:0x036c, B:94:0x038c, B:74:0x0337, B:73:0x0334, B:81:0x033e, B:83:0x0342, B:106:0x014b, B:105:0x0148, B:109:0x014f, B:116:0x0164, B:119:0x020f, B:121:0x0225, B:123:0x0233, B:125:0x023b, B:127:0x0243, B:128:0x0174, B:132:0x0181, B:134:0x018b, B:136:0x019d, B:138:0x01a5, B:140:0x01b9, B:141:0x01bc, B:143:0x01d3, B:146:0x01e8, B:157:0x01f7, B:156:0x01f4, B:160:0x01fb), top: B:4:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033c  */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional d(android.content.Context r26, defpackage.adlw r27, android.net.Network r28, java.lang.String r29, int r30, defpackage.admx r31, defpackage.adiv r32) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adks.d(android.content.Context, adlw, android.net.Network, java.lang.String, int, admx, adiv):j$.util.Optional");
    }
}
