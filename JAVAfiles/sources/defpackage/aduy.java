package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aduy {
    protected final Context a;
    private final ContentResolver b;
    private final Uri c;
    private final acob d;

    public aduy(Context context, ContentResolver contentResolver, Uri uri, acob acobVar) {
        this.a = context;
        this.b = contentResolver;
        this.c = uri;
        this.d = acobVar;
    }

    private final void a(int i, Bundle bundle, String str, Throwable th) {
        String ag = albo.ag(bundle.getString("storage_file_name"));
        String ag2 = albo.ag(bundle.getString("preference_key"));
        if (!((Boolean) aczf.o().a.i.a()).booleanValue() && i == 0) {
            return;
        }
        aozy createBuilder = apeu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apeu apeuVar = (apeu) apagVar;
        apeuVar.b |= 16;
        apeuVar.g = ag;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apeu apeuVar2 = (apeu) apagVar2;
        apeuVar2.b |= 32;
        apeuVar2.h = ag2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apeu apeuVar3 = (apeu) createBuilder.b;
        apeuVar3.b |= 64;
        apeuVar3.i = str;
        String packageName = this.a.getPackageName();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apeu apeuVar4 = (apeu) apagVar3;
        packageName.getClass();
        apeuVar4.b |= 8;
        apeuVar4.f = packageName;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        apeu apeuVar5 = (apeu) apagVar4;
        apeuVar5.b |= 4;
        apeuVar5.e = "com.google.android.apps.messaging";
        if (i == 0) {
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            apeu apeuVar6 = (apeu) createBuilder.b;
            apeuVar6.c = 1;
            apeuVar6.b |= 1;
        } else {
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            apag apagVar5 = createBuilder.b;
            apeu apeuVar7 = (apeu) apagVar5;
            apeuVar7.c = 2;
            apeuVar7.b = 1 | apeuVar7.b;
            if (!apagVar5.isMutable()) {
                createBuilder.u();
            }
            apeu apeuVar8 = (apeu) createBuilder.b;
            apeuVar8.d = i - 1;
            apeuVar8.b |= 2;
            if (actx.k() == 2) {
                String c = advq.GENERIC.c(th);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apeu apeuVar9 = (apeu) createBuilder.b;
                c.getClass();
                apeuVar9.b |= 128;
                apeuVar9.j = c;
            }
        }
        acob acobVar = this.d;
        apeu apeuVar10 = (apeu) createBuilder.s();
        aozy c2 = acobVar.c(acobVar.b);
        if (c2 == null) {
            advr.q("Unable to send ContentProvider request event log", new Object[0]);
            return;
        }
        if (!c2.b.isMutable()) {
            c2.u();
        }
        amno amnoVar = (amno) c2.b;
        amno amnoVar2 = amno.a;
        apeuVar10.getClass();
        amnoVar.f = apeuVar10;
        amnoVar.e = 32;
        acobVar.b(acobVar.b, (amno) c2.s(), apkj.DIAGNOSTIC_EVENT);
    }

    public static String h(String str, String str2) {
        return str.concat(String.valueOf(str2));
    }

    public static final Bundle m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("preference_key", str);
        bundle.putString("storage_file_name", str2);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: NullPointerException -> 0x0099, IllegalStateException -> 0x009b, IllegalArgumentException -> 0x00a9, TryCatch #2 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x009b, NullPointerException -> 0x0099, blocks: (B:6:0x003f, B:8:0x004a, B:10:0x0050, B:11:0x005d, B:14:0x007f, B:15:0x0088, B:17:0x0089, B:27:0x008a, B:29:0x008e, B:30:0x0098), top: B:5:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a A[Catch: NullPointerException -> 0x0099, IllegalStateException -> 0x009b, IllegalArgumentException -> 0x00a9, TryCatch #2 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x009b, NullPointerException -> 0x0099, blocks: (B:6:0x003f, B:8:0x004a, B:10:0x0050, B:11:0x005d, B:14:0x007f, B:15:0x0088, B:17:0x0089, B:27:0x008a, B:29:0x008e, B:30:0x0098), top: B:5:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle g(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.lang.String r0 = "result_error_key"
            android.content.Context r1 = r7.a
            boolean r1 = defpackage.adwi.f(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
        Lc:
            r1 = r3
            goto L2e
        Le:
            boolean r1 = defpackage.aiut.g()
            if (r1 == 0) goto Lc
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "com.google.android.mobly.snippet.SnippetRunner"
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto Lc
            java.lang.String r4 = "com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner"
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L2d
            goto Lc
        L2d:
            r1 = r2
        L2e:
            java.lang.String r4 = "preference_key"
            java.lang.String r4 = r10.getString(r4)
            java.lang.String r5 = "storage_file_name"
            java.lang.String r5 = r10.getString(r5)
            java.lang.String r6 = "Incompatible thread for calling ContentResolver; method: %s, key: %s, fileName: %s"
            defpackage.albo.aa(r1, r6, r8, r4, r5)
            android.content.ContentResolver r1 = r7.b     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            android.net.Uri r4 = r7.c     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            android.os.Bundle r9 = r1.call(r4, r8, r9, r10)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            r1 = 0
            if (r9 == 0) goto L8e
            boolean r3 = r9.containsKey(r0)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            if (r3 == 0) goto L8a
            int r9 = r9.getInt(r0, r2)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            int r9 = defpackage.a.ae(r9)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            r7.a(r9, r10, r8, r1)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            adux r0 = new adux     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            switch(r9) {
                case 1: goto L7b;
                case 2: goto L78;
                case 3: goto L75;
                case 4: goto L72;
                case 5: goto L6f;
                case 6: goto L6c;
                case 7: goto L69;
                case 8: goto L66;
                case 9: goto L63;
                default: goto L60;
            }     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L60:
            java.lang.String r2 = "null"
            goto L7d
        L63:
            java.lang.String r2 = "PREFERENCE_KEY_NOT_SUPPORTED_ERROR"
            goto L7d
        L66:
            java.lang.String r2 = "INTERNAL_ERROR"
            goto L7d
        L69:
            java.lang.String r2 = "URI_IS_NOT_SUPPORTED_ERROR"
            goto L7d
        L6c:
            java.lang.String r2 = "PREFERENCE_FILE_NOT_SUPPORTED_ERROR"
            goto L7d
        L6f:
            java.lang.String r2 = "PREFERENCE_VALUE_TYPE_NOT_SUPPORTED_ERROR"
            goto L7d
        L72:
            java.lang.String r2 = "PREFERENCE_METHOD_NOT_SUPPORTED_ERROR"
            goto L7d
        L75:
            java.lang.String r2 = "PREFERENCE_KEY_MISSING_ERROR"
            goto L7d
        L78:
            java.lang.String r2 = "UID_NOT_VERIFIED_ERROR"
            goto L7d
        L7b:
            java.lang.String r2 = "FAILURE_REASON_UNKNOWN"
        L7d:
            if (r9 == 0) goto L89
            java.lang.String r9 = "ContentProvider request failed, failureReason: "
            java.lang.String r9 = defpackage.a.cp(r2, r9)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            r0.<init>(r9)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            throw r0     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L89:
            throw r1     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L8a:
            r7.a(r2, r10, r8, r1)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            return r9
        L8e:
            r7.a(r3, r10, r8, r1)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            adux r9 = new adux     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            java.lang.String r0 = "ContentResolver::call returned empty Bundle."
            r9.<init>(r0)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            throw r9     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L99:
            r9 = move-exception
            goto L9c
        L9b:
            r9 = move-exception
        L9c:
            r0 = 8
            r7.a(r0, r10, r8, r9)
            adux r8 = new adux
            java.lang.String r10 = "Exception thrown when trying to parse the response parcel"
            r8.<init>(r10, r9)
            throw r8
        La9:
            r9 = move-exception
            r0 = 7
            r7.a(r0, r10, r8, r9)
            android.net.Uri r8 = r7.c
            adux r10 = new adux
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "ContentResolver can not resolve URI: "
            java.lang.String r8 = r0.concat(r8)
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aduy.g(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final String i(String str, String str2, String str3) {
        Bundle m = m(str, str3);
        m.putString("preference_value", str2);
        return g("GET", "STRING", m).getString("preference_key", str2);
    }

    public final void j(String str, int i, String str2) {
        Bundle m = m(str, str2);
        m.putInt("preference_value", i);
        g("PUT", "INTEGER", m);
    }

    public final void k(String str, String str2, String str3) {
        Bundle m = m(str, str3);
        m.putString("preference_value", str2);
        g("PUT", "STRING", m);
    }

    public final boolean l(String str, boolean z, String str2) {
        Bundle m = m(str, str2);
        m.putBoolean("preference_value", z);
        return g("GET", "BOOLEAN", m).getBoolean("preference_key", z);
    }

    public final int n(String str, String str2) {
        Bundle m = m(str, str2);
        m.putInt("preference_value", 0);
        return g("GET", "INTEGER", m).getInt("preference_key", 0);
    }

    public final apbt o(String str, apbt apbtVar) {
        try {
            return uhy.a(i(str, uhy.b(apbtVar), "RcsApplicationData"), apbtVar);
        } catch (apba e) {
            throw new adux("ContentProvider InvalidProtocolBufferException", e);
        }
    }

    public final void p(String str, apbt apbtVar) {
        k(str, uhy.b(apbtVar), "RcsApplicationData");
    }
}
